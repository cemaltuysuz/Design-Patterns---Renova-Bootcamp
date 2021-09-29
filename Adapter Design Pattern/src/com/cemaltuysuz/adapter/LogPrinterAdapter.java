package com.cemaltuysuz.adapter;

public class LogPrinterAdapter implements DebugLog {

    InfoLog infoLog;

    public LogPrinterAdapter(InfoLog infoLog) {
        this.infoLog = infoLog;
    }

    @Override
    public void debugLogging() {
        infoLog.InfoLogging();
    }
}
