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

package com.google.api.services.cloudbuild.v1.model;

/**
 * PullRequestFilter contains filter properties for matching GitHub Pull Requests.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PullRequestFilter extends com.google.api.client.json.GenericJson {

  /**
   * Regex of branches to match.
   *
   * The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at
   * https://github.com/google/re2/wiki/Syntax
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String branch;

  /**
   * Whether to block builds on a "/gcbrun" comment from a repository owner or collaborator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commentControl;

  /**
   * Regex of branches to match.
   *
   * The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at
   * https://github.com/google/re2/wiki/Syntax
   * @return value or {@code null} for none
   */
  public java.lang.String getBranch() {
    return branch;
  }

  /**
   * Regex of branches to match.
   *
   * The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at
   * https://github.com/google/re2/wiki/Syntax
   * @param branch branch or {@code null} for none
   */
  public PullRequestFilter setBranch(java.lang.String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Whether to block builds on a "/gcbrun" comment from a repository owner or collaborator.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommentControl() {
    return commentControl;
  }

  /**
   * Whether to block builds on a "/gcbrun" comment from a repository owner or collaborator.
   * @param commentControl commentControl or {@code null} for none
   */
  public PullRequestFilter setCommentControl(java.lang.String commentControl) {
    this.commentControl = commentControl;
    return this;
  }

  @Override
  public PullRequestFilter set(String fieldName, Object value) {
    return (PullRequestFilter) super.set(fieldName, value);
  }

  @Override
  public PullRequestFilter clone() {
    return (PullRequestFilter) super.clone();
  }

}
