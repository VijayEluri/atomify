/*
 * Copyright (c) 2009 Stephan Schloepke and innoQ Deutschland GmbH
 *
 * Stephan Schloepke: http://www.schloepke.de/
 * innoQ Deutschland GmbH: http://www.innoq.com/
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
package org.atomify.model.syndication;

import javax.xml.namespace.QName;

import org.atomify.model.AtomConstants;
import org.atomify.model.AtomContractConstraint;

/**
 * Base class for the atom extension elements.
 * <p>
 * The restriction of an atom:extension is that it does not contain elements of the atom own name space.
 * </p>
 * 
 * @author Stephan Schloepke
 */
public abstract class AtomExtension {
	/**
	 * <b>Required:</b> The fully qualified name of the extension element. Must not be the atom name space.
	 */
	private final QName extensionName;

	/**
	 * Creates an extension with given name.
	 * 
	 * @param extensionName The extension name.
	 */
	public AtomExtension(final QName extensionName) {
		this.extensionName = AtomContractConstraint.notNull("extensionName", extensionName);
		if (AtomConstants.ATOM_NS_URI.equals(this.extensionName.getNamespaceURI())) {
			throw new IllegalArgumentException("Extention QName cannot be of the atom name space " + extensionName);
		}
	}

	/**
	 * Returns the fully qualified name of the extension.
	 * 
	 * @return The fully qualified name.
	 */
	public QName getExtensionName() {
		return this.extensionName;
	}

}
