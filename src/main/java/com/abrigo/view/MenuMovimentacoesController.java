package com.abrigo.view;

import javafx.fxml.FXML;

public class MenuMovimentacoesController {

    @FXML
    private void abrirRegistroDoacao() {
        NavigationManager.getInstance().navegarConteudo("registro-doacao");
    }

    @FXML
    private void abrirRegistroAdocao() {
        NavigationManager.getInstance().navegarConteudo("registro-adocao");
    }

    @FXML
    private void abrirCompras() {
        NavigationManager.getInstance().navegarConteudo("compras");
    }

    @FXML
    private void abrirCAnimal() {
        NavigationManager.getInstance().navegarConteudo("Cadastro animal");
    }

    @FXML
    private void abrirRGLartemporario() {
        NavigationManager.getInstance().navegarConteudo("Registro animal lar temporário");
    }



    @FXML
    private void voltar() {
        NavigationManager.getInstance().voltarMenu();
    }
}