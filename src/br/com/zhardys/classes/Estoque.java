package br.com.zhardys.classes;

import java.io.*;
import br.com.zhardys.classes.*;

public class Estoque {
    String Nome, Descricao, Local;

    public void criarEstoque(String nome, String descricao, String local) throws Exception {
        this.Nome = nome;
        this.Descricao = descricao;
        this.Local = local;
        ControladorArquivos ArquivoEstoque = new ControladorArquivos();
        ArquivoEstoque.novoEstoque(this);
    }

}
