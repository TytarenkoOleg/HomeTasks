package utils;

import controller.LikedServlet;
import controller.MessangesServlet;
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

        ServletHolder j = new ServletHolder(new LikedServlet());
        handler.addServlet(j, "/liked");

        ServletHolder messanges = new ServletHolder(new MessangesServlet());
        handler.addServlet(messanges,"/messanges/*");

        server.setHandler(handler);
        server.start();
        server.join();


    }

}
