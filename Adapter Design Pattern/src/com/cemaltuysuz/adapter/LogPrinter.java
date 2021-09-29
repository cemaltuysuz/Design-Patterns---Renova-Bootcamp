package com.cemaltuysuz.adapter;

import java.util.ArrayList;

public class LogPrinter {
    ArrayList<DebugLog> logs;

    public LogPrinter() {
        logs = new ArrayList<DebugLog>();
    }

    void insertTheArray (DebugLog object){
        logs.add(object);
    }

    public void printLogs(){
        if (!logs.isEmpty()){
            for (DebugLog d : logs){
                d.debugLogging();
            }
        }
    }
}
