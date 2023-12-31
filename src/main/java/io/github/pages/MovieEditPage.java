/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package io.github.pages;

import io.github.dto.MovieDTO;
import io.github.entities.Movie;
import io.github.pages.dateChooser.DateChooser;
import io.github.pages.deletePopUp.DeleteMessage;
import io.github.pages.generalPopUp.Message;
import io.github.pages.generalPopUp.glass.GlassPanePopup;
import io.github.service.MovieService;
import io.github.service.impl.MovieServiceImpl;
import org.postgresql.util.PSQLException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dougl
 */
public class MovieEditPage extends javax.swing.JFrame {

    /**
     * Creates new form MovieEditPage
     */
    public MovieEditPage() {
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
        buttonEditar = new io.github.pages.button.Button();
        textFieldId = new io.github.pages.textField.TextField();
        buttonBuscar = new io.github.pages.button.Button();
        buttonDelete = new io.github.pages.button.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setUndecorated(true);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(760, 460));

        jLabelCadastrarFilme.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        jLabelCadastrarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo64.png"))); // NOI18N
        jLabelCadastrarFilme.setText("Editar Filme");

        textFieldNome.setEnabled(false);
        textFieldNome.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textFieldNome.setLabelText("Nome");

        textFieldDiretor.setEnabled(false);
        textFieldDiretor.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textFieldDiretor.setLabelText("Diretor");

        comboboxGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACTION", "DRAMA", "SCIENCE_FICTION", "HORROR", "COMEDY" }));
        comboboxGenero.setSelectedIndex(-1);
        comboboxGenero.setEnabled(false);
        comboboxGenero.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        comboboxGenero.setLabeText("Gênero");

