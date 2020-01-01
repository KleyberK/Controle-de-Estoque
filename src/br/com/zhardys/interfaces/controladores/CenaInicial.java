package br.com.zhardys.interfaces.controladores;

import javafx.fxml.FXML;

public class CenaInicial {
    @FXML
    private void CriarEstoque() throws Exception{
        CriarEstoque estoque = new CriarEstoque();
        estoque.start();
    }

}
