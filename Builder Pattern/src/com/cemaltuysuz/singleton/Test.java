package com.cemaltuysuz.singleton;
/**
 * @author cemaltuysuz
 * */

public class Test {

    public static void main(String[] args) {

        TimeOut timeOut = new TimeOut();
        LoggingInterceptor interceptor = new LoggingInterceptor();
        // response
        OnResponse response = new OnResponse() {
            @Override
            public void success() {
                System.out.println("Success");
            }

            @Override
            public void error(String message) {
                System.out.println("Error");
            }
        };

        // Create Request class with Builder
	Request request =
            new Request.Builder()
                    .timeOut(timeOut)
                    .onResponse(response)
                    .build();

    System.out.println(request);



    }
}
