
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class FXMLExample extends Application {
    
    public static void main(String[] args) {
        Application.launch(FXMLExample.class, args);
    }
    private Button Submit;
    private TextField Smith;
    
    public void start(Stage stage) throws Exception {
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("simple.fxml"));
        
        stage.setTitle("FXML Welcome");
        stage.setScene(new Scene(root, 300, 275));
        Submit.setOnAction(null);
        stage.show();
        
    }
    
    
}