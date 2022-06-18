/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author CRISTIAN
 */
public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form FormLogin
     */
    public FormLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nameLogIn = new javax.swing.JLabel();
        separadorMin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jbtnIngresar = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        imgShop = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nameWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 239, 63));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLogIn.setFont(new java.awt.Font("Rubik", 1, 28)); // NOI18N
        nameLogIn.setText("Iniciar sesión");
        jPanel2.add(nameLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        separadorMin.setFont(new java.awt.Font("Rubik", 1, 28)); // NOI18N
        separadorMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/separador-min.png"))); // NOI18N
        jPanel2.add(separadorMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, 10));

        jLabel3.setFont(new java.awt.Font("Rubik", 0, 16)); // NOI18N
        jLabel3.setText("Contraseña");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rubik", 0, 16)); // NOI18N
        jLabel4.setText("Código de usuario");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jTextFieldUsuario.setFont(new java.awt.Font("Rubik", 0, 16)); // NOI18N
        jTextFieldUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 179, 179), 1, true));
        jPanel2.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 280, 50));

        jbtnIngresar.setBackground(new java.awt.Color(255, 15, 39));
        jbtnIngresar.setFont(new java.awt.Font("Rubik Medium", 0, 16)); // NOI18N
        jbtnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnIngresar.setText("Ingresar");
        jbtnIngresar.setBorder(null);
        jPanel2.add(jbtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 280, 50));

        jPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel2.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 280, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 348, 430));

        imgShop.setBackground(new java.awt.Color(255, 255, 255));
        imgShop.setFont(new java.awt.Font("Rubik", 1, 28)); // NOI18N
        imgShop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/shop.png"))); // NOI18N
        jPanel1.add(imgShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logo-color.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameWelcome.setFont(new java.awt.Font("Rubik", 1, 28)); // NOI18N
        nameWelcome.setText("Bienvenido a + MAS");
        jPanel3.add(nameWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/form-login.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rubik", 1, 28)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/separador-min.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgShop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPasswordField jPasswordField;
    public javax.swing.JTextField jTextFieldUsuario;
    public javax.swing.JButton jbtnIngresar;
    public javax.swing.JLabel logo;
    private javax.swing.JLabel nameLogIn;
    public javax.swing.JLabel nameWelcome;
    private javax.swing.JLabel separadorMin;
    // End of variables declaration//GEN-END:variables
}
