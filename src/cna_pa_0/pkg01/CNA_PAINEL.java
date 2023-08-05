/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cna_pa_0.pkg01;

import java.io.*;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Mauricio
 */
public class CNA_PAINEL extends javax.swing.JFrame {

    CrClass cr = new CrClass();
    Connect con = new Connect();
///////////////minhas voids>/////////////

    private Image back;
    final String NOME_ARQUIVO_BLOQUEIO = "bloqueio.lock";
    File arquivoBloqueio;

    public void checarJanela() {
        try {
            arquivoBloqueio = new File(NOME_ARQUIVO_BLOQUEIO);
            if (!arquivoBloqueio.createNewFile()) {
                System.out.println("O programa já está em execução.");
                System.exit(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                return;
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo de bloqueio: " + e.getMessage());
            return;
        }
    }

    private void BtnF() {
        con.MudaFecha();
        if (con.clfe == 1) {
            try {
                arquivoBloqueio.delete();
                con.SairClose();
            } catch (Exception e) {
            }
            System.exit(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        }
    }
    /////////////////////////////////////////

    public CNA_PAINEL() throws IOException {

        checarJanela();

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                arquivoBloqueio.delete();
                super.windowClosing(e);
                System.exit(0); // encerra o aplicativo quando o usuário clicar no botão de fechar
            }
        });
        initComponents();
        SecondW.setVisible(false);
        PanelMain.setVisible(false);
        PanelNr.setVisible(false);
        PanelConsu.setVisible(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("taski.png")));
        back = new ImageIcon("backg.png").getImage();
        this.setIconImage(back);

        RNome.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SecondW = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        AltRNome1 = new javax.swing.JRadioButton();
        AltRSnome1 = new javax.swing.JRadioButton();
        AltRCPF1 = new javax.swing.JRadioButton();
        AltRTel1 = new javax.swing.JRadioButton();
        AltRServ1 = new javax.swing.JRadioButton();
        AltRVal1 = new javax.swing.JRadioButton();
        AltNome1 = new javax.swing.JTextField();
        AltSnome1 = new javax.swing.JTextField();
        AltCPF1 = new javax.swing.JTextField();
        AltTel1 = new javax.swing.JTextField();
        AltServ1 = new javax.swing.JTextField();
        AltVal1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JToggleButton();
        btnAtua = new javax.swing.JButton();
        PanelCon = new javax.swing.JPanel();
        btnMainApagar = new javax.swing.JButton();
        btnCo = new javax.swing.JButton();
        Fc = new javax.swing.JFileChooser();
        btnNovoDB = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        PanelMain = new javax.swing.JPanel();
        btnConsRg = new javax.swing.JButton();
        btnNewrg = new javax.swing.JButton();
        BtnSairFecharCon = new javax.swing.JButton();
        BtnVoltarCon = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        PanelNr = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NrNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NrSnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NrTel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NrCpf = new javax.swing.JTextField();
        BtnVoltNr = new javax.swing.JButton();
        BtnNReg = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        NrServico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        NrValor = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        PanelConsu = new javax.swing.JPanel();
        BtnVoltConsu = new javax.swing.JButton();
        ConsRNome = new javax.swing.JRadioButton();
        ConsRSnome = new javax.swing.JRadioButton();
        ConsRCPF = new javax.swing.JRadioButton();
        ConsRTel = new javax.swing.JRadioButton();
        ConsRServ = new javax.swing.JRadioButton();
        ConsRVal = new javax.swing.JRadioButton();
        ConsNome = new javax.swing.JTextField();
        ConsSnome = new javax.swing.JTextField();
        ConsCPF = new javax.swing.JTextField();
        ConsTel = new javax.swing.JTextField();
        ConsServ = new javax.swing.JTextField();
        ConsVal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ConsLista = new javax.swing.JList<>();
        BtnConsutar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAConsDet = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnDeta = new javax.swing.JButton();
        btnAtuaPanel = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnExc = new javax.swing.JButton();
        RValor = new javax.swing.JRadioButton();
        RNome = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();

