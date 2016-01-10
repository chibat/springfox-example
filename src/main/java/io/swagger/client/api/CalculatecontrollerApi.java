package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Result;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-10T11:02:18.377+09:00")
public class CalculatecontrollerApi {
  private ApiClient apiClient;

  public CalculatecontrollerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CalculatecontrollerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * get
   * 
   * @param arg1 arg1
   * @param arg2 arg2
   * @return Result
   */
  public Result getUsingGET(Integer arg1, Integer arg2) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'arg1' is set
     if (arg1 == null) {
        throw new ApiException(400, "Missing the required parameter 'arg1' when calling getUsingGET");
     }
     
     // verify the required parameter 'arg2' is set
     if (arg2 == null) {
        throw new ApiException(400, "Missing the required parameter 'arg2' when calling getUsingGET");
     }
     
    // create path and map variables
    String path = "/calculate".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "arg1", arg1));
    
    queryParams.addAll(apiClient.parameterToPairs("", "arg2", arg2));
    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Result> returnType = new GenericType<Result>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
