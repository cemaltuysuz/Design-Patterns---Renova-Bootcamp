package com.cemaltuysuz.strategy;

public class MD5 implements Crypto{
    @Override
    public void encrypt() {
        System.out.println("Encrypted with MD5");
    }

    @Override
    public void decrypt() {
        System.out.println("Decrypted with MD5");
    }
}
