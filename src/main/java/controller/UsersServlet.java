package controller;

import model.User;
import org.eclipse.jetty.server.Authentication;
import utils.HtmlUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class UsersServlet extends HttpServlet {
    private static List<User> users = new List<User>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<User> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(User user) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends User> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends User> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public User get(int index) {
            return null;
        }

        @Override
        public User set(int index, User element) {
            return null;
        }

        @Override
        public void add(int index, User element) {

        }

        @Override
        public User remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<User> listIterator() {
            return null;
        }

        @Override
        public ListIterator<User> listIterator(int index) {
            return null;
        }

        @Override
        public List<User> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
//        writer.write("Hello world");
        writer.print(HtmlUtils.readPage("users.html"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action.equals("Yes")) {
            PrintWriter writer = resp.getWriter();
            String outText = HtmlUtils.readPage("liked.html");
            users.add();            ;

        }
        if (action.equals("No")) {
            PrintWriter writer = resp.getWriter();
            String outText = HtmlUtils.readPage("users.html");
        } else {
            doGet(req, resp);
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
