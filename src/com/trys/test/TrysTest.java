package com.trys.test;

import java.io.*;

public class TrysTest {
	public static void main(String[] args) {
        FileReader fr=null;
        try {
            fr=new FileReader("d:\\aa.text");
            System.out.println("aaa");
        } catch (Exception e) {
            System.out.println("进入catch");
            System.out.println("message="+e+"\n"); 
            e.printStackTrace();   
        }
        finally
        {
            System.out.println("进入finally");
            if(fr!=null);
            {
                try {
                    fr.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
        System.out.println("OK");
	}
}
