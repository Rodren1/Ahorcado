/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author xp
 */
public class VentanaAhorcado extends javax.swing.JFrame {

    public VentanaAhorcado() {
        initComponents();
        dibujaImg();
        //inicializo el jLabel en el q se muestran los guiones bajos
        String auxiliar = "";
        for (int i = 0; i < palabraOculta.length(); i++) {
            auxiliar = auxiliar + "_ ";
        }
        jLabel1.setText(auxiliar);
    }

    //va a seleccionar una palabra al azar de un array de palabras
    private String eligePalabra() {
        String[] listaPalabras = {"HOLA", "VLADINIGGA", "BORREGUITO", "BABYYODA"};
        Random aleatorio = new Random();
        int posicion = aleatorio.nextInt(listaPalabras.length);
        return listaPalabras[posicion].toUpperCase();
    }

    int fallos = 0; //guarda el numero de fallos
    boolean gameOver = false;
    String palabraOculta = eligePalabra();

    private void chequeaBoton(JButton boton) {
        if (!gameOver) {
            boton.setEnabled(false);
            chequeaLetra(boton.getText());
        }
    }

    private void chequeaLetra(String letra) {
        String palabraGuiones = jLabel1.getText();
        if (palabraOculta.contains(letra)) {
            //hay letra, la/s letra/s se descubren eliminando guion/es
            char letraPulsada = letra.charAt(0);
            for (int i = 0; i < palabraOculta.length(); i++) {
                if (palabraOculta.charAt(i) == letraPulsada) {
                    palabraGuiones = palabraGuiones.substring(0, 2 * i) + letra + palabraGuiones.substring(2 * i + 1);
                }
            }
            jLabel1.setText(palabraGuiones);
            if (!palabraGuiones.contains("_")) {
                fallos = -1;
                dibujaImg();
                gameOver = true;
            }
        } else {
            fallos++;
            if(fallos == 6){
                gameOver = true;
            }
            dibujaImg();
        }

    }

    private void dibujaImg() { //cambia la imagen en funcion del nº de fallos
        String nombreImg = "";
        switch (fallos) {
            case -1:
                nombreImg = "/img/acertasteTodo.png";
                break;
            case 0:
                nombreImg = "/img/ahorcado_0.png";
                break;
            case 1:
                nombreImg = "/img/ahorcado_1.png";
                break;
            case 2:
                nombreImg = "/img/ahorcado_2.png";
                break;
            case 3:
                nombreImg = "/img/ahorcado_3.png";
                break;
            case 4:
                nombreImg = "/img/ahorcado_4.png";
                break;
            case 5:
                nombreImg = "/img/ahorcado_5.png";
                break;
            default:
                nombreImg = "/img/ahorcado_fin.png";
                break;
        }
        ImageIcon miImg = new ImageIcon(
                new ImageIcon(getClass().getResource(nombreImg))
                        .getImage()
                        .getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT)
        );
        jLabel2.setIcon(miImg);
    }

    /**
     * Creates new form VentanaAhorcado
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        E = new javax.swing.JButton();
        F = new javax.swing.JButton();
        G = new javax.swing.JButton();
        H = new javax.swing.JButton();
        I = new javax.swing.JButton();
        J = new javax.swing.JButton();
        K = new javax.swing.JButton();
        L = new javax.swing.JButton();
        M = new javax.swing.JButton();
        N = new javax.swing.JButton();
        Ñ = new javax.swing.JButton();
        O = new javax.swing.JButton();
        P = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        R = new javax.swing.JButton();
        S = new javax.swing.JButton();
        T = new javax.swing.JButton();
        U = new javax.swing.JButton();
        V = new javax.swing.JButton();
        W = new javax.swing.JButton();
        X = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        Z = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("_ _ _ _ _ ");

        A.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        A.setText("A");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        B.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        B.setText("B");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        C.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        D.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        D.setText("D");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        E.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        E.setText("F");
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        F.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        F.setText("E");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        G.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        G.setText("G");
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });

        H.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        H.setText("H");
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });

        I.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        I.setText("I");
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });

        J.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        J.setText("J");
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });

        K.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        K.setText("K");
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });

        L.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        L.setText("L");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });

        M.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        M.setText("M");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        N.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        N.setText("N");
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });

        Ñ.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        Ñ.setText("Ñ");
        Ñ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÑActionPerformed(evt);
            }
        });

        O.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        O.setText("O");
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });

        P.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        P.setText("P");
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });

        Q.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        Q.setText("Q");
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });

        R.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        R.setText("R");
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });

        S.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        S.setText("S");
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });

        T.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        T.setText("T");
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });

        U.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        U.setText("U");
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });

        V.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        V.setText("V");
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });

        W.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        W.setText("W");
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });

        X.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        X.setText("X");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        Y.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        Y.setText("Y");
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });

        Z.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        Z.setText("Z");
        Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Ñ, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Q, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(U, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Q, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ñ, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(U, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_DActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_EActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_FActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_GActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_HActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_IActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_JActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_KActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_LActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_MActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_NActionPerformed

    private void ÑActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÑActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_ÑActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_OActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_PActionPerformed

    private void QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_QActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_RActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_SActionPerformed

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_TActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_UActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_VActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_WActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_XActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_YActionPerformed

    private void ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZActionPerformed
        chequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_ZActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JButton M;
    private javax.swing.JButton N;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JButton Q;
    private javax.swing.JButton R;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton Ñ;
    // End of variables declaration//GEN-END:variables
}
