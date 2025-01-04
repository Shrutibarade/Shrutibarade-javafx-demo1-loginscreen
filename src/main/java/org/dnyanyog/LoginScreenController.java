package org.dnyanyog;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginScreenController {
    @FXML
    private TextField loginName;

    @FXML
    private TextField password;

    @FXML
    private Label errorMessage;

    @FXML
    public void loginButtonClick() {
        String username = loginName.getText();
        String pwd = password.getText();

        if (username.isEmpty() || pwd.isEmpty()) {
            errorMessage.setText("Both fields are required.");
        } else {
            System.out.println("Username: " + username);
            System.out.println("Password: " + pwd);
            errorMessage.setText(""); // Clear any previous error message
        }
    }
}
