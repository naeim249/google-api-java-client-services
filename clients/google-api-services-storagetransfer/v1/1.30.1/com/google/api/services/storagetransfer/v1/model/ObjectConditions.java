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

package com.google.api.services.storagetransfer.v1.model;

/**
 * Conditions that determine which objects will be transferred. Applies only to S3 and Cloud Storage
 * objects.
 *
 * The "last modification time" refers to the time of the last change to the object's content or
 * metadata — specifically, this is the `updated` property of Cloud Storage objects and the
 * `LastModified` field of S3 objects.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Storage Transfer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ObjectConditions extends com.google.api.client.json.GenericJson {

  /**
   * `exclude_prefixes` must follow the requirements described for include_prefixes.
   *
   * The max size of `exclude_prefixes` is 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> excludePrefixes;

  /**
   * If `include_prefixes` is specified, objects that satisfy the object conditions must have names
   * that start with one of the `include_prefixes` and that do not start with any of the
   * exclude_prefixes. If `include_prefixes` is not specified, all objects except those that have
   * names starting with one of the `exclude_prefixes` must satisfy the object conditions.
   *
   * Requirements:
   *
   *   * Each include-prefix and exclude-prefix can contain any sequence of     Unicode characters,
   * to a max length of 1024 bytes when UTF8-encoded,     and must not contain Carriage Return or
   * Line Feed characters.  Wildcard     matching and regular expression matching are not supported.
   *
   *   * Each include-prefix and exclude-prefix must omit the leading slash.     For example, to
   * include the `requests.gz` object in a transfer from     `s3://my-aws-
   * bucket/logs/y=2015/requests.gz`, specify the include     prefix as `logs/y=2015/requests.gz`.
   *
   *   * None of the include-prefix or the exclude-prefix values can be empty,     if specified.
   *
   *   * Each include-prefix must include a distinct portion of the object     namespace. No
   * include-prefix may be a prefix of another     include-prefix.
   *
   *   * Each exclude-prefix must exclude a distinct portion of the object     namespace. No
   * exclude-prefix may be a prefix of another     exclude-prefix.
   *
   *   * If `include_prefixes` is specified, then each exclude-prefix must start     with the value
   * of a path explicitly included by `include_prefixes`.
   *
   * The max size of `include_prefixes` is 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includePrefixes;

  /**
   * If specified, only objects with a "last modification time" before this timestamp and objects
   * that don't have a "last modification time" will be transferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastModifiedBefore;

  /**
   * If specified, only objects with a "last modification time" on or after this timestamp and
   * objects that don't have a "last modification time" are transferred.
   *
   * The `last_modified_since` and `last_modified_before` fields can be used together for chunked
   * data processing. For example, consider a script that processes each day's worth of data at a
   * time. For that you'd set each of the fields as follows:
   *
   * *  `last_modified_since` to the start of the day
   *
   * *  `last_modified_before` to the end of the day
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastModifiedSince;

  /**
   * If specified, only objects with a "last modification time" on or after `NOW` -
   * `max_time_elapsed_since_last_modification` and objects that don't have a "last modification
   * time" are transferred.
   *
   * For each TransferOperation started by this TransferJob, `NOW` refers to the start_time of the
   * `TransferOperation`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maxTimeElapsedSinceLastModification;

  /**
   * If specified, only objects with a "last modification time" before `NOW` -
   * `min_time_elapsed_since_last_modification` and objects that don't  have a "last modification
   * time" are transferred.
   *
   * For each TransferOperation started by this TransferJob, `NOW` refers to the start_time of the
   * `TransferOperation`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String minTimeElapsedSinceLastModification;

  /**
   * `exclude_prefixes` must follow the requirements described for include_prefixes.
   *
   * The max size of `exclude_prefixes` is 1000.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExcludePrefixes() {
    return excludePrefixes;
  }

  /**
   * `exclude_prefixes` must follow the requirements described for include_prefixes.
   *
   * The max size of `exclude_prefixes` is 1000.
   * @param excludePrefixes excludePrefixes or {@code null} for none
   */
  public ObjectConditions setExcludePrefixes(java.util.List<java.lang.String> excludePrefixes) {
    this.excludePrefixes = excludePrefixes;
    return this;
  }

  /**
   * If `include_prefixes` is specified, objects that satisfy the object conditions must have names
   * that start with one of the `include_prefixes` and that do not start with any of the
   * exclude_prefixes. If `include_prefixes` is not specified, all objects except those that have
   * names starting with one of the `exclude_prefixes` must satisfy the object conditions.
   *
   * Requirements:
   *
   *   * Each include-prefix and exclude-prefix can contain any sequence of     Unicode characters,
   * to a max length of 1024 bytes when UTF8-encoded,     and must not contain Carriage Return or
   * Line Feed characters.  Wildcard     matching and regular expression matching are not supported.
   *
   *   * Each include-prefix and exclude-prefix must omit the leading slash.     For example, to
   * include the `requests.gz` object in a transfer from     `s3://my-aws-
   * bucket/logs/y=2015/requests.gz`, specify the include     prefix as `logs/y=2015/requests.gz`.
   *
   *   * None of the include-prefix or the exclude-prefix values can be empty,     if specified.
   *
   *   * Each include-prefix must include a distinct portion of the object     namespace. No
   * include-prefix may be a prefix of another     include-prefix.
   *
   *   * Each exclude-prefix must exclude a distinct portion of the object     namespace. No
   * exclude-prefix may be a prefix of another     exclude-prefix.
   *
   *   * If `include_prefixes` is specified, then each exclude-prefix must start     with the value
   * of a path explicitly included by `include_prefixes`.
   *
   * The max size of `include_prefixes` is 1000.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludePrefixes() {
    return includePrefixes;
  }

  /**
   * If `include_prefixes` is specified, objects that satisfy the object conditions must have names
   * that start with one of the `include_prefixes` and that do not start with any of the
   * exclude_prefixes. If `include_prefixes` is not specified, all objects except those that have
   * names starting with one of the `exclude_prefixes` must satisfy the object conditions.
   *
   * Requirements:
   *
   *   * Each include-prefix and exclude-prefix can contain any sequence of     Unicode characters,
   * to a max length of 1024 bytes when UTF8-encoded,     and must not contain Carriage Return or
   * Line Feed characters.  Wildcard     matching and regular expression matching are not supported.
   *
   *   * Each include-prefix and exclude-prefix must omit the leading slash.     For example, to
   * include the `requests.gz` object in a transfer from     `s3://my-aws-
   * bucket/logs/y=2015/requests.gz`, specify the include     prefix as `logs/y=2015/requests.gz`.
   *
   *   * None of the include-prefix or the exclude-prefix values can be empty,     if specified.
   *
   *   * Each include-prefix must include a distinct portion of the object     namespace. No
   * include-prefix may be a prefix of another     include-prefix.
   *
   *   * Each exclude-prefix must exclude a distinct portion of the object     namespace. No
   * exclude-prefix may be a prefix of another     exclude-prefix.
   *
   *   * If `include_prefixes` is specified, then each exclude-prefix must start     with the value
   * of a path explicitly included by `include_prefixes`.
   *
   * The max size of `include_prefixes` is 1000.
   * @param includePrefixes includePrefixes or {@code null} for none
   */
  public ObjectConditions setIncludePrefixes(java.util.List<java.lang.String> includePrefixes) {
    this.includePrefixes = includePrefixes;
    return this;
  }

  /**
   * If specified, only objects with a "last modification time" before this timestamp and objects
   * that don't have a "last modification time" will be transferred.
   * @return value or {@code null} for none
   */
  public String getLastModifiedBefore() {
    return lastModifiedBefore;
  }

  /**
   * If specified, only objects with a "last modification time" before this timestamp and objects
   * that don't have a "last modification time" will be transferred.
   * @param lastModifiedBefore lastModifiedBefore or {@code null} for none
   */
  public ObjectConditions setLastModifiedBefore(String lastModifiedBefore) {
    this.lastModifiedBefore = lastModifiedBefore;
    return this;
  }

  /**
   * If specified, only objects with a "last modification time" on or after this timestamp and
   * objects that don't have a "last modification time" are transferred.
   *
   * The `last_modified_since` and `last_modified_before` fields can be used together for chunked
   * data processing. For example, consider a script that processes each day's worth of data at a
   * time. For that you'd set each of the fields as follows:
   *
   * *  `last_modified_since` to the start of the day
   *
   * *  `last_modified_before` to the end of the day
   * @return value or {@code null} for none
   */
  public String getLastModifiedSince() {
    return lastModifiedSince;
  }

  /**
   * If specified, only objects with a "last modification time" on or after this timestamp and
   * objects that don't have a "last modification time" are transferred.
   *
   * The `last_modified_since` and `last_modified_before` fields can be used together for chunked
   * data processing. For example, consider a script that processes each day's worth of data at a
   * time. For that you'd set each of the fields as follows:
   *
   * *  `last_modified_since` to the start of the day
   *
   * *  `last_modified_before` to the end of the day
   * @param lastModifiedSince lastModifiedSince or {@code null} for none
   */
  public ObjectConditions setLastModifiedSince(String lastModifiedSince) {
    this.lastModifiedSince = lastModifiedSince;
    return this;
  }

  /**
   * If specified, only objects with a "last modification time" on or after `NOW` -
   * `max_time_elapsed_since_last_modification` and objects that don't have a "last modification
   * time" are transferred.
   *
   * For each TransferOperation started by this TransferJob, `NOW` refers to the start_time of the
   * `TransferOperation`.
   * @return value or {@code null} for none
   */
  public String getMaxTimeElapsedSinceLastModification() {
    return maxTimeElapsedSinceLastModification;
  }

  /**
   * If specified, only objects with a "last modification time" on or after `NOW` -
   * `max_time_elapsed_since_last_modification` and objects that don't have a "last modification
   * time" are transferred.
   *
   * For each TransferOperation started by this TransferJob, `NOW` refers to the start_time of the
   * `TransferOperation`.
   * @param maxTimeElapsedSinceLastModification maxTimeElapsedSinceLastModification or {@code null} for none
   */
  public ObjectConditions setMaxTimeElapsedSinceLastModification(String maxTimeElapsedSinceLastModification) {
    this.maxTimeElapsedSinceLastModification = maxTimeElapsedSinceLastModification;
    return this;
  }

  /**
   * If specified, only objects with a "last modification time" before `NOW` -
   * `min_time_elapsed_since_last_modification` and objects that don't  have a "last modification
   * time" are transferred.
   *
   * For each TransferOperation started by this TransferJob, `NOW` refers to the start_time of the
   * `TransferOperation`.
   * @return value or {@code null} for none
   */
  public String getMinTimeElapsedSinceLastModification() {
    return minTimeElapsedSinceLastModification;
  }

  /**
   * If specified, only objects with a "last modification time" before `NOW` -
   * `min_time_elapsed_since_last_modification` and objects that don't  have a "last modification
   * time" are transferred.
   *
   * For each TransferOperation started by this TransferJob, `NOW` refers to the start_time of the
   * `TransferOperation`.
   * @param minTimeElapsedSinceLastModification minTimeElapsedSinceLastModification or {@code null} for none
   */
  public ObjectConditions setMinTimeElapsedSinceLastModification(String minTimeElapsedSinceLastModification) {
    this.minTimeElapsedSinceLastModification = minTimeElapsedSinceLastModification;
    return this;
  }

  @Override
  public ObjectConditions set(String fieldName, Object value) {
    return (ObjectConditions) super.set(fieldName, value);
  }

  @Override
  public ObjectConditions clone() {
    return (ObjectConditions) super.clone();
  }

}
