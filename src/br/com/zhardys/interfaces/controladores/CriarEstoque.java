package br.com.zhardys.interfaces.controladores;

import br.com.zhardys.classes.Estoque;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CriarEstoque {
    @FXML
    protected javafx.scene.control.TextField nomeField;
    @FXML
    protected javafx.scene.control.TextField descricaoField;
    @FXML
    protected javafx.scene.control.TextField localField;
    @FXML
    protected javafx.scene.control.Button confirmar;
    @FXML
    protected javafx.scene.control.Button cancelar;

    Stage estagioAtual = new Stage();

    public void start() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("arquivosfxml/CriarEstoque.fxml"));
        estagioAtual.setTitle("Criar Estoque");
        estagioAtual.setScene(new Scene(root));
        estagioAtual.show();
    }

    @FXML
    protected void confirmarButton() throws Exception {
        String Nome, Descricao, Local;
        Stage stage = (Stage) confirmar.getScene().getWindow();
        Nome = nomeField.getText();
        Descricao = descricaoField.getText();
        Local = localField.getText();
        Estoque NovoEstoque = new Estoque();
        NovoEstoque.criarEstoque(Nome, Descricao, Local);
        stage.close();
    }

    @FXML
    protected void cancelarButton(){
        Stage stages = (Stage) cancelar.getScene().getWindow();
        stages.close();
    }


}
