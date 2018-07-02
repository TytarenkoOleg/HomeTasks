package dao;

import model.Messanges;
import model.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MessangesDAO extends AbstractDAO<Messanges> {

    @Override
    public void save(Messanges messanges) {
        String sql = "INSERT INTO tytarenko_messanges (id, text, idfrom, idto, date) VALUES(?,?,?,?,?)";

        try (Connection connection = DataBaseConnector.getConnection(); PreparedStatement statement = connection.prepareStatement(sql); )
        {
            statement.setLong(1, messanges.getId ());
            statement.setString(2, messanges.getText());
            statement.setLong(3, messanges.getIdfrom());
            statement.setLong(4, messanges.getIdto ());
            statement.setTimestamp(5, messanges.getDate());

            statement.executeUpdate();
        }
        catch ( SQLException e )
        {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Messanges messanges) {
        String sql = "UPDATE tytarenko_messanges SET text=?, getidfrom=?, getidto=?, getdate=? WHERE id=?";

        try (
                Connection connection = DataBaseConnector.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql);
        )
        {

            statement.setLong(1, messanges.getId ());
            statement.setString(2, messanges.getText());
            statement.setLong(3, messanges.getIdfrom());
            statement.setLong(4, messanges.getIdto ());
            statement.setTimestamp(5, messanges.getDate());


            statement.executeUpdate();
        }
        catch ( SQLException e )
        {
            e.printStackTrace();
        }
    }

    @Override
    public Messanges get(Object id) {
        Messanges messanges = new Messanges();


        String sql = "SELECT * FROM tytarenko_messanges WHERE id='" + id + "'";

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


    public ArrayList<Messanges> getAllMessanges() {
        ArrayList<Messanges> messanges = new ArrayList<>();


        String sql = "SELECT * FROM tytarenko_messanges";

        try (
                Connection        connection  = DataBaseConnector.getConnection();
                PreparedStatement statement  = connection.prepareStatement(sql);
                ResultSet rSet = statement.executeQuery();

        )
        {
            while ( rSet.next() ){
                Messanges mess = new Messanges(
                        rSet.getLong("id"),
                        rSet.getString("text"),
                        rSet.getLong("id_from"),
                        rSet.getLong("id_to"),
                        rSet.getTimestamp("date")
                );

                messanges.add(mess);

            };
            return messanges;


        }
        catch ( SQLException e )
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Object id) {
        String sql = "DELETE FROM messanges WHERE id=?";

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
