package zyb.com.inet;

/**
 * Created by yanbing1 on 9/7/2016.
 */
import java.net.*;

public class MyAddress {

    public static void main (String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            String IP=address.getHostAddress();
            int lastPoint = IP.lastIndexOf('.');
            String ipHead = IP.substring(0, ++lastPoint);
            SecurityManager security=new SecurityManager();
            System.setSecurityManager(security);
            //SecurityManager security = System.getSecurityManager();
            security.checkConnect("127.0.0.1",80);
            //System.out.println(ipHead);
        } catch (UnknownHostException ex) {
            System.out.println("Could not find this computer's address.");
        }
    }
}

