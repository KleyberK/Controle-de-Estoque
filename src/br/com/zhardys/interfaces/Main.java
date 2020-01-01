package br.com.zhardys.interfaces;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("controladores/arquivosfxml/CenaInicial.fxml"));
        primaryStage.getIcons().add(new Image(this.getClass().getResourceAsStream("imagens/iconBot.jpg")));
        primaryStage.setTitle("Controle de Estoque - Balãozinho Mágico");
        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
