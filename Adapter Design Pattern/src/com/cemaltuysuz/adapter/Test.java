package com.cemaltuysuz.adapter;

/**
 * @author cemaltuysuz
 * @date 29.09.2021
 *
 * --------  Adapter Design Pattern --------
 * Açıklama :
 * Bu proje örneğinde düşünsel olarak kullanıcımız network işlemlerinde bulunuyor.
 * Network işlemlerini Debug kısmına loglayabilmek adına bir arayüz oluşturarak
 * bu arayüzü post işlemini gerçekleştireceği ve cevabını alacağı sınıflara implement ediyor.
 *              @see PostClass1,PostClass2,ResponseClass1,ResponseClass2
 *
 * Sonrasında post sınıflarında yapılacak loglamaların info tipinde olması gerektiği kararı alınıyor,
 * lakin oluşturulacak arayüz ve sistemde logları yazdıracak sınıf gelen nesnelerde DebugLog kalıtımı aradığı için
 * uyumsuzluk oluşturuyor. Bu sorun Adapter Pattern'i sayesinde düzeltiliyor.
 * */

public class Test {

    public static void main(String[] args) {
        LogPrinter printer   = new LogPrinter();

        PostClass1 post1 = new PostClass1();
        PostClass2 post2 = new PostClass2();

        ResponseClass1 response1 = new ResponseClass1();
        ResponseClass2 response2 = new ResponseClass2();

        printer.insertTheArray(new LogPrinterAdapter(post1));
        printer.insertTheArray(new LogPrinterAdapter(post2));
        printer.insertTheArray(response1);
        printer.insertTheArray(response2);

        printer.printLogs();


    }
}
