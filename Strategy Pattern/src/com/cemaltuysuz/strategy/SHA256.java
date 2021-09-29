package com.cemaltuysuz.strategy;

public class SHA256 implements Crypto{
    @Override
    public void encrypt() {
        System.out.println("Encrypted with SHA256");
    }

    @Override
    public void decrypt() {
        System.out.println("Decrypted with SHA256");
    }
}
