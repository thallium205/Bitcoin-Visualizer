/*
 * Copyright 2009 Hao Nguyen
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package gwt.g3d.client.gl2.array;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A {@link WebGLShortArray} represents an array of 16-bit signed integer values.
 * A {@link WebGLShortArray} has an element size of 2 bytes.
 * 
 * @author hao1300@gmail.com
 */
@Deprecated
public class WebGLShortArray extends WebGLArray {
	public static final int BYTES_PER_ELEMENT = 2;
	
	protected WebGLShortArray() {

	}
	
	/**
	 * Create a new {@link WebGLShortArray} object of the given length with a new 
	 * underlying {@link WebGLArrayBuffer} large enough to hold length elements 
	 * of the specific type. Data in the buffer is initialized to 0.
	 * 
	 * @param length
	 */
	public static native WebGLShortArray createArray(int length) /*-{
		return new $wnd.WebGLShortArray(length);
	}-*/;
	
	/**
	 * Create a new {@link WebGLShortArray} object with a new underlying 
	 * {@link WebGLArrayBuffer} large enough to hold the given data, then copy 
	 * the passed data into the buffer.
	 * 
	 * @param array
	 */
	public static native WebGLShortArray createArray(WebGLShortArray array) /*-{
		return new $wnd.WebGLShortArray(array);
	}-*/;
	
	/**
	 * Create a new {@link WebGLShortArray} object with a new underlying 
	 * {@link WebGLArrayBuffer} large enough to hold the given data, then copy 
	 * the passed data into the buffer.
	 * 
	 * @param array
	 */
	public static WebGLShortArray createArray(int... array) {
		WebGLShortArray newArray = createArray(array.length);
		for (int i = 0; i < array.length; ++i) {
			newArray.set(i, array[i]);
		}
		return newArray;
	}
	
	/**
	 * Create a new {@link WebGLShortArray} object with a new underlying 
	 * {@link WebGLArrayBuffer} large enough to hold the given data, then copy 
	 * the passed data into the buffer.
	 * 
	 * @param array a JavaScript array
	 */
	public static native WebGLShortArray createArray(JavaScriptObject array) /*-{
		return new $wnd.WebGLShortArray(array);
	}-*/;
	
	/**
	 * Create a new {@link WebGLShortArray} object using the passed 
	 * {@link WebGLArrayBuffer} for its storage. If a given byteOffset and 
	 * length references an area beyond the end of the {@link WebGLArrayBuffer} 
	 * an exception is raised.
	 * 
	 * @param buffer
	 * @param byteOffset indicates the offset in bytes from the start of 
	 * 				the {@link WebGLArrayBuffer}. must be a multiple of the element 
	 * 				size of the specific type, otherwise an exception is raised.
	 * @param length the count of elements from the offset that this 
	 * 				{@link WebGLShortArray} will reference
	 */
	public static native WebGLShortArray createArray(WebGLArrayBuffer buffer,
			int byteOffset, int length) /*-{
		return new $wnd.WebGLShortArray(buffer, byteOffset, length);
	}-*/;
	
	/**
	 * Return the element at the given index. If the index is out of range, 
	 * an exception is raised. This is an index getter function, and may be 
	 * invoked via array index syntax where applicable.
	 * 
	 * @param index
	 */
	public native final int get(int index) /*-{
		return this[index];
	}-*/;
	
	/**
	 * Sets the element at the given index to the given value. If the index is 
	 * out of range, an exception is raised. This is an index setter function, 
	 * and may be invoked via array index syntax where applicable.
	 * 
	 * If the given value is out of range for the type of the array, a C-style 
	 * cast operation is performed to coerce the value to the valid range. No 
	 * clamping or rounding is performed.
	 * 
	 * @param index
	 * @param value
	 */
	public native final void set(int index, int value) /*-{
		this[index] = value;
	}-*/;
}