        SecondW.setMinimumSize(new java.awt.Dimension(600, 480));
        SecondW.setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 480));

        jLabel15.setText("CPF:");

        jLabel16.setText("Telefone:");

        jLabel17.setText("Serviço");

        jLabel18.setText("Valor:");

        AltRNome1.setSelected(true);
        AltRNome1.setText("Nome");

        AltRSnome1.setSelected(true);
        AltRSnome1.setText("Sobrenome");

        AltRCPF1.setSelected(true);
        AltRCPF1.setText("CPF");

        AltRTel1.setSelected(true);
        AltRTel1.setText("Telefone");
        AltRTel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltRTel1ActionPerformed(evt);
            }
        });

        AltRServ1.setSelected(true);
        AltRServ1.setText("Serviço");

        AltRVal1.setSelected(true);
        AltRVal1.setText("valor");

        AltVal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltVal1ActionPerformed(evt);
            }
        });

        jLabel19.setText("Alterar:");

        jLabel20.setText("Nome:");

        jLabel21.setText("Sobrenome:");

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnAtua.setText("Atualizar");
        btnAtua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addGap(497, 497, 497))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(AltSnome1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(AltNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(AltCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(AltServ1)
                                                    .addComponent(AltTel1)
                                                    .addComponent(AltVal1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jLabel18))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(AltRVal1)
                                    .addComponent(AltRSnome1)
                                    .addComponent(AltRNome1)
                                    .addComponent(AltRCPF1)
                                    .addComponent(AltRTel1)
                                    .addComponent(AltRServ1))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAtua)
                                .addGap(268, 268, 268))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltRNome1)
                    .addComponent(AltNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltRSnome1)
                    .addComponent(AltSnome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltRCPF1)
                    .addComponent(AltCPF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltRTel1)
                    .addComponent(AltTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltRServ1)
                    .addComponent(AltServ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AltRVal1)
                    .addComponent(AltVal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtua)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SecondWLayout = new javax.swing.GroupLayout(SecondW.getContentPane());
        SecondW.getContentPane().setLayout(SecondWLayout);
        SecondWLayout.setHorizontalGroup(
            SecondWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SecondWLayout.setVerticalGroup(
            SecondWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setResizable(false);

        PanelCon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelCon.setPreferredSize(new java.awt.Dimension(1024, 720));
        PanelCon.setLayout(null);

        btnMainApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Apagar.png"))); // NOI18N
        btnMainApagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMainApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainApagarActionPerformed(evt);
            }
        });
        PanelCon.add(btnMainApagar);
        btnMainApagar.setBounds(450, 370, 130, 66);

        btnCo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BtnCon.png"))); // NOI18N
        btnCo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoActionPerformed(evt);
            }
        });
        PanelCon.add(btnCo);
        btnCo.setBounds(220, 370, 210, 66);

        Fc.setOpaque(true);
        Fc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FcActionPerformed(evt);
            }
        });
        PanelCon.add(Fc);
        Fc.setBounds(220, 10, 594, 357);
        Fc.setBackground(new Color(0,0,0,0));

        FileFilter dbFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                if (file.isDirectory()) {
                    return true;
                }
                String fileName = file.getName();
                return fileName.endsWith(".db");
            }

            @Override
            public String getDescription() {
                return "Banco de dados (*.db)";
            }
        };
        Fc.setFileFilter(dbFilter);
        Fc.setAcceptAllFileFilterUsed(false);

        btnNovoDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/CNBD.png"))); // NOI18N
        btnNovoDB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoDBActionPerformed(evt);
            }
        });
        PanelCon.add(btnNovoDB);
        btnNovoDB.setBounds(600, 370, 210, 66);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logo.png"))); // NOI18N
        PanelCon.add(jLabel24);
        jLabel24.setBounds(40, 410, 1030, 330);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/TesteTicoMainT.png"))); // NOI18N
        PanelCon.add(jLabel22);
        jLabel22.setBounds(0, 130, 450, 420);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ClavaTPNG.png"))); // NOI18N
        PanelCon.add(jLabel25);
        jLabel25.setBounds(-70, 480, 440, 300);

        PanelMain.setPreferredSize(new java.awt.Dimension(1024, 720));
        PanelMain.setLayout(null);

        btnConsRg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Consu.png"))); // NOI18N
        btnConsRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsRgActionPerformed(evt);
            }
        });
        PanelMain.add(btnConsRg);
        btnConsRg.setBounds(606, 83, 185, 97);

        btnNewrg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/NovoRg.png"))); // NOI18N
        btnNewrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewrgActionPerformed(evt);
            }
        });
        PanelMain.add(btnNewrg);
        btnNewrg.setBounds(157, 83, 145, 97);

        BtnSairFecharCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sair.png"))); // NOI18N
        BtnSairFecharCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairFecharConActionPerformed(evt);
            }
        });
        PanelMain.add(BtnSairFecharCon);
        BtnSairFecharCon.setBounds(637, 338, 154, 104);

        BtnVoltarCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Escolh.png"))); // NOI18N
        BtnVoltarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarConActionPerformed(evt);
            }
        });
        PanelMain.add(BtnVoltarCon);
        BtnVoltarCon.setBounds(157, 338, 148, 104);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/TicoCoracao.png"))); // NOI18N
        PanelMain.add(jLabel23);
        jLabel23.setBounds(730, 440, 330, 310);

        PanelNr.setMinimumSize(new java.awt.Dimension(1024, 720));
        PanelNr.setPreferredSize(new java.awt.Dimension(1024, 720));
        PanelNr.setLayout(null);

        jLabel1.setText("Nome:");
        PanelNr.add(jLabel1);
        jLabel1.setBounds(174, 94, 30, 36);

        NrNome.setText(" ");
        NrNome.setOpaque(false);
        PanelNr.add(NrNome);
        NrNome.setBounds(248, 100, 167, 19);

        jLabel2.setText("Sobrenome:");
        PanelNr.add(jLabel2);
        jLabel2.setBounds(174, 140, 58, 15);

        NrSnome.setText(" ");
        NrSnome.setOpaque(false);
        NrSnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NrSnomeActionPerformed(evt);
            }
        });
        PanelNr.add(NrSnome);
        NrSnome.setBounds(248, 136, 167, 19);

        jLabel3.setText("Telefone:");
        PanelNr.add(jLabel3);
        jLabel3.setBounds(174, 176, 45, 15);

        NrTel.setText(" ");
        NrTel.setOpaque(false);
        NrTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NrTelActionPerformed(evt);
            }
        });
        PanelNr.add(NrTel);
        NrTel.setBounds(248, 172, 167, 19);

        jLabel4.setText("CPF:");
        PanelNr.add(jLabel4);
        jLabel4.setBounds(174, 206, 22, 15);

        NrCpf.setText(" ");
        NrCpf.setOpaque(false);
        NrCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NrCpfActionPerformed(evt);
            }
        });
        PanelNr.add(NrCpf);
        NrCpf.setBounds(248, 202, 167, 19);

        BtnVoltNr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Voltar.png"))); // NOI18N
        BtnVoltNr.setOpaque(false);
        BtnVoltNr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltNrActionPerformed(evt);
            }
        });
        PanelNr.add(BtnVoltNr);
        BtnVoltNr.setBounds(6, 6, 101, 58);

        BtnNReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Registrar.png"))); // NOI18N
        BtnNReg.setOpaque(false);
        BtnNReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNRegActionPerformed(evt);
            }
        });
        PanelNr.add(BtnNReg);
        BtnNReg.setBounds(382, 329, 100, 29);

        jLabel5.setText("Serviço:");
        PanelNr.add(jLabel5);
        jLabel5.setBounds(174, 242, 40, 15);

        NrServico.setOpaque(false);
        NrServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NrServicoActionPerformed(evt);
            }
        });
        PanelNr.add(NrServico);
        NrServico.setBounds(248, 238, 167, 19);

        jLabel6.setText("Valor:");
        PanelNr.add(jLabel6);
        jLabel6.setBounds(174, 278, 29, 15);

        NrValor.setOpaque(false);
        NrValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NrValorActionPerformed(evt);
            }
        });
        PanelNr.add(NrValor);
        NrValor.setBounds(248, 274, 167, 19);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Tico2.png"))); // NOI18N
        PanelNr.add(jLabel27);
        jLabel27.setBounds(570, 390, 380, 360);

        PanelConsu.setPreferredSize(new java.awt.Dimension(1024, 720));
        PanelConsu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnVoltConsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Voltar.png"))); // NOI18N
        BtnVoltConsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltConsuActionPerformed(evt);
            }
        });
        PanelConsu.add(BtnVoltConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 30, 86, 56));

        ConsRNome.setSelected(true);
        ConsRNome.setText("Nome");
        PanelConsu.add(ConsRNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 143, -1, -1));

        ConsRSnome.setSelected(true);
        ConsRSnome.setText("Sobrenome");
        PanelConsu.add(ConsRSnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 177, -1, -1));

        ConsRCPF.setSelected(true);
        ConsRCPF.setText("CPF");
        PanelConsu.add(ConsRCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 211, -1, -1));

        ConsRTel.setSelected(true);
        ConsRTel.setText("Telefone");
        PanelConsu.add(ConsRTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 245, -1, -1));

        ConsRServ.setSelected(true);
        ConsRServ.setText("Serviço");
        PanelConsu.add(ConsRServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 279, -1, -1));

        ConsRVal.setSelected(true);
        ConsRVal.setText("valor");
        PanelConsu.add(ConsRVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 313, -1, -1));
        PanelConsu.add(ConsNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 145, 232, -1));
        PanelConsu.add(ConsSnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 179, 232, -1));
        PanelConsu.add(ConsCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 213, 232, -1));
        PanelConsu.add(ConsTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 247, 232, -1));
        PanelConsu.add(ConsServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 281, 232, -1));

        ConsVal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsValActionPerformed(evt);
            }
        });
        PanelConsu.add(ConsVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 315, 232, -1));

        jLabel7.setText("Tipo de consulta:");
        PanelConsu.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 121, -1, -1));

        jLabel8.setText("Nome:");
        PanelConsu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 149, -1, -1));

        jLabel9.setText("Sobrenome:");
        PanelConsu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 183, -1, -1));

        jLabel10.setText("CPF:");
        PanelConsu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 217, -1, -1));

        jLabel11.setText("Telefone:");
        PanelConsu.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 251, -1, -1));

        jLabel12.setText("Serviço");
        PanelConsu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 285, -1, -1));

        jLabel13.setText("Valor:");
        PanelConsu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 319, -1, -1));

        jScrollPane1.setViewportView(ConsLista);

        PanelConsu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 121, 392, 464));

        BtnConsutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Consultar.png"))); // NOI18N
        BtnConsutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsutarActionPerformed(evt);
            }
        });
        PanelConsu.add(BtnConsutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 100, 30));

        jLabel14.setText("Detalhes:");
        PanelConsu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 408, -1, -1));

        txtAConsDet.setColumns(20);
        txtAConsDet.setRows(5);
        jScrollPane2.setViewportView(txtAConsDet);

        PanelConsu.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 442, 479, 143));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ListaTudo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelConsu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 120, 30));

        btnDeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Detalhar.png"))); // NOI18N
        btnDeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetaActionPerformed(evt);
            }
        });
        PanelConsu.add(btnDeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 30, 93, 56));

        btnAtuaPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Atualizar.png"))); // NOI18N
        btnAtuaPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtuaPanelActionPerformed(evt);
            }
        });
        PanelConsu.add(btnAtuaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 30, 97, 56));

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Apagar.png"))); // NOI18N
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        PanelConsu.add(btnApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 30, 140, 56));

        btnExc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Excel.png"))); // NOI18N
        btnExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcActionPerformed(evt);
            }
        });
        PanelConsu.add(btnExc, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 100, 60));

        RValor.setText("Valor");
        PanelConsu.add(RValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        RNome.setText("Nome");
        RNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RNomeActionPerformed(evt);
            }
        });
        PanelConsu.add(RNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 80, -1));

        jLabel26.setText("Ordenar por:");
        PanelConsu.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelConsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelConsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoActionPerformed
        cr.mainFile = Fc.getSelectedFile();
        try {
            cr.ExecIn(1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (cr.aux1 == 1) {
            con.url = ("jdbc:sqlite:" + Fc.getSelectedFile());
            System.out.println(Fc.getSelectedFile());
            con.Conexao();
        }
        try {
            cr.criptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        con.servic = "";
        con.val = "";
        System.out.println(con.check);
        if (con.check && cr.aux1 == 1 && cr.keyString != null) {
            PanelCon.setVisible(false);
            PanelMain.setVisible(true);
        } else if (cr.aux1 == 2 && cr.keyString != null) {
            JOptionPane.showMessageDialog(this, "Erro: " + "Chave incorreta ou erro ao conectar o banco de dados");
            System.out.println("erro");
        }
        //////////////////////NR//////////////>
        NrNome.setText(null);
        NrSnome.setText(null);
        NrCpf.setText(null);
        NrTel.setText(null);
        NrServico.setText(null);
        NrValor.setText(null);
        //////////////////////CONS////////////>
        ConsNome.setText(null);
        ConsSnome.setText(null);
        ConsCPF.setText(null);
        ConsTel.setText(null);
        ConsServ.setText(null);
        ConsVal.setText(null);
    }//GEN-LAST:event_btnCoActionPerformed

    private void FcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FcActionPerformed
        // TODO add your handling code here:
        if (cr.check) {
            con.url = ("jdbc:sqlite:" + Fc.getSelectedFile());
            System.out.println(Fc.getSelectedFile());
        }
    }//GEN-LAST:event_FcActionPerformed

    private void btnNewrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewrgActionPerformed
        PanelMain.setVisible(false);
        PanelNr.setVisible(true);
    }//GEN-LAST:event_btnNewrgActionPerformed

    private void BtnVoltarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarConActionPerformed
        PanelCon.setVisible(true);
        PanelMain.setVisible(false);
        PanelNr.setVisible(false);
        try {
            con.CloseCon();
        } catch (SQLException ex) {
            Logger.getLogger(CNA_PAINEL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnVoltarConActionPerformed

    private void BtnSairFecharConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairFecharConActionPerformed
        try {
            BtnF();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BtnSairFecharConActionPerformed

    private void btnConsRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsRgActionPerformed
        // TODO add your handling code here:
        PanelCon.setVisible(false);
        PanelMain.setVisible(false);
        PanelNr.setVisible(false);
        PanelConsu.setVisible(true);
    }//GEN-LAST:event_btnConsRgActionPerformed

    private void BtnVoltConsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltConsuActionPerformed
        // TODO add your handling code here:
        if(!SecondW.isVisible()){
        ConsNome.setText(null);
        ConsSnome.setText(null);
        ConsCPF.setText(null);
        ConsTel.setText(null);
        ConsServ.setText(null);
        ConsVal.setText(null);
        ConsRNome.setSelected(true);
        ConsRSnome.setSelected(true);
        ConsRCPF.setSelected(true);
        ConsRTel.setSelected(true);
        ConsRServ.setSelected(true);
        ConsRVal.setSelected(true);
        RNome.setSelected(true);
        RValor.setSelected(false);
        txtAConsDet.setText(null);
        PanelConsu.setVisible(false);
        PanelMain.setVisible(true);
        try {
            DefaultListModel listModel = (DefaultListModel) ConsLista.getModel();
            if (!listModel.isEmpty()) {
                listModel.removeAllElements();
            }
        } catch (Exception e) {
            e = null;
        }
        }else{
            JOptionPane.showMessageDialog(null, "Atualização em andamento!", "Erro", HEIGHT);
        }
    }//GEN-LAST:event_BtnVoltConsuActionPerformed

    private void ConsValActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsValActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsValActionPerformed
    ////////////////////////////// Consulta>//////////////////////////////
    private int consultar() {
        con.checkSelect = 0;
        DefaultListModel model = new DefaultListModel();
        int cn1 = 0, cn2 = 0, cn3 = 0;
        boolean nome = false, snome = false, cpf = false, tel = false, serv = false, val = false;
        String er = "", armazena = "", armazena1 = "";

        if (ConsRNome.isSelected()) {
            con.checkSelect = 1;
        }
        if (ConsRNome.isSelected() && ConsNome != null && !(ConsNome.getText().isBlank())) {
            armazena += " b.pnome='" + ConsNome.getText().toLowerCase() + "'";
            nome = true;
        } else if (ConsRNome.isSelected() && ConsNome.getText().isBlank()) {
            er += " |Nome| ";
        } else if (!ConsRNome.isSelected()) {
            nome = true;
        }
        //
        if (ConsRSnome.isSelected()) {
            con.checkSelect = 1;
        }
        if (ConsRSnome.isSelected() && ConsSnome != null && !(ConsSnome.getText().isBlank())) {
            if (!ConsRNome.isSelected()) {
                armazena += " b.snome='" + ConsSnome.getText().toLowerCase() + "'";
            } else {
                armazena += " and b.snome='" + ConsSnome.getText().toLowerCase() + "'";
            }
            snome = true;
        } else if (ConsRSnome.isSelected() && ConsNome.getText().isBlank()) {
            er += " |Sobrenome| ";
        } else if (!ConsRSnome.isSelected()) {
            snome = true;
        }
        //n
        if (ConsRCPF.isSelected()) {
            con.checkSelect = 1;
        }
        if (ConsRCPF.isSelected() && ConsCPF != null && !(ConsCPF.getText().isBlank())) {
            try {
                long cn = Long.parseLong(ConsCPF.getText());
                if (!ConsRNome.isSelected() && !ConsRSnome.isSelected()) {
                    armazena += " b.cpf=" + ConsCPF.getText();
                } else {
                    armazena += " and b.cpf=" + ConsCPF.getText();
                }
                cpf = true;
            } catch (Exception e) {
                System.out.println("Erro no campo CPF");
                er += " |CPF| ";
            }
        } else if (ConsRCPF.isSelected() && ConsCPF.getText().isBlank()) {
            er += " |CPF| ";
        } else if (!ConsRCPF.isSelected()) {
            cpf = true;
        }
        //n
        if (ConsRTel.isSelected()) {
            con.checkSelect = 1;
        }
        if (ConsRTel.isSelected() && ConsTel != null && !(ConsTel.getText().isBlank())) {
            try {
                long cn = Long.parseLong(ConsTel.getText());
                if (!ConsRNome.isSelected() && !ConsRSnome.isSelected() && !ConsRCPF.isSelected()) {
                    armazena += " b.tel=" + ConsTel.getText();
                } else {
                    armazena += " and b.tel=" + ConsTel.getText();
                }
                tel = true;
            } catch (Exception e) {
                System.out.println("Erro no campo telefone");
                er += " |Telefone| ";
            }
        } else if (ConsRTel.isSelected() && ConsTel.getText().isBlank()) {
            er += " |Telefone| ";
        } else if (!ConsRTel.isSelected()) {
            tel = true;
        }
        ////////////tablea finaServico//////////>
        if (ConsRServ.isSelected() && con.checkSelect == 1) {
            con.checkSelect = 2;
        } else if (con.checkSelect == 0 && ConsRServ.isSelected()) {
            con.checkSelect = 3;
        }
        if (ConsRServ.isSelected() && ConsServ != null && !(ConsServ.getText().isBlank())) {
            armazena1 += " a.servico='" + ConsServ.getText().toLowerCase() + "'";
            serv = true;
        } else if (ConsRServ.isSelected() && ConsServ.getText().isBlank()) {
            er += " |Serviço| ";
        } else if (!ConsRServ.isSelected()) {
            serv = true;
        }
        //n
        if (ConsRVal.isSelected() && con.checkSelect == 1) {
            con.checkSelect = 2;
        } else if (con.checkSelect == 0 && ConsRVal.isSelected()) {
            con.checkSelect = 3;
        }
        if (ConsRVal.isSelected() && ConsVal != null && !(ConsVal.getText().isBlank())) {
            try {
                int cn = Integer.parseInt(ConsVal.getText());
                if (!ConsRServ.isSelected()) {
                    armazena1 += " a.valorAP=" + ConsVal.getText();
                } else {
                    armazena1 += " and a.valorAP=" + ConsVal.getText();
                }
                val = true;
            } catch (Exception e) {
                System.out.println("Erro no campo valor");
                er += " |Valor| ";
            }
        } else if (ConsRVal.isSelected() && ConsVal.getText().isBlank()) {
            er += " |Valor| ";
        } else if (!ConsRVal.isSelected()) {
            val = true;
        }
        //////////////////////////////////////////////    
        if (nome && snome && cpf && tel && serv && val && TCs2 != 1) {
            //armazena = "SELECT * FROM clientes WHERE", armazena1 = "SELECT * FROM finaServico WHERE";
            if (con.checkSelect == 1) {
                if (RNome.isSelected() && !RValor.isSelected()) {
                    con.sqlSelect = "select b.*, a.* from clientes as b inner join finaServico as a on (b.id=a.finId) WHERE" + armazena + " ORDER BY pnome ASC;";
                } else if (!RNome.isSelected() && RValor.isSelected()) {
                    con.sqlSelect = "select b.*, a.* from clientes as b inner join finaServico as a on (b.id=a.finId) WHERE" + armazena + " ORDER BY valorAP ASC;";
                } else if (RNome.isSelected() && RValor.isSelected()) {
                    con.sqlSelect = "select b.*, a.* from clientes as b inner join finaServico as a on (b.id=a.finId) WHERE" + armazena + " ORDER BY pnome ASC, valorAP ASC;";
                } else {
                    con.sqlSelect = "select b.*, a.* from clientes as b inner join finaServico as a on (b.id=a.finId) WHERE" + armazena + ";";
                }
            } else if (con.checkSelect == 3) {
                if (RNome.isSelected() && !RValor.isSelected()) {
                    con.sqlSelect = "select b.*, a.* from clientes as b inner join finaServico as a on (b.id=a.finId) WHERE" + armazena1 + " ORDER BY pnome ASC;";
                } else if (!RNome.isSelected() && RValor.isSelected()) {
                    con.sqlSelect = "select b.*, a.* from clientes as b inner join finaServico as a on (b.id=a.finId) WHERE" + armazena1 + " ORDER BY valorAP ASC;";
                } else if (RNome.isSelected() && RValor.isSelected()) {
                    con.sqlSelect = "select b.*, a.* from clientes as b inner join finaServico as a on (b.id=a.finId) WHERE" + armazena1 + " ORDER BY pnome ASC, valorAP ASC;";
                } else {
                    con.sqlSelect = "select b.*, a.* from clientes as b inner join finaServico as a on (b.id=a.finId) WHERE" + armazena1;
                }
            } else if (con.checkSelect == 2) {
                if (RNome.isSelected() && !RValor.isSelected()) {
                    con.sqlSelect = "select b.*, a.* from clientes as b inner join finaServico as a on (b.id=a.finId) WHERE" + armazena + " and" + armazena1 + " ORDER BY pnome ASC;";
                } else if (!RNome.isSelected() && RValor.isSelected()) {
                    con.sqlSelect = "select b.*, a.* from clientes as b inner join finaServico as a on (b.id=a.finId) WHERE" + armazena + " and" + armazena1 + " ORDER BY valorAP ASC;";
                } else if (RNome.isSelected() && RValor.isSelected()) {
                    con.sqlSelect = "select b.*, a.* from clientes as b inner join finaServico as a on (b.id=a.finId) WHERE" + armazena + " and" + armazena1 + " ORDER BY pnome ASC, valorAP ASC;";
                } else {
                    con.sqlSelect = "select b.*, a.* from clientes as b inner join finaServico as a on (b.id=a.finId) WHERE" + armazena + " and" + armazena1 + ";";
                }
            } else if (TCs2 == 1) {
                con.sqlSelect = "select b.*, a.* from clientes as b inner join finaServico as a on (b.id=a.finId) WHERE b.id =" + auxId;
            }
            ntt = true;
            TCs2 = 2;
            auxId = 0;
            System.out.println("Passou");
            System.out.println(armazena);
            con.ConsR();
            String nome1, sobrenome1, data1, cpf1, tel1, id1, servico1, valor1;
            try {
                while (con.res.next()) {
                    nome1 = con.res.getString("pnome");
                    sobrenome1 = con.res.getString("snome");
                    data1 = con.res.getString("rgdata");
                    cpf1 = con.res.getString("cpf");
                    tel1 = con.res.getString("tel");
                    id1 = con.res.getString("id");
                    servico1 = con.res.getString("servico");
                    valor1 = con.res.getString("valorAP");
                    model.addElement("Nome: " + nome1 + " |Sobrenome: " + sobrenome1 + " |Valor: " + valor1 + " |ID: " + id1);
                }
                ConsLista.setModel(model);
            } catch (SQLException ex) {
                System.out.println("erro");
            }
        } else if (!checagemAp) {
            int aux = 0;
            UIManager.put("OptionPane.yesButtonText", "Continuar");
            UIManager.put("OptionPane.noButtonText", "Descartar");
            aux = JOptionPane.showConfirmDialog(null, "Campos:" + er + "\n em branco ou indevidamente prenchidos", "Erro", JOptionPane.YES_NO_OPTION);
            if (aux != 0) {
                if (!nome) {
                    ConsNome.setText("");
                    con.nome = null;
                }
                if (!snome) {
                    ConsSnome.setText("");
                    con.snome = null;
                }
                if (!tel) {
                    ConsTel.setText("");
                    con.telefone = null;
                }
                if (!cpf) {
                    ConsCPF.setText("");
                    con.cpf = null;
                }
                if (!serv) {
                    ConsServ.setText("");
                    con.servic = null;
                }
                if (!val) {
                    ConsVal.setText("");
                    con.val = null;
                }
            }
        }
        checagemAp = false;
        if (model.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
    protected static boolean ntt = false;

    protected void btnCons() {
        try {
            cr.descriptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (consultar() != 0 && !checadnv && TCs2 != 1 & ntt) {
            final ImageIcon icon = new ImageIcon("src/assets/ticod.png");
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado", "Erro", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/TicoBorracha.png")).getImage()));
            TCs2 = 0;
        } else {
            checadnv = false;
        }
        ntt = false;
        try {
            cr.criptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
        } catch (Exception e) {
            e = null;
        }
    }

    private void BtnConsutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsutarActionPerformed
        // TODO add your handling code here:
        btnCons();
        TCs = 1;
    }//GEN-LAST:event_BtnConsutarActionPerformed

    protected static String auxB;

    protected void Resorve() {
        auxB = ConsLista.getSelectedValue().substring(ConsLista.getSelectedValue().indexOf("|ID:") + 4);
    }

    private void btnDetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetaActionPerformed
        // TODO add your handling code here:
        if (!SecondW.isVisible()) {
            try {
                cr.descriptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
            } catch (Exception e) {
                System.out.println("Erro aqui");
            }
            try {
                Resorve();
                con.sqlSelect = "select b.*, a.* from clientes as b inner join finaServico as a on (b.id=a.finId) where b.id=" + auxB;
                con.ConsR();
                txtAConsDet.setText(con.armSelect);
            } catch (Exception e) {
                if (!checadnv) {
                    JOptionPane.showMessageDialog(null, "Nenhum registro selecionado", "Erro", JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/assets/TicoLoading.png")));
                } else {
                    checadnv = false;
                }
            }
            try {
                cr.criptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
            } catch (Exception e) {
                e = null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Atualização em andamento!", "Erro", HEIGHT);
        }
    }//GEN-LAST:event_btnDetaActionPerformed

    private void btnAtuaPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtuaPanelActionPerformed
        // TODO add your handling code here:
        Resorve();
        if (!ConsLista.isSelectionEmpty()) {
            SecondW.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/assets/TicoLoading.png")));
        }
        checagemAp = true;
        if (TCs == 1) {
            btnCons();
        } else if (TCs == 2) {
            ListTudo();
        }
        checagemAp = true;
    }//GEN-LAST:event_btnAtuaPanelActionPerformed

    private void AltVal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltVal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AltVal1ActionPerformed

    private void AltRTel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltRTel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AltRTel1ActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        SecondW.setVisible(false);
        AltNome1.setText(null);
        AltSnome1.setText(null);
        AltCPF1.setText(null);
        AltTel1.setText(null);
        AltServ1.setText(null);
        AltVal1.setText(null);
    }//GEN-LAST:event_btnCancelActionPerformed


    private void btnAtuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtuaActionPerformed
        // TODO add your handling code here:
        try {
            cr.descriptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
        } catch (Exception e) {
            System.out.println("Erro aqui");
        }

        String armazena = "", armazena1 = "", er = "";
        boolean nome = false, snome = false, cpf = false, tel = false, servico = false, val = false;
        if (AltRNome1.isSelected() && AltNome1 != null && !(AltNome1.getText().isBlank())) {
            armazena += " pnome='" + AltNome1.getText() + "'";
            nome = !nome;
        } else if (!AltRNome1.isSelected()) {
            nome = !nome;
        } else {
            er += " |Nome| ";
        }
        //
        if (AltRNome1.isSelected() && AltRSnome1.isSelected() && AltSnome1 != null && !(AltSnome1.getText().isBlank())) {
            armazena += ", snome='" + AltSnome1.getText() + "'";
            snome = !snome;
        } else if (AltRSnome1.isSelected() && AltSnome1 != null && !(AltSnome1.getText().isBlank())) {
            armazena += " snome='" + AltSnome1.getText() + "'";
            snome = !snome;
        } else if (!AltRSnome1.isSelected()) {
            snome = !snome;
        } else {
            er += " |Sobrenome| ";
        }
        //n>
        if (AltRNome1.isSelected() && AltRSnome1.isSelected() && AltRCPF1.isSelected() && AltRCPF1 != null && !(AltRCPF1.getText().isBlank())) {
            try {
                long n = Long.parseLong(AltCPF1.getText());
                armazena += ", cpf='" + AltRCPF1.getText() + "'";
                cpf = !cpf;
            } catch (Exception e) {
                System.out.println("Erro no if 1 de cpf, atualização");
            }
        } else if (AltRCPF1.isSelected() && AltRCPF1 != null && !(AltCPF1.getText().isBlank())) {
            try {
                long n = Long.parseLong(AltCPF1.getText());
                armazena += " cpf='" + AltCPF1.getText() + "'";
                cpf = !cpf;
            } catch (Exception e) {
                System.out.println("Erro no if 2 de cpf, atualização");
                er += " |cpf| ";
            }
        } else if (!AltRCPF1.isSelected()) {
            cpf = !cpf;
        } else {
            er += " |cpf| ";
        }
        //n>
        if (AltRNome1.isSelected() && AltRSnome1.isSelected() && AltRCPF1.isSelected() && AltRTel1.isSelected() && AltTel1 != null && !(AltTel1.getText().isBlank())) {
            try {
                long n = Long.parseLong(AltTel1.getText());
                armazena += ", tel='" + AltTel1.getText() + "'";
                tel = !tel;
            } catch (Exception e) {
                System.out.println("Erro no if 1 de telefone, atualização");
            }
        } else if (AltRTel1.isSelected() && AltTel1 != null && !(AltTel1.getText().isBlank())) {
            try {
                long n = Long.parseLong(AltTel1.getText());
                armazena += " tel='" + AltTel1.getText() + "'";
                tel = !tel;
            } catch (Exception e) {
                System.out.println("Erro no if 2 de telefone, atualização");
                er += " |Telefone| ";
            }

        } else if (!AltRTel1.isSelected()) {
            tel = !tel;
        } else {
            er += " |Telefone| ";
        }

        if (AltRNome1.isSelected() || AltRSnome1.isSelected() || AltRCPF1.isSelected() || AltRTel1.isSelected()) {
            con.ncheck = 1;
        }
        /////////////////////////////// tabela finaServico> ///////////////////////////////
        if (AltRServ1.isSelected() && AltServ1 != null && !(AltServ1.getText().isBlank())) {
            armazena1 += " servico='" + AltServ1.getText() + "'";
            servico = !servico;
        } else if (!AltRServ1.isSelected()) {
            servico = !servico;
        } else {
            er += " |Serviço| ";
        }
        //n>
        if (AltRServ1.isSelected() && AltRVal1.isSelected() && AltVal1 != null && !(AltVal1.getText().isBlank())) {
            try {
                long n = Long.parseLong(AltVal1.getText());
                armazena1 += ", valorAP='" + AltVal1.getText() + "'";
                val = !val;
            } catch (Exception e) {
                System.out.println("Erro no if 1 de valor, atualização");
            }
        } else if (AltRVal1.isSelected() && AltVal1 != null && !(AltVal1.getText().isBlank())) {
            try {
                Long n = Long.parseLong(AltVal1.getText());
                armazena1 += " valorAP='" + AltVal1.getText() + "'";
                val = !val;
            } catch (Exception e) {
                System.out.println("Erro no if 2 de valor, atualização");
                er += " |Valor| ";
            }
        } else if (!AltRVal1.isSelected()) {
            val = !val;
        } else {
            er += " |Valor| ";
        }
        /////////////////////////////// <tabela finaServico ///////////////////////////////
        if (con.ncheck == 1 && (AltRServ1.isSelected() || AltRVal1.isSelected())) {
            con.ncheck = 3;
        } else if (AltRServ1.isSelected() || AltRVal1.isSelected()) {
            con.ncheck = 2;
        }

        if (nome && snome && cpf && tel && servico && val) {
            con.sqlSelect1 = "update clientes set" + armazena + " where id=" + auxB;
            System.out.println(con.sqlSelect1);
            System.out.println(con.ncheck);
            con.sqlSelect2 = "update finaServico set" + armazena1 + " where finId=" + auxB;
            con.AtualizaR();
        } else {
            int aux1 = 0;
            UIManager.put("OptionPane.yesButtonText", "Continuar");
            UIManager.put("OptionPane.noButtonText", "Descartar");
            aux1 = JOptionPane.showConfirmDialog(null, "Campos:" + er + "\n em branco ou indevidamente prenchidos", "Erro", JOptionPane.YES_NO_OPTION);
            if (aux1 != 0) {
                if (!nome) {
                    AltNome1.setText("");
                    con.nome = null;
                }
                if (!snome) {
                    AltSnome1.setText("");
                    con.snome = null;
                }
                if (!tel) {
                    AltTel1.setText("");
                    con.telefone = null;
                }
                if (!cpf) {
                    AltCPF1.setText("");
                    con.cpf = null;
                }
                if (!servico) {
                    AltServ1.setText("");
                    con.servic = null;
                }
                if (!val) {
                    AltVal1.setText("");
                    con.val = null;
                }
            }
        }

        try {
            cr.criptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
        } catch (Exception e) {
        }

        if (TCs == 1) {
            TCs2 = 1;
            auxB = auxB.trim();
            auxId = Integer.valueOf(auxB);
            btnCons();
        } else if (TCs == 2) {
            ListTudo();
        }
        TCs2 = 2;
        checagemAp = true;

    }//GEN-LAST:event_btnAtuaActionPerformed
    protected static int auxId;
    protected static boolean checagemAp = false;
    protected static int TCs = 0, TCs2;
    protected static boolean checadnv = false;

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // TODO add your handling code here:
        if(!SecondW.isVisible()){
        try {
            cr.descriptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!ConsLista.isSelectionEmpty()) {
            final ImageIcon icon = new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/TicoBorracha.png")).getImage());
            int aux = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja fazer isso?", "Apagar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, icon);
            if (aux == JOptionPane.YES_OPTION) {
                String Str = new String(ConsLista.getSelectedValuesList().toString());
                Str = Str.substring(0, Str.length() - 1);
                for (String retval : Str.split(",")) {
                    String aux1 = String.valueOf(retval.substring(ConsLista.getSelectedValue().indexOf("ID:") + 4));
                    con.sqlSelect = "delete from clientes where id=" + aux1;
                    con.ApagaR();
                    con.sqlSelect = "delete from finaServico where finId=" + aux1;
                    con.ApagaR();
                }
                JOptionPane.showMessageDialog(null, con.sqlSelect, "Aviso", JOptionPane.WARNING_MESSAGE);
                checagemAp = true;
                checadnv = true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/assets/TicoLoading.png")));
        }
        try {
            cr.criptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TCs == 1) {
            btnCons();
        } else if (TCs == 2) {
            ListTudo();
        }
        checagemAp = true;
        }else{
            JOptionPane.showMessageDialog(null, "Atualização em andamento!", "Erro", HEIGHT);
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void BtnNRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNRegActionPerformed
        // TODO add your handling code here:
        try {
            cr.descriptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String armazena = "";
        int cn1 = 0, cn2 = 0, cn3 = 0;
        boolean cnome = false, csnome = false, ctel = false, ccpf = false, cservi = false, cval = false;
        try {
            con.nome = NrNome.getText().toLowerCase();
            if (!con.nome.isBlank() && con.nome != null) {
                cnome = true;
            } else {
                armazena += " |Nome| ";
            }
            con.snome = NrSnome.getText().toLowerCase();
            if (!con.snome.isBlank() && con.snome != null) {
                csnome = true;
            } else {
                armazena += " |Sobrenome| ";
            }
            //n
            try {
                long cn = Long.parseLong(NrTel.getText());
                cn1 = 1;
                ctel = true;
                con.telefone = NrTel.getText();
            } catch (Exception e) {
                armazena += " |Telefone| ";
            }
            //n
            try {
                long cn = Long.parseLong(NrCpf.getText());
                cn2 = 1;
                ccpf = true;
                con.cpf = NrCpf.getText();
            } catch (Exception e) {
                armazena += " |CPF| ";
            }
            //
            con.servic = NrServico.getText().toLowerCase();
            if (!con.servic.isBlank() && con.servic != null) {
                cservi = true;
            } else {
                armazena += " |Serviço| ";
            }
            //n
            try {
                int cn = Integer.parseInt(NrValor.getText());
                cn3 = 1;
                cval = true;
                con.val = NrValor.getText();
            } catch (Exception e) {
                armazena += " |Valor| ";
            }

            if (cnome && csnome && ctel && ccpf && cservi && cval) {
                con.NovoR();
            } else {
                int aux = 0;
                UIManager.put("OptionPane.yesButtonText", "Continuar");
                UIManager.put("OptionPane.noButtonText", "Descartar");
                aux = JOptionPane.showConfirmDialog(null, "Campos:" + armazena + "\n em branco ou indevidamente prenchidos", "Erro", JOptionPane.YES_NO_OPTION);
                if (aux != 0) {
                    if (!cnome) {
                        NrNome.setText("");
                        con.nome = null;
                    }
                    if (!csnome) {
                        NrSnome.setText("");
                        con.snome = null;
                    }
                    if (!ctel) {
                        NrTel.setText("");
                        con.telefone = null;
                    }
                    if (!ccpf) {
                        NrCpf.setText("");
                        con.cpf = null;
                    }
                    if (!cservi) {
                        NrServico.setText("");
                        con.servic = null;
                    }
                    if (!cval) {
                        NrValor.setText("");
                        con.val = null;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            cr.criptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BtnNRegActionPerformed

    private void BtnVoltNrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltNrActionPerformed
        // TODO add your handling code here:
        NrNome.setText(null);
        NrSnome.setText(null);
        NrTel.setText(null);
        NrCpf.setText(null);
        NrServico.setText(null);
        NrValor.setText(null);
        PanelMain.setVisible(true);
        PanelNr.setVisible(false);
    }//GEN-LAST:event_BtnVoltNrActionPerformed

    private void NrCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NrCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NrCpfActionPerformed

    private void NrTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NrTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NrTelActionPerformed

    private void NrSnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NrSnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NrSnomeActionPerformed

    private void NrValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NrValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NrValorActionPerformed

    private void NrServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NrServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NrServicoActionPerformed

    private void btnNovoDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoDBActionPerformed
        // TODO add your handling code here:
        CriaDB cdb = new CriaDB();
        cdb.Criar();
        if (!cdb.check) {
            cdb.Pop();
            try {
                cdb.EncDb();
            } catch (Exception ex) {

            }
        }
        cdb.check = false;
        Fc.rescanCurrentDirectory();
    }//GEN-LAST:event_btnNovoDBActionPerformed

    private void btnMainApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainApagarActionPerformed
        // TODO add your handling code here:
        CrClass crr = new CrClass();
        try {
            crr.mainFile = Fc.getSelectedFile();
            crr.ExecIn(2);
            if (crr.check1) {
                Fc.getSelectedFile().delete();
                Fc.rescanCurrentDirectory();
            }
            crr.check1 = false;
        } catch (Exception ex) {
            System.out.println("Erro na primeira classe");
        }

    }//GEN-LAST:event_btnMainApagarActionPerformed

    protected void ListTudo() {
        try {
            cr.descriptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
        } catch (Exception e) {
            e = null;
        }

        DefaultListModel model = new DefaultListModel();
        try {
            String Select = "";
            if (RNome.isSelected() && !RValor.isSelected()) {
                Select = "select * from clientes inner join finaServico on clientes.id=finaServico.finId ORDER BY pnome ASC;";
            } else if (!RNome.isSelected() && RValor.isSelected()) {
                Select = "select * from clientes inner join finaServico on clientes.id=finaServico.finId ORDER BY valorAP ASC;";
            } else if (RNome.isSelected() && RValor.isSelected()) {
                Select = "select * from clientes inner join finaServico on clientes.id=finaServico.finId ORDER BY pnome ASC, valorAP ASC;";
            } else {
                Select = "select * from clientes inner join finaServico on clientes.id=finaServico.finId;";
            }
            con.ListarTd(Select);
        } catch (SQLException ex) {
            ex = null;
        }
        try {
            while (con.res.next()) {
                String nome1 = con.res.getString("pnome");
                String sobrenome1 = con.res.getString("snome");
                Long val1 = con.res.getLong("valorAP");
                int id1 = con.res.getInt("id");
                model.addElement("Nome: " + nome1 + " |Sobrenome: " + sobrenome1 + " |Valor: " + val1 + " |ID: " + id1);
            }
            ConsLista.setModel(model);
        } catch (SQLException ex) {
            System.out.println("erro");
        }

        try {
            cr.criptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
        } catch (Exception e) {
            e = null;
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ListTudo();
        TCs = 2;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcActionPerformed
        // TODO add your handling code here:try {
        try {
            cr.descriptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
        } catch (Exception e) {
            e = null;
        }

        try {
            con.GeraEx();
        } catch (Exception e) {
            e = null;
        }

        try {
            cr.criptografarArquivo(cr.inputFile, cr.outputFile, cr.secretKey);
        } catch (Exception e) {
            e = null;
        }
    }//GEN-LAST:event_btnExcActionPerformed

    private void RNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RNomeActionPerformed
    //////////////////////////////<Consulta //////////////////////////////
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CNA_PAINEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CNA_PAINEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CNA_PAINEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CNA_PAINEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CNA_PAINEL().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(CNA_PAINEL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AltCPF1;
    private javax.swing.JTextField AltNome1;
    private javax.swing.JRadioButton AltRCPF1;
    private javax.swing.JRadioButton AltRNome1;
    private javax.swing.JRadioButton AltRServ1;
    private javax.swing.JRadioButton AltRSnome1;
    private javax.swing.JRadioButton AltRTel1;
    private javax.swing.JRadioButton AltRVal1;
    private javax.swing.JTextField AltServ1;
    private javax.swing.JTextField AltSnome1;
    private javax.swing.JTextField AltTel1;
    private javax.swing.JTextField AltVal1;
    private javax.swing.JButton BtnConsutar;
    private javax.swing.JButton BtnNReg;
    private javax.swing.JButton BtnSairFecharCon;
    private javax.swing.JButton BtnVoltConsu;
    private javax.swing.JButton BtnVoltNr;
    private javax.swing.JButton BtnVoltarCon;
    private javax.swing.JTextField ConsCPF;
    private javax.swing.JList<String> ConsLista;
    private javax.swing.JTextField ConsNome;
    private javax.swing.JRadioButton ConsRCPF;
    private javax.swing.JRadioButton ConsRNome;
    private javax.swing.JRadioButton ConsRServ;
    private javax.swing.JRadioButton ConsRSnome;
    private javax.swing.JRadioButton ConsRTel;
    private javax.swing.JRadioButton ConsRVal;
    private javax.swing.JTextField ConsServ;
    private javax.swing.JTextField ConsSnome;
    private javax.swing.JTextField ConsTel;
    private javax.swing.JTextField ConsVal;
    private javax.swing.JFileChooser Fc;
    private javax.swing.JTextField NrCpf;
    private javax.swing.JTextField NrNome;
    private javax.swing.JTextField NrServico;
    private javax.swing.JTextField NrSnome;
    private javax.swing.JTextField NrTel;
    private javax.swing.JTextField NrValor;
    private javax.swing.JPanel PanelCon;
    private javax.swing.JPanel PanelConsu;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JPanel PanelNr;
    private javax.swing.JRadioButton RNome;
    private javax.swing.JRadioButton RValor;
    private javax.swing.JFrame SecondW;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnAtua;
    private javax.swing.JButton btnAtuaPanel;
    private javax.swing.JToggleButton btnCancel;
    private javax.swing.JButton btnCo;
    private javax.swing.JButton btnConsRg;
    private javax.swing.JButton btnDeta;
    private javax.swing.JButton btnExc;
    private javax.swing.JButton btnMainApagar;
    private javax.swing.JButton btnNewrg;
    private javax.swing.JButton btnNovoDB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAConsDet;
    // End of variables declaration//GEN-END:variables
}
