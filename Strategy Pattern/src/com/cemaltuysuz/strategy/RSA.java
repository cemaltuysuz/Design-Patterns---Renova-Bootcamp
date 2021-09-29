package com.cemaltuysuz.strategy;

public class RSA implements Crypto{
    @Override
    public void encrypt() {
        System.out.println("Encrypted with RSA");
    }

    @Override
    public void decrypt() {
        System.out.println("Decrypted with RSA");
    }
}
