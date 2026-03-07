package hub.guzio.SaneServer;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;

import java.net.URI;

public class TestHandler extends SmartHandler {
    @Override
    protected Response onRequest(HttpExchange rq, Headers resp, URI rawPath, String[] processedPath, String[] queryParameters) throws Throwable {
        lg.log("Seen "+processedPath.length+" path components (\""+String.join("\", \"", processedPath)+"\") and "+queryParameters.length+" query params (\""+String.join("\", \"", queryParameters)+"\"), in a call to: "+rawPath.toString());
        return new Response(200, "plain", "200 OK");
    }
}