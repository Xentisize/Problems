package ch01;

import org.w3c.dom.ls.LSOutput;

public class HelloWorld {

    public static void main(String[] args) {
        HelloMessage hm;
        hm = new HelloMessage();

        System.out.println(hm.getMessage());

        hm.setMessage("Hello, World!");
        System.out.println(hm.getMessage());
    }

}
