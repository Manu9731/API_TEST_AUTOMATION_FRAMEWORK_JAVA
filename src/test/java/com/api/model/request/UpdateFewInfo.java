package com.api.model.request;

public class UpdateFewInfo {

    private String mobileNumber;

    public UpdateFewInfo(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber(){
        return  this.mobileNumber;
    }

    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    public static class Builder{
        private String mobileNumber;

        public Builder mobileNumber(String mobileNumber){
            this.mobileNumber = mobileNumber;
            return  this;
        }

        public UpdateFewInfo build(){
            return new UpdateFewInfo(mobileNumber);
        }

    }

}
