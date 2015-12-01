package Fallout;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
 
public class FXMLExampleController {
    private Text actiontarget;
    
   protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
        System.out.println("It worked");
    }

}