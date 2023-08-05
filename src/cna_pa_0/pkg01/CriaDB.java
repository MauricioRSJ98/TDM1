/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cna_pa_0.pkg01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CriaDB {

    protected static File aux;
    protected static boolean check = false;

    // Cria o objeto JFileChooser
    public static JFileChooser fileChooser = new JFileChooser();
    public static CrClass Crn = new CrClass();
    public static File selectedFile;
    protected static void Criar() {

        // Define o filtro de extensão para o tipo de arquivo desejado
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Banco de dados", "db");
        fileChooser.setFileFilter(filter);

        // Exibe a caixa de diálogo para o usuário escolher o diretório e o nome do arquivo
        int returnValue = fileChooser.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            // Obtém o caminho completo do arquivo escolhido pelo usuário
            selectedFile = fileChooser.getSelectedFile();

            /*// Adiciona a extensão .txt, se ela não estiver presente
            if (!selectedFile.getName().endsWith(".db")) {
                selectedFile = new File(selectedFile.getAbsolutePath() + ".db");
            }*/
            // Cria o arquivo e escreve o conteúdo nele
            try {
                FileWriter writer = new FileWriter(selectedFile);
                writer.close();
                System.out.println("Arquivo criado com sucesso em " + selectedFile.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("Nenhum arquivo selecionado.");
            check = true;
        }
        aux = fileChooser.getSelectedFile();
    }

    protected static void Pop() {
        Connect cone = new Connect();
        cone.url = "jdbc:sqlite:" + aux;
        cone.Conexao();
        cone.PopDB();
    }

    protected static void EncDb() {
        try {
            Crn.mainFile = aux;
            if(Crn.EncN()==0){
                selectedFile.delete();
            }
            Crn.secretKey = null;
            Crn.keyBytes = null;
        } catch (Exception e) {
            System.out.println("Erro em CiaDB void EncDb");
        }
    }
}
