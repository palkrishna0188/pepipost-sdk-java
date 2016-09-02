/**
 * Pepipost API v1.0
 * Pepipost API documentation
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.Emailv1;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailApi {
    private ApiClient apiClient;

    public EmailApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmailApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for apiWebSendJsonPost */
    private com.squareup.okhttp.Call apiWebSendJsonPostCall(Emailv1 data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling apiWebSendJsonPost(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/api/web.send.json".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * &#x60;Sending Mails&#x60; – This API is used for sending emails. Pepipost supports REST as well JSON formats for the input. This is JSON API. 
     * @param data Data in JSON format (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void apiWebSendJsonPost(Emailv1 data) throws ApiException {
        apiWebSendJsonPostWithHttpInfo(data);
    }

    /**
     * 
     * &#x60;Sending Mails&#x60; – This API is used for sending emails. Pepipost supports REST as well JSON formats for the input. This is JSON API. 
     * @param data Data in JSON format (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> apiWebSendJsonPostWithHttpInfo(Emailv1 data) throws ApiException {
        com.squareup.okhttp.Call call = apiWebSendJsonPostCall(data, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * &#x60;Sending Mails&#x60; – This API is used for sending emails. Pepipost supports REST as well JSON formats for the input. This is JSON API. 
     * @param data Data in JSON format (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiWebSendJsonPostAsync(Emailv1 data, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiWebSendJsonPostCall(data, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for apiWebSendRestGet */
    private com.squareup.okhttp.Call apiWebSendRestGetCall(String apiKey, String from, String subject, String content, String recipients, String fromname, String replytoid, Boolean footer, Integer template, String attachmentid, Boolean clicktrack, Boolean opentrack, String bcc, String ATT_NAME, String X_APIHEADER, String tags, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling apiWebSendRestGet(Async)");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new ApiException("Missing the required parameter 'from' when calling apiWebSendRestGet(Async)");
        }
        
        // verify the required parameter 'subject' is set
        if (subject == null) {
            throw new ApiException("Missing the required parameter 'subject' when calling apiWebSendRestGet(Async)");
        }
        
        // verify the required parameter 'content' is set
        if (content == null) {
            throw new ApiException("Missing the required parameter 'content' when calling apiWebSendRestGet(Async)");
        }
        
        // verify the required parameter 'recipients' is set
        if (recipients == null) {
            throw new ApiException("Missing the required parameter 'recipients' when calling apiWebSendRestGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/api/web.send.rest".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (apiKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "api_key", apiKey));
        if (fromname != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromname", fromname));
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
        if (replytoid != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "replytoid", replytoid));
        if (subject != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "subject", subject));
        if (content != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "content", content));
        if (footer != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "footer", footer));
        if (template != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "template", template));
        if (attachmentid != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "attachmentid", attachmentid));
        if (clicktrack != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "clicktrack", clicktrack));
        if (opentrack != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "opentrack", opentrack));
        if (bcc != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bcc", bcc));
        if (recipients != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipients", recipients));
        if (ATT_NAME != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "ATT_NAME", ATT_NAME));
        if (X_APIHEADER != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "X-APIHEADER", X_APIHEADER));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * &#x60;Sending Mails&#x60; – This API is used for sending emails. Pepipost supports REST as well JSON formats for the input 
     * @param apiKey Your API Key (required)
     * @param from From email address (required)
     * @param subject Subject of the Email (required)
     * @param content Email body in html (to use attributes to display dynamic values such as name, account number, etc. for ex. [% NAME %] for ATT_NAME , [% AGE %] for ATT_AGE etc.) (required)
     * @param recipients Email addresses for recipients (multiple values allowed) (required)
     * @param fromname Email Sender name (optional)
     * @param replytoid Reply to email address (optional)
     * @param footer Set &#39;0&#39; or &#39;1&#39; in order to include footer or not (optional, default to true)
     * @param template Email template ID (optional)
     * @param attachmentid specify uploaded attachments id (Multiple attachments are allowed) (optional)
     * @param clicktrack set ‘0’ or ‘1’ in-order to disable or enable the click-track (optional, default to true)
     * @param opentrack set open-track value to ‘0’ or ‘1’ in-order to disable or enable (optional, default to true)
     * @param bcc Email address for bcc (optional)
     * @param ATT_NAME Specify attributes followed by ATT_ for recipient to personalized email for ex. ATT_NAME for name, ATT_AGE for age etc. (Multiple attributes are allowed) (optional)
     * @param X_APIHEADER Your defined unique identifier (optional)
     * @param tags To relate each message. Useful for reports. (optional, default to )
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void apiWebSendRestGet(String apiKey, String from, String subject, String content, String recipients, String fromname, String replytoid, Boolean footer, Integer template, String attachmentid, Boolean clicktrack, Boolean opentrack, String bcc, String ATT_NAME, String X_APIHEADER, String tags) throws ApiException {
        apiWebSendRestGetWithHttpInfo(apiKey, from, subject, content, recipients, fromname, replytoid, footer, template, attachmentid, clicktrack, opentrack, bcc, ATT_NAME, X_APIHEADER, tags);
    }

    /**
     * 
     * &#x60;Sending Mails&#x60; – This API is used for sending emails. Pepipost supports REST as well JSON formats for the input 
     * @param apiKey Your API Key (required)
     * @param from From email address (required)
     * @param subject Subject of the Email (required)
     * @param content Email body in html (to use attributes to display dynamic values such as name, account number, etc. for ex. [% NAME %] for ATT_NAME , [% AGE %] for ATT_AGE etc.) (required)
     * @param recipients Email addresses for recipients (multiple values allowed) (required)
     * @param fromname Email Sender name (optional)
     * @param replytoid Reply to email address (optional)
     * @param footer Set &#39;0&#39; or &#39;1&#39; in order to include footer or not (optional, default to true)
     * @param template Email template ID (optional)
     * @param attachmentid specify uploaded attachments id (Multiple attachments are allowed) (optional)
     * @param clicktrack set ‘0’ or ‘1’ in-order to disable or enable the click-track (optional, default to true)
     * @param opentrack set open-track value to ‘0’ or ‘1’ in-order to disable or enable (optional, default to true)
     * @param bcc Email address for bcc (optional)
     * @param ATT_NAME Specify attributes followed by ATT_ for recipient to personalized email for ex. ATT_NAME for name, ATT_AGE for age etc. (Multiple attributes are allowed) (optional)
     * @param X_APIHEADER Your defined unique identifier (optional)
     * @param tags To relate each message. Useful for reports. (optional, default to )
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> apiWebSendRestGetWithHttpInfo(String apiKey, String from, String subject, String content, String recipients, String fromname, String replytoid, Boolean footer, Integer template, String attachmentid, Boolean clicktrack, Boolean opentrack, String bcc, String ATT_NAME, String X_APIHEADER, String tags) throws ApiException {
        com.squareup.okhttp.Call call = apiWebSendRestGetCall(apiKey, from, subject, content, recipients, fromname, replytoid, footer, template, attachmentid, clicktrack, opentrack, bcc, ATT_NAME, X_APIHEADER, tags, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * &#x60;Sending Mails&#x60; – This API is used for sending emails. Pepipost supports REST as well JSON formats for the input 
     * @param apiKey Your API Key (required)
     * @param from From email address (required)
     * @param subject Subject of the Email (required)
     * @param content Email body in html (to use attributes to display dynamic values such as name, account number, etc. for ex. [% NAME %] for ATT_NAME , [% AGE %] for ATT_AGE etc.) (required)
     * @param recipients Email addresses for recipients (multiple values allowed) (required)
     * @param fromname Email Sender name (optional)
     * @param replytoid Reply to email address (optional)
     * @param footer Set &#39;0&#39; or &#39;1&#39; in order to include footer or not (optional, default to true)
     * @param template Email template ID (optional)
     * @param attachmentid specify uploaded attachments id (Multiple attachments are allowed) (optional)
     * @param clicktrack set ‘0’ or ‘1’ in-order to disable or enable the click-track (optional, default to true)
     * @param opentrack set open-track value to ‘0’ or ‘1’ in-order to disable or enable (optional, default to true)
     * @param bcc Email address for bcc (optional)
     * @param ATT_NAME Specify attributes followed by ATT_ for recipient to personalized email for ex. ATT_NAME for name, ATT_AGE for age etc. (Multiple attributes are allowed) (optional)
     * @param X_APIHEADER Your defined unique identifier (optional)
     * @param tags To relate each message. Useful for reports. (optional, default to )
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiWebSendRestGetAsync(String apiKey, String from, String subject, String content, String recipients, String fromname, String replytoid, Boolean footer, Integer template, String attachmentid, Boolean clicktrack, Boolean opentrack, String bcc, String ATT_NAME, String X_APIHEADER, String tags, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiWebSendRestGetCall(apiKey, from, subject, content, recipients, fromname, replytoid, footer, template, attachmentid, clicktrack, opentrack, bcc, ATT_NAME, X_APIHEADER, tags, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}