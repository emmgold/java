<<<<<<< HEAD
// запускать java helloworld start

=======
>>>>>>> 95c7c2e0bd96eaee9258dfe6a9e1b2f88d03b554
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class helloworld extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button();
<<<<<<< HEAD
		btn.setText("Сказать 'Привет мир!!!'");
=======
		btn.setText("Привет мир кнопка");
>>>>>>> 95c7c2e0bd96eaee9258dfe6a9e1b2f88d03b554
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
<<<<<<< HEAD
				System.out.println("Привет мир!");
=======
				System.out.println("Привет мир в консоли!");
>>>>>>> 95c7c2e0bd96eaee9258dfe6a9e1b2f88d03b554
			}
		});

		StackPane root = new StackPane();
		root.getChildren().add(btn);

		Scene scene = new Scene(root, 300, 250);

<<<<<<< HEAD
		primaryStage.setTitle("Привет Мир!!");
=======
		primaryStage.setTitle("Привет мир в заголовке");
>>>>>>> 95c7c2e0bd96eaee9258dfe6a9e1b2f88d03b554
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
