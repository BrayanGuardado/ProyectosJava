package testpsicometrico;

import javax.swing.JOptionPane;

public class FormularioPreguntasTest extends javax.swing.JFrame {
    
    private final TestPsicometrico test;
    
    public FormularioPreguntasTest() {
        initComponents();
        this.test = new TestPsicometrico( this.preguntasEnLabel, this.radioBtnVerdadero, this.radioBtnFalso, 
                this.buttonGroup1, this.siguientePregunta, this, this.jLabelVerdadero, this.jLabelFalso,
                this.jLabelPorcentaje, this.jLabelSociabilidad );
        this.setLocationRelativeTo(null);
        this.setTitle("Cuestionario");
        JOptionPane.showMessageDialog(null, this.test.mensajeDeIntroduccion);
        this.reiniciarTestBtn.setVisible(false);
        this.test.iniciarTest();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton2 = new javax.swing.JRadioButton();
        formularioPanel = new javax.swing.JPanel();
        radioBtnVerdadero = new javax.swing.JRadioButton();
        siguientePregunta = new javax.swing.JButton();
        radioBtnFalso = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        preguntasEnLabel = new javax.swing.JLabel();
        jLabelSociabilidad = new javax.swing.JLabel();
        jLabelPorcentaje = new javax.swing.JLabel();
        jLabelFalso = new javax.swing.JLabel();
        jLabelVerdadero = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reiniciarTestBtn = new javax.swing.JButton();

        jRadioButton2.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formularioPanel.setBackground(new java.awt.Color(102, 102, 255));

        radioBtnVerdadero.setBackground(new java.awt.Color(102, 102, 255));
        buttonGroup1.add(radioBtnVerdadero);
        radioBtnVerdadero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioBtnVerdadero.setForeground(new java.awt.Color(242, 242, 242));
        radioBtnVerdadero.setText("Verdadero");
        radioBtnVerdadero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
        radioBtnVerdadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnVerdaderoActionPerformed(evt);
            }
        });

        siguientePregunta.setBackground(new java.awt.Color(102, 102, 255));
        siguientePregunta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        siguientePregunta.setForeground(new java.awt.Color(255, 255, 255));
        siguientePregunta.setText("SIGUIENTE");
        siguientePregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        siguientePregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguientePreguntaActionPerformed(evt);
            }
        });

        radioBtnFalso.setBackground(new java.awt.Color(102, 102, 255));
        buttonGroup1.add(radioBtnFalso);
        radioBtnFalso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioBtnFalso.setForeground(new java.awt.Color(242, 242, 242));
        radioBtnFalso.setText("Falso");
        radioBtnFalso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("SELECCIONE VERDADERO O FALSO SEGUN SEA EL CASO");

        preguntasEnLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        preguntasEnLabel.setForeground(new java.awt.Color(242, 242, 242));

        jLabelSociabilidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSociabilidad.setForeground(new java.awt.Color(242, 242, 242));
        jLabelSociabilidad.setText("Nivel de sociabilidad: ");

        jLabelPorcentaje.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPorcentaje.setForeground(new java.awt.Color(242, 242, 242));
        jLabelPorcentaje.setText("Tu porcentaje:");

        jLabelFalso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelFalso.setForeground(new java.awt.Color(242, 242, 242));
        jLabelFalso.setText("Veces que seleccionaste falso:");

        jLabelVerdadero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelVerdadero.setForeground(new java.awt.Color(242, 242, 242));
        jLabelVerdadero.setText("Veces que seleccionaste verdadero:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("RESULTADOS");

        reiniciarTestBtn.setBackground(new java.awt.Color(102, 102, 255));
        reiniciarTestBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reiniciarTestBtn.setForeground(new java.awt.Color(255, 255, 255));
        reiniciarTestBtn.setText("REGRESAR AL INICIO");
        reiniciarTestBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        reiniciarTestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarTestBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formularioPanelLayout = new javax.swing.GroupLayout(formularioPanel);
        formularioPanel.setLayout(formularioPanelLayout);
        formularioPanelLayout.setHorizontalGroup(
            formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioPanelLayout.createSequentialGroup()
                        .addGap(0, 435, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(443, 443, 443))
                    .addGroup(formularioPanelLayout.createSequentialGroup()
                        .addComponent(jLabelPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(130, 130, 130))
                    .addGroup(formularioPanelLayout.createSequentialGroup()
                        .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelVerdadero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(preguntasEnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelFalso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(formularioPanelLayout.createSequentialGroup()
                        .addComponent(jLabelSociabilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reiniciarTestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(formularioPanelLayout.createSequentialGroup()
                        .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBtnFalso, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioBtnVerdadero, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(siguientePregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        formularioPanelLayout.setVerticalGroup(
            formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(preguntasEnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioBtnVerdadero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtnFalso)
                .addGap(18, 18, 18)
                .addComponent(siguientePregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelVerdadero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelFalso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formularioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSociabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reiniciarTestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formularioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formularioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguientePreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguientePreguntaActionPerformed
        if(this.test.preguntas.length != this.test.getIteracionPreguntas() + 1) {
            this.test.actualizarTest();
        } else { 
            this.test.actualizarTest();
            this.test.actualizarContadoresEnPantalla();
            this.reiniciarTestBtn.setVisible(true);
        }
    }//GEN-LAST:event_siguientePreguntaActionPerformed

    private void radioBtnVerdaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnVerdaderoActionPerformed
        
    }//GEN-LAST:event_radioBtnVerdaderoActionPerformed

    private void reiniciarTestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarTestBtnActionPerformed
        this.dispose();
        InicioTestPsicometricoForumulario inicio = new InicioTestPsicometricoForumulario();
        inicio.setVisible(true);
    }//GEN-LAST:event_reiniciarTestBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel formularioPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFalso;
    private javax.swing.JLabel jLabelPorcentaje;
    private javax.swing.JLabel jLabelSociabilidad;
    private javax.swing.JLabel jLabelVerdadero;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel preguntasEnLabel;
    private javax.swing.JRadioButton radioBtnFalso;
    private javax.swing.JRadioButton radioBtnVerdadero;
    private javax.swing.JButton reiniciarTestBtn;
    private javax.swing.JButton siguientePregunta;
    // End of variables declaration//GEN-END:variables
}
