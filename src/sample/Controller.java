package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    private loginMadel loginMadel = new loginMadel();
    @FXML
    private Label dbStatus;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button btnLogin;
    @FXML
    private Label loginStatus;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (this.loginMadel.isDatabaseConnection()){
            this.dbStatus.setText("Connected to DB.");
        }else {
            this.dbStatus.setText("Not Connect to DB.");
        }
    }//initialize
    @FXML
    public void Login(ActionEvent event){
        try {
            if (this.loginMadel.isLogin(this.username.getText(),this.password.getText())){
                Stage stage = this.btnLogin.getScene().getWindow();
                stage.close();
                adminDashBoard();
            }else
                loginStatus.setText("Your username or password is ")
        }
    }
}//class
