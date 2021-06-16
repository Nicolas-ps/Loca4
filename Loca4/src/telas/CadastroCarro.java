package telas;

public class CadastroCarro extends javax.swing.JFrame {

    public CadastroCarro() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoCadastroCarro = new javax.swing.JLabel();
        Título = new javax.swing.JLabel();
        Dados = new javax.swing.JPanel();
        marca = new javax.swing.JLabel();
        modelo = new javax.swing.JLabel();
        ano = new javax.swing.JLabel();
        cor = new javax.swing.JLabel();
        motor = new javax.swing.JLabel();
        chassis = new javax.swing.JLabel();
        placa = new javax.swing.JLabel();
        CampoMarca = new javax.swing.JTextField();
        CampoModelo = new javax.swing.JTextField();
        CampoAno = new javax.swing.JComboBox();
        CampoCor = new javax.swing.JTextField();
        CampoMotor = new javax.swing.JTextField();
        CampoChassis = new javax.swing.JTextField();
        CampoPlaca = new javax.swing.JTextField();
        IconeCarro = new javax.swing.JLabel();
        BtnLimpar = new javax.swing.JButton();
        BtnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 420));
        setResizable(false);

        LogoCadastroCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Loca4.png"))); // NOI18N

        Título.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Título.setText("Insira os dados nos campos abaixo para o cadastro do veículo");

        Dados.setPreferredSize(new java.awt.Dimension(841, 233));

        marca.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        marca.setText("Marca:");

        modelo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        modelo.setText("Modelo:");

        ano.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ano.setText("Ano:");

        cor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cor.setText("Cor:");

        motor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        motor.setText("Motor:");

        chassis.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        chassis.setText("Chassis:");

        placa.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        placa.setText("Placa:");

        CampoAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        CampoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoAnoActionPerformed(evt);
            }
        });

        IconeCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/onix.png"))); // NOI18N

        javax.swing.GroupLayout DadosLayout = new javax.swing.GroupLayout(Dados);
        Dados.setLayout(DadosLayout);
        DadosLayout.setHorizontalGroup(
            DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DadosLayout.createSequentialGroup()
                        .addGroup(DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cor)
                            .addComponent(motor)
                            .addComponent(chassis)
                            .addComponent(placa))
                        .addGap(9, 9, 9)
                        .addGroup(DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DadosLayout.createSequentialGroup()
                                .addComponent(CampoMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(CampoPlaca)
                            .addComponent(CampoChassis)
                            .addComponent(CampoCor))
                        .addGap(2, 2, 2))
                    .addGroup(DadosLayout.createSequentialGroup()
                        .addGroup(DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelo)
                            .addComponent(ano)
                            .addComponent(marca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoMarca)
                            .addComponent(CampoModelo)
                            .addGroup(DadosLayout.createSequentialGroup()
                                .addComponent(CampoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(47, 47, 47)
                .addComponent(IconeCarro)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        DadosLayout.setVerticalGroup(
            DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 31, Short.MAX_VALUE)
                .addGroup(DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DadosLayout.createSequentialGroup()
                        .addGroup(DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelo)
                            .addComponent(CampoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ano))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CampoCor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DadosLayout.createSequentialGroup()
                                .addComponent(cor)
                                .addGap(18, 18, 18)
                                .addGroup(DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(motor))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoChassis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chassis)))
                    .addComponent(IconeCarro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(placa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CampoPlaca))
                .addContainerGap())
        );

        BtnLimpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        BtnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnCadastrar.setText("Cadastrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LogoCadastroCarro)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Título))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(BtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Título, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(Dados, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 39, Short.MAX_VALUE))
            .addComponent(LogoCadastroCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoAnoActionPerformed

    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_BtnLimparActionPerformed

    public void limpar(){
        CampoChassis.setText("");
        CampoCor.setText("");
        CampoMarca.setText("");
        CampoModelo.setText("");
        CampoMotor.setText("");
        CampoPlaca.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(CadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrar;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JComboBox CampoAno;
    private javax.swing.JTextField CampoChassis;
    private javax.swing.JTextField CampoCor;
    private javax.swing.JTextField CampoMarca;
    private javax.swing.JTextField CampoModelo;
    private javax.swing.JTextField CampoMotor;
    private javax.swing.JTextField CampoPlaca;
    private javax.swing.JPanel Dados;
    private javax.swing.JLabel IconeCarro;
    private javax.swing.JLabel LogoCadastroCarro;
    private javax.swing.JLabel Título;
    private javax.swing.JLabel ano;
    private javax.swing.JLabel chassis;
    private javax.swing.JLabel cor;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel modelo;
    private javax.swing.JLabel motor;
    private javax.swing.JLabel placa;
    // End of variables declaration//GEN-END:variables
}
