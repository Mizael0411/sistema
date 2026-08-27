package com.abrigo.view;

import javafx.fxml.FXML;

public class MenuCadastroController {

    @FXML
    private void abrirCadastroAnimal() {
        NavigationManager.getInstance().navegarConteudo("cadastroAnimal");
    }
    @FXML
    private void abrirCadastroLarTemporario() {
        NavigationManager.getInstance().navegarConteudo("cadastroLarTemporario");
    }

    @FXML
    private void abrirCadastroProdutos() {
        NavigationManager.getInstance().navegarConteudo("cadastroProdutos");
    }

    @FXML
    private void abrirCadastroDoacoes() {
        NavigationManager.getInstance().navegarConteudo("cadastroDoacoes");
    }

    @FXML
    private void sair() {
        NavigationManager.getInstance().voltarMenu();
    }





}
