/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package io.github.pages;

import io.github.dto.ClientDTO;
import io.github.pages.deletePopUp.DeleteMessage;
import io.github.pages.generalPopUp.Message;
import io.github.pages.generalPopUp.glass.GlassPanePopup;
import io.github.service.ClientService;
import io.github.service.impl.ClientServiceImpl;
import org.postgresql.util.PSQLException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dougl
 */
public class EditClientPage extends javax.swing.JFrame {

    /**
     * Creates new form EditClientPage
     */
    public EditClientPage() {
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
        buttonCancelar = new io.github.pages.button.Button();
        buttonSalvar = new io.github.pages.button.Button();
        buttonLimpar = new io.github.pages.button.Button();
        buttonEditar = new io.github.pages.button.Button();
        textFieldId = new io.github.pages.textField.TextField();
        buttonBuscar = new io.github.pages.button.Button();
        buttonDelete = new io.github.pages.button.Button();
        textFieldNewEmail = new io.github.pages.textField.TextField();
        textFieldCpf = new io.github.pages.textField.TextField();
        textField1 = new io.github.pages.textField.TextField();

        textField1.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(760, 460));

        jLabelCadastrarFilme.setFont(new java.awt.Font("JetBrains Mono", 0, 24)); // NOI18N
        jLabelCadastrarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo64.png"))); // NOI18N
        jLabelCadastrarFilme.setText("Editar Cliente");

        textFieldNome.setEnabled(false);
        textFieldNome.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textFieldNome.setLabelText("Nome");

        buttonCancelar.setText("Cancelar");
        buttonCancelar.setFocusPainted(false);
        buttonCancelar.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

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
        textFieldId.setLabelText("Email");

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

        textFieldNewEmail.setEnabled(false);
        textFieldNewEmail.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textFieldNewEmail.setLabelText("Novo email");

        textFieldCpf.setEnabled(false);
        textFieldCpf.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        textFieldCpf.setLabelText("CPF");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCadastrarFilme)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(170, 170, 170)
                            .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                            .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(textFieldNewEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(textFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelCadastrarFilme)
                .addGap(41, 41, 41)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldNewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
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

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
        mainPage.setVisible(true);
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        try {
            if (textFieldNome.getText().isBlank()) throw new Exception("Você deve buscar pelo cliente primeiro!");
            stringValidation(textFieldNome.getText());

            stringValidation(textFieldNewEmail.getText());
            if (!textFieldNewEmail.getText().contains("@") || textFieldNewEmail.getText().contains(" ")) throw new Exception("Email inválido.");;

            cpfValidation(textFieldCpf.getText());
            if (textFieldCpf.getText().length() != 11) throw new Exception("CPF inválido.");

            ClientDTO request = ClientDTO.builder()
                    .name(textFieldNome.getText())
                    .email(textFieldNewEmail.getText())
                    .cpf(textFieldCpf.getText())
                    .build();

            request.setId(Long.parseLong(textField1.getText()));
            service.update(request);

        } catch (Exception e) {
            if (e instanceof PSQLException) showPopUp("Cliente editado com sucesso!", "Operação bem sucedida:");
            else showPopUp(e.getMessage(), "Erro");
            buttonLimparActionPerformed(evt);
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private static void cpfValidation(String cpf) throws Exception {
        if (cpf.isBlank()) throw new Exception("O Campo CPF não pode ser em branco.");

        String[] digits = cpf.split("");

        for (String digit: digits) {
            try {
                Integer.parseInt(digit);
            } catch (Exception e) {
                throw new Exception("CPF não pode conter letras ou caracteres especiais.");
            }
        }
    }

    private static void stringValidation(String request) throws Exception {
        if (request.isEmpty()) throw new Exception("Nome e email não podem estar em branco.");
        if (request.isBlank()) throw new Exception("Nome e email não podem ser vazios.");
        if (request.equals("null")) throw new Exception("Nome e email não podem ser nulos");
    }

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        textFieldNome.setText("");
        textFieldNewEmail.setText("");
        textFieldCpf.setText("");
        textFieldId.setText("");

        disableButtons();
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void disableButtons() {
        textFieldNewEmail.setEnabled(false);
        textFieldNome.setEnabled(false);
        textFieldCpf.setEnabled(false);
    }
    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        try {
            if (textFieldId.getText().isBlank()) throw new Exception("Você deve buscar pelo cliente primeiro!");

            textFieldNome.setEnabled(true);
            textFieldNewEmail.setEnabled(true);
            textFieldCpf.setEnabled(true);
        } catch (Exception e) {
            showPopUp(e.getMessage(), "Erro:");
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        try {
            if (textFieldId.getText().isBlank()) throw new Exception("Você precisa informar o email do cliente primeiro!");

            var client = service.getClientByEmail(textFieldId.getText());

            textFieldNome.setText(client.getName());
            textFieldCpf.setText(client.getCpf());
            textFieldNewEmail.setText(client.getEmail());
            textField1.setText(String.valueOf(client.getId()));
        } catch (Exception e) {
            showPopUp(e.getMessage(), "Erro:");
        }
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        try {
            if (textFieldNome.getText().isBlank()) throw new Exception("Você precisa buscar pelo cliente primeiro!");
            showDeletePopUp("Tem certeza que deseja deleter? \nTodos os dados serão apagados.", "Deletar.");

        } catch (Exception e) {
            showPopUp(e.getMessage(), "Erro:");
            buttonLimparActionPerformed(evt);
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    public void confirmDelete(String email) throws Exception {
        service.delete(email);
    }
    private void showDeletePopUp(String message, String title) {
        DeleteMessage obj = new DeleteMessage();
        obj.setMessage(message);
        obj.setTitle(title);
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    confirmDelete(textFieldId.getText());
                } catch (Exception e) {
                    GlassPanePopup.closePopupLast();
                    showPopUp("Cliente deletado com sucesso!", "Operação bem sucedida:");
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
            java.util.logging.Logger.getLogger(EditClientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditClientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditClientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditClientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditClientPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.pages.button.Button buttonBuscar;
    private io.github.pages.button.Button buttonCancelar;
    private io.github.pages.button.Button buttonDelete;
    private io.github.pages.button.Button buttonEditar;
    private io.github.pages.button.Button buttonLimpar;
    private io.github.pages.button.Button buttonSalvar;
    private javax.swing.JLabel jLabelCadastrarFilme;
    private keeptoo.KGradientPanel kGradientPanel1;
    private io.github.pages.textField.TextField textField1;
    private io.github.pages.textField.TextField textFieldCpf;
    private io.github.pages.textField.TextField textFieldId;
    private io.github.pages.textField.TextField textFieldNewEmail;
    private io.github.pages.textField.TextField textFieldNome;
    // End of variables declaration//GEN-END:variables

    private MainPage mainPage = new MainPage();
    private final ClientService service = new ClientServiceImpl();
}
