package code.program;

import java.util.Arrays;
import javax.swing.DefaultListModel;

/**
 *
 * @author bruno
 */
public class VetoresSwing extends javax.swing.JFrame {

    //Adicionando valores iniciais
    int vetor [] = new int [5]; //Vetor criado com 5 indices
    DefaultListModel list = new DefaultListModel();     //Model da lista para vincular a lista do swing
    int select = 0; //Definindo o valor do selecionado  
    
    public VetoresSwing() {
        initComponents();
        //Iniciar a aplicação com os vetores a mostra
        for(int c = 0; c < vetor.length; c++){
            list.addElement(vetor[c]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxVal = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnRemo = new javax.swing.JButton();
        btnOrd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        vtrSelect = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstVetor = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vetores Personalizados");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxVal.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(boxVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 36, 75, -1));

        btnAdd.setBackground(new java.awt.Color(102, 153, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Adicionar!");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 33, -1, -1));

        btnRemo.setBackground(new java.awt.Color(102, 153, 255));
        btnRemo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemo.setForeground(new java.awt.Color(255, 255, 255));
        btnRemo.setText("Remover!");
        btnRemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemo, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 77, 91, -1));

        btnOrd.setBackground(new java.awt.Color(102, 153, 255));
        btnOrd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOrd.setForeground(new java.awt.Color(255, 255, 255));
        btnOrd.setText("Ordenar!");
        btnOrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 121, 91, -1));

        jLabel1.setText("Vetor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        vtrSelect.setForeground(new java.awt.Color(153, 0, 255));
        vtrSelect.setText("[ 0 ]");
        getContentPane().add(vtrSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        lstVetor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lstVetor.setModel(list);
        lstVetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstVetor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 130, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Ação botão adicionar
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //Adicionando o valor do boxVal para o vetor que foi selecionado
        vetor[select] = Integer.parseInt(boxVal.getValue().toString()); //Conversão feita
        list.removeAllElements();   //Limpando a lista para add somente o necessário
        //Colocando na lista
        for(int c = 0; c < vetor.length; c++){
            list.addElement(vetor[c]);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    //Ação botão remover
    private void btnRemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoActionPerformed
        // Pegando qual é para remover, no caso deixar o valor zerado
        vetor[select] = 0;
        list.removeAllElements();   //Remover para ficar limpo a lista
        for(int c = 0; c < vetor.length; c++){  //Loop para mostrar o array
            list.addElement(vetor[c]);
        }
    }//GEN-LAST:event_btnRemoActionPerformed

    //Ação botão ordenar
    private void btnOrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdActionPerformed
        //Ordenando a lista
        Arrays.sort(vetor); //Ordenando
        list.removeAllElements();   //Limpando a lista
        for(int c = 0; c < vetor.length; c++){
            list.addElement(vetor[c]);
        }
        
    }//GEN-LAST:event_btnOrdActionPerformed

    //Ação do selecionar com o mouse na lista
    private void lstVetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVetorMouseClicked
        // Pegando posição, pelo index
        select = lstVetor.getSelectedIndex();
        vtrSelect.setText("[ "+Integer.toString(select)+" ]");    //Adicionando o número ao label
    }//GEN-LAST:event_lstVetorMouseClicked

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
            java.util.logging.Logger.getLogger(VetoresSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VetoresSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VetoresSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VetoresSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VetoresSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner boxVal;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOrd;
    private javax.swing.JButton btnRemo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstVetor;
    private javax.swing.JLabel vtrSelect;
    // End of variables declaration//GEN-END:variables
}
