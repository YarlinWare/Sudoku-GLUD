package sudoku.glud;

import java.awt.Color;
import javafx.scene.layout.Background;

public class Interfaz_Usuario extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    
    
    Sudoku_Metodos sudoku_metodos = new Sudoku_Metodos();
    
   /* public static void main(String[] args) {
        Sudoku_Metodos sudoku_metodos = new Sudoku_Metodos();
        int[][] sudoku = sudoku_metodos.cargar_juego();        
        
    }*/
    
    public Interfaz_Usuario() {
        initComponents();
        iniciar();
        this.setSize(700,500);
    }
    
   public void iniciar() {
        sudoku_metodos.cargar_juego();
        //***________________1ª Fila ________________***//
        j13.setText(String.valueOf(sudoku_metodos.matriz[1][3]));
        j13.setEditable(false);
        j14.setText(String.valueOf(sudoku_metodos.matriz[1][4]));
        j14.setEditable(false);        
        //***________________2ª Fila ________________***//
        j22.setText(String.valueOf(sudoku_metodos.matriz[2][2]));
        j22.setEditable(false);
        j24.setText(String.valueOf(sudoku_metodos.matriz[2][4]));
        j24.setEditable(false);
        j28.setText(String.valueOf(sudoku_metodos.matriz[2][8]));
        j28.setEditable(false);
        j29.setText(String.valueOf(sudoku_metodos.matriz[2][9]));
        j29.setEditable(false);
        //***________________3ª Fila ________________***//
        j34.setText(String.valueOf(sudoku_metodos.matriz[3][4]));
        j34.setEditable(false);
        j36.setText(String.valueOf(sudoku_metodos.matriz[3][6]));
        j36.setEditable(false);
        j37.setText(String.valueOf(sudoku_metodos.matriz[3][7]));
        j37.setEditable(false);
        j39.setText(String.valueOf(sudoku_metodos.matriz[3][9]));
        j39.setEditable(false);
        //***________________4ª Fila ________________***//
        j41.setText(String.valueOf(sudoku_metodos.matriz[4][1]));
        j41.setEditable(false);
        j43.setText(String.valueOf(sudoku_metodos.matriz[4][3]));
        j43.setEditable(false);
        j44.setText(String.valueOf(sudoku_metodos.matriz[4][4]));
        j44.setEditable(false);
        j45.setText(String.valueOf(sudoku_metodos.matriz[4][5]));
        j45.setEditable(false);
        //***________________5ª Fila ________________***//
        j52.setText(String.valueOf(sudoku_metodos.matriz[5][2]));
        j52.setEditable(false);
        j58.setText(String.valueOf(sudoku_metodos.matriz[5][8]));
        j58.setEditable(false);
        j59.setText(String.valueOf(sudoku_metodos.matriz[5][9]));
        j59.setEditable(false);
        //***________________6ª Fila ________________***//
        j66.setText(String.valueOf(sudoku_metodos.matriz[6][6]));
        j66.setEditable(false);
        j67.setText(String.valueOf(sudoku_metodos.matriz[6][7]));
        j67.setEditable(false);
        //***________________7ª Fila ________________***//
        j71.setText(String.valueOf(sudoku_metodos.matriz[7][1]));
        j71.setEditable(false);
        j74.setText(String.valueOf(sudoku_metodos.matriz[7][4]));
        j74.setEditable(false);
        j76.setText(String.valueOf(sudoku_metodos.matriz[7][6]));
        j76.setEditable(false);
        j77.setText(String.valueOf(sudoku_metodos.matriz[7][7]));
        j77.setEditable(false);
        j79.setText(String.valueOf(sudoku_metodos.matriz[7][9]));
        j79.setEditable(false);
        //***________________8ª Fila ________________***//
        j81.setText(String.valueOf(sudoku_metodos.matriz[8][1]));
        j81.setEditable(false);
        j82.setText(String.valueOf(sudoku_metodos.matriz[8][2]));
        j82.setEditable(false);
        j86.setText(String.valueOf(sudoku_metodos.matriz[8][6]));
        j86.setEditable(false);
        j88.setText(String.valueOf(sudoku_metodos.matriz[8][8]));
        j88.setEditable(false);
        //***________________9ª Fila ________________***//
        j92.setText(String.valueOf(sudoku_metodos.matriz[9][2]));
        j92.setEditable(false);
        j95.setText(String.valueOf(sudoku_metodos.matriz[9][5]));
        j95.setEditable(false);
        j96.setText(String.valueOf(sudoku_metodos.matriz[9][6]));
        j96.setEditable(false);
        j97.setText(String.valueOf(sudoku_metodos.matriz[9][7]));
        j97.setEditable(false);    
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
            java.util.logging.Logger.getLogger(Interfaz_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Interfaz_Usuario().setVisible(true);
            }
        });
        
    }
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        j11 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        j12 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        j13 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        j14 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        j15 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        j16 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        j17 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        j18 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        j19 = new javax.swing.JTextPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        j21 = new javax.swing.JTextPane();
        jScrollPane20 = new javax.swing.JScrollPane();
        j22 = new javax.swing.JTextPane();
        jScrollPane21 = new javax.swing.JScrollPane();
        j23 = new javax.swing.JTextPane();
        jScrollPane22 = new javax.swing.JScrollPane();
        j24 = new javax.swing.JTextPane();
        jScrollPane23 = new javax.swing.JScrollPane();
        j25 = new javax.swing.JTextPane();
        jScrollPane24 = new javax.swing.JScrollPane();
        j26 = new javax.swing.JTextPane();
        jScrollPane25 = new javax.swing.JScrollPane();
        j27 = new javax.swing.JTextPane();
        jScrollPane26 = new javax.swing.JScrollPane();
        j28 = new javax.swing.JTextPane();
        jScrollPane27 = new javax.swing.JScrollPane();
        j29 = new javax.swing.JTextPane();
        jScrollPane28 = new javax.swing.JScrollPane();
        j31 = new javax.swing.JTextPane();
        jScrollPane29 = new javax.swing.JScrollPane();
        j32 = new javax.swing.JTextPane();
        jScrollPane30 = new javax.swing.JScrollPane();
        j33 = new javax.swing.JTextPane();
        jScrollPane31 = new javax.swing.JScrollPane();
        j34 = new javax.swing.JTextPane();
        jScrollPane32 = new javax.swing.JScrollPane();
        j35 = new javax.swing.JTextPane();
        jScrollPane33 = new javax.swing.JScrollPane();
        j36 = new javax.swing.JTextPane();
        jScrollPane34 = new javax.swing.JScrollPane();
        j37 = new javax.swing.JTextPane();
        jScrollPane35 = new javax.swing.JScrollPane();
        j38 = new javax.swing.JTextPane();
        jScrollPane36 = new javax.swing.JScrollPane();
        j39 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        j41 = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        j42 = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        j43 = new javax.swing.JTextPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        j44 = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        j45 = new javax.swing.JTextPane();
        jScrollPane15 = new javax.swing.JScrollPane();
        j46 = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        j47 = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        j48 = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        j49 = new javax.swing.JTextPane();
        jScrollPane37 = new javax.swing.JScrollPane();
        j51 = new javax.swing.JTextPane();
        jScrollPane38 = new javax.swing.JScrollPane();
        j52 = new javax.swing.JTextPane();
        jScrollPane39 = new javax.swing.JScrollPane();
        j53 = new javax.swing.JTextPane();
        jScrollPane40 = new javax.swing.JScrollPane();
        j54 = new javax.swing.JTextPane();
        jScrollPane41 = new javax.swing.JScrollPane();
        j55 = new javax.swing.JTextPane();
        jScrollPane42 = new javax.swing.JScrollPane();
        j56 = new javax.swing.JTextPane();
        jScrollPane43 = new javax.swing.JScrollPane();
        j57 = new javax.swing.JTextPane();
        jScrollPane44 = new javax.swing.JScrollPane();
        j58 = new javax.swing.JTextPane();
        jScrollPane45 = new javax.swing.JScrollPane();
        j59 = new javax.swing.JTextPane();
        jScrollPane46 = new javax.swing.JScrollPane();
        j61 = new javax.swing.JTextPane();
        jScrollPane47 = new javax.swing.JScrollPane();
        j62 = new javax.swing.JTextPane();
        jScrollPane48 = new javax.swing.JScrollPane();
        j63 = new javax.swing.JTextPane();
        jScrollPane49 = new javax.swing.JScrollPane();
        j64 = new javax.swing.JTextPane();
        jScrollPane50 = new javax.swing.JScrollPane();
        j65 = new javax.swing.JTextPane();
        jScrollPane51 = new javax.swing.JScrollPane();
        j66 = new javax.swing.JTextPane();
        jScrollPane52 = new javax.swing.JScrollPane();
        j67 = new javax.swing.JTextPane();
        jScrollPane53 = new javax.swing.JScrollPane();
        j68 = new javax.swing.JTextPane();
        jScrollPane54 = new javax.swing.JScrollPane();
        j69 = new javax.swing.JTextPane();
        jScrollPane55 = new javax.swing.JScrollPane();
        j71 = new javax.swing.JTextPane();
        jScrollPane56 = new javax.swing.JScrollPane();
        j72 = new javax.swing.JTextPane();
        jScrollPane57 = new javax.swing.JScrollPane();
        j73 = new javax.swing.JTextPane();
        jScrollPane58 = new javax.swing.JScrollPane();
        j74 = new javax.swing.JTextPane();
        jScrollPane59 = new javax.swing.JScrollPane();
        j75 = new javax.swing.JTextPane();
        jScrollPane60 = new javax.swing.JScrollPane();
        j76 = new javax.swing.JTextPane();
        jScrollPane61 = new javax.swing.JScrollPane();
        j77 = new javax.swing.JTextPane();
        jScrollPane62 = new javax.swing.JScrollPane();
        j78 = new javax.swing.JTextPane();
        jScrollPane63 = new javax.swing.JScrollPane();
        j79 = new javax.swing.JTextPane();
        jScrollPane64 = new javax.swing.JScrollPane();
        j81 = new javax.swing.JTextPane();
        jScrollPane65 = new javax.swing.JScrollPane();
        j82 = new javax.swing.JTextPane();
        jScrollPane66 = new javax.swing.JScrollPane();
        j83 = new javax.swing.JTextPane();
        jScrollPane67 = new javax.swing.JScrollPane();
        j84 = new javax.swing.JTextPane();
        jScrollPane68 = new javax.swing.JScrollPane();
        j85 = new javax.swing.JTextPane();
        jScrollPane69 = new javax.swing.JScrollPane();
        j86 = new javax.swing.JTextPane();
        jScrollPane70 = new javax.swing.JScrollPane();
        j87 = new javax.swing.JTextPane();
        jScrollPane71 = new javax.swing.JScrollPane();
        j88 = new javax.swing.JTextPane();
        jScrollPane72 = new javax.swing.JScrollPane();
        j89 = new javax.swing.JTextPane();
        jScrollPane77 = new javax.swing.JScrollPane();
        j91 = new javax.swing.JTextPane();
        jScrollPane78 = new javax.swing.JScrollPane();
        j92 = new javax.swing.JTextPane();
        jScrollPane79 = new javax.swing.JScrollPane();
        j93 = new javax.swing.JTextPane();
        jScrollPane80 = new javax.swing.JScrollPane();
        j94 = new javax.swing.JTextPane();
        jScrollPane81 = new javax.swing.JScrollPane();
        j95 = new javax.swing.JTextPane();
        jScrollPane82 = new javax.swing.JScrollPane();
        j96 = new javax.swing.JTextPane();
        jScrollPane83 = new javax.swing.JScrollPane();
        j97 = new javax.swing.JTextPane();
        jScrollPane84 = new javax.swing.JScrollPane();
        j98 = new javax.swing.JTextPane();
        jScrollPane85 = new javax.swing.JScrollPane();
        j99 = new javax.swing.JTextPane();
        JL_informacion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jB_terminar = new javax.swing.JButton();

        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(null);

        j11.setBackground(new java.awt.Color(0, 153, 153));
        j11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        j11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j11KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(j11);

        j12.setBackground(new java.awt.Color(0, 153, 153));
        j12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j12KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(j12);

        j13.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane3.setViewportView(j13);

        jScrollPane4.setViewportView(j14);

        j15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j15KeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(j15);

        j16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j16KeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(j16);

        jScrollPane7.setBackground(new java.awt.Color(0, 153, 153));

        j17.setBackground(new java.awt.Color(0, 153, 153));
        j17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j17KeyReleased(evt);
            }
        });
        jScrollPane7.setViewportView(j17);

        jScrollPane8.setBackground(new java.awt.Color(0, 153, 153));

        j18.setBackground(new java.awt.Color(0, 153, 153));
        j18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j18KeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(j18);

        jScrollPane9.setBackground(new java.awt.Color(0, 153, 153));

        j19.setBackground(new java.awt.Color(0, 153, 153));
        j19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j19KeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(j19);

        j21.setBackground(new java.awt.Color(0, 153, 153));
        j21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j21KeyReleased(evt);
            }
        });
        jScrollPane19.setViewportView(j21);

        j22.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane20.setViewportView(j22);

        j23.setBackground(new java.awt.Color(0, 153, 153));
        j23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j23KeyReleased(evt);
            }
        });
        jScrollPane21.setViewportView(j23);

        jScrollPane22.setViewportView(j24);

        j25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j25KeyReleased(evt);
            }
        });
        jScrollPane23.setViewportView(j25);

        j26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j26KeyReleased(evt);
            }
        });
        jScrollPane24.setViewportView(j26);

        jScrollPane25.setBackground(new java.awt.Color(0, 153, 153));

        j27.setBackground(new java.awt.Color(0, 153, 153));
        j27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j27KeyReleased(evt);
            }
        });
        jScrollPane25.setViewportView(j27);

        jScrollPane26.setBackground(new java.awt.Color(0, 153, 153));

        j28.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane26.setViewportView(j28);

        jScrollPane27.setBackground(new java.awt.Color(0, 153, 153));

        j29.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane27.setViewportView(j29);

        j31.setBackground(new java.awt.Color(0, 153, 153));
        j31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j31KeyReleased(evt);
            }
        });
        jScrollPane28.setViewportView(j31);

        j32.setBackground(new java.awt.Color(0, 153, 153));
        j32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j32KeyReleased(evt);
            }
        });
        jScrollPane29.setViewportView(j32);

        j33.setBackground(new java.awt.Color(0, 153, 153));
        j33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j33KeyReleased(evt);
            }
        });
        jScrollPane30.setViewportView(j33);

        jScrollPane31.setViewportView(j34);

        j35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j35KeyReleased(evt);
            }
        });
        jScrollPane32.setViewportView(j35);

        jScrollPane33.setViewportView(j36);

        jScrollPane34.setBackground(new java.awt.Color(0, 153, 153));

        j37.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane34.setViewportView(j37);

        jScrollPane35.setBackground(new java.awt.Color(0, 153, 153));

        j38.setBackground(new java.awt.Color(0, 153, 153));
        j38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j38KeyReleased(evt);
            }
        });
        jScrollPane35.setViewportView(j38);

        jScrollPane36.setBackground(new java.awt.Color(0, 153, 153));

        j39.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane36.setViewportView(j39);

        jScrollPane10.setViewportView(j41);

        j42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j42KeyReleased(evt);
            }
        });
        jScrollPane11.setViewportView(j42);

        jScrollPane12.setViewportView(j43);

        j44.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane13.setViewportView(j44);

        j45.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane14.setViewportView(j45);

        j46.setBackground(new java.awt.Color(0, 153, 153));
        j46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j46KeyReleased(evt);
            }
        });
        jScrollPane15.setViewportView(j46);

        j47.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j47KeyReleased(evt);
            }
        });
        jScrollPane16.setViewportView(j47);

        j48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j48KeyReleased(evt);
            }
        });
        jScrollPane17.setViewportView(j48);

        j49.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j49KeyReleased(evt);
            }
        });
        jScrollPane18.setViewportView(j49);

        j51.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j51KeyReleased(evt);
            }
        });
        jScrollPane37.setViewportView(j51);

        jScrollPane38.setViewportView(j52);

        j53.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j53KeyReleased(evt);
            }
        });
        jScrollPane39.setViewportView(j53);

        j54.setBackground(new java.awt.Color(0, 153, 153));
        j54.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j54KeyReleased(evt);
            }
        });
        jScrollPane40.setViewportView(j54);

        j55.setBackground(new java.awt.Color(0, 153, 153));
        j55.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j55KeyReleased(evt);
            }
        });
        jScrollPane41.setViewportView(j55);

        j56.setBackground(new java.awt.Color(0, 153, 153));
        j56.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j56KeyReleased(evt);
            }
        });
        jScrollPane42.setViewportView(j56);

        j57.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j57KeyReleased(evt);
            }
        });
        jScrollPane43.setViewportView(j57);

        jScrollPane44.setViewportView(j58);

        jScrollPane45.setViewportView(j59);

        j61.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j61KeyReleased(evt);
            }
        });
        jScrollPane46.setViewportView(j61);

        j62.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j62KeyReleased(evt);
            }
        });
        jScrollPane47.setViewportView(j62);

        j63.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j63KeyReleased(evt);
            }
        });
        jScrollPane48.setViewportView(j63);

        j64.setBackground(new java.awt.Color(0, 153, 153));
        j64.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j64KeyReleased(evt);
            }
        });
        jScrollPane49.setViewportView(j64);

        j65.setBackground(new java.awt.Color(0, 153, 153));
        j65.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j65KeyReleased(evt);
            }
        });
        jScrollPane50.setViewportView(j65);

        j66.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane51.setViewportView(j66);

        jScrollPane52.setViewportView(j67);

        j68.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j68KeyReleased(evt);
            }
        });
        jScrollPane53.setViewportView(j68);

        j69.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j69KeyReleased(evt);
            }
        });
        jScrollPane54.setViewportView(j69);

        j71.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane55.setViewportView(j71);

        j72.setBackground(new java.awt.Color(0, 153, 153));
        j72.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j72KeyReleased(evt);
            }
        });
        jScrollPane56.setViewportView(j72);

        j73.setBackground(new java.awt.Color(0, 153, 153));
        j73.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j73KeyReleased(evt);
            }
        });
        jScrollPane57.setViewportView(j73);

        jScrollPane58.setViewportView(j74);

        j75.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j75KeyReleased(evt);
            }
        });
        jScrollPane59.setViewportView(j75);

        jScrollPane60.setViewportView(j76);

        j77.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane61.setViewportView(j77);

        j78.setBackground(new java.awt.Color(0, 153, 153));
        j78.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j78KeyReleased(evt);
            }
        });
        jScrollPane62.setViewportView(j78);

        j79.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane63.setViewportView(j79);

        j81.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane64.setViewportView(j81);

        j82.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane65.setViewportView(j82);

        j83.setBackground(new java.awt.Color(0, 153, 153));
        j83.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j83KeyReleased(evt);
            }
        });
        jScrollPane66.setViewportView(j83);

        j84.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j84KeyReleased(evt);
            }
        });
        jScrollPane67.setViewportView(j84);

        j85.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j85KeyReleased(evt);
            }
        });
        jScrollPane68.setViewportView(j85);

        jScrollPane69.setViewportView(j86);

        j87.setBackground(new java.awt.Color(0, 153, 153));
        j87.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j87KeyReleased(evt);
            }
        });
        jScrollPane70.setViewportView(j87);

        j88.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane71.setViewportView(j88);

        j89.setBackground(new java.awt.Color(0, 153, 153));
        j89.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j89KeyReleased(evt);
            }
        });
        jScrollPane72.setViewportView(j89);

        j91.setBackground(new java.awt.Color(0, 153, 153));
        j91.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j91KeyReleased(evt);
            }
        });
        jScrollPane77.setViewportView(j91);

        j92.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane78.setViewportView(j92);

        j93.setBackground(new java.awt.Color(0, 153, 153));
        j93.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j93KeyReleased(evt);
            }
        });
        jScrollPane79.setViewportView(j93);

        j94.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j94KeyReleased(evt);
            }
        });
        jScrollPane80.setViewportView(j94);

        jScrollPane81.setViewportView(j95);

        jScrollPane82.setViewportView(j96);

        j97.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane83.setViewportView(j97);

        j98.setBackground(new java.awt.Color(0, 153, 153));
        j98.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j98KeyReleased(evt);
            }
        });
        jScrollPane84.setViewportView(j98);

        j99.setBackground(new java.awt.Color(0, 153, 153));
        j99.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                j99KeyReleased(evt);
            }
        });
        jScrollPane85.setViewportView(j99);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Detalles del juego:");

        jB_terminar.setText("Terminar");
        jB_terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_terminarActionPerformed(evt);
            }
        });
        jB_terminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jB_terminarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jB_terminar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JL_informacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane77, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane78, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane79, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane80, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane81, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane82, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane83, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane84, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane85, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane66, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane68, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane69, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane70, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane71, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane72, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane62, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane63, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane57)
                            .addComponent(jScrollPane56)
                            .addComponent(jScrollPane55)
                            .addComponent(jScrollPane60)
                            .addComponent(jScrollPane59)
                            .addComponent(jScrollPane58)
                            .addComponent(jScrollPane63)
                            .addComponent(jScrollPane62)
                            .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane66, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane69, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane68, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane72, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane71, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane70, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_terminar)
                    .addComponent(jScrollPane79, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane78, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane77, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane82, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane81, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane80, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane85, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane84, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane83, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        JL_informacion.getAccessibleContext().setAccessibleName("error");
    }// </editor-fold>//GEN-END:initComponents

    private void j12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j12KeyReleased
    
    int con = 0;
    //Evaluamos que el valor ingresado sea un numero entero valido
    if (sudoku_metodos.comprobar_valor((j12.getText()))) {
        //Evaluamos si el numero se repite en la fila
        if (sudoku_metodos.existe_fila(Integer.valueOf(j12.getText()), 1)) {
            //En caso de repetirse en la fila se envia el siguiente mensaje
            JL_informacion.setText("el numero " + j12.getText() + " ya esta en la fila");
            //se desocupa la caja
            j12.setText("");
        } else {
            //Evaluamos si el numero se repite en la columna
            if (sudoku_metodos.existe_columna(Integer.valueOf(j12.getText()), 2)) {
                //En caso de repetirse en la columna se envia el siguiente mensaje
                JL_informacion.setText("el numero " + j12.getText() + " ya esta en la columna");
                //se desocupa la caja
                j12.setText("");
            } else {
                //Evaluamos si el numero se repite en el bloque correspondiente de 3X3
                if (sudoku_metodos.existe_caja(Integer.valueOf(j12.getText()), 1, 2)) {
                    //En caso de repetirse en el bloque de 3X3, se envia el siguiente mensaje
                    JL_informacion.setText("el numero " + j12.getText() + " ya esta en la caja");
                    //se desocupa la caja
                    j12.setText("");
                } else {
                    /*
                    *En caso de que no este repetido en ningun caso añadimo
                    *el numero en la casilla y mantenemos la casilla de 
                    *información desocupada
                    */
                    sudoku_metodos.matriz[1][2] = Integer.valueOf(j12.getText());
                    JL_informacion.setText("");
                    con++;
                }
            }
        }
    } 
    //Si el numero ingresado no es un numero la casilla queda vacia
    else {
        j12.setText("");
    }
    /*
    *Si contador 'con' es mayor a uno es por que el numero ingresado 
    *es valido, en caso contrario la bicacion de la matriz se matendrá en cero
    */
    if (con == 0) {
        sudoku_metodos.matriz[1][2] = 0;
    }
    }//GEN-LAST:event_j12KeyReleased

    private void j11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j11KeyReleased
        int contador = 0;
    if (sudoku_metodos.comprobar_valor((j11.getText()))) {
        if (sudoku_metodos.existe_fila(Integer.valueOf(j11.getText()), 1)) {
            JL_informacion.setText("El numero " + j11.getText() + " ya esta en la fila");
            j11.setText("");
        } else {
            if (sudoku_metodos.existe_columna(Integer.valueOf(j11.getText()), 1)) {
                JL_informacion.setText("El numero " + j11.getText() + " ya esta en la columna");
                j11.setText("");
            } else {
                if (sudoku_metodos.existe_caja(Integer.valueOf(j11.getText()), 1, 1)) {
                    JL_informacion.setText("El numero " + j11.getText() + " ya esta en la caja");
                    j11.setText("");
                } else {
                    sudoku_metodos.matriz[1][1] = Integer.valueOf(j11.getText());
                    JL_informacion.setText("");
                    contador++;
                }
            }
        }
    }
    else {
        j11.setText("");
    }
    if (contador == 0) {
        sudoku_metodos.matriz[1][1] = 0;
    }
    }//GEN-LAST:event_j11KeyReleased

    private void j15KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j15KeyReleased
        int contador = 0;
    if (sudoku_metodos.comprobar_valor((j15.getText()))) {
        if (sudoku_metodos.existe_fila(Integer.valueOf(j15.getText()), 1)) {
            JL_informacion.setText("El numero " + j15.getText() + " ya esta en la fila");
            j15.setText("");
        } else {
            if (sudoku_metodos.existe_columna(Integer.valueOf(j15.getText()), 5)) {
                JL_informacion.setText("El numero " + j15.getText() + " ya esta en la columna");
                j15.setText("");
            } else {
                if (sudoku_metodos.existe_caja(Integer.valueOf(j15.getText()), 1, 5)) {
                    JL_informacion.setText("El numero " + j15.getText() + " ya esta en la caja");
                    j15.setText("");
                } else {
                    sudoku_metodos.matriz[1][5] = Integer.valueOf(j15.getText());
                    JL_informacion.setText("");
                    contador++;
                }
            }
        }
    }
    else {
        j15.setText("");
    }
    if (contador == 0) {
        sudoku_metodos.matriz[1][5] = 0;
    }
    }//GEN-LAST:event_j15KeyReleased

    private void j16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j16KeyReleased
        int contador = 0;
    if (sudoku_metodos.comprobar_valor((j16.getText()))) {
        if (sudoku_metodos.existe_fila(Integer.valueOf(j16.getText()), 1)) {
            JL_informacion.setText("El numero " + j16.getText() + " ya esta en la fila");
            j16.setText("");
        } else {
            if (sudoku_metodos.existe_columna(Integer.valueOf(j16.getText()), 6)) {
                JL_informacion.setText("El numero " + j16.getText() + " ya esta en la columna");
                j16.setText("");
            } else {
                if (sudoku_metodos.existe_caja(Integer.valueOf(j16.getText()), 1, 6)) {
                    JL_informacion.setText("El numero " + j16.getText() + " ya esta en la caja");
                    j16.setText("");
                } else {
                    sudoku_metodos.matriz[1][6] = Integer.valueOf(j16.getText());
                    JL_informacion.setText("");
                    contador++;
                }
            }
        }
    }
    else {
        j16.setText("");
    }
    if (contador == 0) {
        sudoku_metodos.matriz[1][6] = 0;
    }
    }//GEN-LAST:event_j16KeyReleased

    private void j17KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j17KeyReleased
        int contador = 0;
    if (sudoku_metodos.comprobar_valor((j17.getText()))) {
        if (sudoku_metodos.existe_fila(Integer.valueOf(j17.getText()), 1)) {
            JL_informacion.setText("El numero " + j17.getText() + " ya esta en la fila");
            j17.setText("");
        } else {
            if (sudoku_metodos.existe_columna(Integer.valueOf(j17.getText()), 7)) {
                JL_informacion.setText("El numero " + j17.getText() + " ya esta en la columna");
                j17.setText("");
            } else {
                if (sudoku_metodos.existe_caja(Integer.valueOf(j17.getText()), 1, 7)) {
                    JL_informacion.setText("El numero " + j17.getText() + " ya esta en la caja");
                    j17.setText("");
                } else {
                    sudoku_metodos.matriz[1][7] = Integer.valueOf(j17.getText());
                    JL_informacion.setText("");
                    contador++;
                }
            }
        }
    }
    else {
        j17.setText("");
    }
    if (contador == 0) {
        sudoku_metodos.matriz[1][7] = 0;
    }
    }//GEN-LAST:event_j17KeyReleased

    private void j18KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j18KeyReleased
       int contador = 0;
    if (sudoku_metodos.comprobar_valor((j18.getText()))) {
        if (sudoku_metodos.existe_fila(Integer.valueOf(j18.getText()), 1)) {
            JL_informacion.setText("El numero " + j18.getText() + " ya esta en la fila");
            j18.setText("");
        } else {
            if (sudoku_metodos.existe_columna(Integer.valueOf(j18.getText()), 8)) {
                JL_informacion.setText("El numero " + j18.getText() + " ya esta en la columna");
                j18.setText("");
            } else {
                if (sudoku_metodos.existe_caja(Integer.valueOf(j18.getText()), 1, 8)) {
                    JL_informacion.setText("El numero " + j18.getText() + " ya esta en la caja");
                    j18.setText("");
                } else {
                    sudoku_metodos.matriz[1][8] = Integer.valueOf(j18.getText());
                    JL_informacion.setText("");
                    contador++;
                }
            }
        }
    }
    else {
        j18.setText("");
    }
    if (contador == 0) {
        sudoku_metodos.matriz[1][8] = 0;
    }
    }//GEN-LAST:event_j18KeyReleased

    private void j19KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j19KeyReleased
        int contador = 0;
    if (sudoku_metodos.comprobar_valor((j19.getText()))) {
        if (sudoku_metodos.existe_fila(Integer.valueOf(j19.getText()), 1)) {
            JL_informacion.setText("El numero " + j19.getText() + " ya esta en la fila");
            j19.setText("");
        } else {
            if (sudoku_metodos.existe_columna(Integer.valueOf(j19.getText()), 9)) {
                JL_informacion.setText("El numero " + j19.getText() + " ya esta en la columna");
                j19.setText("");
            } else {
                if (sudoku_metodos.existe_caja(Integer.valueOf(j19.getText()), 1, 9)) {
                    JL_informacion.setText("El numero " + j19.getText() + " ya esta en la caja");
                    j19.setText("");
                } else {
                    sudoku_metodos.matriz[1][9] = Integer.valueOf(j19.getText());
                    JL_informacion.setText("");
                    contador++;
                }
            }
        }
    }
    else {
        j19.setText("");
    }
    if (contador == 0) {
        sudoku_metodos.matriz[1][9] = 0;
        
    }
    }//GEN-LAST:event_j19KeyReleased

    private void j21KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j21KeyReleased
        int contador = 0;
        if (sudoku_metodos.comprobar_valor((j21.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j21.getText()), 2)) {
                JL_informacion.setText("El numero " + j21.getText() + " ya esta en la fila");
                j21.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j21.getText()), 1)) {
                    JL_informacion.setText("El numero " + j21.getText() + " ya esta en la columna");
                    j21.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j21.getText()), 2, 1)) {
                        JL_informacion.setText("El numero " + j21.getText() + " ya esta en la caja");
                        j21.setText("");
                    } else {
                        sudoku_metodos.matriz[2][1] = Integer.valueOf(j21.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j21.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[2][1] = 0;

        }
    }//GEN-LAST:event_j21KeyReleased

    private void j23KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j23KeyReleased
                int contador = 0;
        if (sudoku_metodos.comprobar_valor((j23.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j23.getText()), 2)) {
                JL_informacion.setText("El numero " + j23.getText() + " ya esta en la fila");
                j23.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j23.getText()), 3)) {
                    JL_informacion.setText("El numero " + j23.getText() + " ya esta en la columna");
                    j23.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j23.getText()), 2, 3)) {
                        JL_informacion.setText("El numero " + j23.getText() + " ya esta en la caja");
                        j23.setText("");
                    } else {
                        sudoku_metodos.matriz[2][3] = Integer.valueOf(j23.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j23.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[2][3] = 0;

        }
    }//GEN-LAST:event_j23KeyReleased

    private void j25KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j25KeyReleased
        int contador = 0;
        if (sudoku_metodos.comprobar_valor((j25.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j25.getText()), 2)) {
                JL_informacion.setText("El numero " + j25.getText() + " ya esta en la fila");
                j25.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j25.getText()), 5)) {
                    JL_informacion.setText("El numero " + j25.getText() + " ya esta en la columna");
                    j25.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j25.getText()), 2, 5)) {
                        JL_informacion.setText("El numero " + j25.getText() + " ya esta en la caja");
                        j25.setText("");
                    } else {
                        sudoku_metodos.matriz[2][5] = Integer.valueOf(j25.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j25.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[2][5] = 0;

        }        // TODO add your handling code here:
    }//GEN-LAST:event_j25KeyReleased

    private void j26KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j26KeyReleased
                int contador = 0;
        if (sudoku_metodos.comprobar_valor((j26.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j26.getText()), 2)) {
                JL_informacion.setText("El numero " + j26.getText() + " ya esta en la fila");
                j26.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j26.getText()), 6)) {
                    JL_informacion.setText("El numero " + j26.getText() + " ya esta en la columna");
                    j26.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j26.getText()), 2, 6)) {
                        JL_informacion.setText("El numero " + j26.getText() + " ya esta en la caja");
                        j26.setText("");
                    } else {
                        sudoku_metodos.matriz[2][6] = Integer.valueOf(j26.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j26.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[2][6] = 0;

        }
    }//GEN-LAST:event_j26KeyReleased

    private void j27KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j27KeyReleased
        int contador = 0;
        if (sudoku_metodos.comprobar_valor((j27.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j27.getText()), 2)) {
                JL_informacion.setText("El numero " + j27.getText() + " ya esta en la fila");
                j27.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j27.getText()), 7)) {
                    JL_informacion.setText("El numero " + j27.getText() + " ya esta en la columna");
                    j27.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j27.getText()), 2, 7)) {
                        JL_informacion.setText("El numero " + j27.getText() + " ya esta en la caja");
                        j27.setText("");
                    } else {
                        sudoku_metodos.matriz[2][7] = Integer.valueOf(j27.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j27.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[2][7] = 0;

        }
    }//GEN-LAST:event_j27KeyReleased

    private void j31KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j31KeyReleased
        int contador = 0;
        if (sudoku_metodos.comprobar_valor((j31.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j31.getText()), 3)) {
                JL_informacion.setText("El numero " + j31.getText() + " ya esta en la fila");
                j31.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j31.getText()), 1)) {
                    JL_informacion.setText("El numero " + j31.getText() + " ya esta en la columna");
                    j31.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j31.getText()), 3, 1)) {
                        JL_informacion.setText("El numero " + j31.getText() + " ya esta en la caja");
                        j31.setText("");
                    } else {
                        sudoku_metodos.matriz[3][1] = Integer.valueOf(j31.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j31.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[3][1] = 0;
        }        
    }//GEN-LAST:event_j31KeyReleased

    private void j32KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j32KeyReleased
        int contador = 0;
        if (sudoku_metodos.comprobar_valor((j32.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j32.getText()), 3)) {
                JL_informacion.setText("El numero " + j32.getText() + " ya esta en la fila");
                j32.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j32.getText()), 2)) {
                    JL_informacion.setText("El numero " + j32.getText() + " ya esta en la columna");
                    j32.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j32.getText()), 3, 2)) {
                        JL_informacion.setText("El numero " + j32.getText() + " ya esta en la caja");
                        j32.setText("");
                    } else {
                        sudoku_metodos.matriz[3][2] = Integer.valueOf(j32.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j32.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[3][2] = 0;
        }        
    }//GEN-LAST:event_j32KeyReleased

    private void j33KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j33KeyReleased
