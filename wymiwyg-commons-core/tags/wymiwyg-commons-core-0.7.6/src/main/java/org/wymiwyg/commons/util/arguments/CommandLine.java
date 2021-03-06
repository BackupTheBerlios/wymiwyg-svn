/*
 * Copyright  2002-2005 WYMIWYG (http://wymiwyg.org)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.wymiwyg.commons.util.arguments;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author reto
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CommandLine {
	String[] longName();
	String[] shortName();
	/** the default value for a single-string attribute
	 * 
	 * @return
	 */
	String[] defaultValue() default {};
	/** the default value for a non-switch attribute
	 * 
	 * @return
	 */
	boolean defaultBooleanValue() default false;
	/** if the return type is boolean this indicated that the argument is used without value, if present the result is true, otherwise 
	 * false (defaultBooleanValue ignored)
	 * 
	 * @return
	 */
	boolean isSwitch() default true;
	
	boolean required() default false;

	/** a text describing the attribute
	 * 
	 * @return
	 */
	String description() default "undocumented";
}
