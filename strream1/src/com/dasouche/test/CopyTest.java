package com.dasouche.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

/**
 * Created by liuqizhe on 15/9/18.
 */
public class CopyTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.dat");
        FileOutputStream fos = new FileOutputStream("fos_copy.dat");

        int d = -1 ;
        while ((d=fis.read()) != -1) {
            fos.write(d);
        }

        fis.close();
        fos.close();

    }
}
