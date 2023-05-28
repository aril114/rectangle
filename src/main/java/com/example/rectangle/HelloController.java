package com.example.rectangle;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    // прямоугольник
    private Rectangle rectangle = new Rectangle(100, 100);
    @FXML
    // форма прямоугольника - объект, нужный для отображения прямоугольника на экране
    private javafx.scene.shape.Rectangle rectangleForm;
    @FXML
    // отображает размеры
    private Label sizesL;
    @FXML
    // показывает ошибки
    private Label errorL;
    @FXML
    // текстовое поле для ширины
    private TextField widthTF;
    @FXML
    // текстовое поле для высоты
    private TextField heightTF;

    public void initialize() {
        double width = rectangle.getWidth();
        double height = rectangle.getHeight();
        // отображает первоначальные размеры
        sizesL.setText(String.format("ширина: %.1f\n высота: %.1f", width, height));
        // устанавливает первоначальные размеры формы
        rectangleForm.setWidth(width);
        rectangleForm.setHeight(height);
    }

    @FXML
    // проверяет правильность введенных данных и меняет размеры прямоугольника
    // rectangle и его формы rectangleForm
    public void onSetButtonClick() {
        try {
            double width = Double.parseDouble(widthTF.getText());
            rectangle.setWidth(width);
            double height = Double.parseDouble(heightTF.getText());
            rectangle.setHeight(height);
            rectangleForm.setHeight(width);
            rectangleForm.setWidth(height);
            sizesL.setText(String.format("ширина: %.1f\n высота: %.1f", width, height));
        }
        catch (Exception e) {
            // вывод сообщения на лэйбел errorL
            showMessage(e.getMessage(), 5);
        }
    }

    // показывает сообщение на лэйбеле заданное время
    private void showMessage(String message, int duration) {
        errorL.setText(message);
        PauseTransition pause = new PauseTransition(Duration.seconds(duration));
        pause.setOnFinished(e -> errorL.setText(null));
        pause.play();
    }
}