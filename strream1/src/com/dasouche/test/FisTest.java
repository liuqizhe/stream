package com.dasouche.test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by liuqizhe on 15/9/18.
 */
public class FisTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.dat") ;

        int d = -1 ;
        while ((d = fis.read()) != -1) {
            char c = (char)d ;
            System.out.print(c);
        }
        fis.close();
    }
}
