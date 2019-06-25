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

package com.google.api.services.classroom.model;

/**
 * URL item.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Classroom API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Link extends com.google.api.client.json.GenericJson {

  /**
   * URL of a thumbnail image of the target URL.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnailUrl;

  /**
   * Title of the target of the URL.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * URL to link to. This must be a valid UTF-8 string containing between 1 and 2024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * URL of a thumbnail image of the target URL.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnailUrl() {
    return thumbnailUrl;
  }

  /**
   * URL of a thumbnail image of the target URL.
   *
   * Read-only.
   * @param thumbnailUrl thumbnailUrl or {@code null} for none
   */
  public Link setThumbnailUrl(java.lang.String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

  /**
   * Title of the target of the URL.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title of the target of the URL.
   *
   * Read-only.
   * @param title title or {@code null} for none
   */
  public Link setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * URL to link to. This must be a valid UTF-8 string containing between 1 and 2024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * URL to link to. This must be a valid UTF-8 string containing between 1 and 2024 characters.
   * @param url url or {@code null} for none
   */
  public Link setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public Link set(String fieldName, Object value) {
    return (Link) super.set(fieldName, value);
  }

  @Override
  public Link clone() {
    return (Link) super.clone();
  }

}