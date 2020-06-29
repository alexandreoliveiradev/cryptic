package project.main.test.model;

import project.main.java.model.Decrypt;
import org.junit.jupiter.api.Test;

class DecryptTest {

    Decrypt decrypt = new Decrypt();

    @Test
    void encryptText() {
        String email1 = "«p;iqv569#pzixsg!ai9793;8vnc59£";
        String email2 = "ºz!4v446>;4cd6t*;}:afaa»";
        String email3 = "«73i>;569p7s!bid4p6!d>z39lº";

        String output1 = decrypt.decryptText(email1);
        String output2 = decrypt.decryptText(email2);
        String output3 = decrypt.decryptText(email3);

        System.out.println("output1: " + output1);
        System.out.println("output2: " + output2);
        System.out.println("output3: " + output3);
    }



}