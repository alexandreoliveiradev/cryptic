### Cryptic

Cryptic is an API that allows you to request a POST method to localhost:8080/encrypter 
or localhost:8080/decrypter which will give you an encrypting message based on your input. 

Since the API is not actually hosted anywhere, you'll have to use cd (Change Directory) into
the project root and perform "mvn spring-boot:run" on your command line. You can try using
Postman using a POST method with your text on the body.

#### It should look something like this:
Encrypting text:

![encrypt](https://imgur.com/hZA9fgU.png)

Decrypting text:

![decrypt](https://imgur.com/g4Crd0Z.png)

Mainly used to hide emails or other small sentences, with no specific intents. 
The next version will be deployed in netlify with an actual frontend.

Thank you for visiting,

Alexandre Oliveira

Last update was on June 29, 2020.
