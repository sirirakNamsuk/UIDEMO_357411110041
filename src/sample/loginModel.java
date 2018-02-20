package sample;

import dbUtill.dbConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class loginModel {
    Connection connection;

    public loginModel()  {
        try {
            this.connection = dbConnection.getConnection();

        }catch (SQLException ex ){
            ex.printStackTrace();
        }
        if (this.connection == null) {
            System.exit(1);
        }
    }//loginModel
    public  boolean isDatabaseConnection() {
        return this.connection != null;
    }//isDatabaseConnection
    public boolean



}//loginModel