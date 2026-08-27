package com.abrigo.view;

import javafx.fxml.FXML;

/**
 * Controller responsável pela tela de menu principal e navegação entre as telas.
 * - Contendo as telas de cadastro, movimentações e relatórios
 *
 * Camada: Controller
 * Arquivo Relacionado: main-Layout.fxml
 *
 * @author Mizael
 */
public class MenuPrincipalController {

    @FXML
    private void abrirCadastro() {
       NavigationManager.getInstance().navegarMenu("menu-cadastro");
       NavigationManager.getInstance().navegarConteudo("boas-vindas");
    }

    @FXML
    private void abrirRelatorios() {
        NavigationManager.getInstance().navegarMenu("Relatorios");
    }

    @FXML
    private void abrirMovimentacoes() {
        // Aqui é o pulo do gato: troca o MENU inteiro pro submenu de Movimentações
        NavigationManager.getInstance().navegarMenu("Movimentacao");
        NavigationManager.getInstance().navegarConteudo("boas-vindas");
    }

    @FXML
    private void sair() {
        System.exit(0);
    }
}