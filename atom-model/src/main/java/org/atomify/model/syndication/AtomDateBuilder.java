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
package org.atomify.model.syndication;

import org.atomify.model.common.AtomCommonBuilder;
import org.jbasics.parser.annotations.Content;
import org.jbasics.pattern.builder.Builder;

public class AtomDateBuilder extends AtomCommonBuilder<AtomDateBuilder> implements Builder<AtomDate> {
	/**
	 * <b>Required:</b> IRI referecnce. Must be absolute.
	 * <p>
	 * TODO: Must be an IRI reference.
	 * </p>
	 */
	private String dateString;

	public static AtomDateBuilder newInstance() {
		return new AtomDateBuilder();
	}

	private AtomDateBuilder() {
		// disallow instantiation
	}

	public AtomDate build() {
		AtomDate temp = AtomDate.valueOf(this.dateString);
		attachParentBuilder(temp);
		return temp;
	}

	@Override
	public void reset() {
		super.reset();
		this.dateString = null;
	}

	@Content
	public AtomDateBuilder setDate(String dateString) {
		this.dateString = dateString;
		return this;
	}

}
