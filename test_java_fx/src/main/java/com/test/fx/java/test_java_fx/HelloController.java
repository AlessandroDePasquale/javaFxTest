package com.test.fx.java.test_java_fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label labelTitle;
    @FXML
    private Button hideTitleButton;

    @FXML
    public void hideTitleButton(ActionEvent actionEvent) {
        if(labelTitle.getText().equalsIgnoreCase("title hide")){
            labelTitle.setText("title to hide");
            hideTitleButton.setText("hide title");
        } else {
            labelTitle.setText("title hide");
            hideTitleButton.setText("show title");
        }
    }
}
