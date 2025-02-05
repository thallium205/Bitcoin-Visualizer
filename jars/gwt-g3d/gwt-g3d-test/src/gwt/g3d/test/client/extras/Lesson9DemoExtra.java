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
package gwt.g3d.test.client.extras;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 * Extra widget for lesson 9 demo.
 */
public class Lesson9DemoExtra extends Composite {

  interface MyUiBinder extends UiBinder<Widget, Lesson9DemoExtra> {}
  private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

  @UiField CheckBox chkTwinkle;
    
  public Lesson9DemoExtra() {
    initWidget(uiBinder.createAndBindUi(this));
  }
  
  /**
   * Gets whether twinkle is enabled.
   */
  public boolean isTwinkle() {
  	return chkTwinkle.getValue();
  }
}