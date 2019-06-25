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

package com.google.api.services.bigquery.model;

/**
 * Evaluation metrics for clustering models.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClusteringMetrics extends com.google.api.client.json.GenericJson {

  /**
   * Davies-Bouldin index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double daviesBouldinIndex;

  /**
   * Mean of squared distances between each sample to its cluster centroid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double meanSquaredDistance;

  /**
   * Davies-Bouldin index.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDaviesBouldinIndex() {
    return daviesBouldinIndex;
  }

  /**
   * Davies-Bouldin index.
   * @param daviesBouldinIndex daviesBouldinIndex or {@code null} for none
   */
  public ClusteringMetrics setDaviesBouldinIndex(java.lang.Double daviesBouldinIndex) {
    this.daviesBouldinIndex = daviesBouldinIndex;
    return this;
  }

  /**
   * Mean of squared distances between each sample to its cluster centroid.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMeanSquaredDistance() {
    return meanSquaredDistance;
  }

  /**
   * Mean of squared distances between each sample to its cluster centroid.
   * @param meanSquaredDistance meanSquaredDistance or {@code null} for none
   */
  public ClusteringMetrics setMeanSquaredDistance(java.lang.Double meanSquaredDistance) {
    this.meanSquaredDistance = meanSquaredDistance;
    return this;
  }

  @Override
  public ClusteringMetrics set(String fieldName, Object value) {
    return (ClusteringMetrics) super.set(fieldName, value);
  }

  @Override
  public ClusteringMetrics clone() {
    return (ClusteringMetrics) super.clone();
  }

}
