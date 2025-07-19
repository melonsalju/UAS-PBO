/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop1_9;
import java.text.DecimalFormat;
public class CalcFrame extends javax.swing.JFrame {

    public CalcFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnbagi = new javax.swing.JButton();
        btnkali = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnkurang = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btnkoma = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnsama = new javax.swing.JButton();
        txtData = new javax.swing.JTextField();
        btnhapus = new javax.swing.JButton();
        navigateToPOS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn7.setBackground(new java.awt.Color(0, 102, 102));
        btn7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 102, 102));
        btn8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 102, 102));
        btn9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnbagi.setBackground(new java.awt.Color(0, 102, 102));
        btnbagi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnbagi.setForeground(new java.awt.Color(255, 255, 255));
        btnbagi.setText(":");
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });

        btnkali.setBackground(new java.awt.Color(0, 102, 102));
        btnkali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnkali.setForeground(new java.awt.Color(255, 255, 255));
        btnkali.setText("x");
        btnkali.setToolTipText("");
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 102, 102));
        btn6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 102, 102));
        btn5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 102, 102));
        btn4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btnkurang.setBackground(new java.awt.Color(0, 102, 102));
        btnkurang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnkurang.setForeground(new java.awt.Color(255, 255, 255));
        btnkurang.setText("-");
        btnkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurangActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 102, 102));
        btn3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 102, 102));
        btn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(0, 102, 102));
        btn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btntambah.setBackground(new java.awt.Color(0, 102, 102));
        btntambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btntambah.setForeground(new java.awt.Color(255, 255, 255));
        btntambah.setText("+");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnkoma.setBackground(new java.awt.Color(0, 102, 102));
        btnkoma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnkoma.setForeground(new java.awt.Color(255, 255, 255));
        btnkoma.setText(".");
        btnkoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkomaActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(0, 102, 102));
        btn0.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnsama.setBackground(new java.awt.Color(0, 102, 102));
        btnsama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsama.setForeground(new java.awt.Color(255, 255, 255));
        btnsama.setText("=");
        btnsama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsamaActionPerformed(evt);
            }
        });

        txtData.setBackground(new java.awt.Color(0, 102, 102));
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        txtData.setCaretColor(new java.awt.Color(204, 255, 204));
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        btnhapus.setBackground(new java.awt.Color(0, 102, 102));
        btnhapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(255, 255, 255));
        btnhapus.setText("C");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        navigateToPOS.setBackground(new java.awt.Color(0, 102, 102));
        navigateToPOS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        navigateToPOS.setForeground(new java.awt.Color(255, 255, 255));
        navigateToPOS.setText("Kembali");
        navigateToPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navigateToPOSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtData, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnkali, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnkoma, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                        .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnsama, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(navigateToPOS))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnkali, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnkurang, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnkoma, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnsama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(navigateToPOS)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
        AddText("7");
    }//GEN-LAST:event_btn7MouseClicked

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        AddText("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        AddText("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
        setOperator(":");
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
        setOperator("x");
    }//GEN-LAST:event_btnkaliActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        AddText("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        AddText("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        AddText("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btnkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurangActionPerformed
        setOperator("-");
    }//GEN-LAST:event_btnkurangActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        AddText("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        AddText("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        AddText("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        setOperator("+");
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnkomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkomaActionPerformed
        String currentText = txtData.getText();

        if (!currentText.contains(".")) {
            txtData.setText(currentText + ".");
        }
    }//GEN-LAST:event_btnkomaActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        AddText("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnsamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsamaActionPerformed
        calculateResult();
    }//GEN-LAST:event_btnsamaActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        txtData.setText("");
        firstNumber = 0;
        operator = "";
        isOperatorPressed = false;
    }//GEN-LAST:event_btnhapusActionPerformed

    private void navigateToPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navigateToPOSActionPerformed
        // TODO add your handling code here:
        pointOfSale pos = new pointOfSale();
        pos.setVisible(true);
        pos.pack();
        pos.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_navigateToPOSActionPerformed
    private String operator = "";
    private double firstNumber = 0;
    private boolean isOperatorPressed = false;
    
    private void AddText(String num){
        if (isOperatorPressed) {
            txtData.setText("");
            isOperatorPressed = false;
        }
        txtData.setText(txtData.getText() + num);
    }
    
    private void setOperator(String op) {
        String currentText = txtData.getText();
            if (currentText.isEmpty()) {
                txtData.setText("0");
            }
        operator = op;
        firstNumber = Double.parseDouble(txtData.getText()); 
        isOperatorPressed = true;
    }
    
    private void calculateResult() {
        if (txtData.getText().isEmpty()) {
            txtData.setText("0");
        }

        double secondNumber = Double.parseDouble(txtData.getText());
        double result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "x":
                result = firstNumber * secondNumber;
                break;
            case ":":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    txtData.setText("Error");
                    return;
                }
                break;
            default:
                txtData.setText("Invalid");
                return;
        }
        DecimalFormat df = new DecimalFormat("#.#####");
        txtData.setText(df.format(result));
        
        operator = "";
        isOperatorPressed = false;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalcFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnbagi;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkali;
    private javax.swing.JButton btnkoma;
    private javax.swing.JButton btnkurang;
    private javax.swing.JButton btnsama;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton navigateToPOS;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
}