int contador = 0;
        if (sudoku_metodos.comprobar_valor((j33.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j33.getText()), 3)) {
                JL_informacion.setText("El numero " + j33.getText() + " ya esta en la fila");
                j33.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j33.getText()), 3)) {
                    JL_informacion.setText("El numero " + j33.getText() + " ya esta en la columna");
                    j33.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j33.getText()), 3, 3)) {
                        JL_informacion.setText("El numero " + j33.getText() + " ya esta en la caja");
                        j33.setText("");
                    } else {
                        sudoku_metodos.matriz[3][3] = Integer.valueOf(j33.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j33.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[3][3] = 0;
        }              
    }//GEN-LAST:event_j33KeyReleased

    private void j35KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j35KeyReleased
int contador = 0;
        if (sudoku_metodos.comprobar_valor((j35.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j35.getText()), 3)) {
                JL_informacion.setText("El numero " + j35.getText() + " ya esta en la fila");
                j35.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j35.getText()), 5)) {
                    JL_informacion.setText("El numero " + j35.getText() + " ya esta en la columna");
                    j35.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j35.getText()), 3, 5)) {
                        JL_informacion.setText("El numero " + j35.getText() + " ya esta en la caja");
                        j35.setText("");
                    } else {
                        sudoku_metodos.matriz[3][5] = Integer.valueOf(j35.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j35.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[3][5] = 0;
        }                
    }//GEN-LAST:event_j35KeyReleased

    private void j38KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j38KeyReleased
