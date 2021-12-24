/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dict_19127369;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author lemin
 */
public class JFrSlang extends javax.swing.JFrame {
    public static final SlangWordList list = new SlangWordList();

    /**
     * Creates new form JFrSlang
     */
    
    public void initData() {
        FileProccess fh=new FileProccess();
        String data_path="slang.txt";
        fh.read(data_path, list);
    }
     
    public JFrSlang() {
        initData();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSlang = new javax.swing.JTextField();
        btnFindSlang = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtShowMean = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtDefinition = new javax.swing.JTextField();
        btnFindDef = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtShowSlang = new javax.swing.JTextArea();
        btnReset = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtHistory = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtShowSlangWord = new javax.swing.JTextArea();
        btnShowAll = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnRandom = new javax.swing.JButton();
        btnQuizSlang = new javax.swing.JButton();
        btnQuizDef = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("SLANG WORD DICTIONARY");
        jPanel2.add(jLabel8);

        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Search by slang word:");

        txtSlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSlangActionPerformed(evt);
            }
        });

        btnFindSlang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N
        btnFindSlang.setText("FIND");
        btnFindSlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindSlangActionPerformed(evt);
            }
        });

        txtShowMean.setColumns(20);
        txtShowMean.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtShowMean.setRows(5);
        jScrollPane1.setViewportView(txtShowMean);

        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Search by definition:");

        btnFindDef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N
        btnFindDef.setText("FIND");
        btnFindDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindDefActionPerformed(evt);
            }
        });

        txtShowSlang.setColumns(20);
        txtShowSlang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtShowSlang.setRows(5);
        jScrollPane2.setViewportView(txtShowSlang);

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh.png"))); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Tick.png"))); // NOI18N
        btnHistory.setText("REFRESH HISTORY");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        txtHistory.setColumns(20);
        txtHistory.setRows(5);
        jScrollPane5.setViewportView(txtHistory);

        txtShowSlangWord.setColumns(20);
        txtShowSlangWord.setRows(5);
        jScrollPane6.setViewportView(txtShowSlangWord);

        btnShowAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List.png"))); // NOI18N
        btnShowAll.setText("Show all Slang Word");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
        btnEdit.setText("UPDATE");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Meaning:");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        btnAdd.setText("ADD NEW SLANG WORD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRandom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Favourites.png"))); // NOI18N
        btnRandom.setText("RANDOM SLANG WORD");
        btnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomActionPerformed(evt);
            }
        });

        btnQuizSlang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Task list.png"))); // NOI18N
        btnQuizSlang.setText("QUIZ (SLANG WORD MODE)");
        btnQuizSlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizSlangActionPerformed(evt);
            }
        });

        btnQuizDef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Numbered list.png"))); // NOI18N
        btnQuizDef.setText("QUIZ (DEFINITION MODE)");
        btnQuizDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizDefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSlang, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnFindSlang))
                                            .addComponent(jScrollPane2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnFindDef, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(btnAdd)))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnShowAll)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHistory)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(442, 442, 442)
                        .addComponent(btnRandom)
                        .addGap(37, 37, 37)
                        .addComponent(btnQuizSlang)
                        .addGap(32, 32, 32)
                        .addComponent(btnQuizDef)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSlang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFindSlang))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReset))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFindDef))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRandom)
                    .addComponent(btnQuizSlang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuizDef, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1392, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSlangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSlangActionPerformed

    private void btnFindSlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindSlangActionPerformed
        if(txtSlang.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "(!) Please enter a slang word to search.");
        }
        else {
            ArrayList<String> values = list.searchBySlangWord(txtSlang.getText());
            if(values == null) {
                txtShowMean.setText("Not found!");
                //txtShowMean.setEditable(false);
            }
            else {
                String def = "";
                for (int i = 0; i< values.size(); i++){
                    if(i != values.size() - 1){
                        def = def + values.get(i) + " | ";
                    }
                    else if (i == values.size() - 1){
                        def = def + values.get(i);
                    }
                }
                FileProccess.writeHistory("historySlang.txt", txtSlang.getText(), def);
                txtShowMean.setText(def);
                //txtShowMean.setEditable(false);
            }
        }
    }//GEN-LAST:event_btnFindSlangActionPerformed

    private void btnFindDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindDefActionPerformed
        if(txtDefinition.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "(!) Please enter a definition to search.");
        }
        else {
            ArrayList<String> values = list.searchByDefinition(txtDefinition.getText());
            if(values == null) {
                txtShowSlang.setText("Not found!");
                txtShowSlang.setEditable(false);
            }
            else {
                String slang = "";
                for (int i = 0; i< values.size(); i++){
                    if(i != values.size() - 1){
                        slang = slang + values.get(i) + "\n";
                    }
                    else if (i == values.size() - 1){
                        slang = slang + values.get(i);
                    }
                }
                txtShowSlang.setText(slang);
                txtShowSlang.setEditable(false);
            }
        }
    }//GEN-LAST:event_btnFindDefActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        Object[] options = {"Confirm", "Cancel"};
        String mess = "(?) Are you sure you want to reset the dictionary?";
        
        int n = JOptionPane.showOptionDialog(this, mess, "Reset SlangWord", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, null);
        
        if(n == JOptionPane.YES_OPTION){
            try {
                FileProccess.read("original_slang.txt", list);
                FileProccess.write("slang.txt", list);
                JOptionPane.showMessageDialog(this, "(i) Reset successful.");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(this, "(!} Error: " + e.toString());
            }
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        ArrayList<String> values = FileProccess.readHistory("historySlang.txt");
        String def = "";
        for (int i = 0; i< values.size(); i++){
            if(i != values.size() - 1){
                def = def + values.get(i) + "\n";
            }
            else if (i == values.size() - 1){
                def = def + values.get(i);
            }
        }
        txtHistory.setText(def);
        txtHistory.setEditable(false);
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        // TODO add your handling code here:
        txtShowSlangWord.setText(list.toString());
        txtShowSlangWord.setEditable(false);
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(txtSlang.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "(!) Please enter a slang word to delete.");
        }
        else {
            int choice=JOptionPane.showConfirmDialog(null, "Do you want to delete this slang word?",
                            "Confirm", JOptionPane.YES_NO_OPTION);
            if(choice==JOptionPane.YES_OPTION) {
                list.deleteSlang(txtSlang.getText());
                FileProccess.write("slang.txt", list);
                JOptionPane.showMessageDialog(this, "(i) Delete successful.");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(txtSlang.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "(!) Please enter a slang word to edit.");
        }
        else {
            int choice=JOptionPane.showConfirmDialog(null, "Do you want to update this slang word?",
                            "Confirm", JOptionPane.YES_NO_OPTION);
            if(choice==JOptionPane.YES_OPTION) {
                if(list.editSlang(txtSlang.getText(), txtShowMean.getText()) > 0) {
                    FileProccess.write("slang.txt", list);
                    JOptionPane.showMessageDialog(this, "(!) Update successful.");
                }
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        new JFrAdd().setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomActionPerformed
        // TODO add your handling code here:
        String key = list.random(1).get(0);
        ArrayList<String> values = list.getList().get(key);
        String def = "";
        for(int i = 0; i < values.size(); i++){
            if(i != values.size() - 1){
                def = def + values.get(i) + " | ";
            }
            else if (i == values.size() - 1){
                def = def + values.get(i);
            }
        }
        Object[] options = {"OK"};
            String mess = "SlangWord: " + key + "\nDefinition: "+ def;
            int n = JOptionPane.showOptionDialog(this,
            mess,
            "On this day slang word",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            options,
            null);
    }//GEN-LAST:event_btnRandomActionPerformed

    private void btnQuizSlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizSlangActionPerformed
        // TODO add your handling code here:
        FunnyQuestion funnyQuestion = new FunnyQuestion(this, list, true);
        funnyQuestion.setUpGUI();
    }//GEN-LAST:event_btnQuizSlangActionPerformed

    private void btnQuizDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizDefActionPerformed
        // TODO add your handling code here:
        FunnyQuestion funnyQuestionDef = new FunnyQuestion(this, list, false);
        funnyQuestionDef.setUpGUI();
    }//GEN-LAST:event_btnQuizDefActionPerformed

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
            java.util.logging.Logger.getLogger(JFrSlang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrSlang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrSlang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrSlang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrSlang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFindDef;
    private javax.swing.JButton btnFindSlang;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnQuizDef;
    private javax.swing.JButton btnQuizSlang;
    private javax.swing.JButton btnRandom;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField txtDefinition;
    private javax.swing.JTextArea txtHistory;
    private javax.swing.JTextArea txtShowMean;
    private javax.swing.JTextArea txtShowSlang;
    private javax.swing.JTextArea txtShowSlangWord;
    private javax.swing.JTextField txtSlang;
    // End of variables declaration//GEN-END:variables
}
