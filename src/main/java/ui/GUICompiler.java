package ui;

import java.awt.Font;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import antlr.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class GUICompiler extends javax.swing.JFrame {

    private static GUICompiler instance;

    private GUICompiler() {
        com.formdev.flatlaf.FlatDarculaLaf.install();
        initComponents();
        setupFonts();
        inTextArea.setLineWrap(true);
        outTextArea.setLineWrap(true);
    }

    public static GUICompiler getInstance(){
        if (GUICompiler.instance == null){
            GUICompiler.instance = new GUICompiler();
        }
        return GUICompiler.instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        inTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        runButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YALACO Compiler");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        outTextArea.setColumns(20);
        outTextArea.setRows(5);
        outTextArea.setEnabled(false);
        jScrollPane1.setViewportView(outTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 30, 270, 360));

        inTextArea.setColumns(20);
        inTextArea.setRows(5);
        jScrollPane2.setViewportView(inTextArea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 330));

        jLabel1.setText("Código fuente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setText("Salida");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        runButton.setText("Ejecutar");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });
        jPanel1.add(runButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(596, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        outTextArea.setText("");
        CharStream codePointCharStream = CharStreams.fromString(inTextArea.getText());

        Logger logger = Logger.getLogger(GUICompiler.class.getName());
        logger.setLevel(Level.ALL);

        YalacoLexer lexer = new YalacoLexer(codePointCharStream);

        lexer.removeErrorListeners();
        CustomErrorListener lexerErrorListener = new CustomErrorListener();
        lexer.addErrorListener(lexerErrorListener);

        if (!lexerErrorListener.getErrores().isEmpty()){
            for (String s : lexerErrorListener.getErrores())
                appendOutput(s + "\n");
            return;
        }

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        YalacoParser parser = new YalacoParser(tokens);

        parser.removeErrorListeners();
        CustomErrorListener parserErrorListener = new CustomErrorListener();
        parser.addErrorListener(parserErrorListener);

        HashMap<String, Object> tabla = new HashMap<>();
        //YalacoParser.StartContext tree = parser.start(tabla);
        YalacoParser.StartContext tree = parser.start();

        YalacoCustomVisitor visitor = new YalacoCustomVisitor();
        visitor.visit(tree);

        if (!parserErrorListener.getErrores().isEmpty()){
            for (String s : parserErrorListener.getErrores())
                appendOutput(s + "\n");
            return;
        }
        for (YalacoParser.StatementContext a : tree.statement()) {
            a.node.execute(tabla);
        }
    }//GEN-LAST:event_runButtonActionPerformed

    
    private void setupFonts(){
        Font font = new Font("Consolas", Font.PLAIN, 11);
        outTextArea.setFont(font);
        inTextArea.setFont(font);
    }


    public void appendOutput(Object obj){
        //outTextArea.append(obj.toString());
        outTextArea.setText(outTextArea.getText() + obj.toString());
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
            java.util.logging.Logger.getLogger(GUICompiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICompiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICompiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICompiler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new GUICompiler().setVisible(true);
                GUICompiler.getInstance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea inTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea outTextArea;
    private javax.swing.JButton runButton;
    // End of variables declaration//GEN-END:variables
}
