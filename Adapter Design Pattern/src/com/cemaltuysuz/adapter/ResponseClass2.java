package com.cemaltuysuz.adapter;

public class ResponseClass2 implements DebugLog{

    @Override
    public void debugLogging() {
        // Log Type is Debug
        System.out.println(this.getClass().getName() + " Logging...");
    }
}
