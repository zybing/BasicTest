package zyb.com.socket;
import java.net.*;
import java.io.*;
import java.util.Date;
/**
 * Created by yanbing1 on 11/24/2016.
 */
public class SocketMonitor {
    public static int DEFAULT_PORT = 8001;

    public static void main(String[] args) {
        int port;
        try {
            port = Integer.parseInt(args[1]);
        } catch (RuntimeException ex) {
            port = DEFAULT_PORT;
        }

        Socket socket = null;
        try {
            //InetAddress tt=InetAddress.getLocalHost();
            socket = new Socket("127.0.0.1", port,InetAddress.getByName("127.0.0.1"),7998);
            socket.setSoTimeout(25000);
            InputStream in = socket.getInputStream();
            StringBuilder time = new StringBuilder();
            InputStreamReader reader = new InputStreamReader(in, "ASCII");
            for (int c = reader.read(); c != -1; c = reader.read()) {
                time.append((char) c);
                if(c=='\n')
                    System.out.println(time);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException ex) {
                    // ignore
                }
            }
        }
    }
}
