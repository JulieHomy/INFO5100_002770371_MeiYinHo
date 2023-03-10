package com.example.exercise9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {
    @FXML
    private Label result;
    private long number1 = 0;
    private String operator = "";
    private boolean start = true;
    private Model model = new Model();

    @FXML
    protected void processNumbers(ActionEvent event) {
        if (start) {
            result.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText(); //get the input of number from the user
        result.setText(result.getText() + value);
    }

    @FXML
    public void processOperator(ActionEvent event) {
        String value = ((Button)event.getSource()).getText(); //get operator input from user

        if (!value.equals("=")) {
            if(!operator.isEmpty())
                return;

            operator = value;
            number1 = Long.parseLong(result.getText());
            result.setText("");
        } else {
            if (operator.isEmpty())
                return;
            long number2 = Long.parseLong(result.getText());
            float output = model.calculate(number1, number2, operator);
            result.setText(String.valueOf(output));
            operator = "";
            start = true;
        }
    }
}