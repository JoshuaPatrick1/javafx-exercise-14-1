import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DisplayImages extends Application {
   @Override
   public void start(Stage primaryStage) {
      GridPane pane = new GridPane();

      Image img1 = new Image("file:image/flag1.gif");
      Image img2 = new Image("file:image/flag2.gif");
      Image img3 = new Image("file:image/flag6.gif");
      Image img4 = new Image("file:image/flag7.gif");

      pane.add(new ImageView(img1), 0, 0);
      pane.add(new ImageView(img2), 1, 0);
      pane.add(new ImageView(img3), 0, 1);
      pane.add(new ImageView(img4), 1, 1);

      Scene scene = new Scene(pane);
      primaryStage.setTitle("Exercise 14.1 - Display Images");
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String[] args) {
      launch(args);
   }
}