int contador = 0;
        if (sudoku_metodos.comprobar_valor((j38.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j38.getText()), 3)) {
                JL_informacion.setText("El numero " + j38.getText() + " ya esta en la fila");
                j38.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j38.getText()), 8)) {
                    JL_informacion.setText("El numero " + j38.getText() + " ya esta en la columna");
                    j38.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j38.getText()), 3, 8)) {
                        JL_informacion.setText("El numero " + j38.getText() + " ya esta en la caja");
                        j38.setText("");
                    } else {
                        sudoku_metodos.matriz[3][8] = Integer.valueOf(j38.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j38.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[3][8] = 0;
        }                
    }//GEN-LAST:event_j38KeyReleased

    private void j42KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j42KeyReleased
     int contador = 0;
        if (sudoku_metodos.comprobar_valor((j42.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j42.getText()), 4)) {
                JL_informacion.setText("El numero " + j42.getText() + " ya esta en la fila");
                j42.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j42.getText()), 2)) {
                    JL_informacion.setText("El numero " + j42.getText() + " ya esta en la columna");
                    j42.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j42.getText()), 4, 2)) {
                        JL_informacion.setText("El numero " + j42.getText() + " ya esta en la caja");
                        j42.setText("");
                    } else {
                        sudoku_metodos.matriz[4][2] = Integer.valueOf(j42.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j42.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[4][2] = 0;
        }           
    }//GEN-LAST:event_j42KeyReleased

    private void j46KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j46KeyReleased
     int contador = 0;
        if (sudoku_metodos.comprobar_valor((j46.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j46.getText()), 4)) {
                JL_informacion.setText("El numero " + j46.getText() + " ya esta en la fila");
                j46.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j46.getText()), 6)) {
                    JL_informacion.setText("El numero " + j46.getText() + " ya esta en la columna");
                    j46.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j46.getText()), 4, 6)) {
                        JL_informacion.setText("El numero " + j46.getText() + " ya esta en la caja");
                        j46.setText("");
                    } else {
                        sudoku_metodos.matriz[4][6] = Integer.valueOf(j46.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j46.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[4][6] = 0;
        }   
    }//GEN-LAST:event_j46KeyReleased

    private void j47KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j47KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j47.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j47.getText()), 4)) {
                JL_informacion.setText("El numero " + j47.getText() + " ya esta en la fila");
                j47.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j47.getText()), 7)) {
                    JL_informacion.setText("El numero " + j47.getText() + " ya esta en la columna");
                    j47.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j47.getText()), 4, 7)) {
                        JL_informacion.setText("El numero " + j47.getText() + " ya esta en la caja");
                        j47.setText("");
                    } else {
                        sudoku_metodos.matriz[4][7] = Integer.valueOf(j47.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j47.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[4][7] = 0;
        }   
    }//GEN-LAST:event_j47KeyReleased

    private void j48KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j48KeyReleased
        int contador = 0;
        if (sudoku_metodos.comprobar_valor((j48.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j48.getText()), 4)) {
                JL_informacion.setText("El numero " + j48.getText() + " ya esta en la fila");
                j48.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j48.getText()), 8)) {
                    JL_informacion.setText("El numero " + j48.getText() + " ya esta en la columna");
                    j48.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j48.getText()), 4, 8)) {
                        JL_informacion.setText("El numero " + j48.getText() + " ya esta en la caja");
                        j48.setText("");
                    } else {
                        sudoku_metodos.matriz[4][8] = Integer.valueOf(j48.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j48.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[4][8] = 0;
        }   
    }//GEN-LAST:event_j48KeyReleased

    private void j49KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j49KeyReleased
        int contador = 0;
        if (sudoku_metodos.comprobar_valor((j49.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j49.getText()), 4)) {
                JL_informacion.setText("El numero " + j49.getText() + " ya esta en la fila");
                j49.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j49.getText()), 9)) {
                    JL_informacion.setText("El numero " + j49.getText() + " ya esta en la columna");
                    j49.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j49.getText()), 4, 9)) {
                        JL_informacion.setText("El numero " + j49.getText() + " ya esta en la caja");
                        j49.setText("");
                    } else {
                        sudoku_metodos.matriz[4][9] = Integer.valueOf(j49.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j49.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[4][9] = 0;
        }   
    }//GEN-LAST:event_j49KeyReleased

    private void j51KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j51KeyReleased
