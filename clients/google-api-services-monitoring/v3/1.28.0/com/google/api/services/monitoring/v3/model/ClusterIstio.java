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

package com.google.api.services.monitoring.v3.model;

/**
 * Istio service. Learn more at http://istio.io.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClusterIstio extends com.google.api.client.json.GenericJson {

  /**
   * The name of the Kubernetes cluster in which this Istio service is defined. Corresponds to the
   * cluster_name resource label in k8s_cluster resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterName;

  /**
   * The location of the Kubernetes cluster in which this Istio service is defined. Corresponds to
   * the location resource label in k8s_cluster resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The name of the Istio service underlying this service. Corresponds to the
   * destination_service_name metric label in Istio metrics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceName;

  /**
   * The namespace of the Istio service underlying this service. Corresponds to the
   * destination_service_namespace metric label in Istio metrics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceNamespace;

  /**
   * The name of the Kubernetes cluster in which this Istio service is defined. Corresponds to the
   * cluster_name resource label in k8s_cluster resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterName() {
    return clusterName;
  }

  /**
   * The name of the Kubernetes cluster in which this Istio service is defined. Corresponds to the
   * cluster_name resource label in k8s_cluster resources.
   * @param clusterName clusterName or {@code null} for none
   */
  public ClusterIstio setClusterName(java.lang.String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * The location of the Kubernetes cluster in which this Istio service is defined. Corresponds to
   * the location resource label in k8s_cluster resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * The location of the Kubernetes cluster in which this Istio service is defined. Corresponds to
   * the location resource label in k8s_cluster resources.
   * @param location location or {@code null} for none
   */
  public ClusterIstio setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * The name of the Istio service underlying this service. Corresponds to the
   * destination_service_name metric label in Istio metrics.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceName() {
    return serviceName;
  }

  /**
   * The name of the Istio service underlying this service. Corresponds to the
   * destination_service_name metric label in Istio metrics.
   * @param serviceName serviceName or {@code null} for none
   */
  public ClusterIstio setServiceName(java.lang.String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * The namespace of the Istio service underlying this service. Corresponds to the
   * destination_service_namespace metric label in Istio metrics.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceNamespace() {
    return serviceNamespace;
  }

  /**
   * The namespace of the Istio service underlying this service. Corresponds to the
   * destination_service_namespace metric label in Istio metrics.
   * @param serviceNamespace serviceNamespace or {@code null} for none
   */
  public ClusterIstio setServiceNamespace(java.lang.String serviceNamespace) {
    this.serviceNamespace = serviceNamespace;
    return this;
  }

  @Override
  public ClusterIstio set(String fieldName, Object value) {
    return (ClusterIstio) super.set(fieldName, value);
  }

  @Override
  public ClusterIstio clone() {
    return (ClusterIstio) super.clone();
  }

}
