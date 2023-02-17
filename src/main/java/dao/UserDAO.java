package dao;

import model.User;

import java.sql.Connection;

/**
 * Methods Needed in this file:
 * 1. Insert -> YES
 * 2. find -> YES
 * 3. clear all -> YES
 * 4. delete a certain User -> NO
 * 5. Users related to a certain Person -> NO
 * 6. Users for a certain Event -> NO
 * 7. MAYBE :: LIST OF USERS RELATED TO EACH OTHER
 */
public class UserDAO {
    private final Connection conn;

    // Constructor -> When do we call this method/Constructor ??????
    public UserDAO(Connection conn) {
        this.conn = conn;
    }

    public void insert(User user){

    }

    public User find(String userID) throws DataAccessException{
        return null;
    }

    public void clear() throws DataAccessException{

    }


}
