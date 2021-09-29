package com.cemaltuysuz.strategy;

public class Context {
    Crypto crypto;

    public Context(Crypto crypto) {
        this.crypto = crypto;
    }

    public void encryptAction (){
        crypto.encrypt();
    }

    public void decryptAction (){
        crypto.decrypt();
    }
}
