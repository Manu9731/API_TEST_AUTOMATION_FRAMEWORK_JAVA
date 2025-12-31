package com.api.test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.api.listeners.TestListeners.class)
public class SampleTest {

    @Test
    public void login(){
//        RequestSpecification requestSpecification = ;
//        Response response = given()
//                .baseUri("http://64.227.160.186:8080/").contentType(ContentType.JSON)
//                .body("{ \"userName\": \"Manu MG\", \"password\": \"Manu@123\" }").post("/api/auth/login");
//        System.out.println(response.asPrettyString());

        RequestSpecification requestSpecification = given().baseUri("https://petstore.swagger.io/v2");
        Response response = requestSpecification.get("/store/inventory");
        System.out.println(response.asPrettyString());


    }

}
