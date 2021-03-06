/*
 * Copyright (c) 2009-2016 Stephan Schloepke
 *
 * Stephan Schloepke: http://www.schloepke.de/
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.atomify.model;

import javax.xml.namespace.QName;


/**
 * Constants for the Atom Syndication Format (short Atom) and the Atom Publishing Protocol (short AtomPub).
 * 
 * @author Stephan Schloepke
 */
public class AtomConstants {
	/**
	 * The name space URI of the atom syndication format.
	 */
	public static final String ATOM_NS_URI = "http://www.w3.org/2005/Atom";
	/**
	 * The suggested prefix for the atom syndication format name space URI.
	 */
	public static final String ATOM_NS_PREFIX = "atom";

	/**
	 * The name space URI of the atom publishing protocol (atom_pub).
	 */
	public static final String ATOM_PUB_NS_URI = "http://www.w3.org/2007/app";
	/**
	 * The suggested prefix for the atom publishing protocol name space URI.
	 */
	public static final String ATOM_PUB_NS_PREFIX = "app";

	/**
	 * The atom:title elements QName used in checks for the extensionSansTitleElement.
	 */
	public static final QName ATOM_TITLE_QNAME = new QName(ATOM_NS_URI, "title");

}
