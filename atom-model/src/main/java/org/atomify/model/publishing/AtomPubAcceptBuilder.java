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
package org.atomify.model.publishing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.atomify.model.AtomContractConstraint;
import org.atomify.model.common.AtomCommonBuilder;
import org.atomify.model.syndication.AtomEntry;
import org.jbasics.net.mediatype.MediaTypeRange;
import org.jbasics.parser.annotations.Content;
import org.jbasics.pattern.builder.Builder;

public class AtomPubAcceptBuilder extends AtomCommonBuilder<AtomPubAcceptBuilder> implements Builder<AtomPubAccept> {
	public final static Map<MediaTypeRange, AtomPubAccept> STANDARD_ACCEPTS;

	static {
		Map<MediaTypeRange, AtomPubAccept> temp = new HashMap<MediaTypeRange, AtomPubAccept>();
		temp.put(null, AtomPubAccept.valueOf((String)null));
		temp.put(MediaTypeRange.valueOf(AtomEntry.MEDIA_TYPE.toString()), AtomPubAccept.valueOf(AtomEntry.MEDIA_TYPE));
		STANDARD_ACCEPTS = Collections.unmodifiableMap(temp);
	}

	private MediaTypeRange acceptMediaRange;

	private AtomPubAcceptBuilder() {
		// empty to dissallow instantiation
	}

	public static AtomPubAcceptBuilder newInstance() {
		return new AtomPubAcceptBuilder();
	}

	public AtomPubAccept build() {
		AtomPubAccept temp = null;
		if (!hasCommonAttributes()) {
			temp = STANDARD_ACCEPTS.get(this.acceptMediaRange);
		}
		if (temp == null) {
			temp = AtomPubAccept.valueOf(this.acceptMediaRange);
			attachParentBuilder(temp);
		}
		return temp;
	}

	@Override
	public void reset() {
		super.reset();
		this.acceptMediaRange = null;
	}

	@Content(mixed = false)
	public AtomPubAcceptBuilder setAcceptMediaRange(String acceptMediaRange) {
		this.acceptMediaRange = MediaTypeRange.valueOf(acceptMediaRange);
		return this;
	}

	public AtomPubAcceptBuilder setAcceptMediaRange(MediaTypeRange acceptMediaRange) {
		return setAcceptMediaRange(AtomContractConstraint.notNull("acceptMediaRange", acceptMediaRange).toString());
	}

}
