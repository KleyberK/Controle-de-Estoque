package br.com.zhardys.classes;

import br.com.zhardys.interfaces.controladores.MensagemErro;

import java.io.*;

public class ControladorArquivos {

    public void novoEstoque(Estoque estoque) throws Exception {
        String caminho = "ArquivosPrincipais/estoques.txt";
        File arquivoEstoque = new File(caminho);
        if(arquivoEstoque.exists()){
            if(procuraEstoque(estoque.Nome)){
                MensagemErro erro = new MensagemErro();
                erro.setErro("Estoque Informado Já Existe!");
                erro.start();
            } else {
                arquivoEstoque.createNewFile();
                FileWriter arquivo = new FileWriter(caminho, true);
                BufferedWriter escrita = new BufferedWriter(arquivo);
                criarArquivos(escrita, estoque);
            }
        } else {
            arquivoEstoque.createNewFile();
            FileWriter arquivo = new FileWriter(caminho, true);
            BufferedWriter escrita = new BufferedWriter(arquivo);
            criarArquivos(escrita, estoque);
        }
    }

    private boolean procuraEstoque(String nome) {
        return false;
    }

    private void criarArquivos(BufferedWriter escrita, Estoque estoque) throws IOException {
        escrita.write(estoque.Nome);
        escrita.newLine();
        escrita.close();
        FileWriter arquivos = new FileWriter("ArquivosPrincipais/Estoques/" + estoque.Nome + ".txt");
        BufferedWriter escritas = new BufferedWriter(arquivos);
        escritas.write(estoque.Descricao);
        escritas.newLine();
        escritas.write(estoque.Local);
        escritas.newLine();
        escritas.close();
    }

}
