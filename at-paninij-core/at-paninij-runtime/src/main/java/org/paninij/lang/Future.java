/*
 * This file is part of the Panini project at Iowa State University.
 *
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/.
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * For more details and the latest version of this code please see
 * http://paninij.org
 *
 * Contributor(s): Dalton Mills
 */
package org.paninij.lang;

/**
 * The @Future annotation changes the behind-the-scenes behavior of a 
 * procedure by making it return a java.util.concurrent.Future when called.
 * <br />
 * This annotation is one of the three which can define the behavior
 * of a procedure. They are:
 * <ul>
 * <li>@Block - blocking behavior</li>
 * <li>@Future - futurized behvaior</li>
 * <li>@Duck - ducked behavior</li>
 * </ul>
 *
 */
public @interface Future { }
