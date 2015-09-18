package com.dasouche.test;

import java.io.IOException;
import java.io.FileOutputStream;


/**
 * Created by liuqizhe on 15/9/18.
 */
public class FosTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.dat", true) ;


        fos.write("helloworld".getBytes("utf-8"));

        fos.close();

    }

}
