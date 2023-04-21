package br.com.showmilhao.application;
	
import br.com.showmilhao.util.LogUtil;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static final String FILE_MUSIC = "src/main/resources/songs/som-abertura-2.mp3";
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Janela JAVA FX!");
			LogUtil.getLogger(Main.class).info(primaryStage.getTitle());
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			// True: tocar a música infinitas vezes
			ContinuousReprodution reprodution = new ContinuousReprodution(FILE_MUSIC, true);
			reprodution.start();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
