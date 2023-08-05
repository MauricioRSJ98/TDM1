package cna_pa_0.pkg01;

import static cna_pa_0.pkg01.CriaDB.fileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.*;

import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;

public class Connect {

    // db parameters
    private static Connection conn = null;
    static Statement stmt;
    static Statement resd;
    static ResultSet res;
    protected static String sqlInsert, sqlSelect, sqlSelect1, sqlSelect2, armSelect;
    // create a connection to the database
    protected static String url = " ", status;
    protected static boolean check = true, cnome = false, csnome = false, ctel = false, ccpf = false, cservi = false, cval = false;
    // Rg parameters
    protected static String nome = null, snome = null, cpf = null, telefone = null, servic = null, val = null, armazena = "";
    private String data;
    protected static String LTd;

    ////
    public static void connect() {
        System.out.println(url + " checando");
        try {
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            System.out.println("Conectado");
        } catch (Exception e) {
            e.printStackTrace();
            check = false;
            System.out.println(e.getMessage() + "erro no metodo connect na classe Connect, 1° catch");
            status = e.getMessage();
        }
    }

    protected void CloseCon() throws SQLException {
        conn.close();
        System.out.println("Conexão fehcada");
    }
    ////////////////////////////Zona de encriptação////////////////////////////

    ////////////////////////////
    public void Conexao() {
        connect();
    }
    ////////////////////////////
    protected static int resD = 1;

    protected void RepA() {
        nome = nome.replaceAll("[à.à.â.ã.ä]", "a").replaceAll("[è.é.ê.ë]", "e")
                .replaceAll("[ì.í.î.ï]", "i").replaceAll("[ò.ó.ô.õ.ö]", "o")
                .replaceAll("[ù.ú.û.ü]", "u").replaceAll("[ý.ÿ]", "y")
                .replaceAll("[ñ]", "n").replaceAll("[?.@.!.#.$.%.¨.&.*]", "");
        snome = snome.replaceAll("[à.à.â.ã.ä]", "a").replaceAll("[è.é.ê.ë]", "e")
                .replaceAll("[ì.í.î.ï]", "i").replaceAll("[ò.ó.ô.õ.ö]", "o")
                .replaceAll("[ù.ú.û.ü]", "u").replaceAll("[ý.ÿ]", "y")
                .replaceAll("[ñ]", "n").replaceAll("[?.@.!.#.$.%.¨.&.*]", "");
        servic = servic.replaceAll("[à.à.â.ã.ä]", "a").replaceAll("[è.é.ê.ë]", "e")
                .replaceAll("[ì.í.î.ï]", "i").replaceAll("[ò.ó.ô.õ.ö]", "o")
                .replaceAll("[ù.ú.û.ü]", "u").replaceAll("[ý.ÿ]", "y")
                .replaceAll("[ñ]", "n").replaceAll("[?.@.!.#.$.%.¨.&.*]", "");
    }

    public void NovoR() {
        if ((!nome.isBlank() && !snome.isBlank() && !cpf.isBlank() && !telefone.isBlank() && !servic.isBlank() && !val.isBlank()) || (nome != null && snome != null && cpf != null && telefone != null && servic != null && val != null)) {// Segundo filtro de segurança
            RepA();
            try {
                sqlSelect = "select * from aux where eti='padrao'";
                res = stmt.executeQuery(sqlSelect);
                int aux = res.getInt("nrg");
                data = String.valueOf(LocalDate.now());
                sqlInsert = "insert into clientes (pnome,snome,rgdata,cpf,tel,id) values ('" + nome.toLowerCase() + "','" + snome.toLowerCase() + "','" + data + "','" + Long.parseLong(cpf) + "','" + Long.parseLong(telefone) + "','" + (aux + 1) + "')";
                stmt.executeUpdate(sqlInsert);
                sqlInsert = "insert into finaServico (finId,servico,valorAP) values('" + (aux + 1) + "','" + servic.toLowerCase() + "','" + val + "')";
                stmt.executeUpdate(sqlInsert);
                stmt.executeUpdate("update aux set nrg=" + (aux + 1) + " where eti='padrao';");
                System.out.println("Novo registro feito com sucesso!");
                final ImageIcon icon = new ImageIcon("src/assets/ticoh.png");
                JOptionPane.showMessageDialog(null, "Novo registro feito com sucesso", "Aê", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ticoh.png")).getImage()));
                //res = stmt.executeQuery("select * from clientes");
                //System.out.println(res.getString("pnome")+res.getString("snome"));
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + "Erro no metodo NovoR na calsse Connect");
                resD = 0;
            }
        } else {
            System.out.println("Erro: contem campos em branco, pego no segundo filtro no segundo filtro, classe Connect, função NovoR");
        }
    }

    ////////////////////////////
    protected int checkSelect = 0;

