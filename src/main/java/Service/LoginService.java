package Service;

import Result_Request.LoginRequest;
import Result_Request.LoginResponse;
import dao.DataAccessException;
import dao.Database;
import dao.UserDAO;
import model.User;

import java.sql.Connection;
import java.util.Objects;

public class LoginService {
    private LoginResponse login(LoginRequest lr) throws DataAccessException {

        // Check if a Username is provided or not
        if(lr.getUsername() == null){
            return null;
        }

        // Check if a password is provided or not
        if(lr.getPassword() == null){
            return null;
        }

        Database dao = new Database();
        Connection conn = null;
        try {
             conn = dao.openConnect();
        }catch (Exception error){
            error.printStackTrace();
        }
        UserDAO user = new UserDAO(conn);

        User newUser = new User();
        try {
            newUser = user.find(lr.getUsername());
        } catch (DataAccessException e) {
            throw new RuntimeException(e);
        }

        LoginResponse respnsew = new LoginResponse();
        if (Objects.equals(newUser.getUsername(), lr.getUsername()) && Objects.equals(newUser.getPassword(), lr.getPassword())){
            return
        }


        return null;
    }

}
