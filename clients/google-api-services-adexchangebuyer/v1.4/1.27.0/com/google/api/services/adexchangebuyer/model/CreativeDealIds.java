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

package com.google.api.services.adexchangebuyer.model;

/**
 * The external deal ids associated with a creative.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreativeDealIds extends com.google.api.client.json.GenericJson {

  /**
   * A list of external deal ids and ARC approval status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DealStatuses> dealStatuses;

  static {
    // hack to force ProGuard to consider DealStatuses used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DealStatuses.class);
  }

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A list of external deal ids and ARC approval status.
   * @return value or {@code null} for none
   */
  public java.util.List<DealStatuses> getDealStatuses() {
    return dealStatuses;
  }

  /**
   * A list of external deal ids and ARC approval status.
   * @param dealStatuses dealStatuses or {@code null} for none
   */
  public CreativeDealIds setDealStatuses(java.util.List<DealStatuses> dealStatuses) {
    this.dealStatuses = dealStatuses;
    return this;
  }

  /**
   * Resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type.
   * @param kind kind or {@code null} for none
   */
  public CreativeDealIds setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public CreativeDealIds set(String fieldName, Object value) {
    return (CreativeDealIds) super.set(fieldName, value);
  }

  @Override
  public CreativeDealIds clone() {
    return (CreativeDealIds) super.clone();
  }

  /**
   * Model definition for CreativeDealIdsDealStatuses.
   */
  public static final class DealStatuses extends com.google.api.client.json.GenericJson {

    /**
     * ARC approval status.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String arcStatus;

    /**
     * External deal ID.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key @com.google.api.client.json.JsonString
    private java.lang.Long dealId;

    /**
     * Publisher ID.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer webPropertyId;

    /**
     * ARC approval status.
     * @return value or {@code null} for none
     */
    public java.lang.String getArcStatus() {
      return arcStatus;
    }

    /**
     * ARC approval status.
     * @param arcStatus arcStatus or {@code null} for none
     */
    public DealStatuses setArcStatus(java.lang.String arcStatus) {
      this.arcStatus = arcStatus;
      return this;
    }

    /**
     * External deal ID.
     * @return value or {@code null} for none
     */
    public java.lang.Long getDealId() {
      return dealId;
    }

    /**
     * External deal ID.
     * @param dealId dealId or {@code null} for none
     */
    public DealStatuses setDealId(java.lang.Long dealId) {
      this.dealId = dealId;
      return this;
    }

    /**
     * Publisher ID.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getWebPropertyId() {
      return webPropertyId;
    }

    /**
     * Publisher ID.
     * @param webPropertyId webPropertyId or {@code null} for none
     */
    public DealStatuses setWebPropertyId(java.lang.Integer webPropertyId) {
      this.webPropertyId = webPropertyId;
      return this;
    }

    @Override
    public DealStatuses set(String fieldName, Object value) {
      return (DealStatuses) super.set(fieldName, value);
    }

    @Override
    public DealStatuses clone() {
      return (DealStatuses) super.clone();
    }

  }

}