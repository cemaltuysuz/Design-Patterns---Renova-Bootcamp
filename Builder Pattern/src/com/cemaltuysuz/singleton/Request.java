package com.cemaltuysuz.singleton;
/**
 * This class sends request the api.
 *
 * */

public class Request {
    private LoggingInterceptor loggingInterceptor;
    private TimeOut timeOut;
    private OnResponse onResponse;

    public Request(LoggingInterceptor loggingInterceptor, TimeOut timeOut, OnResponse onResponse) {
        this.loggingInterceptor = loggingInterceptor;
        this.timeOut = timeOut;
        this.onResponse = onResponse;
    }

    public static class Builder{
        private LoggingInterceptor loggingInterceptor;
        private TimeOut timeOut;
        private OnResponse onResponse;

        public Builder() {}

        public Builder loggingInterceptor(LoggingInterceptor interceptor){
            this.loggingInterceptor = interceptor;
            return this;
        }

        public Builder timeOut(TimeOut timeOut){
            this.timeOut = timeOut;
            return this;
        }

        public Builder onResponse(OnResponse onResponse){
            this.onResponse = onResponse;
            return this;
        }

        public Request build(){
            return new Request(this.loggingInterceptor,this.timeOut,this.onResponse);
        }
    }

    @Override
    public String toString() {
        return "Request{" +
                "loggingInterceptor=" + loggingInterceptor +
                ", timeOut=" + timeOut +
                ", onResponse=" + onResponse +
                '}';
    }
}
