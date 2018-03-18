
package appmultitarea;

import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;


public class ArityGeo extends javax.swing.JFrame {

    
    public ArityGeo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        DiametroCircunferencia = new javax.swing.JLabel();
        txtCircunferencia = new javax.swing.JTextField();
        Circunferencia = new javax.swing.JLabel();
        flecha = new javax.swing.JLabel();
        RespuestaCircunferencia = new javax.swing.JLabel();
        txtCircunferencia1 = new javax.swing.JTextField();
        VolumenEsfera = new javax.swing.JLabel();
        DiametroEsfera = new javax.swing.JLabel();
        txtEsfera = new javax.swing.JTextField();
        RespuestaEsfera = new javax.swing.JLabel();
        txtEsfera1 = new javax.swing.JTextField();
        flecha1 = new javax.swing.JLabel();
        VolumenEsfera1 = new javax.swing.JLabel();
        DiagonalCubo = new javax.swing.JLabel();
        btnEjecutar = new javax.swing.JButton();
        btnEjecutar1 = new javax.swing.JButton();
        txtCubo = new javax.swing.JTextField();
        RespuestaCubo = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        txtCubo1 = new javax.swing.JTextField();
        flecha2 = new javax.swing.JLabel();
        btnEjecutar2 = new javax.swing.JButton();
        btnLimpiar2 = new javax.swing.JButton();
        PromedioNumeros = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txtPromedio = new javax.swing.JTextField();
        RespuestaPromedio = new javax.swing.JLabel();
        btnLimpiar3 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        titulo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Aritmética y Geometría");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 77, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addContainerGap())
        );

        DiametroCircunferencia.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        DiametroCircunferencia.setText("Ingrese el diametro");

        txtCircunferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCircunferenciaActionPerformed(evt);
            }
        });
        txtCircunferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCircunferenciaKeyTyped(evt);
            }
        });

        Circunferencia.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 27)); // NOI18N
        Circunferencia.setForeground(new java.awt.Color(255, 255, 255));
        Circunferencia.setText("Circunferencia");

        flecha.setText("----------------------------------------------------------------------------------------->");

        RespuestaCircunferencia.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        RespuestaCircunferencia.setText("Circunferencia del circulo");

        VolumenEsfera.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 27)); // NOI18N
        VolumenEsfera.setForeground(new java.awt.Color(255, 255, 255));
        VolumenEsfera.setText("Volumen de una esfera");

        DiametroEsfera.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        DiametroEsfera.setText("Ingrese el diametro");

        txtEsfera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEsferaKeyTyped(evt);
            }
        });

        RespuestaEsfera.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        RespuestaEsfera.setText("Volumen de la esfera");

        flecha1.setText("----------------------------------------------------------------------------------------->");

        VolumenEsfera1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 27)); // NOI18N
        VolumenEsfera1.setForeground(new java.awt.Color(255, 255, 255));
        VolumenEsfera1.setText("Volumen de un cubo");

        DiagonalCubo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        DiagonalCubo.setText("Ingrese la diagonal");

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEjecutarMouseClicked(evt);
            }
        });

        btnEjecutar1.setText("Ejecutar");
        btnEjecutar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEjecutar1MouseClicked(evt);
            }
        });

        txtCubo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuboKeyTyped(evt);
            }
        });

        RespuestaCubo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        RespuestaCubo.setText("Volumen del cubo");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiar1MouseClicked(evt);
            }
        });

        flecha2.setText("----------------------------------------------------------------------------------------->");

        btnEjecutar2.setText("Ejecutar");
        btnEjecutar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEjecutar2MouseClicked(evt);
            }
        });

        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiar2MouseClicked(evt);
            }
        });

        PromedioNumeros.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 27)); // NOI18N
        PromedioNumeros.setForeground(new java.awt.Color(255, 255, 255));
        PromedioNumeros.setText("Promedio de Numeros");

        btnIngresar.setText("Iniciar Proceso");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnIngresarKeyTyped(evt);
            }
        });

        RespuestaPromedio.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        RespuestaPromedio.setText("Promedio");

        btnLimpiar3.setText("Limpiar");
        btnLimpiar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiar3MouseClicked(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(VolumenEsfera))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(VolumenEsfera1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PromedioNumeros)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(156, 156, 156)
                                        .addComponent(RespuestaPromedio))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DiametroCircunferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCircunferencia)
                            .addComponent(DiametroEsfera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DiagonalCubo)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RespuestaCircunferencia)
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(flecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(9, 9, 9))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(flecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RespuestaEsfera)
                                            .addComponent(txtCircunferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEsfera1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(flecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(RespuestaCubo)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(btnLimpiar1)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnEjecutar1))
                                                    .addComponent(txtCubo1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(btnLimpiar2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btnEjecutar2))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnLimpiar)
                                                .addGap(26, 26, 26)
                                                .addComponent(btnEjecutar)))))
                                .addGap(80, 80, 80))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(Circunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEsfera, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RespuestaPromedio)
                .addGap(18, 18, 18)
                .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(930, 930, 930))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addComponent(Circunferencia)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiametroCircunferencia)
                    .addComponent(RespuestaCircunferencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(flecha)
                        .addComponent(txtCircunferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(VolumenEsfera)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RespuestaEsfera)
                    .addComponent(DiametroEsfera))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEsfera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEsfera1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flecha1))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEjecutar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(VolumenEsfera1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RespuestaCubo)
                    .addComponent(DiagonalCubo))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCubo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCubo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flecha2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEjecutar2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PromedioNumeros)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        txtCircunferencia.setText(null);
        txtCircunferencia1.setText(null);
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnEjecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEjecutarMouseClicked
        
        
        double circunferencia= 0;
        double diametro= Double.parseDouble(txtCircunferencia.getText());
        
        circunferencia=diametro*3.14;
        String respuesta=String.valueOf(circunferencia);
        
        txtCircunferencia1.setText(respuesta);
      
    }//GEN-LAST:event_btnEjecutarMouseClicked

    private void txtCircunferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCircunferenciaActionPerformed
    
    }//GEN-LAST:event_txtCircunferenciaActionPerformed

    private void txtCircunferenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCircunferenciaKeyTyped
        
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo números");
        }       
    }//GEN-LAST:event_txtCircunferenciaKeyTyped

    private void txtEsferaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEsferaKeyTyped
        char validar=evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo números");
        }       
    }//GEN-LAST:event_txtEsferaKeyTyped

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnLimpiar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiar1MouseClicked
        txtEsfera.setText(null);
        txtEsfera1.setText(null);
    }//GEN-LAST:event_btnLimpiar1MouseClicked

    private void btnEjecutar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEjecutar1MouseClicked
        
        double operacion=0;
        double diametro= Double.parseDouble(txtEsfera.getText());
        
        operacion=(4/3)*(3.14)*((diametro/2)*(diametro/2)*(diametro/2));
        
        String volumen= String.valueOf(operacion);
        
        txtEsfera1.setText(volumen);
                
    }//GEN-LAST:event_btnEjecutar1MouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        MenuApp App= new MenuApp();
        App.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void txtCuboKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuboKeyTyped
        char validar= evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo números");
        }
        
    }//GEN-LAST:event_txtCuboKeyTyped

    private void btnLimpiar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiar2MouseClicked
        txtCubo.setText(null);
        txtCubo1.setText(null);
    }//GEN-LAST:event_btnLimpiar2MouseClicked

    private void btnEjecutar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEjecutar2MouseClicked
        
        double operacion=0;
        double diagonal=Double.parseDouble(txtCubo.getText());
        
        operacion=((diagonal/1.73)*(diagonal/1.73)*(diagonal/1.73));
        
        String volumen= String.valueOf(operacion);
        
        txtCubo1.setText(volumen);
        
    }//GEN-LAST:event_btnEjecutar2MouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        
        double numeros[]= new double [10];
        int contador=0;
        
      do{
        numeros[contador]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero en la posicion "+(contador+1)));
        contador++; 
      } while(contador<10);
      
      double media=0;
        for(int conta=0; conta<numeros.length; conta++){
            media=media+numeros[conta];
        }
        double proceso= (media/numeros.length);
                      
        String total= String.valueOf(proceso);
        
        txtPromedio.setText(total);
        
        for(int conta=0; conta<numeros.length; conta++){
            numeros[conta]=0;
        }
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnIngresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyTyped
        
    }//GEN-LAST:event_btnIngresarKeyTyped

    private void btnLimpiar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiar3MouseClicked
        
       txtPromedio.setText(null);   
        
    }//GEN-LAST:event_btnLimpiar3MouseClicked

    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArityGeo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Circunferencia;
    private javax.swing.JLabel DiagonalCubo;
    private javax.swing.JLabel DiametroCircunferencia;
    private javax.swing.JLabel DiametroEsfera;
    private javax.swing.JLabel PromedioNumeros;
    private javax.swing.JLabel RespuestaCircunferencia;
    private javax.swing.JLabel RespuestaCubo;
    private javax.swing.JLabel RespuestaEsfera;
    private javax.swing.JLabel RespuestaPromedio;
    private javax.swing.JLabel VolumenEsfera;
    private javax.swing.JLabel VolumenEsfera1;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnEjecutar1;
    private javax.swing.JButton btnEjecutar2;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnLimpiar3;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel flecha;
    private javax.swing.JLabel flecha1;
    private javax.swing.JLabel flecha2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtCircunferencia;
    private javax.swing.JTextField txtCircunferencia1;
    private javax.swing.JTextField txtCubo;
    private javax.swing.JTextField txtCubo1;
    private javax.swing.JTextField txtEsfera;
    private javax.swing.JTextField txtEsfera1;
    private javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
}
