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
package gwt.g3d.resources.client;

import gwt.g3d.client.texture.Texture2D;
import gwt.g3d.resources.ExternalTexture2DResourceGenerator;

import com.google.gwt.resources.client.ResourceCallback;
import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.resources.ext.DefaultExtensions;
import com.google.gwt.resources.ext.ResourceGeneratorType;

/**
 * Represents a resource that creates a {@link Texture2D} from an image.
 * 
 * @author hao1300@gmail.com
 */
@DefaultExtensions(value = {".png", ".jpg", ".gif", ".bmp"})
@ResourceGeneratorType(ExternalTexture2DResourceGenerator.class)
public interface ExternalTexture2DResource extends ResourcePrototype {

	/**
	 * Asynchronously loads the texture resource.
	 * 
	 * @param textureResource
	 */
	void getTexture(ResourceCallback<Texture2DResource> textureResource);
}
