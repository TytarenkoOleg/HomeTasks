package controller;

import dao.MessangesDAO;
import model.Messanges;
import model.Users;
import utils.HtmlUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MessangesServlet extends HttpServlet{
    public static List<Messanges> messanges = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MessangesDAO DAO = new MessangesDAO();
        messanges = DAO.getAllMessanges();

        PrintWriter writer = resp.getWriter();

        String code = "<li>%s</li>";
        String readyCode = "";
        for ( Messanges msg :
                messanges ) {
            readyCode += String.format(code, msg.getText());
            System.out.println(msg.getText());
        }
        writer.print(String.format(HtmlUtils.readPage("messanges.html"), readyCode));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
