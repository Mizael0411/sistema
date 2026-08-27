package com.abrigo.view;

import javafx.fxml.FXML;

public class RelatorioMenuController {

    @FXML
    private void abrirRelFinanceiro() {
        NavigationManager.getInstance().navegarConteudo("relatorioFinanceiro");
    }

    @FXML
    private void abrirRelDoacao() {
        NavigationManager.getInstance().navegarConteudo("relatorioDoacao");
    }

    @FXML
    private void abrirRelAdocao() {
        NavigationManager.getInstance().navegarConteudo("relatorioAdocao");
    }

    @FXML
    private void abrirRelAnimais() {
        NavigationManager.getInstance().navegarConteudo("relatorioAnimais");
    }

    @FXML
    private void sair() {
        NavigationManager.getInstance().voltarMenu();
    }
}
