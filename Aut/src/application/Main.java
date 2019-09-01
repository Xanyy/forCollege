
package application;


import View.PlayerView;
import View.ManagerView;
import View.TeamView;
import View.LeagueView;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application{

 
	
	public static void main(String[] args) {
			
		launch(args);
	}

	
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane mainPane = new BorderPane();
		Group root = new Group();
		Scene scene = new Scene(root,600,500);
		TabPane tp = new TabPane ();
		
		tp.getTabs().add(new PlayerView(null));
		tp.getTabs().add(new ManagerView( null));
		tp.getTabs().add(new TeamView( null));
		tp.getTabs().add(new LeagueView( null));
		
		mainPane.setCenter(tp);
		
		root.getChildren().add(mainPane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
