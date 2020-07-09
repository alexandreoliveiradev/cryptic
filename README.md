### Cryptic

Cryptic is an API that allows you to request a POST method to localhost:8080/encrypter 
or localhost:8080/decrypter which will give you an encrypting message based on your input. 
The message you encrypt can only be decrypted here, and this is nice.

Since the API is not actually hosted anywhere, you'll have to use cd (Change Directory) into
the project root and perform "mvn spring-boot:run" on your command line. You can try using
Postman using a POST method with your text on the body.

#### It should look something like this:
Encrypting text:

![encrypt](https://imgur.com/eyXF3Dw.png)
![encrypt2](https://imgur.com/bnnBFq6.png)

Decrypting text:

![decrypt](https://imgur.com/YSWv8W0.png)
![decrypt2](https://imgur.com/g2NKMSH.png)

Mainly used to hide emails or other small sentences, with no specific intents. 
The application is hosted at netlify so you can just click [here](https://cryptit.netlify.app).

Thank you for visiting,

Alexandre Oliveira

Last update was on June 29, 2020.
