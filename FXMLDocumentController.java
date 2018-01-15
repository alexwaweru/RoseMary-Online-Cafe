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
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author study
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Button Loginlabel;
    @FXML
    private Button SignUblbl;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    



    @FXML
    private void LoginbtnChangeColor(MouseDragEvent event) {
        Loginlabel.setTextFill(Color.web("#8aa200"));
    }


    @FXML
    private void SignupbtnChangeColor(MouseDragEvent event) {
        SignUblbl.setTextFill(Color.web("#a15000"));
    }

    @FXML
    private void GoToSignUpPage(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUpPage.fxml"));
        Parent root1 = (Parent)fxmlLoader.load();
            
        Scene scene = new Scene(root1);
        Stage stage = new Stage(StageStyle.DECORATED);
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(scene);
        
    }

    @FXML
    private void GoToLoginPage(ActionEvent event) throws IOException{
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
        Stage stagee = (Stage) Loginlabel.getScene().getWindow();
        stagee.close();
        
    }  
}
