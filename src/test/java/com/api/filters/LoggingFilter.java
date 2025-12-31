package com.api.filters;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

public class LoggingFilter implements Filter {

    private static Logger logger = LogManager.getLogger(LoggingFilter.class);


    @Override
    public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec, FilterContext ctx) {
        logRequest(requestSpec);
        Response response = ctx.next(requestSpec, responseSpec);
        logResponse(response);
        return response; //test for assertion
    }

    public void logRequest(FilterableRequestSpecification requestSpec){

        logger.info("BASE URI "+requestSpec.getBaseUri());
        logger.info("Request Header", requestSpec.getHeaders());
        logger.info("Request Payload", Optional.ofNullable(requestSpec.getBody()));


    }

    public void logResponse(Response response){
        logger.info("BASE URI "+response.getStatusCode());
        logger.info("Request Payload", response.headers());
        logger.info("Request Header", response.getBody().prettyPrint());
    }


}
