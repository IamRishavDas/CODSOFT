
package src.java;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;

public class Frame extends JFrame {

    public Frame() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();

        jTextField1  = new JTextField();
        jTextField2  = new JTextField();
        jTextField3  = new JTextField();
        jTextField4  = new JTextField();
        jTextField5  = new JTextField();
        jTextField6  = new JTextField();
        jTextField7  = new JTextField();
        jTextField8  = new JTextField();
        jTextField9  = new JTextField();
        jTextField10 = new JTextField();
        jTextField11 = new JTextField();
        jTextField12 = new JTextField();
        jTextField13 = new JTextField();
        jTextField14 = new JTextField();
        jTextField15 = new JTextField();
        jTextField16 = new JTextField();
        jTextField17 = new JTextField();
        jTextField18 = new JTextField();

        jLabel5  = new JLabel();
        jLabel6  = new JLabel();
        jLabel7  = new JLabel();
        jLabel8  = new JLabel();
        jLabel9  = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();

        submit   = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Grade Calculator");
        setBackground(new java.awt.Color(204, 255, 204));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24));
        jLabel1.setText("Student Grade Calculator");
        jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(216, 216, 216));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel2.setText("Subject Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel3.setText("Marks(Out of 100)");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel4.setText("Percentage(%)");

        jTextField1.setHorizontalAlignment      (JTextField.CENTER);
        jTextField2.setHorizontalAlignment      (JTextField.CENTER);
        jTextField3.setHorizontalAlignment      (JTextField.CENTER);
        jTextField4.setHorizontalAlignment      (JTextField.CENTER);
        jTextField5.setHorizontalAlignment      (JTextField.CENTER);
        jTextField6.setHorizontalAlignment      (JTextField.CENTER);
        jTextField7.setHorizontalAlignment      (JTextField.CENTER);
        jTextField8.setHorizontalAlignment      (JTextField.CENTER);
        jTextField9.setHorizontalAlignment      (JTextField.CENTER);
        jTextField10.setHorizontalAlignment     (JTextField.CENTER);
        jTextField11.setHorizontalAlignment     (JTextField.CENTER);
        jTextField12.setHorizontalAlignment     (JTextField.CENTER);
        jTextField13.setHorizontalAlignment     (JTextField.CENTER);
        jTextField14.setHorizontalAlignment     (JTextField.CENTER);
        jTextField15.setHorizontalAlignment     (JTextField.CENTER);
        jTextField16.setHorizontalAlignment     (JTextField.CENTER);
        jTextField17.setHorizontalAlignment     (JTextField.CENTER);
        jTextField18.setHorizontalAlignment     (JTextField.CENTER);

        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("%");
        jLabel5.setBorder(BorderFactory.createEtchedBorder());

        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setText("%");
        jLabel6.setBorder(BorderFactory.createEtchedBorder());

        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7.setText("%");
        jLabel7.setBorder(BorderFactory.createEtchedBorder());

        jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel8.setText("%");
        jLabel8.setBorder(BorderFactory.createEtchedBorder());

        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setText("%");
        jLabel9.setBorder(BorderFactory.createEtchedBorder());

        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setText("%");
        jLabel10.setBorder(BorderFactory.createEtchedBorder());

        jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel11.setText("%");
        jLabel11.setBorder(BorderFactory.createEtchedBorder());

        jLabel12.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel12.setText("%");
        jLabel12.setBorder(BorderFactory.createEtchedBorder());

        jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel13.setText("%");
        jLabel13.setBorder(BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel14.setText("Total: ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel15.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel15.setText("100");
        jLabel15.setBorder(BorderFactory.createEtchedBorder());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel16.setText("Percentage: ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel17.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel17.setText("%");
        jLabel17.setBorder(BorderFactory.createEtchedBorder());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel18.setText("Grade: ");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel19.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel19.setBorder(BorderFactory.createEtchedBorder());

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField9)
                                        .addComponent(jTextField8)
                                        .addComponent(jTextField7)
                                        .addComponent(jTextField6)
                                        .addComponent(jTextField5)
                                        .addComponent(jTextField4)
                                        .addComponent(jTextField3)
                                        .addComponent(jTextField2)
                                        .addComponent(jTextField1)
                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(161, 161, 161)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jTextField18,
                                                                GroupLayout.PREFERRED_SIZE, 1,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jTextField17,
                                                                GroupLayout.PREFERRED_SIZE, 1,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jTextField16,
                                                                GroupLayout.PREFERRED_SIZE, 1,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jTextField15,
                                                                GroupLayout.PREFERRED_SIZE, 1,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jTextField14,
                                                                GroupLayout.PREFERRED_SIZE, 1,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jTextField13,
                                                                GroupLayout.PREFERRED_SIZE, 1,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jTextField12,
                                                                GroupLayout.PREFERRED_SIZE, 1,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jTextField11,
                                                                GroupLayout.PREFERRED_SIZE, 1,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jTextField10,
                                                                GroupLayout.PREFERRED_SIZE, 44,
                                                                GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addComponent(jLabel3)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel13, GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel12, GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                        .createSequentialGroup()
                                                        .addComponent(jLabel16)
                                                        .addGap(38, 38, 38)
                                                        .addComponent(jLabel17, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jLabel4))
                                .addGap(122, 122, 122))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel14, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, GroupLayout.DEFAULT_SIZE, 64,
                                                Short.MAX_VALUE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel19, GroupLayout.DEFAULT_SIZE, 68,
                                                        Short.MAX_VALUE)
                                                .addGap(449, 449, 449))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 68,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField10, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField11, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField12, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField13, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField14, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField15, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField16, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField8, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField17, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField9, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField18, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 24,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 24,
                                                GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel17))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel18, GroupLayout.DEFAULT_SIZE, 24,
                                                Short.MAX_VALUE)
                                        .addComponent(jLabel19, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(34, Short.MAX_VALUE)));

        submit.setText("submit");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(281, 281, 281)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(submit, GroupLayout.PREFERRED_SIZE,
                                                                101, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE,
                                                                GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(22, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 43,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(submit, GroupLayout.PREFERRED_SIZE, 31,
                                        GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                var frame = new Frame();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
    }

    private JButton submit;

    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    
    private JTextField jTextField1;
    private JTextField jTextField10;
    private JTextField jTextField11;
    private JTextField jTextField12;
    private JTextField jTextField13;
    private JTextField jTextField14;
    private JTextField jTextField15;
    private JTextField jTextField16;
    private JTextField jTextField17;
    private JTextField jTextField18;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    private JTextField jTextField8;
    private JTextField jTextField9;

}
