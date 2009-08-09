/**
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
package org.atomify.model;

/**
 * Simple class offering methods to check if a contract constrain is broken.
 * 
 * @author Stephan Schloepke
 * @since 1.0.0
 */
public final class AtomContractConstraint {

	/**
	 * Checks if the given instance is not null
	 * 
	 * @param <T> The type of instance to check
	 * @param instanceName The name of the instance (should not be null).
	 * @param instance The instance to check.
	 * @return The checked instance which is guaranteed to not be null.
	 * @throws IllegalArgumentException If the instance to check is null.
	 */
	public static <T> T notNull(String instanceName, T instance) {
		if (instance == null) {
			if (instanceName != null) {
				throw new IllegalArgumentException("[AtomContractConstraint] The instance " + instanceName + " must not be null");
			} else {
				throw new IllegalArgumentException(
				        "[AtomContractConstraint] The unknown instance must not be null (please consider the call to know which one)");
			}
		}
		return instance;
	}

}
