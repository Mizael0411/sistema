package com.abrigo.view;

import com.abrigo.App;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
/**
 * Controller responsável pela tela de login.
 *
 * Camada: Controller
 * Arquivo Relacionado: login.fxml
 *
 * @author Mizael
 */
public class LoginController {

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtSenha;

    @FXML
    private void onEntrarClick() {
        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();


        if (usuario.equals("admin") && senha.equals("1234")) {
            try {
                App.trocarCena("main-layout");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Usuário ou senha inválidos");
        }
    }
}