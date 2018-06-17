package utils;

import controller.UsersServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class LocalServerJetty {

    public static void start() throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();

        ServletHolder holder = new ServletHolder(new UsersServlet());
        handler.addServlet(holder, "/users");

        server.setHandler(handler);
        server.start();
        server.join();


    }

}
