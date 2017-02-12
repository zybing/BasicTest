package zyb.com;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;

import java.util.Hashtable;
import zyb.com.Inter.inter_test;

/**
 * Created by ybzhang on 2016/8/27.
 */
public class TestWorld {
    public static void main(String[] args){
        System.out.println("test world123!");
        System.out.println(inter_test.hehe);
        HelloWorld.test();
        int a=3;
        a++;
        TestWorld tmp=new TestWorld();
        try
        {
            InputStream is=tmp.getClass().getResourceAsStream("/resource/res.txt");
            InputStreamReader rr=new InputStreamReader(is);
            BufferedReader  rre=new BufferedReader(rr);
            System.out.println(is.toString());

        }
        catch(Exception ex){

        }
        java.util.Hashtable<String,String> hh=new java.util.Hashtable<String,String>();
    }
    public String test(){
        return "test success";
    }
    public String hehe(String hehe){
        hehe=hehe+"123";
        return hehe;
    }
}
