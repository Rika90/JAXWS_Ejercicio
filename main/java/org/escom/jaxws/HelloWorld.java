package org.escom.jaxws;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

