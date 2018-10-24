import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Main extends Application {

    Image image0 = new Image("mario0.jpg");
    Image image1 = new Image("mario1.jpg");
    Image image2 = new Image("mario2.jpg");
    Image image3 = new Image("mario3.jpg");
    Image image4 = new Image("mario4.jpg");
    Image image5 = new Image("mario5.jpg");
    Image image6 = new Image("mario6.jpg");
    Image image7 = new Image("mario7.jpg");
    Image image8 = new Image("mario8.jpg");
    ArrayList<Image> arrayImage = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage){
        primaryStage.setTitle("Laboratoire 8: Casse-tête pour les 5-20 ans");
        primaryStage.setResizable(false);
        primaryStage.setMaximized(false);
        primaryStage.setWidth(930);
        primaryStage.setHeight(930);

        arrayImage.add(image0);
        arrayImage.add(image1);
        arrayImage.add(image2);
        arrayImage.add(image3);
        arrayImage.add(image4);
        arrayImage.add(image5);
        arrayImage.add(image6);
        arrayImage.add(image7);
        arrayImage.add(image8);

        melanger();

        ImageView imageView0 = new ImageView(arrayImage.get(0));
        imageView0.setFitHeight(300);
        imageView0.setFitWidth(300);
        ImageView imageView1 = new ImageView(arrayImage.get(1));
        imageView1.setFitWidth(300);
        imageView1.setFitHeight(300);
        ImageView imageView2 = new ImageView(arrayImage.get(2));
        imageView2.setFitHeight(300);
        imageView2.setFitWidth(300);
        ImageView imageView3 = new ImageView(arrayImage.get(3));
        imageView3.setFitHeight(300);
        imageView3.setFitWidth(300);
        ImageView imageView4 = new ImageView(arrayImage.get(4));
        imageView4.setFitHeight(300);
        imageView4.setFitWidth(300);
        ImageView imageView5 = new ImageView(arrayImage.get(5));
        imageView5.setFitHeight(300);
        imageView5.setFitWidth(300);
        ImageView imageView6 = new ImageView(arrayImage.get(6));
        imageView6.setFitHeight(300);
        imageView6.setFitWidth(300);
        ImageView imageView7 = new ImageView(arrayImage.get(7));
        imageView7.setFitHeight(300);
        imageView7.setFitWidth(300);
        ImageView imageView8 = new ImageView(arrayImage.get(8));
        imageView8.setFitHeight(300);
        imageView8.setFitWidth(300);

        HBox hBoxH = new HBox(imageView0,imageView1,imageView2);
        hBoxH.setSpacing(5);

        HBox hBoxM = new HBox(imageView3,imageView4,imageView5);
        hBoxM.setSpacing(5);

        HBox hBoxB = new HBox(imageView6,imageView7,imageView8);
        hBoxB.setSpacing(5);

        VBox vBox = new VBox(hBoxH,hBoxM,hBoxB);
        vBox.setSpacing(5);

        BorderPane borderPane = new BorderPane(vBox);

        Scene scene = new Scene(borderPane);

        scene.setOnKeyPressed(event -> {
            if (event.isControlDown() && event.getCode() == KeyCode.M){
                melanger();
                imageView0.setImage(arrayImage.get(0));
                imageView1.setImage(arrayImage.get(1));
                imageView2.setImage(arrayImage.get(2));
                imageView3.setImage(arrayImage.get(3));
                imageView4.setImage(arrayImage.get(4));
                imageView5.setImage(arrayImage.get(5));
                imageView6.setImage(arrayImage.get(6));
                imageView7.setImage(arrayImage.get(7));
                imageView8.setImage(arrayImage.get(8));
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void melanger(){
        Collections.shuffle(arrayImage);
    }
}
