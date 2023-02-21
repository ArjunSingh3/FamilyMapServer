package dao;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private Connection connection;

    /**
     * Ask TA if these functions need to be static or not, and if static means the same things in Java as it does in C ?????
     */
    private static EventDAO event_dao;
    private static UserDAO user_dao;
    private static PersonDAO person_dao;

    public Connection openConnect() throws DataAccessException{
        String dbName = "db" + File.separator + "<name of database goes here>";
        String connectionURL = "jdbc:sqlife:" + dbName;

        //Connection connection = null;
        try(Connection c = DriverManager.getConnection(connectionURL)){
            connection = c;

            /**
             *
             * And also How to and from Where to call these DAO classes/ Methods ????????????????? -> Follow up questioin: Where to call the other children methods of the EVENT DAO for example
             * How to test it to see if it is working or not
             */



            // start a transaction
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }

    public Connection getConnection() {
        return connection;
    }

    // I Dont know if this is the same functino as openConnect or not, and is this function even useful ?????????
    /**(public void setConnection(Connection connection) {
        this.connection = connection;
    }*/

    public void closeConnection(boolean commit) throws DataAccessException{
        try {
            if (commit) {
                connection.commit();
            } else {
                connection.rollback();
            }

            connection.close();
            connection = null;
        }
        catch (SQLException error){

        }
    }

    // Write a Empty Tables Function to reset/ Restart the Database from Scratch

}
