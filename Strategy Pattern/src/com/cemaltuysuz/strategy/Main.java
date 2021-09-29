package com.cemaltuysuz.strategy;

/**
 * Bir işlemi yapabileceğimiz birden fazla algoritmaya sahipsek kullanılır.
 * */

public class Main {
    public static void main(String[] args) {


	    Context context = new Context(new MD5());
        context.encryptAction();
        context.decryptAction();

        Context context2 = new Context(new RSA());
        context2.encryptAction();
        context2.decryptAction();

        Context context3 = new Context(new SHA256());
        context3.encryptAction();
        context3.decryptAction();
    }
}
