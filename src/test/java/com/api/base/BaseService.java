package com.api.base;

import com.api.filters.LoggingFilter;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class BaseService {

    private static final String BASE_URL = "http://64.227.160.186:8080/";
    private RequestSpecification requestSpecification;

    static {
        filters(new LoggingFilter());
    }

    public BaseService(){
        this.requestSpecification = given().baseUri(BASE_URL);
    }

    protected void seAuthToken(String token){
        this.requestSpecification.header("Authorization", "Bearer "+token );
    }

    protected Response postRequest(Object payload, String endPoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endPoint);
    }

    protected Response getRequest(String endpoint){
        return requestSpecification.get(endpoint);
    }

    protected Response putRequest(Object payload, String endpoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);
    }

    protected Response patchRequest(Object payload, String endpoint){
        return requestSpecification.contentType(ContentType.JSON).body(payload).patch(endpoint);
    }


}
