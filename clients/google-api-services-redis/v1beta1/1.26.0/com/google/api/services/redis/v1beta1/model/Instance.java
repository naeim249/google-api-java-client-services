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

package com.google.api.services.redis.v1beta1.model;

/**
 * A Google Cloud Redis instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Memorystore for Redis API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Instance extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Only applicable to STANDARD_HA tier which protects the instance against zonal
   * failures by provisioning it across two zones. If provided, it must be a different zone from the
   * one provided in [location_id].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alternativeLocationId;

  /**
   * Optional. The full name of the Google Compute Engine [network](/compute/docs/networks-and-
   * firewalls#networks) to which the instance is connected. If left unspecified, the `default`
   * network will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authorizedNetwork;

  /**
   * Output only. The time the instance was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The current zone where the Redis endpoint is placed. For Basic Tier instances,
   * this will always be the same as the [location_id] provided by the user at creation time. For
   * Standard Tier instances, this can be either [location_id] or [alternative_location_id] and can
   * change after a failover event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currentLocationId;

  /**
   * An arbitrary and optional user-provided name for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Hostname or IP address of the exposed Redis endpoint used by clients to connect to
   * the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * Resource labels to represent user provided metadata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. The zone where the instance will be provisioned. If not provided, the service will
   * choose a zone for the instance. For STANDARD_HA tier, instances will be created across two
   * zones for protection against zonal failures. If [alternative_location_id] is also provided, it
   * must be different from [location_id].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationId;

  /**
   * Required. Redis memory size in GiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer memorySizeGb;

  /**
   * Required. Unique name of the resource in this scope including project and location using the
   * form:     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   *
   * Note: Redis instances are managed and addressed at regional level so location_id here refers to
   * a GCP region; however, users may choose which specific zone (or collection of zones for cross-
   * zone instances) an instance should be provisioned in. Refer to [location_id] and
   * [alternative_location_id] fields for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Cloud IAM identity used by import / export operations to transfer data to/from
   * Cloud Storage. Format is "serviceAccount:". The value may change over time for a given instance
   * so should be checked before each import/export operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String persistenceIamIdentity;

  /**
   * Output only. The port number of the exposed Redis endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * Optional. Redis configuration parameters, according to http://redis.io/topics/config.
   * Currently, the only supported parameters are:
   *
   *  Redis 3.2 and above:
   *
   *  *   maxmemory-policy  *   notify-keyspace-events
   *
   *  Redis 4.0 and above:
   *
   *  *   activedefrag  *   lfu-log-factor  *   lfu-decay-time
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> redisConfigs;

  /**
   * Optional. The version of Redis software. If not provided, latest supported version will be
   * used. Updating the version will perform an upgrade/downgrade to the new version. Currently, the
   * supported values are:
   *
   *  *   `REDIS_4_0` for Redis 4.0 compatibility  *   `REDIS_3_2` for Redis 3.2 compatibility
   * (default)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String redisVersion;

  /**
   * Optional. The CIDR range of internal addresses that are reserved for this instance. If not
   * provided, the service will choose an unused /29 block, for example, 10.0.0.0/29 or
   * 192.168.0.0/29. Ranges must be unique and non-overlapping with existing subnets in an
   * authorized network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reservedIpRange;

  /**
   * Output only. The current state of this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Additional information about the current status of this instance, if available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * Required. The service tier of the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tier;

  /**
   * Optional. Only applicable to STANDARD_HA tier which protects the instance against zonal
   * failures by provisioning it across two zones. If provided, it must be a different zone from the
   * one provided in [location_id].
   * @return value or {@code null} for none
   */
  public java.lang.String getAlternativeLocationId() {
    return alternativeLocationId;
  }

  /**
   * Optional. Only applicable to STANDARD_HA tier which protects the instance against zonal
   * failures by provisioning it across two zones. If provided, it must be a different zone from the
   * one provided in [location_id].
   * @param alternativeLocationId alternativeLocationId or {@code null} for none
   */
  public Instance setAlternativeLocationId(java.lang.String alternativeLocationId) {
    this.alternativeLocationId = alternativeLocationId;
    return this;
  }

  /**
   * Optional. The full name of the Google Compute Engine [network](/compute/docs/networks-and-
   * firewalls#networks) to which the instance is connected. If left unspecified, the `default`
   * network will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthorizedNetwork() {
    return authorizedNetwork;
  }

  /**
   * Optional. The full name of the Google Compute Engine [network](/compute/docs/networks-and-
   * firewalls#networks) to which the instance is connected. If left unspecified, the `default`
   * network will be used.
   * @param authorizedNetwork authorizedNetwork or {@code null} for none
   */
  public Instance setAuthorizedNetwork(java.lang.String authorizedNetwork) {
    this.authorizedNetwork = authorizedNetwork;
    return this;
  }

  /**
   * Output only. The time the instance was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the instance was created.
   * @param createTime createTime or {@code null} for none
   */
  public Instance setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The current zone where the Redis endpoint is placed. For Basic Tier instances,
   * this will always be the same as the [location_id] provided by the user at creation time. For
   * Standard Tier instances, this can be either [location_id] or [alternative_location_id] and can
   * change after a failover event.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrentLocationId() {
    return currentLocationId;
  }

  /**
   * Output only. The current zone where the Redis endpoint is placed. For Basic Tier instances,
   * this will always be the same as the [location_id] provided by the user at creation time. For
   * Standard Tier instances, this can be either [location_id] or [alternative_location_id] and can
   * change after a failover event.
   * @param currentLocationId currentLocationId or {@code null} for none
   */
  public Instance setCurrentLocationId(java.lang.String currentLocationId) {
    this.currentLocationId = currentLocationId;
    return this;
  }

  /**
   * An arbitrary and optional user-provided name for the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * An arbitrary and optional user-provided name for the instance.
   * @param displayName displayName or {@code null} for none
   */
  public Instance setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Hostname or IP address of the exposed Redis endpoint used by clients to connect to
   * the service.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Output only. Hostname or IP address of the exposed Redis endpoint used by clients to connect to
   * the service.
   * @param host host or {@code null} for none
   */
  public Instance setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * Resource labels to represent user provided metadata
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Resource labels to represent user provided metadata
   * @param labels labels or {@code null} for none
   */
  public Instance setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. The zone where the instance will be provisioned. If not provided, the service will
   * choose a zone for the instance. For STANDARD_HA tier, instances will be created across two
   * zones for protection against zonal failures. If [alternative_location_id] is also provided, it
   * must be different from [location_id].
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationId() {
    return locationId;
  }

  /**
   * Optional. The zone where the instance will be provisioned. If not provided, the service will
   * choose a zone for the instance. For STANDARD_HA tier, instances will be created across two
   * zones for protection against zonal failures. If [alternative_location_id] is also provided, it
   * must be different from [location_id].
   * @param locationId locationId or {@code null} for none
   */
  public Instance setLocationId(java.lang.String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Required. Redis memory size in GiB.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMemorySizeGb() {
    return memorySizeGb;
  }

  /**
   * Required. Redis memory size in GiB.
   * @param memorySizeGb memorySizeGb or {@code null} for none
   */
  public Instance setMemorySizeGb(java.lang.Integer memorySizeGb) {
    this.memorySizeGb = memorySizeGb;
    return this;
  }

  /**
   * Required. Unique name of the resource in this scope including project and location using the
   * form:     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   *
   * Note: Redis instances are managed and addressed at regional level so location_id here refers to
   * a GCP region; however, users may choose which specific zone (or collection of zones for cross-
   * zone instances) an instance should be provisioned in. Refer to [location_id] and
   * [alternative_location_id] fields for more details.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Unique name of the resource in this scope including project and location using the
   * form:     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   *
   * Note: Redis instances are managed and addressed at regional level so location_id here refers to
   * a GCP region; however, users may choose which specific zone (or collection of zones for cross-
   * zone instances) an instance should be provisioned in. Refer to [location_id] and
   * [alternative_location_id] fields for more details.
   * @param name name or {@code null} for none
   */
  public Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Cloud IAM identity used by import / export operations to transfer data to/from
   * Cloud Storage. Format is "serviceAccount:". The value may change over time for a given instance
   * so should be checked before each import/export operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getPersistenceIamIdentity() {
    return persistenceIamIdentity;
  }

  /**
   * Output only. Cloud IAM identity used by import / export operations to transfer data to/from
   * Cloud Storage. Format is "serviceAccount:". The value may change over time for a given instance
   * so should be checked before each import/export operation.
   * @param persistenceIamIdentity persistenceIamIdentity or {@code null} for none
   */
  public Instance setPersistenceIamIdentity(java.lang.String persistenceIamIdentity) {
    this.persistenceIamIdentity = persistenceIamIdentity;
    return this;
  }

  /**
   * Output only. The port number of the exposed Redis endpoint.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Output only. The port number of the exposed Redis endpoint.
   * @param port port or {@code null} for none
   */
  public Instance setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Optional. Redis configuration parameters, according to http://redis.io/topics/config.
   * Currently, the only supported parameters are:
   *
   *  Redis 3.2 and above:
   *
   *  *   maxmemory-policy  *   notify-keyspace-events
   *
   *  Redis 4.0 and above:
   *
   *  *   activedefrag  *   lfu-log-factor  *   lfu-decay-time
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getRedisConfigs() {
    return redisConfigs;
  }

  /**
   * Optional. Redis configuration parameters, according to http://redis.io/topics/config.
   * Currently, the only supported parameters are:
   *
   *  Redis 3.2 and above:
   *
   *  *   maxmemory-policy  *   notify-keyspace-events
   *
   *  Redis 4.0 and above:
   *
   *  *   activedefrag  *   lfu-log-factor  *   lfu-decay-time
   * @param redisConfigs redisConfigs or {@code null} for none
   */
  public Instance setRedisConfigs(java.util.Map<String, java.lang.String> redisConfigs) {
    this.redisConfigs = redisConfigs;
    return this;
  }

  /**
   * Optional. The version of Redis software. If not provided, latest supported version will be
   * used. Updating the version will perform an upgrade/downgrade to the new version. Currently, the
   * supported values are:
   *
   *  *   `REDIS_4_0` for Redis 4.0 compatibility  *   `REDIS_3_2` for Redis 3.2 compatibility
   * (default)
   * @return value or {@code null} for none
   */
  public java.lang.String getRedisVersion() {
    return redisVersion;
  }

  /**
   * Optional. The version of Redis software. If not provided, latest supported version will be
   * used. Updating the version will perform an upgrade/downgrade to the new version. Currently, the
   * supported values are:
   *
   *  *   `REDIS_4_0` for Redis 4.0 compatibility  *   `REDIS_3_2` for Redis 3.2 compatibility
   * (default)
   * @param redisVersion redisVersion or {@code null} for none
   */
  public Instance setRedisVersion(java.lang.String redisVersion) {
    this.redisVersion = redisVersion;
    return this;
  }

  /**
   * Optional. The CIDR range of internal addresses that are reserved for this instance. If not
   * provided, the service will choose an unused /29 block, for example, 10.0.0.0/29 or
   * 192.168.0.0/29. Ranges must be unique and non-overlapping with existing subnets in an
   * authorized network.
   * @return value or {@code null} for none
   */
  public java.lang.String getReservedIpRange() {
    return reservedIpRange;
  }

  /**
   * Optional. The CIDR range of internal addresses that are reserved for this instance. If not
   * provided, the service will choose an unused /29 block, for example, 10.0.0.0/29 or
   * 192.168.0.0/29. Ranges must be unique and non-overlapping with existing subnets in an
   * authorized network.
   * @param reservedIpRange reservedIpRange or {@code null} for none
   */
  public Instance setReservedIpRange(java.lang.String reservedIpRange) {
    this.reservedIpRange = reservedIpRange;
    return this;
  }

  /**
   * Output only. The current state of this instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of this instance.
   * @param state state or {@code null} for none
   */
  public Instance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Additional information about the current status of this instance, if available.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * Output only. Additional information about the current status of this instance, if available.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public Instance setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Required. The service tier of the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getTier() {
    return tier;
  }

  /**
   * Required. The service tier of the instance.
   * @param tier tier or {@code null} for none
   */
  public Instance setTier(java.lang.String tier) {
    this.tier = tier;
    return this;
  }

  @Override
  public Instance set(String fieldName, Object value) {
    return (Instance) super.set(fieldName, value);
  }

  @Override
  public Instance clone() {
    return (Instance) super.clone();
  }

}
