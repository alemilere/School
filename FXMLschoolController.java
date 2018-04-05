/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projschool;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author frenzey
 */
public class FXMLschoolController implements Initializable {

    @FXML
    private JFXButton logButton;
    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField password;
    @FXML
    private AnchorPane Body;
    @FXML
    private AnchorPane LogContainer;
    @FXML
    private AnchorPane LogpPanel;
    @FXML
    private AnchorPane AdminAccess;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        AdminAccess.setVisible(false);
        //this is a comment
    }    

    @FXML
    private void handleaction(ActionEvent event) {
    LogContainer.setVisible(false);
    AdminAccess.setVisible(true);
    }
    
}
            