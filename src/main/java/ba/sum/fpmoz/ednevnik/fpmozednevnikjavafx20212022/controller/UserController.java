package ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022.controller;

import ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UserController {
    @FXML
    TextField nameTxt;

    @FXML
    TextField surnameTxt;

    @FXML
    TextField uidTxt;

    @FXML
    TextField roleTxt;

    @FXML
    protected void saveUser () throws Exception {
        User newUser = new User();
        newUser.setName(this.nameTxt.getText());
        newUser.setLastname(this.surnameTxt.getText());
        newUser.setUid(this.uidTxt.getText());
        newUser.setRole(this.roleTxt.getText());
        newUser.save();
    }
}
