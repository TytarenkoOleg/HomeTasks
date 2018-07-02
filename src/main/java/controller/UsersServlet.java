package controller;

import model.Users;
import utils.HtmlUtils;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class UsersServlet extends HttpServlet {


       private List<Users> users = new ArrayList<>();



   private static int likesCount = 0;
   private static int dislikesCount = 0;
   private static int i = 0;

   @Override
   public void init (ServletConfig config) throws ServletException {


       users.add(new Users(1L, "Petya", "http://nenadoada.ru/upload/iblock/fad/fad0c9a52f5e7f1368de8c5af45d1817.jpg"));
       users.add(new Users(2L, "Katya", "https://uznayvse.ru/person/kate_clapp/clapp01.jpg"));
       users.add(new Users(3L, "Sergey", "https://images.aif.ru/011/493/6e9f11cf74dc5b4318a9b36e3bc81100.jpg"));
   }

   @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //List <Users> d = new ArrayList<>();

        //users = d;
        if (i >= users.size()) {
            resp.sendRedirect("/liked");
        } else {

            PrintWriter writer = resp.getWriter();
//        writer.write("Hello world");
            Users user = users.get(i);
           writer.print(String.format(HtmlUtils.readPage("users.html"), user.getUrlIMG(), user.getName(), user.getId()));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String action = req.getParameter("action");

            String chose = req.getParameter("chose");
        if (chose.equals("YES")) {
            PrintWriter writer = resp.getWriter();
            likesCount++;
            System.out.println("Likes: "+ likesCount + " Turn " + i);
            System.out.println("Dislikes " + dislikesCount + " Turn " + i);
            System.out.println("end of  turn");
            LikedServlet.likedusers.add(users.get(i));
            i++;



        } else if (chose.equals("NO")) {
            PrintWriter writer = resp.getWriter();
            dislikesCount++;
            System.out.println("Likes: "+ likesCount + " Turn " + i);
            System.out.println("Dislikes " + dislikesCount + " Turn " + i);
            System.out.println("end of  turn");
            i++;
        } else {
            doGet(req, resp);
        }

        resp.sendRedirect("/users");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
