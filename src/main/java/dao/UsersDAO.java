package dao;

import model.Users;

import java.util.ArrayList;

public class UsersDAO extends ArrayList<Users> {

    @Override
    public Users get(int index) {
        return super.get(index);
    }

    @Override
    public Users set(int index, Users element) {
        return super.set(index, element);
    }

    @Override
    public boolean add(Users users) {
        return super.add(users);
    }

    @Override
    public void add(int index, Users element) {
        super.add(index, element);
    }
}

