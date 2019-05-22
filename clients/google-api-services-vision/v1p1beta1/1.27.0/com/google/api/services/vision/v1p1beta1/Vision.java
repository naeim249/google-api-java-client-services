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

package com.google.api.services.vision.v1p1beta1;

/**
 * Service definition for Vision (v1p1beta1).
 *
 * <p>
 * Integrates Google Vision features, including image labeling, face, logo, and landmark detection, optical character recognition (OCR), and detection of explicit content, into applications.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/vision/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link VisionRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Vision extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.27.0 of the Cloud Vision API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://vision.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Vision(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Vision(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Files collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Vision vision = new Vision(...);}
   *   {@code Vision.Files.List request = vision.files().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Files files() {
    return new Files();
  }

  /**
   * The "files" collection of methods.
   */
  public class Files {

    /**
     * Service that performs image detection and annotation for a batch of files. Now only
     * "application/pdf", "image/tiff" and "image/gif" are supported.
     *
     * This service will extract at most 5 (customers can specify which 5 in AnnotateFileRequest.pages)
     * frames (gif) or pages (pdf or tiff) from each file provided and perform detection and annotation
     * for each image extracted.
     *
     * Create a request for the method "files.annotate".
     *
     * This request holds the parameters needed by the vision server.  After setting any optional
     * parameters, call the {@link Annotate#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1BatchAnnotateFilesRequest}
     * @return the request
     */
    public Annotate annotate(com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1BatchAnnotateFilesRequest content) throws java.io.IOException {
      Annotate result = new Annotate(content);
      initialize(result);
      return result;
    }

    public class Annotate extends VisionRequest<com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1BatchAnnotateFilesResponse> {

      private static final String REST_PATH = "v1p1beta1/files:annotate";

      /**
       * Service that performs image detection and annotation for a batch of files. Now only
       * "application/pdf", "image/tiff" and "image/gif" are supported.
       *
       * This service will extract at most 5 (customers can specify which 5 in
       * AnnotateFileRequest.pages) frames (gif) or pages (pdf or tiff) from each file provided and
       * perform detection and annotation for each image extracted.
       *
       * Create a request for the method "files.annotate".
       *
       * This request holds the parameters needed by the the vision server.  After setting any optional
       * parameters, call the {@link Annotate#execute()} method to invoke the remote operation. <p>
       * {@link
       * Annotate#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1BatchAnnotateFilesRequest}
       * @since 1.13
       */
      protected Annotate(com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1BatchAnnotateFilesRequest content) {
        super(Vision.this, "POST", REST_PATH, content, com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1BatchAnnotateFilesResponse.class);
      }

      @Override
      public Annotate set$Xgafv(java.lang.String $Xgafv) {
        return (Annotate) super.set$Xgafv($Xgafv);
      }

      @Override
      public Annotate setAccessToken(java.lang.String accessToken) {
        return (Annotate) super.setAccessToken(accessToken);
      }

      @Override
      public Annotate setAlt(java.lang.String alt) {
        return (Annotate) super.setAlt(alt);
      }

      @Override
      public Annotate setCallback(java.lang.String callback) {
        return (Annotate) super.setCallback(callback);
      }

      @Override
      public Annotate setFields(java.lang.String fields) {
        return (Annotate) super.setFields(fields);
      }

      @Override
      public Annotate setKey(java.lang.String key) {
        return (Annotate) super.setKey(key);
      }

      @Override
      public Annotate setOauthToken(java.lang.String oauthToken) {
        return (Annotate) super.setOauthToken(oauthToken);
      }

      @Override
      public Annotate setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Annotate) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Annotate setQuotaUser(java.lang.String quotaUser) {
        return (Annotate) super.setQuotaUser(quotaUser);
      }

      @Override
      public Annotate setUploadType(java.lang.String uploadType) {
        return (Annotate) super.setUploadType(uploadType);
      }

      @Override
      public Annotate setUploadProtocol(java.lang.String uploadProtocol) {
        return (Annotate) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Annotate set(String parameterName, Object value) {
        return (Annotate) super.set(parameterName, value);
      }
    }
    /**
     * Run asynchronous image detection and annotation for a list of generic files, such as PDF files,
     * which may contain multiple pages and multiple images per page. Progress and results can be
     * retrieved through the `google.longrunning.Operations` interface. `Operation.metadata` contains
     * `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateFilesResponse`
     * (results).
     *
     * Create a request for the method "files.asyncBatchAnnotate".
     *
     * This request holds the parameters needed by the vision server.  After setting any optional
     * parameters, call the {@link AsyncBatchAnnotate#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest}
     * @return the request
     */
    public AsyncBatchAnnotate asyncBatchAnnotate(com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest content) throws java.io.IOException {
      AsyncBatchAnnotate result = new AsyncBatchAnnotate(content);
      initialize(result);
      return result;
    }

    public class AsyncBatchAnnotate extends VisionRequest<com.google.api.services.vision.v1p1beta1.model.Operation> {

      private static final String REST_PATH = "v1p1beta1/files:asyncBatchAnnotate";

      /**
       * Run asynchronous image detection and annotation for a list of generic files, such as PDF files,
       * which may contain multiple pages and multiple images per page. Progress and results can be
       * retrieved through the `google.longrunning.Operations` interface. `Operation.metadata` contains
       * `OperationMetadata` (metadata). `Operation.response` contains `AsyncBatchAnnotateFilesResponse`
       * (results).
       *
       * Create a request for the method "files.asyncBatchAnnotate".
       *
       * This request holds the parameters needed by the the vision server.  After setting any optional
       * parameters, call the {@link AsyncBatchAnnotate#execute()} method to invoke the remote
       * operation. <p> {@link AsyncBatchAnnotate#initialize(com.google.api.client.googleapis.services.A
       * bstractGoogleClientRequest)} must be called to initialize this instance immediately after
       * invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest}
       * @since 1.13
       */
      protected AsyncBatchAnnotate(com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1AsyncBatchAnnotateFilesRequest content) {
        super(Vision.this, "POST", REST_PATH, content, com.google.api.services.vision.v1p1beta1.model.Operation.class);
      }

      @Override
      public AsyncBatchAnnotate set$Xgafv(java.lang.String $Xgafv) {
        return (AsyncBatchAnnotate) super.set$Xgafv($Xgafv);
      }

      @Override
      public AsyncBatchAnnotate setAccessToken(java.lang.String accessToken) {
        return (AsyncBatchAnnotate) super.setAccessToken(accessToken);
      }

      @Override
      public AsyncBatchAnnotate setAlt(java.lang.String alt) {
        return (AsyncBatchAnnotate) super.setAlt(alt);
      }

      @Override
      public AsyncBatchAnnotate setCallback(java.lang.String callback) {
        return (AsyncBatchAnnotate) super.setCallback(callback);
      }

      @Override
      public AsyncBatchAnnotate setFields(java.lang.String fields) {
        return (AsyncBatchAnnotate) super.setFields(fields);
      }

      @Override
      public AsyncBatchAnnotate setKey(java.lang.String key) {
        return (AsyncBatchAnnotate) super.setKey(key);
      }

      @Override
      public AsyncBatchAnnotate setOauthToken(java.lang.String oauthToken) {
        return (AsyncBatchAnnotate) super.setOauthToken(oauthToken);
      }

      @Override
      public AsyncBatchAnnotate setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (AsyncBatchAnnotate) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AsyncBatchAnnotate setQuotaUser(java.lang.String quotaUser) {
        return (AsyncBatchAnnotate) super.setQuotaUser(quotaUser);
      }

      @Override
      public AsyncBatchAnnotate setUploadType(java.lang.String uploadType) {
        return (AsyncBatchAnnotate) super.setUploadType(uploadType);
      }

      @Override
      public AsyncBatchAnnotate setUploadProtocol(java.lang.String uploadProtocol) {
        return (AsyncBatchAnnotate) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public AsyncBatchAnnotate set(String parameterName, Object value) {
        return (AsyncBatchAnnotate) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Images collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Vision vision = new Vision(...);}
   *   {@code Vision.Images.List request = vision.images().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Images images() {
    return new Images();
  }

  /**
   * The "images" collection of methods.
   */
  public class Images {

    /**
     * Run image detection and annotation for a batch of images.
     *
     * Create a request for the method "images.annotate".
     *
     * This request holds the parameters needed by the vision server.  After setting any optional
     * parameters, call the {@link Annotate#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest}
     * @return the request
     */
    public Annotate annotate(com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest content) throws java.io.IOException {
      Annotate result = new Annotate(content);
      initialize(result);
      return result;
    }

    public class Annotate extends VisionRequest<com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse> {

      private static final String REST_PATH = "v1p1beta1/images:annotate";

      /**
       * Run image detection and annotation for a batch of images.
       *
       * Create a request for the method "images.annotate".
       *
       * This request holds the parameters needed by the the vision server.  After setting any optional
       * parameters, call the {@link Annotate#execute()} method to invoke the remote operation. <p>
       * {@link
       * Annotate#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest}
       * @since 1.13
       */
      protected Annotate(com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1BatchAnnotateImagesRequest content) {
        super(Vision.this, "POST", REST_PATH, content, com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse.class);
      }

      @Override
      public Annotate set$Xgafv(java.lang.String $Xgafv) {
        return (Annotate) super.set$Xgafv($Xgafv);
      }

      @Override
      public Annotate setAccessToken(java.lang.String accessToken) {
        return (Annotate) super.setAccessToken(accessToken);
      }

      @Override
      public Annotate setAlt(java.lang.String alt) {
        return (Annotate) super.setAlt(alt);
      }

      @Override
      public Annotate setCallback(java.lang.String callback) {
        return (Annotate) super.setCallback(callback);
      }

      @Override
      public Annotate setFields(java.lang.String fields) {
        return (Annotate) super.setFields(fields);
      }

      @Override
      public Annotate setKey(java.lang.String key) {
        return (Annotate) super.setKey(key);
      }

      @Override
      public Annotate setOauthToken(java.lang.String oauthToken) {
        return (Annotate) super.setOauthToken(oauthToken);
      }

      @Override
      public Annotate setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Annotate) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Annotate setQuotaUser(java.lang.String quotaUser) {
        return (Annotate) super.setQuotaUser(quotaUser);
      }

      @Override
      public Annotate setUploadType(java.lang.String uploadType) {
        return (Annotate) super.setUploadType(uploadType);
      }

      @Override
      public Annotate setUploadProtocol(java.lang.String uploadProtocol) {
        return (Annotate) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public Annotate set(String parameterName, Object value) {
        return (Annotate) super.set(parameterName, value);
      }
    }
    /**
     * Run asynchronous image detection and annotation for a list of images.
     *
     * Progress and results can be retrieved through the `google.longrunning.Operations` interface.
     * `Operation.metadata` contains `OperationMetadata` (metadata). `Operation.response` contains
     * `AsyncBatchAnnotateImagesResponse` (results).
     *
     * This service will write image annotation outputs to json files in customer GCS bucket, each json
     * file containing BatchAnnotateImagesResponse proto.
     *
     * Create a request for the method "images.asyncBatchAnnotate".
     *
     * This request holds the parameters needed by the vision server.  After setting any optional
     * parameters, call the {@link AsyncBatchAnnotate#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1AsyncBatchAnnotateImagesRequest}
     * @return the request
     */
    public AsyncBatchAnnotate asyncBatchAnnotate(com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1AsyncBatchAnnotateImagesRequest content) throws java.io.IOException {
      AsyncBatchAnnotate result = new AsyncBatchAnnotate(content);
      initialize(result);
      return result;
    }

    public class AsyncBatchAnnotate extends VisionRequest<com.google.api.services.vision.v1p1beta1.model.Operation> {

      private static final String REST_PATH = "v1p1beta1/images:asyncBatchAnnotate";

      /**
       * Run asynchronous image detection and annotation for a list of images.
       *
       * Progress and results can be retrieved through the `google.longrunning.Operations` interface.
       * `Operation.metadata` contains `OperationMetadata` (metadata). `Operation.response` contains
       * `AsyncBatchAnnotateImagesResponse` (results).
       *
       * This service will write image annotation outputs to json files in customer GCS bucket, each
       * json file containing BatchAnnotateImagesResponse proto.
       *
       * Create a request for the method "images.asyncBatchAnnotate".
       *
       * This request holds the parameters needed by the the vision server.  After setting any optional
       * parameters, call the {@link AsyncBatchAnnotate#execute()} method to invoke the remote
       * operation. <p> {@link AsyncBatchAnnotate#initialize(com.google.api.client.googleapis.services.A
       * bstractGoogleClientRequest)} must be called to initialize this instance immediately after
       * invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1AsyncBatchAnnotateImagesRequest}
       * @since 1.13
       */
      protected AsyncBatchAnnotate(com.google.api.services.vision.v1p1beta1.model.GoogleCloudVisionV1p1beta1AsyncBatchAnnotateImagesRequest content) {
        super(Vision.this, "POST", REST_PATH, content, com.google.api.services.vision.v1p1beta1.model.Operation.class);
      }

      @Override
      public AsyncBatchAnnotate set$Xgafv(java.lang.String $Xgafv) {
        return (AsyncBatchAnnotate) super.set$Xgafv($Xgafv);
      }

      @Override
      public AsyncBatchAnnotate setAccessToken(java.lang.String accessToken) {
        return (AsyncBatchAnnotate) super.setAccessToken(accessToken);
      }

      @Override
      public AsyncBatchAnnotate setAlt(java.lang.String alt) {
        return (AsyncBatchAnnotate) super.setAlt(alt);
      }

      @Override
      public AsyncBatchAnnotate setCallback(java.lang.String callback) {
        return (AsyncBatchAnnotate) super.setCallback(callback);
      }

      @Override
      public AsyncBatchAnnotate setFields(java.lang.String fields) {
        return (AsyncBatchAnnotate) super.setFields(fields);
      }

      @Override
      public AsyncBatchAnnotate setKey(java.lang.String key) {
        return (AsyncBatchAnnotate) super.setKey(key);
      }

      @Override
      public AsyncBatchAnnotate setOauthToken(java.lang.String oauthToken) {
        return (AsyncBatchAnnotate) super.setOauthToken(oauthToken);
      }

      @Override
      public AsyncBatchAnnotate setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (AsyncBatchAnnotate) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AsyncBatchAnnotate setQuotaUser(java.lang.String quotaUser) {
        return (AsyncBatchAnnotate) super.setQuotaUser(quotaUser);
      }

      @Override
      public AsyncBatchAnnotate setUploadType(java.lang.String uploadType) {
        return (AsyncBatchAnnotate) super.setUploadType(uploadType);
      }

      @Override
      public AsyncBatchAnnotate setUploadProtocol(java.lang.String uploadProtocol) {
        return (AsyncBatchAnnotate) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public AsyncBatchAnnotate set(String parameterName, Object value) {
        return (AsyncBatchAnnotate) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Vision}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Vision}. */
    @Override
    public Vision build() {
      return new Vision(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link VisionRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setVisionRequestInitializer(
        VisionRequestInitializer visionRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(visionRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}