int contador = 0;
        if (sudoku_metodos.comprobar_valor((j51.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j51.getText()), 5)) {
                JL_informacion.setText("El numero " + j51.getText() + " ya esta en la fila");
                j51.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j51.getText()), 1)) {
                    JL_informacion.setText("El numero " + j51.getText() + " ya esta en la columna");
                    j51.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j51.getText()), 5, 1)) {
                        JL_informacion.setText("El numero " + j51.getText() + " ya esta en la caja");
                        j51.setText("");
                    } else {
                        sudoku_metodos.matriz[5][1] = Integer.valueOf(j51.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j51.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[5][1] = 0;
        }           
    }//GEN-LAST:event_j51KeyReleased

    private void j53KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j53KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j53.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j53.getText()), 5)) {
                JL_informacion.setText("El numero " + j53.getText() + " ya esta en la fila");
                j53.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j53.getText()), 3)) {
                    JL_informacion.setText("El numero " + j53.getText() + " ya esta en la columna");
                    j53.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j53.getText()), 5, 3)) {
                        JL_informacion.setText("El numero " + j53.getText() + " ya esta en la caja");
                        j53.setText("");
                    } else {
                        sudoku_metodos.matriz[5][3] = Integer.valueOf(j53.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j53.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[5][3] = 0;
        }      
    }//GEN-LAST:event_j53KeyReleased

    private void j54KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j54KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j54.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j54.getText()), 5)) {
                JL_informacion.setText("El numero " + j54.getText() + " ya esta en la fila");
                j54.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j54.getText()), 4)) {
                    JL_informacion.setText("El numero " + j54.getText() + " ya esta en la columna");
                    j54.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j54.getText()), 5, 4)) {
                        JL_informacion.setText("El numero " + j54.getText() + " ya esta en la caja");
                        j54.setText("");
                    } else {
                        sudoku_metodos.matriz[5][4] = Integer.valueOf(j54.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j54.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[5][4] = 0;
        }      
    }//GEN-LAST:event_j54KeyReleased

    private void j55KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j55KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j55.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j55.getText()), 5)) {
                JL_informacion.setText("El numero " + j55.getText() + " ya esta en la fila");
                j55.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j55.getText()), 5)) {
                    JL_informacion.setText("El numero " + j55.getText() + " ya esta en la columna");
                    j55.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j55.getText()), 5, 5)) {
                        JL_informacion.setText("El numero " + j55.getText() + " ya esta en la caja");
                        j55.setText("");
                    } else {
                        sudoku_metodos.matriz[5][5] = Integer.valueOf(j55.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j55.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[5][5] = 0;
        }      
    }//GEN-LAST:event_j55KeyReleased

    private void j56KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j56KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j56.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j56.getText()), 5)) {
                JL_informacion.setText("El numero " + j56.getText() + " ya esta en la fila");
                j56.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j56.getText()), 6)) {
                    JL_informacion.setText("El numero " + j56.getText() + " ya esta en la columna");
                    j56.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j56.getText()), 5, 6)) {
                        JL_informacion.setText("El numero " + j56.getText() + " ya esta en la caja");
                        j56.setText("");
                    } else {
                        sudoku_metodos.matriz[5][6] = Integer.valueOf(j56.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j56.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[5][6] = 0;
        }      
    }//GEN-LAST:event_j56KeyReleased

    private void j57KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j57KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j57.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j57.getText()), 5)) {
                JL_informacion.setText("El numero " + j57.getText() + " ya esta en la fila");
                j57.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j57.getText()), 7)) {
                    JL_informacion.setText("El numero " + j57.getText() + " ya esta en la columna");
                    j57.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j57.getText()), 5, 7)) {
                        JL_informacion.setText("El numero " + j57.getText() + " ya esta en la caja");
                        j57.setText("");
                    } else {
                        sudoku_metodos.matriz[5][7] = Integer.valueOf(j57.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j57.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[5][7] = 0;
        }      
    }//GEN-LAST:event_j57KeyReleased

    private void j61KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j61KeyReleased
       int contador = 0;
        if (sudoku_metodos.comprobar_valor((j61.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j61.getText()), 6)) {
                JL_informacion.setText("El numero " + j61.getText() + " ya esta en la fila");
                j61.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j61.getText()), 1)) {
                    JL_informacion.setText("El numero " + j61.getText() + " ya esta en la columna");
                    j61.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j61.getText()), 6, 1)) {
                        JL_informacion.setText("El numero " + j61.getText() + " ya esta en la caja");
                        j61.setText("");
                    } else {
                        sudoku_metodos.matriz[6][1] = Integer.valueOf(j61.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j61.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[6][1] = 0;
        }      
    }//GEN-LAST:event_j61KeyReleased

    private void j62KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j62KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j62.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j62.getText()), 6)) {
                JL_informacion.setText("El numero " + j62.getText() + " ya esta en la fila");
                j62.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j62.getText()), 2)) {
                    JL_informacion.setText("El numero " + j62.getText() + " ya esta en la columna");
                    j62.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j62.getText()), 6, 2)) {
                        JL_informacion.setText("El numero " + j62.getText() + " ya esta en la caja");
                        j62.setText("");
                    } else {
                        sudoku_metodos.matriz[6][2] = Integer.valueOf(j62.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j62.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[6][2] = 0;
        } 
    }//GEN-LAST:event_j62KeyReleased

    private void j63KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j63KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j63.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j63.getText()), 6)) {
                JL_informacion.setText("El numero " + j63.getText() + " ya esta en la fila");
                j63.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j63.getText()), 3)) {
                    JL_informacion.setText("El numero " + j63.getText() + " ya esta en la columna");
                    j63.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j63.getText()), 6, 3)) {
                        JL_informacion.setText("El numero " + j63.getText() + " ya esta en la caja");
                        j63.setText("");
                    } else {
                        sudoku_metodos.matriz[6][3] = Integer.valueOf(j63.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j63.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[6][3] = 0;
        }  
    }//GEN-LAST:event_j63KeyReleased

    private void j64KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j64KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j64.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j64.getText()), 6)) {
                JL_informacion.setText("El numero " + j64.getText() + " ya esta en la fila");
                j64.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j64.getText()), 4)) {
                    JL_informacion.setText("El numero " + j64.getText() + " ya esta en la columna");
                    j64.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j64.getText()), 6, 4)) {
                        JL_informacion.setText("El numero " + j64.getText() + " ya esta en la caja");
                        j64.setText("");
                    } else {
                        sudoku_metodos.matriz[6][4] = Integer.valueOf(j64.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j64.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[6][4] = 0;
        }  
    }//GEN-LAST:event_j64KeyReleased

    private void j65KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j65KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j65.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j65.getText()), 6)) {
                JL_informacion.setText("El numero " + j65.getText() + " ya esta en la fila");
                j65.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j65.getText()), 5)) {
                    JL_informacion.setText("El numero " + j65.getText() + " ya esta en la columna");
                    j65.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j65.getText()), 6, 5)) {
                        JL_informacion.setText("El numero " + j65.getText() + " ya esta en la caja");
                        j65.setText("");
                    } else {
                        sudoku_metodos.matriz[6][5] = Integer.valueOf(j65.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j65.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[6][5] = 0;
        }  
    }//GEN-LAST:event_j65KeyReleased

    private void j68KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j68KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j68.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j68.getText()), 6)) {
                JL_informacion.setText("El numero " + j68.getText() + " ya esta en la fila");
                j68.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j68.getText()), 8)) {
                    JL_informacion.setText("El numero " + j68.getText() + " ya esta en la columna");
                    j68.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j68.getText()), 6, 8)) {
                        JL_informacion.setText("El numero " + j68.getText() + " ya esta en la caja");
                        j68.setText("");
                    } else {
                        sudoku_metodos.matriz[6][8] = Integer.valueOf(j68.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j68.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[6][8] = 0;
        }  
    }//GEN-LAST:event_j68KeyReleased

    private void j69KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j69KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j69.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j69.getText()), 6)) {
                JL_informacion.setText("El numero " + j69.getText() + " ya esta en la fila");
                j69.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j69.getText()),9)) {
                    JL_informacion.setText("El numero " + j69.getText() + " ya esta en la columna");
                    j69.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j69.getText()), 6, 9)) {
                        JL_informacion.setText("El numero " + j69.getText() + " ya esta en la caja");
                        j69.setText("");
                    } else {
                        sudoku_metodos.matriz[6][9] = Integer.valueOf(j69.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j69.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[6][9] = 0;
        }  
    }//GEN-LAST:event_j69KeyReleased

    private void j72KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j72KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j72.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j72.getText()), 7)) {
                JL_informacion.setText("El numero " + j72.getText() + " ya esta en la fila");
                j72.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j72.getText()), 2)) {
                    JL_informacion.setText("El numero " + j72.getText() + " ya esta en la columna");
                    j72.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j72.getText()), 7, 2)) {
                        JL_informacion.setText("El numero " + j72.getText() + " ya esta en la caja");
                        j72.setText("");
                    } else {
                        sudoku_metodos.matriz[7][2] = Integer.valueOf(j72.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j72.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[7][2] = 0;
        }  
    }//GEN-LAST:event_j72KeyReleased

    private void j73KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j73KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j73.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j73.getText()), 7)) {
                JL_informacion.setText("El numero " + j73.getText() + " ya esta en la fila");
                j73.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j73.getText()), 3)) {
                    JL_informacion.setText("El numero " + j73.getText() + " ya esta en la columna");
                    j73.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j73.getText()), 7, 3)) {
                        JL_informacion.setText("El numero " + j73.getText() + " ya esta en la caja");
                        j73.setText("");
                    } else {
                        sudoku_metodos.matriz[7][3] = Integer.valueOf(j73.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j73.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[7][3] = 0;
        } 
    }//GEN-LAST:event_j73KeyReleased

    private void j75KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j75KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j75.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j75.getText()), 7)) {
                JL_informacion.setText("El numero " + j75.getText() + " ya esta en la fila");
                j75.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j75.getText()), 5)) {
                    JL_informacion.setText("El numero " + j75.getText() + " ya esta en la columna");
                    j75.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j75.getText()), 7, 5)) {
                        JL_informacion.setText("El numero " + j75.getText() + " ya esta en la caja");
                        j75.setText("");
                    } else {
                        sudoku_metodos.matriz[7][5] = Integer.valueOf(j75.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j75.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[7][5] = 0;
        } 
    }//GEN-LAST:event_j75KeyReleased

    private void j78KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j78KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j78.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j78.getText()), 7)) {
                JL_informacion.setText("El numero " + j78.getText() + " ya esta en la fila");
                j78.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j78.getText()), 8)) {
                    JL_informacion.setText("El numero " + j78.getText() + " ya esta en la columna");
                    j78.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j78.getText()), 7, 8)) {
                        JL_informacion.setText("El numero " + j78.getText() + " ya esta en la caja");
                        j78.setText("");
                    } else {
                        sudoku_metodos.matriz[7][8] = Integer.valueOf(j78.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j78.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[7][8] = 0;
        } 
    }//GEN-LAST:event_j78KeyReleased

    private void j83KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j83KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j83.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j83.getText()), 8)) {
                JL_informacion.setText("El numero " + j83.getText() + " ya esta en la fila");
                j83.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j83.getText()), 3)) {
                    JL_informacion.setText("El numero " + j83.getText() + " ya esta en la columna");
                    j83.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j83.getText()), 8, 3)) {
                        JL_informacion.setText("El numero " + j83.getText() + " ya esta en la caja");
                        j83.setText("");
                    } else {
                        sudoku_metodos.matriz[8][3] = Integer.valueOf(j83.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j83.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[8][3] = 0;
        } 
    }//GEN-LAST:event_j83KeyReleased

    private void j84KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j84KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j84.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j84.getText()), 8)) {
                JL_informacion.setText("El numero " + j84.getText() + " ya esta en la fila");
                j84.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j84.getText()), 4)) {
                    JL_informacion.setText("El numero " + j84.getText() + " ya esta en la columna");
                    j84.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j84.getText()), 8, 4)) {
                        JL_informacion.setText("El numero " + j84.getText() + " ya esta en la caja");
                        j84.setText("");
                    } else {
                        sudoku_metodos.matriz[8][4] = Integer.valueOf(j84.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j84.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[8][4] = 0;
        } 
    }//GEN-LAST:event_j84KeyReleased

    private void j85KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j85KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j85.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j85.getText()), 8)) {
                JL_informacion.setText("El numero " + j85.getText() + " ya esta en la fila");
                j85.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j85.getText()), 5)) {
                    JL_informacion.setText("El numero " + j85.getText() + " ya esta en la columna");
                    j85.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j85.getText()), 8, 5)) {
                        JL_informacion.setText("El numero " + j85.getText() + " ya esta en la caja");
                        j85.setText("");
                    } else {
                        sudoku_metodos.matriz[8][5] = Integer.valueOf(j85.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j85.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[8][5] = 0;
        } 
    }//GEN-LAST:event_j85KeyReleased

    private void j87KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j87KeyReleased
        int contador = 0;
        if (sudoku_metodos.comprobar_valor((j87.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j87.getText()), 8)) {
                JL_informacion.setText("El numero " + j87.getText() + " ya esta en la fila");
                j87.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j87.getText()), 7)) {
                    JL_informacion.setText("El numero " + j87.getText() + " ya esta en la columna");
                    j87.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j87.getText()), 8, 7)) {
                        JL_informacion.setText("El numero " + j87.getText() + " ya esta en la caja");
                        j87.setText("");
                    } else {
                        sudoku_metodos.matriz[8][7] = Integer.valueOf(j87.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j87.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[8][7] = 0;
        } 
    }//GEN-LAST:event_j87KeyReleased

    private void j89KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j89KeyReleased
       int contador = 0;
        if (sudoku_metodos.comprobar_valor((j89.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j89.getText()), 8)) {
                JL_informacion.setText("El numero " + j89.getText() + " ya esta en la fila");
                j89.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j89.getText()), 9)) {
                    JL_informacion.setText("El numero " + j89.getText() + " ya esta en la columna");
                    j89.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j89.getText()), 8, 9)) {
                        JL_informacion.setText("El numero " + j89.getText() + " ya esta en la caja");
                        j89.setText("");
                    } else {
                        sudoku_metodos.matriz[8][9] = Integer.valueOf(j89.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j89.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[8][9] = 0;
        } 
    }//GEN-LAST:event_j89KeyReleased

    private void j91KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j91KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j91.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j91.getText()), 9)) {
                JL_informacion.setText("El numero " + j91.getText() + " ya esta en la fila");
                j91.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j91.getText()), 1)) {
                    JL_informacion.setText("El numero " + j91.getText() + " ya esta en la columna");
                    j91.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j91.getText()), 9, 1)) {
                        JL_informacion.setText("El numero " + j91.getText() + " ya esta en la caja");
                        j91.setText("");
                    } else {
                        sudoku_metodos.matriz[9][1] = Integer.valueOf(j91.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j91.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[9][1] = 0;
        }
    }//GEN-LAST:event_j91KeyReleased

    private void j93KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j93KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j93.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j93.getText()), 9)) {
                JL_informacion.setText("El numero " + j93.getText() + " ya esta en la fila");
                j93.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j93.getText()), 3)) {
                    JL_informacion.setText("El numero " + j93.getText() + " ya esta en la columna");
                    j93.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j93.getText()), 9, 3)) {
                        JL_informacion.setText("El numero " + j93.getText() + " ya esta en la caja");
                        j93.setText("");
                    } else {
                        sudoku_metodos.matriz[9][3] = Integer.valueOf(j93.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j93.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[9][3] = 0;
        }
    }//GEN-LAST:event_j93KeyReleased

    private void j94KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j94KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j94.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j94.getText()), 9)) {
                JL_informacion.setText("El numero " + j94.getText() + " ya esta en la fila");
                j94.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j94.getText()), 4)) {
                    JL_informacion.setText("El numero " + j94.getText() + " ya esta en la columna");
                    j94.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j94.getText()), 9, 4)) {
                        JL_informacion.setText("El numero " + j94.getText() + " ya esta en la caja");
                        j94.setText("");
                    } else {
                        sudoku_metodos.matriz[9][4] = Integer.valueOf(j94.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j94.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[9][4] = 0;
        }
    }//GEN-LAST:event_j94KeyReleased

    private void j98KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j98KeyReleased
    int contador = 0;
        if (sudoku_metodos.comprobar_valor((j98.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j98.getText()), 9)) {
                JL_informacion.setText("El numero " + j98.getText() + " ya esta en la fila");
                j98.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j98.getText()), 8)) {
                    JL_informacion.setText("El numero " + j98.getText() + " ya esta en la columna");
                    j98.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j98.getText()), 9, 8)) {
                        JL_informacion.setText("El numero " + j98.getText() + " ya esta en la caja");
                        j98.setText("");
                    } else {
                        sudoku_metodos.matriz[9][8] = Integer.valueOf(j98.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j98.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[9][8] = 0;
        }
    }//GEN-LAST:event_j98KeyReleased

    private void j99KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j99KeyReleased
    
        int contador = 0;
        if (sudoku_metodos.comprobar_valor((j99.getText()))) {
            if (sudoku_metodos.existe_fila(Integer.valueOf(j99.getText()), 9)) {
                JL_informacion.setText("El numero " + j99.getText() + " ya esta en la fila");
                j99.setText("");
            } else {
                if (sudoku_metodos.existe_columna(Integer.valueOf(j99.getText()), 9)) {
                    JL_informacion.setText("El numero " + j99.getText() + " ya esta en la columna");
                    j99.setText("");
                } else {
                    if (sudoku_metodos.existe_caja(Integer.valueOf(j99.getText()), 9, 9)) {
                        JL_informacion.setText("El numero " + j99.getText() + " ya esta en la caja");
                        j99.setText("");
                    } else {
                        sudoku_metodos.matriz[9][9] = Integer.valueOf(j99.getText());
                        JL_informacion.setText("");
                        contador++;
                    }
                }
            }
        }
        else {
            j99.setText("");
        }
        if (contador == 0) {
            sudoku_metodos.matriz[9][9] = 0;
        }
    }//GEN-LAST:event_j99KeyReleased

    private void jB_terminarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jB_terminarKeyReleased
        
    }//GEN-LAST:event_jB_terminarKeyReleased

    private void jB_terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_terminarActionPerformed
        sudoku_metodos.terminado(sudoku_metodos.matriz);
        
        
    }//GEN-LAST:event_jB_terminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_informacion;
    private javax.swing.JTextPane j11;
    private javax.swing.JTextPane j12;
    private javax.swing.JTextPane j13;
    private javax.swing.JTextPane j14;
    private javax.swing.JTextPane j15;
    private javax.swing.JTextPane j16;
    private javax.swing.JTextPane j17;
    private javax.swing.JTextPane j18;
    private javax.swing.JTextPane j19;
    private javax.swing.JTextPane j21;
    private javax.swing.JTextPane j22;
    private javax.swing.JTextPane j23;
    private javax.swing.JTextPane j24;
    private javax.swing.JTextPane j25;
    private javax.swing.JTextPane j26;
    private javax.swing.JTextPane j27;
    private javax.swing.JTextPane j28;
    private javax.swing.JTextPane j29;
    private javax.swing.JTextPane j31;
    private javax.swing.JTextPane j32;
    private javax.swing.JTextPane j33;
    private javax.swing.JTextPane j34;
    private javax.swing.JTextPane j35;
    private javax.swing.JTextPane j36;
    private javax.swing.JTextPane j37;
    private javax.swing.JTextPane j38;
    private javax.swing.JTextPane j39;
    private javax.swing.JTextPane j41;
    private javax.swing.JTextPane j42;
    private javax.swing.JTextPane j43;
    private javax.swing.JTextPane j44;
    private javax.swing.JTextPane j45;
    private javax.swing.JTextPane j46;
    private javax.swing.JTextPane j47;
    private javax.swing.JTextPane j48;
    private javax.swing.JTextPane j49;
    private javax.swing.JTextPane j51;
    private javax.swing.JTextPane j52;
    private javax.swing.JTextPane j53;
    private javax.swing.JTextPane j54;
    private javax.swing.JTextPane j55;
    private javax.swing.JTextPane j56;
    private javax.swing.JTextPane j57;
    private javax.swing.JTextPane j58;
    private javax.swing.JTextPane j59;
    private javax.swing.JTextPane j61;
    private javax.swing.JTextPane j62;
    private javax.swing.JTextPane j63;
    private javax.swing.JTextPane j64;
    private javax.swing.JTextPane j65;
    private javax.swing.JTextPane j66;
    private javax.swing.JTextPane j67;
    private javax.swing.JTextPane j68;
    private javax.swing.JTextPane j69;
    private javax.swing.JTextPane j71;
    private javax.swing.JTextPane j72;
    private javax.swing.JTextPane j73;
    private javax.swing.JTextPane j74;
    private javax.swing.JTextPane j75;
    private javax.swing.JTextPane j76;
    private javax.swing.JTextPane j77;
    private javax.swing.JTextPane j78;
    private javax.swing.JTextPane j79;
    private javax.swing.JTextPane j81;
    private javax.swing.JTextPane j82;
    private javax.swing.JTextPane j83;
    private javax.swing.JTextPane j84;
    private javax.swing.JTextPane j85;
    private javax.swing.JTextPane j86;
    private javax.swing.JTextPane j87;
    private javax.swing.JTextPane j88;
    private javax.swing.JTextPane j89;
    private javax.swing.JTextPane j91;
    private javax.swing.JTextPane j92;
    private javax.swing.JTextPane j93;
    private javax.swing.JTextPane j94;
    private javax.swing.JTextPane j95;
    private javax.swing.JTextPane j96;
    private javax.swing.JTextPane j97;
    private javax.swing.JTextPane j98;
    private javax.swing.JTextPane j99;
    private javax.swing.JButton jB_terminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane56;
    private javax.swing.JScrollPane jScrollPane57;
    private javax.swing.JScrollPane jScrollPane58;
    private javax.swing.JScrollPane jScrollPane59;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane60;
    private javax.swing.JScrollPane jScrollPane61;
    private javax.swing.JScrollPane jScrollPane62;
    private javax.swing.JScrollPane jScrollPane63;
    private javax.swing.JScrollPane jScrollPane64;
    private javax.swing.JScrollPane jScrollPane65;
    private javax.swing.JScrollPane jScrollPane66;
    private javax.swing.JScrollPane jScrollPane67;
    private javax.swing.JScrollPane jScrollPane68;
    private javax.swing.JScrollPane jScrollPane69;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane70;
    private javax.swing.JScrollPane jScrollPane71;
    private javax.swing.JScrollPane jScrollPane72;
    private javax.swing.JScrollPane jScrollPane77;
    private javax.swing.JScrollPane jScrollPane78;
    private javax.swing.JScrollPane jScrollPane79;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane80;
    private javax.swing.JScrollPane jScrollPane81;
    private javax.swing.JScrollPane jScrollPane82;
    private javax.swing.JScrollPane jScrollPane83;
    private javax.swing.JScrollPane jScrollPane84;
    private javax.swing.JScrollPane jScrollPane85;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
    
}