        comboboxClass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "G", "PG", "PG13", "R", "NC17" }));
        comboboxClass.setSelectedIndex(-1);
        comboboxClass.setEnabled(false);
        comboboxClass.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        comboboxClass.setLabeText("Classificação");

        textFieldDuracao.setEnabled(false);
        textFieldDuracao.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textFieldDuracao.setLabelText("Duração (em minutos)");

        textField1.setEnabled(false);
        textField1.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textField1.setLabelText("Data de Lançamento");

        button1.setText("...");
        button1.setEnabled(false);
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

        textAreaScroll1.setEnabled(false);
        textAreaScroll1.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textAreaScroll1.setLabelText("Descrição");

        textArea1.setBackground(new java.awt.Color(245, 245, 245));
        textArea1.setColumns(20);
        textArea1.setRows(5);
        textArea1.setEnabled(false);
        textArea1.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
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

        buttonEditar.setText("Editar");
        buttonEditar.setFocusPainted(false);
        buttonEditar.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        textFieldId.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textFieldId.setLabelText("Id Filme");

        buttonBuscar.setFocusPainted(false);
        buttonBuscar.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        buttonBuscar.setLabel("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        buttonDelete.setText("Deletar");
        buttonDelete.setFocusPainted(false);
        buttonDelete.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addComponent(textFieldDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textFieldDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(textAreaScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(comboboxClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboboxGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                            .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadastrarFilme)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(464, 464, 464))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelCadastrarFilme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(comboboxClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboboxGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(textAreaScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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
            if (textFieldNome.getText().isBlank()) throw new Exception("Você deve buscar pelo filme primeiro!");
            stringValidation(textFieldNome.getText());
            stringValidation(textFieldDiretor.getText());

            MovieDTO request = MovieDTO.builder()
                .name(textFieldNome.getText())
                .director(textFieldDiretor.getText())
                .duration(textFieldDuracao.getText())
                .genre(String.valueOf(comboboxGenero.getSelectedItem()))
                .rating(String.valueOf(comboboxClass.getSelectedItem()))
                .releaseDate(textField1.getText())
                .description(textArea1.getText())
                .build();

            request.setId(Long.parseLong(textFieldId.getText()));

            movieService.update(request);
        } catch (Exception e) {
            if (e instanceof NumberFormatException) showPopUp("A duração do filme aceita apenas números.", "Erro:");
            else if (e instanceof PSQLException) showPopUp("Filme editado com sucesso!", "Operação bem sucedida:");
            else showPopUp(e.getMessage(), "Erro");

            buttonLimparActionPerformed(evt);
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
        textFieldId.setText("");

        disableButtons();
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void disableButtons() {
        textFieldDiretor.setEnabled(false);
        comboboxGenero.setEnabled(false);
        textFieldDuracao.setEnabled(false);
        comboboxClass.setEnabled(false);
        textFieldNome.setEnabled(false);
        textField1.setEnabled(false);
        textArea1.setEnabled(false);
        textAreaScroll1.setEnabled(false);
    }

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        try {
            if (textFieldId.getText().isBlank()) throw new Exception("Você deve buscar pelo filme primeiro!");

            textFieldDiretor.setEnabled(true);
            comboboxGenero.setEnabled(true);
            textFieldDuracao.setEnabled(true);
            comboboxClass.setEnabled(true);
            textFieldNome.setEnabled(true);
            textField1.setEnabled(true);
            textArea1.setEnabled(true);
            button1.setEnabled(true);
            textAreaScroll1.setEnabled(true);
        } catch (Exception e) {
            showPopUp(e.getMessage(), "Erro:");
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        try {
            if (textFieldNome.getText().isBlank()) throw new Exception("Você precisa buscar pelo filme primeiro!");
            showDeletePopUp("Tem certeza que deseja deleter? \nTodos os dados serão apagados.", "Deletar.");

        } catch (Exception e) {
            showPopUp(e.getMessage(), "Erro:");
            buttonLimparActionPerformed(evt);
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        try {
            if (textFieldId.getText().isBlank()) throw new Exception("Você precisa informar o id do filme primeiro!");

            var movie = movieService.getMovieById(Long.parseLong(textFieldId.getText()));
            textFieldNome.setText(movie.getName());
            textFieldDiretor.setText(movie.getDirector());
            textFieldDuracao.setText(String.valueOf(movie.getDuration()));
            textArea1.setText(movie.getDescription());
            textField1.setText(movie.getReleaseDate());

            JComboBoxGeneroChanges(Movie.of(movie));
            JComboBoxRatingsChanges(Movie.of(movie));

        } catch (Exception e) {
            showPopUp(e.getMessage(), "Erro:");
        }
    }//GEN-LAST:event_buttonBuscarActionPerformed

    public void confirmDelete(Long id) throws Exception {
        movieService.delete(id);
    }

    private void showDeletePopUp(String message, String title) {
        DeleteMessage obj = new DeleteMessage();
        obj.setMessage(message);
        obj.setTitle(title);
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    confirmDelete(Long.parseLong(textFieldId.getText()));
                } catch (Exception e) {
                    GlassPanePopup.closePopupLast();
                    showPopUp("Filme deletado com sucesso!", "Operação bem sucedida:");
                    buttonLimparActionPerformed(ae);
                }

            }
        });
        GlassPanePopup.showPopup(obj);
    }

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
    private void JComboBoxGeneroChanges(Movie movie) {
        switch (movie.getGenre()) {
            case ACTION -> comboboxGenero.setSelectedIndex(0);
            case DRAMA -> comboboxGenero.setSelectedIndex(1);
            case SCIENCE_FICTION -> comboboxGenero.setSelectedIndex(2);
            case HORROR -> comboboxGenero.setSelectedIndex(3);
            case COMEDY -> comboboxGenero.setSelectedIndex(4);
        }
    }

    private void JComboBoxRatingsChanges(Movie movie) {
        switch (movie.getRating()) {
            case G -> comboboxClass.setSelectedIndex(0);
            case PG -> comboboxClass.setSelectedIndex(1);
            case PG13 -> comboboxClass.setSelectedIndex(2);
            case R -> comboboxClass.setSelectedIndex(3);
            case NC17 -> comboboxClass.setSelectedIndex(4);
        }
    }

    private static void stringValidation(String request) throws Exception {
        if (request.isEmpty()) throw new Exception("Nomes não podem estar em branco.");
        if (request.isBlank()) throw new Exception("Nomes não podem ser vazios.");
        if (request.equals("null")) throw new Exception("Nomes não podem ser nulos.");
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
            java.util.logging.Logger.getLogger(MovieEditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieEditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieEditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieEditPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieEditPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.pages.button.Button button1;
    private io.github.pages.button.Button buttonBuscar;
    private io.github.pages.button.Button buttonCancelar;
    private io.github.pages.button.Button buttonDelete;
    private io.github.pages.button.Button buttonEditar;
    private io.github.pages.button.Button buttonLimpar;
    private io.github.pages.button.Button buttonSalvar;
    private io.github.pages.Combobox comboboxClass;
    private io.github.pages.Combobox comboboxGenero;
    private javax.swing.JLabel jLabelCadastrarFilme;
    private keeptoo.KGradientPanel kGradientPanel1;
    private io.github.pages.textArea.TextArea textArea1;
    private io.github.pages.textArea.TextAreaScroll textAreaScroll1;
    private io.github.pages.textField.TextField textField1;
    private io.github.pages.textField.TextField textFieldDiretor;
    private io.github.pages.textField.TextField textFieldDuracao;
    private io.github.pages.textField.TextField textFieldId;
    private io.github.pages.textField.TextField textFieldNome;
    // End of variables declaration//GEN-END:variables
    private final MainPage mainPage = new MainPage();

    private MovieService movieService = new MovieServiceImpl();

    private final DateChooser dateChooser = new DateChooser();
}
