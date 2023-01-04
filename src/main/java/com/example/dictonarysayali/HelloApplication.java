package com.example.dictonarysayali;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Label meaningLabel;
    Button searchButton;
    TextField wordTextField;
    DictonaryUsingHashMap dictonaryUsingHashMap = new DictonaryUsingHashMap();



    Pane createContent(){

        Pane root=new Pane();
        root.setPrefSize(400,600);

        wordTextField=new TextField();
        wordTextField.setTranslateX(20);
        wordTextField.setTranslateY(30);

        searchButton = new Button("Search");
        searchButton.setTranslateX(200);
        searchButton.setTranslateY(30);
        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                meaningLabel.setText("Button is clicked.");
                wordTextField.getText();
                String word=wordTextField.getText();
                if(word.isBlank()|| word.isEmpty()){
                    meaningLabel.setText("Please enter a word !");
                    meaningLabel.setTextFill(Color.RED);
                }
                else{
                    String meaning= dictonaryUsingHashMap.getMeaning(word);
                    meaningLabel.setText(meaning);
                    meaningLabel.setTextFill(Color.BLACK);
                }

            }
        });


        meaningLabel=new Label("I am meaning");
        meaningLabel.setTranslateX(20);
        meaningLabel.setTranslateY(60);

        root.getChildren().addAll( wordTextField, searchButton,meaningLabel);


        return root;
    }
    @Override
    public void start(Stage stage) throws IOException {
       // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(createContent());
        stage.setTitle("My Dictonary!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}