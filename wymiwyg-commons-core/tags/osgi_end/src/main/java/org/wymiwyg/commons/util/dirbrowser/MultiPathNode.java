/*
 * Created on Nov 5, 2003
 * 
 * 
 * ====================================================================
 *
 * The WYMIWYG Software License, Version 1.0
 *
 * Copyright (c) 2002-2003 WYMIWYG  
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:
 *       "This product includes software developed by WYMIWYG."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The name "WYMIWYG" or "WYMIWYG.org" must not be used to endorse 
 *    or promote products derived from this software without prior written 
 *    permission. For written permission, please contact wymiwyg@wymiwyg.org.
 *
 * 5. Products derived from this software may not be called  
 *    "WYMIWYG" nor may "WYMIWYG" appear in their names 
 *    without prior written permission of WYMIWYG.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL WYMIWYG OR ITS CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,SPECIAL, EXEMPLARY, 
 * OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY 
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR 
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF 
 * THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of WYMIWYG.  For more
 * information on WYMIWYG, please see http://www.WYMIWYG.org/.
 *
 * This licensed is based on The Apache Software License, Version 1.1,
 * see http://www.apache.org/.
 */

package org.wymiwyg.commons.util.dirbrowser;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author reto
 */
public class MultiPathNode implements PathNode {
	private static final Log log = LogFactory.getLog(MultiPathNode.class);

	PathNode[] nodes;

	/**
	 * 
	 */
	public MultiPathNode(PathNode[] nodes) {
		this.nodes = nodes;
	}

	/**
	 * @see org.wymiwyg.commons.util.dirbrowser.PathNode#getSubPath(java.lang.String)
	 */
	public PathNode getSubPath(String requestPath) {
		PathNode[] subNodes = new PathNode[nodes.length];
		for (int i = 0; i < subNodes.length; i++) {
			subNodes[i] = nodes[i].getSubPath(requestPath);
		}
		return new MultiPathNode(subNodes);
	}

	/**
	 * @see org.wymiwyg.commons.util.dirbrowser.PathNode#isDirectory()
	 */
	public boolean isDirectory() {
		for (int i = 0; i < nodes.length; i++) {
			if (nodes[i].isDirectory()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @see org.wymiwyg.commons.util.dirbrowser.PathNode#list(org.wymiwyg.commons.util.dirbrowser.PathNameFilter)
	 */
	public String[] list(PathNameFilter filter) {
		List resultList = new ArrayList();
		for (int i = 0; i < nodes.length; i++) {
			String[] subList = nodes[i].list(filter);
			if (subList != null) {
				resultList.addAll(Arrays.asList(subList));
			}
		}
		return (String[]) resultList.toArray(new String[resultList.size()]);
	}
	/**
	 * @see org.wymiwyg.commons.util.dirbrowser.PathNode#list()
	 */
	public String[] list() {
		List resultList = new ArrayList();
		for (int i = 0; i < nodes.length; i++) {
			String[] subList = nodes[i].list();
			if (subList != null) {
				resultList.addAll(Arrays.asList(subList));
			}
		}
		return (String[]) resultList.toArray(new String[resultList.size()]);
	}

	/**
	 * @see org.wymiwyg.commons.util.dirbrowser.PathNode#getInputStream()
	 */
	public InputStream getInputStream() throws IOException {
		InputStream result = null;
		for (int i = 0; i < nodes.length; i++) {
			try {
				result = nodes[i].getInputStream();
			} catch (Exception e) {
				// nothing
			}
			if (result != null) {
				return result;
			}
		}
		return null;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("MultiPathNode of ");
		for (int i = 0; i < nodes.length; i++) {
			buffer.append(nodes[i]);
		}
		return buffer.toString();
	}

	/**
	 * @see org.wymiwyg.commons.util.dirbrowser.PathNode#getLength()
	 */
	public long getLength() {
		InputStream result = null;
		for (int i = 0; i < nodes.length; i++) {
			try {
				result = nodes[i].getInputStream();
			} catch (Exception e) {
				// nothing
			}

			if (result != null) {
				try {
					return nodes[i].getLength();
				} finally {
					try {
						result.close();
					} catch (IOException e1) {
						log.error("cloding inputstream", e1);
					}
				}
			}
		}
		return -1;
	}

	/* (non-Javadoc)
	 * @see org.wymiwyg.commons.util.dirbrowser.PathNode#getPath()
	 */
	public String getPath() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.wymiwyg.commons.util.dirbrowser.PathNode#getLastModified()
	 */
	public Date getLastModified() {
		Date lastModified = null;
		for (int i = 0; i < nodes.length; i++) {
			PathNode node = nodes[i];
			Date currentLastModified = node.getLastModified();
			if (currentLastModified != null) {
				if ((lastModified == null) || (currentLastModified.after(lastModified))) {
					lastModified = currentLastModified;
				}
			}
		}
		return lastModified;
	}
}