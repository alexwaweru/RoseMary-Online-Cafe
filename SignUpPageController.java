/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosemary;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author study
 */
public class SignUpPageController implements Initializable {
    @FXML
    private Button UserSignUpbtn;
    @FXML
    private Button AdminSignUpbtn;
    @FXML
    private TextField fnametxt;
    @FXML
    private TextField snametxt;
    @FXML
    private TextField ashesiidtxt;
    @FXML
    private ComboBox<?> categorycmb;
    @FXML
    private TextField mobiletxt;
    @FXML
    private ComboBox<?> cardtypecmb;
    @FXML
    private TextField cardnotxt;
    @FXML
    private TextField usernametxt;
    @FXML
    private PasswordField passwordtxt;
    @FXML
    private PasswordField cpasswordtxt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void GotoAdminSignUp(ActionEvent event)throws IOException{
        //Opening the Login Page
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AdminSignup.fxml"));
        Parent root = (Parent)fxmlLoader.load();
            
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(scene);
        stage.show();
        
        //Close the Welcome window
        Stage stagee = (Stage) AdminSignUpbtn.getScene().getWindow();
        stagee.close();
    }

    @FXML
    private void GotoLoginPage(ActionEvent event) throws IOException{
        //Opening the Login Page
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
        Parent root = (Parent)fxmlLoader.load();
            
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(scene);
        stage.show();
        
        //Close the Welcome window
        Stage stagee = (Stage) UserSignUpbtn.getScene().getWindow();
        stagee.close();
    }

    
}
