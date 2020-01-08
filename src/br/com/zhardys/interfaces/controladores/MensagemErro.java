package br.com.zhardys.interfaces.controladores;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import br.com.zhardys.classes.ControladorArquivos;

public class MensagemErro {
    public static String erro;
    @FXML
    private javafx.scene.control.Label erroSaida;

    Stage estagioAtual = new Stage();


    public void start() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("arquivosfxml/MensagemErro.fxml"));
        estagioAtual.setTitle("Erro");
        estagioAtual.setScene(new Scene(root));
        estagioAtual.show();
    }

    @FXML
    private void initialize(){
        erroSaida.setText(getErro());
    }

    public String getErro(){
        return erro;
    }

    public void setErro(String erro){
        this.erro = erro;
    }
}
