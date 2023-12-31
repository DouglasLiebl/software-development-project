/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package io.github.pages;

import io.github.dto.MovieDTO;
import io.github.pages.dateChooser.DateChooser;
import io.github.pages.generalPopUp.Message;
import io.github.pages.generalPopUp.glass.GlassPanePopup;
import io.github.service.MovieService;
import io.github.service.impl.MovieServiceImpl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dougl
 */
public class MovieRegisterPage extends javax.swing.JFrame {

    /**
     * Creates new form MovieRegisterPage
     */
    public MovieRegisterPage() {
        initComponents();
        GlassPanePopup.install(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabelCadastrarFilme = new javax.swing.JLabel();
        textFieldNome = new io.github.pages.textField.TextField();
        textFieldDiretor = new io.github.pages.textField.TextField();
        comboboxGenero = new io.github.pages.Combobox();
        comboboxClass = new io.github.pages.Combobox();
        textFieldDuracao = new io.github.pages.textField.TextField();
        textField1 = new io.github.pages.textField.TextField();
        button1 = new io.github.pages.button.Button();
        buttonCancelar = new io.github.pages.button.Button();
        textAreaScroll1 = new io.github.pages.textArea.TextAreaScroll();
        textArea1 = new io.github.pages.textArea.TextArea();
        buttonSalvar = new io.github.pages.button.Button();
        buttonLimpar = new io.github.pages.button.Button();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(760, 460));

        jLabelCadastrarFilme.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        jLabelCadastrarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo64.png"))); // NOI18N
        jLabelCadastrarFilme.setText("Cadastrar Filme");

        textFieldNome.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textFieldNome.setLabelText("Nome");

        textFieldDiretor.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textFieldDiretor.setLabelText("Diretor");

        comboboxGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACTION", "DRAMA", "SCIENCE_FICTION", "HORROR", "COMEDY" }));
        comboboxGenero.setSelectedIndex(-1);
        comboboxGenero.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        comboboxGenero.setLabeText("Gênero");

        comboboxClass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "G", "PG", "PG13", "R", "NC17" }));
        comboboxClass.setSelectedIndex(-1);
        comboboxClass.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        comboboxClass.setLabeText("Classificação");

        textFieldDuracao.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textFieldDuracao.setLabelText("Duração (em minutos)");

        textField1.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textField1.setLabelText("Data de Lançamento");

        button1.setText("...");
        button1.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.setFocusPainted(false);
        buttonCancelar.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        textAreaScroll1.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textAreaScroll1.setLabelText("Descrição");

        textArea1.setBackground(new java.awt.Color(245, 245, 245));
        textArea1.setColumns(20);
        textArea1.setRows(5);
        textAreaScroll1.setViewportView(textArea1);

        buttonSalvar.setText("Salvar");
        buttonSalvar.setFocusPainted(false);
        buttonSalvar.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar Campos");
        buttonLimpar.setFocusPainted(false);
        buttonLimpar.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textAreaScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCadastrarFilme)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(comboboxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                    .addComponent(comboboxClass, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(textFieldDiretor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addGap(66, 66, 66)
                                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12))
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addComponent(textFieldDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(10, 10, 10))))
                        .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 38, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelCadastrarFilme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboboxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboboxClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(textAreaScroll1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private static void stringValidation(String request) throws Exception {
        if (request.isEmpty()) throw new Exception("Nomes não podem estar em branco.");
        if (request.isBlank()) throw new Exception("Nomes não podem ser vazios.");
        if (request.equals("null")) throw new Exception("Nomes não podem ser nulos");
    }

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        dateChooser.setTextRefernce(textField1);
        dateChooser.showPopup();
    }//GEN-LAST:event_button1ActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
        mainPage.setVisible(true);
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
       try {
           stringValidation(textFieldNome.getText());
           stringValidation(textFieldDiretor.getText());

           if (textField1.getText().isBlank()) throw new Exception("A date de lançamento não pode estar em branco.");

           MovieDTO request = MovieDTO.builder()
                   .name(textFieldNome.getText())
                   .director(textFieldDiretor.getText())
                   .duration(textFieldDuracao.getText())
                   .genre(comboboxGenero.getSelectedItem().toString())
                   .rating(comboboxClass.getSelectedItem().toString())
                   .releaseDate(textField1.getText())
                   .description(textArea1.getText())
                   .build();

           movieService.register(request);
           showPopUp("Filme salvo com sucesso!", "Operação bem sucedida:");
           buttonLimparActionPerformed(evt);

       } catch (Exception e) {
           if (e instanceof NumberFormatException) showPopUp("A duração do filme aceita apenas números.", "Erro:");
           else if (e instanceof NullPointerException) showPopUp("O campo Gênero e Classificação devem ter valores selecionados.", "Erro:");
           else showPopUp(e.getMessage(), "Erro:");
       }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        textFieldNome.setText("");
        textFieldDiretor.setText("");
        textFieldDuracao.setText("");
        textArea1.setText("");
        textField1.setText("");
        comboboxClass.setSelectedIndex(-1);
        comboboxGenero.setSelectedIndex(-1);
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void showPopUp(String message, String title) {
        Message obj = new Message();
        obj.setMessage(message);
        obj.setTitle(title);
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
    }
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
            java.util.logging.Logger.getLogger(MovieRegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieRegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieRegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieRegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieRegisterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.pages.button.Button button1;
    private io.github.pages.button.Button buttonCancelar;
    private io.github.pages.button.Button buttonLimpar;
    private io.github.pages.button.Button buttonSalvar;
    private io.github.pages.Combobox comboboxClass;
    private io.github.pages.Combobox comboboxGenero;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabelCadastrarFilme;
    private keeptoo.KGradientPanel kGradientPanel1;
    private io.github.pages.textArea.TextArea textArea1;
    private io.github.pages.textArea.TextAreaScroll textAreaScroll1;
    private io.github.pages.textField.TextField textField1;
    private io.github.pages.textField.TextField textFieldDiretor;
    private io.github.pages.textField.TextField textFieldDuracao;
    private io.github.pages.textField.TextField textFieldNome;
    // End of variables declaration//GEN-END:variables
    private MainPage mainPage = new MainPage();
    private DateChooser dateChooser = new DateChooser();

    private MovieService movieService = new MovieServiceImpl();
}