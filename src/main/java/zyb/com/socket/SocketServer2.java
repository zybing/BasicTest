package zyb.com.socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by yanbing1 on 11/24/2016.
 */
public class SocketServer2 {
    public final static int PORT = 8001;

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(PORT)) {
            try (Socket connection = server.accept()) {
                System.out.println("accept");
                System.out.println(connection.getPort());
                while(true)
                {
                    Writer out = new OutputStreamWriter(connection.getOutputStream());
                    Date now = new Date();
                    out.write(now.toString() +"\r\n");
                    out.flush();
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (IOException ex) {}
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
