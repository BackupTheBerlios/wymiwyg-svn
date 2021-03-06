/*
 * Created on Nov 10, 2003
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

package org.wymiwyg.commons.tsmodel;

import com.hp.hpl.jena.rdf.model.Container;
import com.hp.hpl.jena.rdf.model.NodeIterator;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Statement;

/**
 * @author reto
 */
public class ThreadSafeContainer
	extends ThreadSafeResource
	implements Container {

	Container wrapped;
	/**
	 * @param model
	 * @param wrapped
	 */
	public ThreadSafeContainer(ThreadSafeModel model, Container wrapped) {
		super(model, wrapped);
		this.wrapped = wrapped;
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#isAlt()
	 */
	public boolean isAlt() {
		synchronized (model) {
			return wrapped.isAlt();
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#isSeq()
	 */
	public boolean isSeq() {
		synchronized (model) {
			return wrapped.isSeq();
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#isBag()
	 */
	public boolean isBag() {
		synchronized (model) {
			return wrapped.isBag();
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#add(com.hp.hpl.jena.rdf.model.RDFNode)
	 */
	public Container add(RDFNode o) {
		synchronized (model) {
			return wrapped.add(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#add(boolean)
	 */
	public Container add(boolean o) {
		synchronized (model) {
			return wrapped.add(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#add(long)
	 */
	public Container add(long o) {
		synchronized (model) {
			return wrapped.add(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#add(char)
	 */
	public Container add(char o) {
		synchronized (model) {
			return wrapped.add(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#add(float)
	 */
	public Container add(float o) {
		synchronized (model) {
			return wrapped.add(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#add(double)
	 */
	public Container add(double o) {
		synchronized (model) {
			return wrapped.add(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#add(java.lang.String)
	 */
	public Container add(String o) {
		synchronized (model) {
			return wrapped.add(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#add(java.lang.String, java.lang.String)
	 */
	public Container add(String o, String l) {
		synchronized (model) {
			return wrapped.add(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#add(java.lang.Object)
	 */
	public Container add(Object o) {
		synchronized (model) {
			return wrapped.add(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#contains(com.hp.hpl.jena.rdf.model.RDFNode)
	 */
	public boolean contains(RDFNode o) {
		synchronized (model) {
			return wrapped.contains(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#contains(boolean)
	 */
	public boolean contains(boolean o) {
		synchronized (model) {
			return wrapped.contains(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#contains(long)
	 */
	public boolean contains(long o) {
		synchronized (model) {
			return wrapped.contains(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#contains(char)
	 */
	public boolean contains(char o) {
		synchronized (model) {
			return wrapped.contains(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#contains(float)
	 */
	public boolean contains(float o) {
		synchronized (model) {
			return wrapped.contains(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#contains(double)
	 */
	public boolean contains(double o) {
		synchronized (model) {
			return wrapped.contains(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#contains(java.lang.String)
	 */
	public boolean contains(String o) {
		synchronized (model) {
			return wrapped.contains(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#contains(java.lang.String, java.lang.String)
	 */
	public boolean contains(String o, String l) {
		synchronized (model) {
			return wrapped.contains(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#contains(java.lang.Object)
	 */
	public boolean contains(Object o) {
		synchronized (model) {
			return wrapped.contains(o);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#remove(com.hp.hpl.jena.rdf.model.Statement)
	 */
	public Container remove(Statement s) {
		synchronized (model) {
			return wrapped.remove(s);
		}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#iterator()
	 */
	public NodeIterator iterator() {
		synchronized (model) {
		return new CachingNodeIterator(wrapped.iterator());}
	}

	/**
	 * @see com.hp.hpl.jena.rdf.model.Container#size()
	 */
	public int size() {
		synchronized (model) {
		return wrapped.size();
		}
	}

}
