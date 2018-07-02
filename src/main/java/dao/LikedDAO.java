package dao;

import model.Liked;
import model.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LikedDAO extends AbstractDAO <Liked> {

    @Override
    public void save(Liked liked) {
        String sql = "INSERT INTO liked(id, id_first_user, id_liked_user) VALUES(?,?,?)";

        try (Connection connection = DataBaseConnector.getConnection(); PreparedStatement statement = connection.prepareStatement(sql); )
        {
            statement.setLong(1, liked.getId());
            statement.setLong(2, liked.getIdFirstUser());
            statement.setLong(3, liked.getIdLikedUser());

            statement.executeUpdate();
        }
        catch ( SQLException e )
        {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Liked liked) {
        String sql = "UPDATE liked SET id_first_user=?, id_liked_user=? WHERE id=?";

        try ( Connection connection = DataBaseConnector.getConnection(); PreparedStatement statement = connection.prepareStatement(sql); )
        {
            statement.setLong(1, liked.getId());
            statement.setLong(2, liked.getIdFirstUser());
            statement.setLong(3, liked.getIdLikedUser());

            statement.executeUpdate();
        }
        catch ( SQLException e )
        {
            e.printStackTrace();
        }
    }

    @Override
    public Liked get(Object pk) {
        Liked liked = new Liked();


        String sql = "SELECT * FROM liked WHERE id='" + pk + "'";

        try (
                Connection        connection  = DataBaseConnector.getConnection();
                PreparedStatement statement  = connection.prepareStatement(sql);
                ResultSet rSet = statement.executeQuery();
        )
        {
            while ( rSet.next() );
        }
        catch ( SQLException e )
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Object id) {
        String sql = "DELETE FROM liked WHERE id=?";

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
