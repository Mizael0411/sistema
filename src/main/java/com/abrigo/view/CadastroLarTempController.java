package com.abrigo.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

/**
 * Controller responsável pelo cadastro de lar temporário.
 * Esta classe controla o formulário definido no arquivo FXML cadastroLarTemp.fxml,
 * permitindo capturar e manipular os dados do lar temporário antes de salvar.
 * Camada: Controller
 * Arquivo Relacionado: cadastroLarTemp.fxml
 * @author Mizael
 */
public class CadastroLarTempController {

    @FXML private TextField txtNome;
    @FXML private TextField txtEndereco;
    @FXML private TextField txtTelefone;
    @FXML private Spinner<Integer> spCapacidade;
    @FXML private Spinner<Integer> spDisponibilidadeVagas;
    @FXML private ComboBox<String> cbAceitaDoencas;
    @FXML private Button btnSalvar;
    @FXML private Button btnLimpar;

    public String getNome() {
        return txtNome.getText();
    }

    public String getEndereco() {
        return txtEndereco.getText();
    }

    public String getTelefone() {
        return txtTelefone.getText();
    }

    public Integer getCapacidade() {
        return spCapacidade.getValue();
    }

    public Integer getDisponibilidadeVagas() {
        return spDisponibilidadeVagas.getValue();
    }

    public String getAceitaDoencas() {
        return cbAceitaDoencas.getValue();
    }

    @FXML
    private void limparCampos() {
        txtNome.clear();
        txtEndereco.clear();
        txtTelefone.clear();
        spCapacidade.getValueFactory().setValue(0);
        spDisponibilidadeVagas.getValueFactory().setValue(0);
        cbAceitaDoencas.setValue(null);
    }
}
