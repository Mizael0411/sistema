package com.abrigo.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class NavigationManager {

    private static final NavigationManager instance = new NavigationManager();

    private StackPane menuContainer;
    private StackPane contentContainer;

    private final Deque<String> historicoMenu = new ArrayDeque<>();
    private String menuAtual;

    private NavigationManager() {}

    public static NavigationManager getInstance() {
        return instance;
    }

    public void setMenuContainer(StackPane container) {
        this.menuContainer = container;
    }

    public void setContentContainer(StackPane container) {
        this.contentContainer = container;
    }

    // Troca o MENU (lado esquerdo), guardando histórico
    public void navegarMenu(String nomeFxml) {
        if (menuAtual != null) {
            historicoMenu.push(menuAtual);
        }
        carregar(menuContainer, nomeFxml);
        menuAtual = nomeFxml;
    }


    public void voltarMenu() {
        if (!historicoMenu.isEmpty()) {
            String anterior = historicoMenu.pop();
            carregar(menuContainer, anterior);
            menuAtual = anterior;
        }
    }

    // Troca o CONTEÚDO (lado direito, área maior)
    public void navegarConteudo(String nomeFxml) {
        carregar(contentContainer, nomeFxml);
    }

    private void carregar(StackPane destino, String nomeFxml) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/abrigo/sistema/fxml/" + nomeFxml + ".fxml"));
            Parent tela = loader.load();
            destino.getChildren().setAll(tela);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}