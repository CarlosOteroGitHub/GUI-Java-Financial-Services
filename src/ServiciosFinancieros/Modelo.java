package ServiciosFinancieros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Modelo extends javax.swing.JFrame {

    public Modelo() {
        initComponents();

        //Caracteristicas de los Frames.
        this.setLocationRelativeTo(null);
        FrameCantidades.setSize(230, 310);
        FrameCantidades.setLocation(460, 250);
        FramePagoServicios.setSize(330, 170);
        FramePagoServicios.setLocation(480, 270);
        FrameTransferenciaElectronica.setSize(310, 160);
        FrameTransferenciaElectronica.setLocation(480, 310);
        FrameSalír.setSize(210, 120);
        FrameSalír.setLocation(510, 300);

        //Caracteristicas de los JRadioButton.
        this.buttonGroup1.add(RadioButton1);
        this.buttonGroup1.add(RadioButton2);
        this.buttonGroup1.add(RadioButton3);
        this.buttonGroup1.add(RadioButton4);
        this.buttonGroup1.add(RadioButton5);
    }

//---------------------------------------------------------------------------------------------------------------------
    /* Clases y Métodos */
    int dinero = 10000;

    public void DescontarDinero(int cantidad) {
        if(dinero >= cantidad){
            this.dinero = dinero - cantidad;
            FrameCantidades.setVisible(false);
            this.setVisible(true);
            timer.start();
            JOptionPane.showMessageDialog(null, "Progreso en Desarollo.");
        }else{
            FrameCantidades.setVisible(false);
            JOptionPane.showMessageDialog(null, "No Cuentas con El Dinero Suficiente, para Efectuar la Operación.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            FrameCantidades.setVisible(true);
        }
    }

    public int getDinero() {
        return dinero;
    }
    
//......................................................................................................................
    
    private Timer timer;

    public class progreso implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            int barra = ProgressBar1.getValue();
            if (barra < 100) {
                barra++;
                ProgressBar1.setValue(barra);
                ProgressBar1.setStringPainted(true);
                ProgressBar1.setForeground(java.awt.Color.BLUE);
            } else {
                timer.stop();
                ProgressBar1.setValue(0);
                JOptionPane.showMessageDialog(null, "Progreso Terminado con Exito.");
            }
        }
    }
    
