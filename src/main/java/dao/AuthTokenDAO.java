package dao;

import  java.sql.Connection;
public class AuthTokenDAO {
    private final Connection conn;

    public AuthTokenDAO(Connection conn) {
        this.conn = conn;
    }
    
}
