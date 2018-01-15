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
public class AdminSignupController implements Initializable {

    @FXML
    private TextField bnametxt;
    @FXML
    private TextField bidtxt;
    @FXML
    private TextField admobilenotxt;
    @FXML
    private ComboBox<?> adcardtypecmb;
    @FXML
    private TextField adcardnotxt;
    @FXML
    private TextField adminusernametxt;
    @FXML
    private PasswordField adminpasswordtxt;
    @FXML
    private PasswordField adminccpasswordtxt;
    @FXML
    private Button AdminSignUpbtn;
    @FXML
    private Button UserSignUpbtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     private void GotoUserSignUp(ActionEvent event)throws IOException{
        //Opening the Login Page
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUpPage.fxml"));
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
        Stage stagee = (Stage) AdminSignUpbtn.getScene().getWindow();
        stagee.close();
    }    
}