//......................................................................................................................

    public boolean SoloNumeros(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

//---------------------------------------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FramePagoServicios = new javax.swing.JFrame();
        ComboBox1 = new javax.swing.JComboBox();
        Label4 = new javax.swing.JLabel();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        FrameSalír = new javax.swing.JFrame();
        Label3 = new javax.swing.JLabel();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        FrameCantidades = new javax.swing.JFrame();
        Label5 = new javax.swing.JLabel();
        RadioButton1 = new javax.swing.JRadioButton();
        RadioButton2 = new javax.swing.JRadioButton();
        RadioButton3 = new javax.swing.JRadioButton();
        RadioButton4 = new javax.swing.JRadioButton();
        RadioButton5 = new javax.swing.JRadioButton();
        boton10 = new javax.swing.JButton();
        boton11 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        FrameTransferenciaElectronica = new javax.swing.JFrame();
        Label6 = new javax.swing.JLabel();
        TextField1 = new javax.swing.JTextField();
        boton12 = new javax.swing.JButton();
        boton13 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        ProgressBar1 = new javax.swing.JProgressBar();
        Label2 = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();

        FramePagoServicios.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Telmex", "CFE", "Telcel", "Movistar", "Cablecom", "Sky", "Walmart de México", "Unefon", "FedEx Express", "Grupo Soriana", "Mediacom", " " }));

        Label4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Label4.setText("Selecciona la Compañia de Servicios");

        boton8.setText("Seleccionar");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton9.setText("Cancelar");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FramePagoServiciosLayout = new javax.swing.GroupLayout(FramePagoServicios.getContentPane());
        FramePagoServicios.getContentPane().setLayout(FramePagoServiciosLayout);
        FramePagoServiciosLayout.setHorizontalGroup(
            FramePagoServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FramePagoServiciosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FramePagoServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label4)
                    .addGroup(FramePagoServiciosLayout.createSequentialGroup()
                        .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FramePagoServiciosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        FramePagoServiciosLayout.setVerticalGroup(
            FramePagoServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FramePagoServiciosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label4)
                .addGap(18, 18, 18)
                .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FramePagoServiciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton8)
                    .addComponent(boton9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Label3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Label3.setText("¿Esta Seguro de Salír?");

        boton6.setText("Si");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton7.setText("No");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrameSalírLayout = new javax.swing.GroupLayout(FrameSalír.getContentPane());
        FrameSalír.getContentPane().setLayout(FrameSalírLayout);
        FrameSalírLayout.setHorizontalGroup(
            FrameSalírLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameSalírLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FrameSalírLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FrameSalírLayout.createSequentialGroup()
                        .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        FrameSalírLayout.setVerticalGroup(
            FrameSalírLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameSalírLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FrameSalírLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton6)
                    .addComponent(boton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Label5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Label5.setText(" Selecciona la Cantidad.");

        RadioButton1.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        RadioButton1.setText("$200.00");

        RadioButton2.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        RadioButton2.setText("$500.00");

        RadioButton3.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        RadioButton3.setText("$1000.00");

        RadioButton4.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        RadioButton4.setText("$1500.00");

        RadioButton5.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        RadioButton5.setText("$2000.00");

        boton10.setText("Aceptar");
        boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton10ActionPerformed(evt);
            }
        });

        boton11.setText("Cancelar");
        boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrameCantidadesLayout = new javax.swing.GroupLayout(FrameCantidades.getContentPane());
        FrameCantidades.getContentPane().setLayout(FrameCantidadesLayout);
        FrameCantidadesLayout.setHorizontalGroup(
            FrameCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameCantidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrameCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FrameCantidadesLayout.createSequentialGroup()
                        .addGroup(FrameCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameCantidadesLayout.createSequentialGroup()
                                .addComponent(boton10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameCantidadesLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(FrameCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RadioButton4)
                                    .addComponent(RadioButton3)
                                    .addComponent(RadioButton1)
                                    .addComponent(RadioButton2)
                                    .addComponent(RadioButton5))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FrameCantidadesLayout.setVerticalGroup(
            FrameCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameCantidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RadioButton1)
                .addGap(18, 18, 18)
                .addComponent(RadioButton2)
                .addGap(18, 18, 18)
                .addComponent(RadioButton3)
                .addGap(18, 18, 18)
                .addComponent(RadioButton4)
                .addGap(18, 18, 18)
                .addComponent(RadioButton5)
                .addGap(18, 18, 18)
                .addGroup(FrameCantidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton10)
                    .addComponent(boton11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Label6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        Label6.setText(" Ingresa el Número de Cuenta.");

        boton12.setText("Aceptar");
        boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton12ActionPerformed(evt);
            }
        });

        boton13.setText("Cancelar");
        boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FrameTransferenciaElectronicaLayout = new javax.swing.GroupLayout(FrameTransferenciaElectronica.getContentPane());
        FrameTransferenciaElectronica.getContentPane().setLayout(FrameTransferenciaElectronicaLayout);
        FrameTransferenciaElectronicaLayout.setHorizontalGroup(
            FrameTransferenciaElectronicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameTransferenciaElectronicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FrameTransferenciaElectronicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Label6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FrameTransferenciaElectronicaLayout.createSequentialGroup()
                        .addComponent(boton12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton13, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        FrameTransferenciaElectronicaLayout.setVerticalGroup(
            FrameTransferenciaElectronicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameTransferenciaElectronicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FrameTransferenciaElectronicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton12)
                    .addComponent(boton13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        boton1.setText("Colsultar Estado de Cuenta");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setText("Retirar Efectivo");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton5.setText("Salir de la Cuenta");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton4.setText("Pago de Servicios");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton3.setText("Transferencias Electronicas");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        Label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ServiciosFinancieros/Img.PNG"))); // NOI18N
        Label2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Label1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Label1.setText("                       Servicios Financieros \"AcroMex\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(ProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton1)
                        .addGap(18, 18, 18)
                        .addComponent(boton2)
                        .addGap(18, 18, 18)
                        .addComponent(boton3)
                        .addGap(18, 18, 18)
                        .addComponent(boton4)
                        .addGap(18, 18, 18)
                        .addComponent(boton5))
                    .addComponent(Label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "La Cantidad de Dinero con la que Cuenta su Tarjeta es: $" + getDinero());
        this.setVisible(true);
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        this.setVisible(false);
        FrameSalír.setVisible(true);
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        if (dinero > 0) {
            this.setVisible(false);
            FrameCantidades.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Su Tarjeta ya no Cuenta con Dinero.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        JOptionPane.showMessageDialog(null, "Bienvenido a Servicios Financieros AcroMex.");
        timer = new Timer(100, new progreso());
    }//GEN-LAST:event_formWindowOpened

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        if (dinero > 0) {
            this.setVisible(false);
            FrameTransferenciaElectronica.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Su Tarjeta ya no Cuenta con Dinero.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton3ActionPerformed

    String recivirPagoServicio = "";
    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        if (dinero > 0) {
            this.setVisible(false);
            FramePagoServicios.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Su Tarjeta ya no Cuenta con Dinero.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton4ActionPerformed

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* FramePagoServicios */

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        recivirPagoServicio = ComboBox1.getSelectedItem().toString();
        FramePagoServicios.setVisible(false);
        FrameCantidades.setVisible(true);
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        this.setVisible(true);
        FramePagoServicios.setVisible(false);
    }//GEN-LAST:event_boton9ActionPerformed

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* FrameSalír */

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        FrameSalír.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        FrameSalír.setVisible(false);
        JOptionPane.showMessageDialog(null, "Gracias por Su Preferencia, que Pase Buen Día.");
        System.exit(0);
    }//GEN-LAST:event_boton6ActionPerformed

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* FrameCantidades */

    private void boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton10ActionPerformed
        if (RadioButton1.isSelected()) {
            DescontarDinero(200);
        } else if (RadioButton2.isSelected()) {
            DescontarDinero(500);
        } else if (RadioButton3.isSelected()) {
            DescontarDinero(1000);
        } else if (RadioButton4.isSelected()) {
            DescontarDinero(1500);
        } else if (RadioButton5.isSelected()) {
            DescontarDinero(2000);
        } else {
            FrameCantidades.setVisible(false);
            JOptionPane.showMessageDialog(null, "No se ha Seleccionado una Cantidad.", "Mensaje", JOptionPane.WARNING_MESSAGE);
            FrameCantidades.setVisible(true);
        }
    }//GEN-LAST:event_boton10ActionPerformed

    private void boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton11ActionPerformed
        FrameCantidades.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_boton11ActionPerformed

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
    /* FrameTransferenciaElectronica */
    private void boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton12ActionPerformed
        if (!TextField1.getText().isEmpty()) {
            //Validamos que el Número de la Cuenta Contenga solo Numeros.
            String cadena = TextField1.getText();
            if (SoloNumeros(cadena) == true) {
                FrameTransferenciaElectronica.setVisible(false);
                TextField1.setText("");
                JOptionPane.showMessageDialog(null, "Número de Cuenta Aceptada.");
                FrameCantidades.setVisible(true);
            } else {
                FrameTransferenciaElectronica.setVisible(false);
                JOptionPane.showMessageDialog(null, "Ingresa Por Favor el Número de Cuenta Correcta.", "Error", JOptionPane.ERROR_MESSAGE);
                TextField1.setText("");
                FrameTransferenciaElectronica.setVisible(true);
            }
        } else {
            FrameTransferenciaElectronica.setVisible(false);
            JOptionPane.showMessageDialog(null, "Aun no ha Ingresado el Número de Cuenta.", "Mensaje", JOptionPane.WARNING_MESSAGE);
            FrameTransferenciaElectronica.setVisible(true);
        }
    }//GEN-LAST:event_boton12ActionPerformed

    private void boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton13ActionPerformed
        FrameTransferenciaElectronica.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_boton13ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modelo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox1;
    private javax.swing.JFrame FrameCantidades;
    private javax.swing.JFrame FramePagoServicios;
    private javax.swing.JFrame FrameSalír;
    private javax.swing.JFrame FrameTransferenciaElectronica;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JLabel Label5;
    private javax.swing.JLabel Label6;
    private javax.swing.JProgressBar ProgressBar1;
    private javax.swing.JRadioButton RadioButton1;
    private javax.swing.JRadioButton RadioButton2;
    private javax.swing.JRadioButton RadioButton3;
    private javax.swing.JRadioButton RadioButton4;
    private javax.swing.JRadioButton RadioButton5;
    private javax.swing.JTextField TextField1;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton11;
    private javax.swing.JButton boton12;
    private javax.swing.JButton boton13;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}

/*

Programa que Simula una Cuenta Bancaria de un Usuario, de la cual sele Permite Consultar, Retirar, Enviar y Pagar Dinero Electronicamente.

 */