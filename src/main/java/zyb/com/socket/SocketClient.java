package zyb.com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by yanbing1 on 11/24/2016.
 */
public class SocketClient {
    public static int DEFAULT_PORT = 8000;

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
            socket = new Socket("127.0.0.1", port,InetAddress.getByName("127.0.0.1"),7999);
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
