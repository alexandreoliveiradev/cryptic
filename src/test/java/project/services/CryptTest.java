package project.main.test.services;

import project.main.java.services.Crypt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CryptTest {


    @Test
    public  void Crypter(){
        Crypt service = new Crypt();

        String text = "dorme bem linda <3";

        String result = service.encryptText(text);

        System.out.println(result);

        result = service.decryptText(result);

        assertEquals(text, result);
    }


}
