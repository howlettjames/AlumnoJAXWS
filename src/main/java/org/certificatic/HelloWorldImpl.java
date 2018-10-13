
package org.certificatic;

import javax.jws.WebService;

@WebService(endpointInterface = "org.certificatic.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

