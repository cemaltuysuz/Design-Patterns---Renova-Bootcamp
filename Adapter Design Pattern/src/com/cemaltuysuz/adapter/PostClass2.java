package com.cemaltuysuz.adapter;

public class PostClass2 implements InfoLog{
    @Override
    public void InfoLogging() {
        // Log Type is Info
        System.out.println(this.getClass().getName() + " Logging...");
    }
}
