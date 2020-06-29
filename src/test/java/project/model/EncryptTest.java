package project.main.test.model;

import org.junit.jupiter.api.Test;
import project.main.java.model.Encrypt;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EncryptTest {

    Encrypt encrypt = new Encrypt();

    @Test
    void encryptText() {
        String email1 = "alex.dragao12@hotmail.com";
        String email2 = "1191743@isep.ipp.pt";
        String email3 = "bart.simpson@gmail.org";

        String output1 = encrypt.encryptText(email1);
        String output2 = encrypt.encryptText(email2);
        String output3 = encrypt.encryptText(email3);

        System.out.println("output1: " + output1);
        System.out.println("output2: " + output2);
        System.out.println("output3: " + output3);
    }

    @Test
    void everySix(){
        String input = "hello mate, what are you up to?";

        String output = Encrypt.everySix(input);

        int expectedSize = input.length() + ((input.length()-1)/6) + 2;

        System.out.println(output);

        assertEquals(expectedSize, output.length());
    }

    @Test
    void reverse(){
        String input = "hello mate";
        String result = Encrypt.reverse(input);
        String expected = "etam olleh";

        assertEquals(expected, result);
    }

    @Test
    void point(){
        for (int i = 0; i < 10; i++){
            System.out.println(Encrypt.point());
        }
    }

    @Test
    void at(){
        for (int i = 0; i < 10; i++){
            System.out.println(Encrypt.at());
        }
    }

    @Test
    void every(){
        for (int i = 0; i < 10; i++){
            System.out.println(Encrypt.every());
        }
    }

}