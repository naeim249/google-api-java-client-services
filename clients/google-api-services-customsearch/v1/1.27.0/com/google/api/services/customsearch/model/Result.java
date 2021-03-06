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

package com.google.api.services.customsearch.model;

/**
 * Model definition for Result.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the CustomSearch API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Result extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cacheId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayLink;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileFormat;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String htmlFormattedUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String htmlSnippet;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String htmlTitle;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Image image;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Labels> labels;

  static {
    // hack to force ProGuard to consider Labels used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Labels.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String link;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.util.List<java.util.Map<String, java.lang.Object>>> pagemap;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String snippet;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCacheId() {
    return cacheId;
  }

  /**
   * @param cacheId cacheId or {@code null} for none
   */
  public Result setCacheId(java.lang.String cacheId) {
    this.cacheId = cacheId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayLink() {
    return displayLink;
  }

  /**
   * @param displayLink displayLink or {@code null} for none
   */
  public Result setDisplayLink(java.lang.String displayLink) {
    this.displayLink = displayLink;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFileFormat() {
    return fileFormat;
  }

  /**
   * @param fileFormat fileFormat or {@code null} for none
   */
  public Result setFileFormat(java.lang.String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedUrl() {
    return formattedUrl;
  }

  /**
   * @param formattedUrl formattedUrl or {@code null} for none
   */
  public Result setFormattedUrl(java.lang.String formattedUrl) {
    this.formattedUrl = formattedUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getHtmlFormattedUrl() {
    return htmlFormattedUrl;
  }

  /**
   * @param htmlFormattedUrl htmlFormattedUrl or {@code null} for none
   */
  public Result setHtmlFormattedUrl(java.lang.String htmlFormattedUrl) {
    this.htmlFormattedUrl = htmlFormattedUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getHtmlSnippet() {
    return htmlSnippet;
  }

  /**
   * @param htmlSnippet htmlSnippet or {@code null} for none
   */
  public Result setHtmlSnippet(java.lang.String htmlSnippet) {
    this.htmlSnippet = htmlSnippet;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getHtmlTitle() {
    return htmlTitle;
  }

  /**
   * @param htmlTitle htmlTitle or {@code null} for none
   */
  public Result setHtmlTitle(java.lang.String htmlTitle) {
    this.htmlTitle = htmlTitle;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Image getImage() {
    return image;
  }

  /**
   * @param image image or {@code null} for none
   */
  public Result setImage(Image image) {
    this.image = image;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public Result setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Labels> getLabels() {
    return labels;
  }

  /**
   * @param labels labels or {@code null} for none
   */
  public Result setLabels(java.util.List<Labels> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLink() {
    return link;
  }

  /**
   * @param link link or {@code null} for none
   */
  public Result setLink(java.lang.String link) {
    this.link = link;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMime() {
    return mime;
  }

  /**
   * @param mime mime or {@code null} for none
   */
  public Result setMime(java.lang.String mime) {
    this.mime = mime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.util.List<java.util.Map<String, java.lang.Object>>> getPagemap() {
    return pagemap;
  }

  /**
   * @param pagemap pagemap or {@code null} for none
   */
  public Result setPagemap(java.util.Map<String, java.util.List<java.util.Map<String, java.lang.Object>>> pagemap) {
    this.pagemap = pagemap;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSnippet() {
    return snippet;
  }

  /**
   * @param snippet snippet or {@code null} for none
   */
  public Result setSnippet(java.lang.String snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * @param title title or {@code null} for none
   */
  public Result setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public Result set(String fieldName, Object value) {
    return (Result) super.set(fieldName, value);
  }

  @Override
  public Result clone() {
    return (Result) super.clone();
  }

  /**
   * Model definition for ResultImage.
   */
  public static final class Image extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer byteSize;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String contextLink;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer height;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer thumbnailHeight;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String thumbnailLink;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer thumbnailWidth;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer width;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getByteSize() {
      return byteSize;
    }

    /**
     * @param byteSize byteSize or {@code null} for none
     */
    public Image setByteSize(java.lang.Integer byteSize) {
      this.byteSize = byteSize;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getContextLink() {
      return contextLink;
    }

    /**
     * @param contextLink contextLink or {@code null} for none
     */
    public Image setContextLink(java.lang.String contextLink) {
      this.contextLink = contextLink;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getHeight() {
      return height;
    }

    /**
     * @param height height or {@code null} for none
     */
    public Image setHeight(java.lang.Integer height) {
      this.height = height;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getThumbnailHeight() {
      return thumbnailHeight;
    }

    /**
     * @param thumbnailHeight thumbnailHeight or {@code null} for none
     */
    public Image setThumbnailHeight(java.lang.Integer thumbnailHeight) {
      this.thumbnailHeight = thumbnailHeight;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getThumbnailLink() {
      return thumbnailLink;
    }

    /**
     * @param thumbnailLink thumbnailLink or {@code null} for none
     */
    public Image setThumbnailLink(java.lang.String thumbnailLink) {
      this.thumbnailLink = thumbnailLink;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getThumbnailWidth() {
      return thumbnailWidth;
    }

    /**
     * @param thumbnailWidth thumbnailWidth or {@code null} for none
     */
    public Image setThumbnailWidth(java.lang.Integer thumbnailWidth) {
      this.thumbnailWidth = thumbnailWidth;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.Integer getWidth() {
      return width;
    }

    /**
     * @param width width or {@code null} for none
     */
    public Image setWidth(java.lang.Integer width) {
      this.width = width;
      return this;
    }

    @Override
    public Image set(String fieldName, Object value) {
      return (Image) super.set(fieldName, value);
    }

    @Override
    public Image clone() {
      return (Image) super.clone();
    }

  }

  /**
   * Model definition for ResultLabels.
   */
  public static final class Labels extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String displayName;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key("label_with_op")
    private java.lang.String labelWithOp;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getDisplayName() {
      return displayName;
    }

    /**
     * @param displayName displayName or {@code null} for none
     */
    public Labels setDisplayName(java.lang.String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getLabelWithOp() {
      return labelWithOp;
    }

    /**
     * @param labelWithOp labelWithOp or {@code null} for none
     */
    public Labels setLabelWithOp(java.lang.String labelWithOp) {
      this.labelWithOp = labelWithOp;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getName() {
      return name;
    }

    /**
     * @param name name or {@code null} for none
     */
    public Labels setName(java.lang.String name) {
      this.name = name;
      return this;
    }

    @Override
    public Labels set(String fieldName, Object value) {
      return (Labels) super.set(fieldName, value);
    }

    @Override
    public Labels clone() {
      return (Labels) super.clone();
    }

  }

}
