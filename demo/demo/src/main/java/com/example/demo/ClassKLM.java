// File: ClassKLM.java
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassKLM {

    @Autowired
    @Qualifier("classABC") // we can also change
    private InterfacePQR pqr;

    public void show() {
        pqr.display(); // Will call the display() method from the class specified
    }
}
