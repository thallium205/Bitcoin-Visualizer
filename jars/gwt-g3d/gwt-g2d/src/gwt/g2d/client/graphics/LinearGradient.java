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
package gwt.g2d.client.graphics;

import gwt.g2d.client.graphics.canvas.Context;
import gwt.g2d.client.graphics.canvas.CanvasGradient;
import gwt.g2d.client.math.Vector2;

/**
 * Represents a linear gradient that paints along the line given by the 
 * coordinates. 
 * 
 * @author hao1300@gmail.com
 */
public class LinearGradient extends Gradient {
	private double x0, y0, x1, y1;
	
	/**
	 * Creates a linear gradient from (x0, y0) to (x1, y1).
	 */
	public LinearGradient(double x0, double y0, double x1, double y1) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
	}
	
	/**
	 * Creates a linear gradient from startPoint to endPoint.
	 */
	public LinearGradient(Vector2 startPoint, Vector2 endPoint) {
		this(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
	}
	
	@Override
	protected CanvasGradient createGradientAdapter(Context context) {
		return CanvasGradient.as(context.createLinearGradient(x0, y0, x1, y1));
	}
}
