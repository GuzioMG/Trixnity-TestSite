package hub.guzio.MatrixTest;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpHandlers;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    static void main() throws IOException {

        var sv = HttpServer.create(new InetSocketAddress(8080), 1000);
        sv.createContext("/", new Handler());
        sv.start();
    }
}