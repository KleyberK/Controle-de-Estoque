package br.com.zhardys.classes;

import java.io.*;

public class Estoque {
    String Nome, Descricao, Local;

    public void criarEstoque(String nome, String descricao, String local){
        this.Nome = nome;
        this.Descricao = descricao;
        this.Local = local;
    }

    public void addEstoque(Estoque estoque) throws IOException {
        String caminho = "ArquivosPrincipais/estoques.txt";
        //caminho = "estoques.txt";
        File arquivoEstoque = new File(caminho);
        if(arquivoEstoque.exists()){
            FileWriter arquivo = new FileWriter(caminho, true);
            BufferedWriter escrita = new BufferedWriter(arquivo);
            escrita.write(estoque.Nome);
            escrita.newLine();
            escrita.write(estoque.Descricao);
            escrita.newLine();
            escrita.write(estoque.Local);
            escrita.newLine();
            escrita.close();
        } else {
            arquivoEstoque.createNewFile();
            FileWriter arquivo = new FileWriter(caminho, true);
            BufferedWriter escrita = new BufferedWriter(arquivo);
            escrita.write(estoque.Nome);
            escrita.newLine();
            escrita.write(estoque.Descricao);
            escrita.newLine();
            escrita.write(estoque.Local);
            escrita.newLine();
            escrita.close();
        }
    }

}
