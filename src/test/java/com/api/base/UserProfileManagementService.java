package com.api.base;

import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService {
    private static final String BASE_URL = "/api/users/";
    private static final String PROFILE = BASE_URL+"profile";


    public Response getProfile(String token){
        this.seAuthToken(token);
        return this.getRequest(PROFILE);
    }

    public Response updateProfile(Object payload, String token){
        this.seAuthToken(token);
        return this.putRequest(payload, PROFILE);
    }

    public Response updateFewInfo(Object payload, String token){
        this.seAuthToken(token);
        return this.patchRequest(payload, PROFILE);
    }

}
