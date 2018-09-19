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

package com.google.firestore.v1beta2.model;

/**
 * Metadata for google.longrunning.Operation results from FirestoreAdmin.CreateIndex.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirestoreAdminV1beta2IndexOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The time this operation completed. Will be unset if operation still in progress.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The index resource that this operation is acting on. For example: `projects/{project_id}/databa
   * ses/{database_id}/collectionGroups/{collection_id}/indexes/{index_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String index;

  /**
   * The progress, in bytes, of this operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleFirestoreAdminV1beta2Progress progressBytes;

  /**
   * The progress, in documents, of this operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleFirestoreAdminV1beta2Progress progressDocuments;

  /**
   * The time this operation started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * The state of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The time this operation completed. Will be unset if operation still in progress.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The time this operation completed. Will be unset if operation still in progress.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2IndexOperationMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The index resource that this operation is acting on. For example: `projects/{project_id}/databa
   * ses/{database_id}/collectionGroups/{collection_id}/indexes/{index_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getIndex() {
    return index;
  }

  /**
   * The index resource that this operation is acting on. For example: `projects/{project_id}/databa
   * ses/{database_id}/collectionGroups/{collection_id}/indexes/{index_id}`
   * @param index index or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2IndexOperationMetadata setIndex(java.lang.String index) {
    this.index = index;
    return this;
  }

  /**
   * The progress, in bytes, of this operation.
   * @return value or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2Progress getProgressBytes() {
    return progressBytes;
  }

  /**
   * The progress, in bytes, of this operation.
   * @param progressBytes progressBytes or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2IndexOperationMetadata setProgressBytes(GoogleFirestoreAdminV1beta2Progress progressBytes) {
    this.progressBytes = progressBytes;
    return this;
  }

  /**
   * The progress, in documents, of this operation.
   * @return value or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2Progress getProgressDocuments() {
    return progressDocuments;
  }

  /**
   * The progress, in documents, of this operation.
   * @param progressDocuments progressDocuments or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2IndexOperationMetadata setProgressDocuments(GoogleFirestoreAdminV1beta2Progress progressDocuments) {
    this.progressDocuments = progressDocuments;
    return this;
  }

  /**
   * The time this operation started.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The time this operation started.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2IndexOperationMetadata setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The state of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of the operation.
   * @param state state or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2IndexOperationMetadata setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleFirestoreAdminV1beta2IndexOperationMetadata set(String fieldName, Object value) {
    return (GoogleFirestoreAdminV1beta2IndexOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleFirestoreAdminV1beta2IndexOperationMetadata clone() {
    return (GoogleFirestoreAdminV1beta2IndexOperationMetadata) super.clone();
  }

}
