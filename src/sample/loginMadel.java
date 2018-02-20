package sample;

import dbUtill.dbConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class loginMadel {
    Connection connection;

    public loginMadel() throws SQLException {
        this.connection = dbConnection.getConnection();
        if (this.connection == null) {
            System.exit(1);
        }
    }//login
    public boolean isDatabaseConnection(){
        return this.connection != null;
    }
}//loginModel
