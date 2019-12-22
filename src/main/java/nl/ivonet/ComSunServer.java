/*
 * Copyright 2019 Ivo Woltring <WebMaster@ivonet.nl>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nl.ivonet;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
/**
 * I had expected this one to also not work anymore after java 9+, but to my surprise it kept on working??
 */
public class ComSunServer {
    public static void main(String[] args) throws IOException {
        String payload = "https://www.IvoNet.nl";
        HttpServer server = HttpServer.create(new InetSocketAddress(4250), 0);
        HttpContext context = server.createContext("/java");
        context.setHandler((he) -> {
        	he.sendResponseHeaders(200, payload.getBytes().length);
        	final OutputStream output = he.getResponseBody();
        	output.write(payload.getBytes());
        	output.flush();
        	he.close();
        });
        server.start();
    }
}