    protected void ConsR() {
        try {
            res = stmt.executeQuery(sqlSelect);
            armSelect = ("Nome: " + res.getString("pnome") + "\n Sobrenome: " + res.getString("snome") + "\n Data rg: "
                    + res.getString("rgdata") + "\n CPF: " + res.getString("cpf") + "\n Telefone: "
                    + res.getString("tel") + "\n Serviço: " + res.getString("servico") + "\n Valor a pagar: "
                    + res.getString("valorAP") + "\n Id: " + res.getString("id"));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + "Erro no metodo ConsR na calsse Connect");
            resD = 0;
        }
    }
    protected int ncheck = 0;

    protected void AtualizaR() {
        try {
            if (ncheck == 1 || ncheck == 3) {
                stmt.executeUpdate(sqlSelect1);
            }
            if (ncheck == 2 || ncheck == 3) {
                stmt.executeUpdate(sqlSelect2);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + "Erro no metodo AtualizaR na classe Connect");
        }
    }

    protected void ApagaR() {
        try {
            stmt.executeUpdate(sqlSelect);
            sqlSelect = "Registro apagado com sucesso";
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            sqlSelect = "Erro a apagar o registro selecionado";
        }
    }
    ////////////////////////////
    protected static int clfe = 0;

    protected static void MudaFecha() {
        UIManager.put("OptionPane.yesButtonText", "Não");
        UIManager.put("OptionPane.noButtonText", "Sim");
        clfe = JOptionPane.showConfirmDialog(null, "Fechar Programa", "Sair", JOptionPane.YES_NO_OPTION);
    }

    protected void SairClose() {
        try {
            conn.close();
            System.out.println("Conexão fechada!");
            conn = null;
        } catch (SQLException ex) {
            System.out.println(" Erro ao fechar a conexão, ou ja foi fechada");

        }
    }

    protected void PopDB() {
        try {
            stmt.executeUpdate("create table aux (nrg INTEGER (5000), eti VARCHAR (10));");
            stmt.executeUpdate("insert into aux (eti) values ('padrao')");
            stmt.executeUpdate("create table clientes (pnome VARCHAR (50) NOT NULL, snome VARCHAR (50) NOT NULL, rgdata DATE NOT NULL, cpf INT (11), tel INT (14), id INT (5000) PRIMARY KEY);");
            stmt.executeUpdate("create table finaServico (finId INT (5000) REFERENCES clientes (id) ON DELETE CASCADE, servico VARCHAR (25), valorAP INT (50000));");
            System.out.println("update feito");
            conn.close();
        } catch (Exception e) {
            System.out.println("Erro em Connect PopDB");
        }
    }

    public void ListarTd(String ii) throws SQLException {
        System.out.println("Void chamad");
        res = stmt.executeQuery(ii);
    }

    public void GeraEx() throws SQLException {
        res = stmt.executeQuery("select * from clientes inner join finaServico on clientes.id=finaServico.finId;");
        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Database Table");
        int rownum = 1;
        Row row1 = sheet.createRow(0);
        Cell cell0 = row1.createCell(0);
        cell0.setCellValue("Nome");
        Cell cell1 = row1.createCell(1);
        cell1.setCellValue("Sobrenome");
        Cell cell2 = row1.createCell(2);
        cell2.setCellValue("CPF");
        Cell cell3 = row1.createCell(3);
        cell3.setCellValue("Telefone");
        Cell cell4 = row1.createCell(4);
        cell4.setCellValue("Serviço");
        Cell cell5 = row1.createCell(5);
        cell5.setCellValue("Valor");

        while (res.next()) {
            Row row = sheet.createRow(rownum++);

            Cell cell11 = row.createCell(0);
            cell11.setCellValue(res.getString("pnome"));

            Cell cell22 = row.createCell(1);
            cell22.setCellValue(res.getString("snome"));

            Cell cell33 = row.createCell(2);
            cell33.setCellValue(res.getLong("cpf"));

            Cell cell44 = row.createCell(3);
            cell44.setCellValue(res.getLong("tel"));

            Cell cell55 = row.createCell(4);
            cell55.setCellValue(res.getString("servico"));

            Cell cell66 = row.createCell(5);
            cell66.setCellValue(res.getInt("valorAP"));

        }

        Row row = sheet.createRow(rownum);
        Cell cel = row.createCell(0);
        cel.setCellValue("Valor total:");
        Cell cel1 = row.createCell(1);//select SUM(valorAP) FROM finaServico;
        res = stmt.executeQuery("select sum(finaServico.valorAP) as total from finaServico join clientes on finaServico.finId = clientes.id;");
        cel1.setCellValue(res.getDouble(1));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel", "xlsx");

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setFileFilter(filter);
        int returnValue = fileChooser.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            
            File selectedFile = fileChooser.getSelectedFile();
            try {
                FileOutputStream out = new FileOutputStream(selectedFile + ".xlsx");
                workbook.write(out);
                out.close();
                System.out.println("Arquivo Excel criado com sucesso!");
            } catch (Exception e) {
                System.out.println("Erro ao criar o arquivo");
            }
        } else {
            System.out.println("Nenhum arquivo selecionado.");
        }
    }

    /////////////////Area de testes>/////////////////
    /////////////////<Area de testes/////////////////
}/*Blindar, n permnitir q ele registre no db se tiver algo de errado, pq ele ta 
registrando até o erro, blindar contra campos repetidos, talvez criar uma opção
para a pessoa escolher se quer duplicar ou n, quem sabe até se quer identificar
ou n*/
