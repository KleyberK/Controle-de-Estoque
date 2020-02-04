package br.com.zhardys.classes;

import br.com.zhardys.interfaces.controladores.MensagemErro;

import java.io.*;

public class ControladorArquivos {

    public void novoEstoque(Estoque estoque) throws Exception {
        String caminho = "ArquivosPrincipais/estoques.txt";
        File arquivoEstoque = new File(caminho);
        if(arquivoEstoque.exists()){
            if(procuraEstoque(estoque.Nome, arquivoEstoque)){
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

    private boolean procuraEstoque(String nome, File caminhoArquivo) throws Exception {
        FileReader estoque = new FileReader(caminhoArquivo);
        BufferedReader verificaEstoque = new BufferedReader(estoque);

        while(verificaEstoque.ready()){
            String compare = verificaEstoque.readLine();
            if(compare.equals(nome)){
                return true;
            }
        }

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
