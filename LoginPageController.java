package rosemary;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author study
 */
public class LoginPageController implements Initializable {

    @FXML
    private Button Loginbtn;
    @FXML
    private Label ForgotPasswordlbl;
    @FXML
    private TextField Usernametxt;
    @FXML
    private TextField Passwordtxt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GoToLHomePage(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Homepage.fxml"));
        Parent root = (Parent)fxmlLoader.load();
            
        Scene scene = new Scene(root);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.setScene(scene);
        
        /**Pass Data
        String dataToPass = txtResult.getText();
        Form2Controller bcc = fxmlLoader.<Form2Controller>getController();
        bcc.AddtoList(dataToPass);**/
        stage.show();
        
        //Close the Welcome window
        Stage stagee = (Stage) Loginbtn.getScene().getWindow();
        stagee.close();
    }

    @FXML
    private void LoginChangeColor(MouseDragEvent event) {
    }

    @FXML
    private void GoToChangePassword(MouseEvent event) {
    }
    
}
