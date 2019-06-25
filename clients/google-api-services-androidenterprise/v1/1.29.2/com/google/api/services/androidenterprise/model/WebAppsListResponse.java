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

package com.google.api.services.androidenterprise.model;

/**
 * The web app details for an enterprise.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WebAppsListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#webAppsListResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The manifest describing a web app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WebApp> webApp;

  static {
    // hack to force ProGuard to consider WebApp used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(WebApp.class);
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#webAppsListResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "androidenterprise#webAppsListResponse".
   * @param kind kind or {@code null} for none
   */
  public WebAppsListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The manifest describing a web app.
   * @return value or {@code null} for none
   */
  public java.util.List<WebApp> getWebApp() {
    return webApp;
  }

  /**
   * The manifest describing a web app.
   * @param webApp webApp or {@code null} for none
   */
  public WebAppsListResponse setWebApp(java.util.List<WebApp> webApp) {
    this.webApp = webApp;
    return this;
  }

  @Override
  public WebAppsListResponse set(String fieldName, Object value) {
    return (WebAppsListResponse) super.set(fieldName, value);
  }

  @Override
  public WebAppsListResponse clone() {
    return (WebAppsListResponse) super.clone();
  }

}