package dao;

import model.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsersDAO extends AbstractDAO<Users> {


    @Override
    public void save(Users users) {
        String sql = "INSERT INTO users (id, name, url) VALUES(?,?,?)";

        try ( Connection connection = DataBaseConnector.getConnection(); PreparedStatement statement = connection.prepareStatement(sql); )
        {
            statement.setLong(1, users.getId ());
            statement.setString(2, users.getName());
            statement.setString(3, users.getUrlIMG());


            statement.executeUpdate();
        }
        catch ( SQLException e )
        {
            e.printStackTrace();
        }

    }

    @Override
    public void update(Users users) {
        String sql = "UPDATE users SET name=?, url=? WHERE id=?";

        try (
                Connection connection = DataBaseConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
        )
        {

            statement.setLong(1, users.getId());
            statement.setString(2, users.getName());
            statement.setString(3, users.getUrlIMG());


            statement.executeUpdate();
        }
        catch ( SQLException e )
        {
            e.printStackTrace();
        }
    }

    @Override
    public Users get(Object pk) {
        Users users = new Users();


        String sql = "SELECT * FROM users WHERE id='" + pk + "'";

        try (
                Connection        connection  = DataBaseConnector.getConnection();
                PreparedStatement statement  = connection.prepareStatement(sql);
                ResultSet rSet = statement.executeQuery();
        )
        {
            while ( rSet.next() );
//            {
//                users.setId(rSet.getString("id"));
//                users.setId(rSet.getString(2));
//                users.setFirstName(rSet.getString("first_name"));
//                client.setSecondName(rSet.getString(4));
//
//                return client;
//            }
        }
        catch ( SQLException e )
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Object id) {
        String sql = "DELETE FROM users WHERE id=?";

        try (
                Connection connection = DataBaseConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
        )
        {
            statement.setString(1, (String) id);
            statement.executeUpdate();
        }
        catch ( SQLException e )
        {
            e.printStackTrace();
        }
    }
}

