package application;
	
import javax.swing.ScrollPaneLayout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Scene mainScene;
	@Override
	public void start(Stage stage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			
			
			ScrollPane scrollPane = loader.load();
		
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);
			
			 mainScene = new Scene(scrollPane);
			stage.setScene(mainScene);
			stage.setTitle("Sample JavaFX application");
			
			stage.show();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Scene getMainScene() {
		return mainScene;
	}
	public static void main(String[] args) {
		launch(args);
	}
}
