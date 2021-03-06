package com.pb.popov.hw15;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Client extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("win.fxml"));
        primaryStage.setTitle("Client");
        primaryStage.setScene(new Scene(root, 478, 396));
        primaryStage.show();
    }
    @FXML
    public TextField textField;
    @FXML
    private TextArea textArea;

    @FXML
    public void handleSubmit(ActionEvent event) throws IOException {

        System.out.println("Клиент стартовал");
        String serverIp = "127.0.0.1";
        int serverPort = 1234;
        System.out.println("Соединяемся с сервером " + serverIp + ":" + serverPort);
        Socket server = new Socket(serverIp, serverPort);

            textArea.setText(textArea.getText() + "\n" + textField.getText() + "\n"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))+"\n");
            textField.clear();

        server.close();

   }

}
