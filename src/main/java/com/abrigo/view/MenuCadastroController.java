package com.abrigo.view;

import javafx.fxml.FXML;

public class MenuCadastroController {
    /**
     * Controller responsável pela tela de cadastros. Contendo as telas para cadstro de animais, lar temporário, produtos e doações.
     *
     * Camada: Controller
     * Arquivo Relacionado: menu-cadastro.fxml
     *
     * @author Mizael
     */
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
