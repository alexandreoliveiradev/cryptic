package project.main.java.services;

import project.main.java.model.Decrypt;
import project.main.java.model.Encrypt;

public class Crypt {

    private final Encrypt encrypter;
    private final Decrypt decrypter;

    public Crypt() {
        this.encrypter = new Encrypt();
        this.decrypter = new Decrypt();
    }

    public String encryptText(String text){
        return encrypter.encryptText(text);
    }

    public String decryptText(String text){
        return decrypter.decryptText(text);
    }

}
