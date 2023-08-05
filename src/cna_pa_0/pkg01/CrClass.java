/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cna_pa_0.pkg01;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author MauricioR
 */
public class CrClass {

    protected static boolean checaDnv = false;
    protected static boolean check1 = false;
    public static boolean check = false;
    protected static File outputFile;
    protected static String keyString;
    protected static File mainFile;
    protected static String filePath;
    protected static File inputFile;
    protected static byte[] keyBytes;
    protected static SecretKey secretKey;

    // Função para ler um arquivo em um array de bytes
    public static byte[] lerArquivo(File file) throws IOException {
        FileInputStream inputStream = new FileInputStream(file);
        byte[] byteArray = new byte[(int) file.length()];
        inputStream.read(byteArray);
        inputStream.close();
        return byteArray;
    }

    // Função para escrever um array de bytes em um arquivo
    public static void escreverArquivo(byte[] byteArray, String fileName) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(fileName);
        outputStream.write(byteArray);
        outputStream.close();
    }

    // Função para criptografar um arquivo usando uma chave AES
    public static void criptografarArquivo(File inputFile, File outputFile, SecretKey secretKey) {
        try {
            byte[] inputBytes = lerArquivo(inputFile);

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            AlgorithmParameters params = cipher.getParameters();
            byte[] iv = ((AlgorithmParameters) params).getParameterSpec(IvParameterSpec.class).getIV();

            byte[] encryptedBytes = cipher.doFinal(inputBytes);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            outputStream.write(iv);
            outputStream.write(encryptedBytes);

            byte[] outputBytes = outputStream.toByteArray();
            if (!outputFile.getName().endsWith(".db")) {
                escreverArquivo(outputBytes, outputFile.getAbsolutePath() + ".db");
                outputFile.delete();
            } else {
                escreverArquivo(outputBytes, outputFile.getAbsolutePath());
            }
            checaDnv = false;
            System.out.println("Criptografado");
        } catch (Exception e) {
            checaDnv = true;
        }
    }
    public static boolean checagem;

    // Função para descriptografar um arquivo usando uma chave AES
    public static void descriptografarArquivo(File inputFile, File outputFile, SecretKey secretKey) throws Exception {
        byte[] inputBytes = lerArquivo(inputFile);

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] iv = new byte[16];
        System.arraycopy(inputBytes, 0, iv, 0, iv.length);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, new IvParameterSpec(iv));

        byte[] encryptedBytes = new byte[inputBytes.length - iv.length];
        System.arraycopy(inputBytes, iv.length, encryptedBytes, 0, encryptedBytes.length);

        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

        escreverArquivo(decryptedBytes, outputFile.getAbsolutePath());
        System.out.println("descriptografado");
    }
    public static int aux1;

    protected static void ExecIn(int i) throws Exception {
        try {
            UIManager.put("OptionPane.okButtonText", "Ok");
            inputFile = mainFile;
            outputFile = mainFile;
            // Seleciona a chave de criptografia
            if (i == 2) {
                UIManager.put("OptionPane.okButtonText", "Ok, apagar");
                final ImageIcon icon = new ImageIcon("src/assets/ticoCafe.png");
                keyString = (String) JOptionPane.showInputDialog(null, "Digite a chave de criptografia:", "Chave", JOptionPane.PLAIN_MESSAGE, icon, null, "");
                UIManager.put("OptionPane.okButtonText", "ok");
            } else {
                final ImageIcon icon = new ImageIcon("src/assets/ticoCafe.png");
                keyString = (String) JOptionPane.showInputDialog(null, "Digite a chave de criptografia:", "Chave", JOptionPane.PLAIN_MESSAGE, icon, null, "");
            }
            // Cria a chave secreta a partir da string fornecida pelo usuário
            keyBytes = keyString.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "AES");
            secretKey = secretKeySpec;

            // Descriptografa o arquivo
            descriptografarArquivo(inputFile, outputFile, secretKey);
            JOptionPane.showMessageDialog(null, "Arquivo descriptografado com sucesso!");

            check = true;
            check1 = true;
            aux1 = 1;
            System.out.print(1);
        } catch (Exception e) {
            aux1 = 2;
            System.out.println(2);
        }
    }

    protected static void ExecFi() throws Exception {
        outputFile = mainFile;
        inputFile = mainFile;
        // Cria a chave secreta a partir da string fornecida pelo usuário
        keyBytes = keyString.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "AES");
        SecretKey secretKey = secretKeySpec;

        // Criptografa o arquivo
        criptografarArquivo(inputFile, outputFile, secretKey);
        JOptionPane.showMessageDialog(null, "Arquivo criptografado com sucesso!");
        System.out.println(mainFile);
        check = false;
    }

    protected static int EncN() throws Exception {
                final ImageIcon icon = new ImageIcon("src/assets/ticoCafe.png");
        int ret = 0;
        boolean teste = false;
        String aux, aux1 = "";
        String para = "                ";
        aux = (String) JOptionPane.showInputDialog(null, "Digite a chave de criptografia:", "Chave", JOptionPane.PLAIN_MESSAGE, icon, null, "");
        if (aux != null) {
            if (aux.length() == 16 && !aux.equals(para)) {
                while (!teste) {
                    aux1 = JOptionPane.showInputDialog("Confirme a chave");
                    if (aux.equals(aux1)) {
                        keyString = aux;
                        teste = true;
                    } else if (aux1 == null) {
                        break;
                    } else if (aux1.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Campo vazi!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Chaves não batem");
                    }
                }
            } else {
                if (aux.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campo vazio");
                    teste = false;
                    EncN();
                } else if (aux.length() < 16) {
                    JOptionPane.showMessageDialog(null, "Chave invalida, caracteres insuficientes");
                    teste = false;
                    EncN();
                } else if (aux.length() > 16) {
                    JOptionPane.showMessageDialog(null, "Chave invalida, caracteres alem do permitido");
                    teste = false;
                    EncN();
                } else if (aux.equals(para)) {
                    JOptionPane.showMessageDialog(null, "A chave não pode conter espaços");
                    teste = false;
                    EncN();
                }
            }
        }

        if (teste && aux1 != null) {
            // Cria a chave secreta a partir da string fornecida pelo usuário
            keyBytes = keyString.getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "AES");
            secretKey = secretKeySpec;
            ExecFi();
            ret = 1;
        } else {
            ret = 0;
        }
        return ret;
    }

}
