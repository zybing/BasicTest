package zyb.com.JoinInterrupt;

import java.util.concurrent.TimeUnit;

/**
 * Created by ybzhang on 2016/8/30.
 */
public class Interrupttest1 {
    public static void main(String[] args){
        Customer customer=new Customer("customer");
        Customer burden=new Customer("burden");
        customer.setBurden(burden);
        try {
            customer.start();
            customer.interrupt();
            customer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("main interrupt");
        }
    }
}
class Customer extends Thread{
    private String name;
    private Customer burden;
    public void setBurden(Customer burden){
        this.burden=burden;
    }
    public Customer(String name){
        this.name=name;
    }
    @Override
    public void run(){
        for(int i=0;i<3;i++){
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println(name+i+"sleep");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("customer interrupt");
            }
        }
        if(burden!=null){
            try {
                burden.start();
                burden.join();
                interrupt();
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("burden interrupt");
            }
        }
    }
}
