import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class Dodaj_ksiazke extends javax.swing.JFrame {
DefaultTableModel model;
    /**
     * Creates new form DodajUsuńTowar
     */
    public Dodaj_ksiazke() 
    {
        initComponents();
        
        try {
            Odczyt();
            } catch (FileNotFoundException ex) 
            {
            Logger.getLogger(Dodaj_ksiazke.class.getName()).log(Level.SEVERE, null, ex);
            }
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void Zapis() 
    {
        
       try{
        File file = new File("C:\\Users\\Lendemark\\Documents\\NetBeansProjects\\Ksiazki\\src\\txt.txt");
        FileWriter pw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(pw);
        
        for(int i = 0; i < TTabela.getRowCount(); i++){
            for(int j = 0; j < TTabela.getColumnCount(); j++){
                bw.write((String)TTabela.getModel().getValueAt(i, j)+",");
                
            }
           bw.write("\n");
        }
        bw.close();
        pw.close();
          }catch(IOException ex)
            {
             ex.printStackTrace();
            }
    }
       
    public void Odczyt() throws FileNotFoundException
    {
        DefaultTableModel model=(DefaultTableModel) TTabela.getModel();
        
        Object[] row = new Object[3];
        File file = new File("C:\\Users\\Lendemark\\Documents\\NetBeansProjects\\Ksiazki\\src\\txt.txt");
        Scanner in = new Scanner(file);
      
        while(in.hasNextLine())
         {
            String line = in.nextLine();
            String[] columns = line.split(",");
             
            row[0] = columns[0];
            row[1] = columns[1];
            row[2] = columns[2];
            
            model.addRow(row);
             
         }model.fireTableDataChanged();
    }
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TTabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFNazwa = new javax.swing.JTextField();
        TFIlość = new javax.swing.JTextField();
        TFCena = new javax.swing.JTextField();
        Bdodaj = new javax.swing.JButton();
        Busuń = new javax.swing.JButton();
        LInfo = new javax.swing.JLabel();
        Zapisz = new javax.swing.JButton();
        buttonPowrot = new javax.swing.JButton();
        buttonZamow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nazwa", "ilość [szt / opk]", "Cena [zł ]"
            }
        ));
        TTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TTabela);

        jLabel1.setText("Nazwa");

        jLabel2.setText("Ilość");

        jLabel3.setText("Cena");

        TFNazwa.setText("Pełna nazwa, tytuł, autor, wydawnictwo.");

        TFCena.setText("Podaj cene w złotówkach");

        Bdodaj.setBackground(new java.awt.Color(255, 255, 255));
        Bdodaj.setText(" Dodaj");
        Bdodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdodajActionPerformed(evt);
            }
        });

        Busuń.setText("  Usuń");
        Busuń.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusuńActionPerformed(evt);
            }
        });

        LInfo.setForeground(new java.awt.Color(255, 51, 51));

        Zapisz.setText("Zapisz");
        Zapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZapiszActionPerformed(evt);
            }
        });

        buttonPowrot.setText("Powrót");
        buttonPowrot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPowrotActionPerformed(evt);
            }
        });

        buttonZamow.setText("Zamów");
        buttonZamow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZamowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bdodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Zapisz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Busuń, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFNazwa, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFCena, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFIlość, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonPowrot, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(buttonZamow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFNazwa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(buttonPowrot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Busuń, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Zapisz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bdodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFIlość, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonZamow, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFCena, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(LInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 180, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TTabelaMouseClicked
        DefaultTableModel model=(DefaultTableModel) TTabela.getModel();
        TFNazwa.setText(model.getValueAt(TTabela.getSelectedRow(), 0).toString());
        TFIlość.setText(model.getValueAt(TTabela.getSelectedRow(), 1).toString());
        TFCena.setText(model.getValueAt(TTabela.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_TTabelaMouseClicked

    private void BdodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdodajActionPerformed

        DefaultTableModel model=(DefaultTableModel) TTabela.getModel();
        if(!TFNazwa.getText().trim().equals(""))
        {
            model.addRow(new Object[]{TFNazwa.getText(),TFIlość.getText(),TFCena.getText()});
        }
        else
        {
            LInfo.setText("Produkt Nie może być dodany, pole 'Nazwa' musi być wypełnione!!!");
        }
    }//GEN-LAST:event_BdodajActionPerformed

    private void BusuńActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusuńActionPerformed
        int wybór;
        wybór=JOptionPane.showConfirmDialog(null, "Czy na pewno chcesz usunąć?","Potwierdzenie",JOptionPane.YES_NO_OPTION);
        if(wybór==JOptionPane.YES_OPTION)
        {
            DefaultTableModel model=(DefaultTableModel) TTabela.getModel();
            if(TTabela.getSelectedRow()==-1)
            {
                if(TTabela.getRowCount()==0)
                {
                    JOptionPane.showMessageDialog(null, "Tabela jest pusta");
                }else
                {
                    JOptionPane.showMessageDialog(null, "Musisz wybrać produkt");
                }
            }else
            {
                model.removeRow(TTabela.getSelectedRow());
            }
        }
    }//GEN-LAST:event_BusuńActionPerformed

    private void ZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZapiszActionPerformed
        Zapis();

    }//GEN-LAST:event_ZapiszActionPerformed

    private void buttonPowrotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPowrotActionPerformed
      new menu().setVisible(true);
      Dodaj_ksiazke.this.setVisible(false);
        
        
    }//GEN-LAST:event_buttonPowrotActionPerformed

    private void buttonZamowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZamowActionPerformed
       new zamowienie().setVisible(true);
      Dodaj_ksiazke.this.setVisible(false);
    }//GEN-LAST:event_buttonZamowActionPerformed

        /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dodaj_ksiazke().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdodaj;
    private javax.swing.JButton Busuń;
    private javax.swing.JLabel LInfo;
    private javax.swing.JTextField TFCena;
    private javax.swing.JTextField TFIlość;
    private javax.swing.JTextField TFNazwa;
    private javax.swing.JTable TTabela;
    private javax.swing.JButton Zapisz;
    public javax.swing.JButton buttonPowrot;
    public javax.swing.JButton buttonZamow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

