/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.slides.v1.model;

/**
 * Deletes an object, either pages or page elements, from the presentation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeleteObjectRequest extends com.google.api.client.json.GenericJson {

  /**
   * The object ID of the page or page element to delete.
   *
   * If after a delete operation a group contains only 1 or no page elements, the group is also
   * deleted.
   *
   * If a placeholder is deleted on a layout, any empty inheriting shapes are also deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectId;

  /**
   * The object ID of the page or page element to delete.
   *
   * If after a delete operation a group contains only 1 or no page elements, the group is also
   * deleted.
   *
   * If a placeholder is deleted on a layout, any empty inheriting shapes are also deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectId() {
    return objectId;
  }

  /**
   * The object ID of the page or page element to delete.
   *
   * If after a delete operation a group contains only 1 or no page elements, the group is also
   * deleted.
   *
   * If a placeholder is deleted on a layout, any empty inheriting shapes are also deleted.
   * @param objectId objectId or {@code null} for none
   */
  public DeleteObjectRequest setObjectId(java.lang.String objectId) {
    this.objectId = objectId;
    return this;
  }

  @Override
  public DeleteObjectRequest set(String fieldName, Object value) {
    return (DeleteObjectRequest) super.set(fieldName, value);
  }

  @Override
  public DeleteObjectRequest clone() {
    return (DeleteObjectRequest) super.clone();
  }

}
