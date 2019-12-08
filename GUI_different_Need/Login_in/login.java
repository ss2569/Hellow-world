/*
 * Created by JFormDesigner on Fri Nov 29 14:35:14 CST 2019
 */

package GUI_assignment.GUI_different_Need.Login_in;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;

/**
 * @author 12
 */
public class login extends JFrame {
    public login() {
        initComponents();
    }

    private void CancelButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        System.exit(1);
    }
    public static void main(String[] args){
        new login().setVisible(true);
    }

    private void okButtonActionPerformed(ActionEvent e) {
        // TODO add your code here

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("GUI_assignment.Frame");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel1 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        panel2 = new JPanel();
        label2 = new JLabel();
        passwordField1 = new JPasswordField();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setTitle(bundle.getString("this.title_2"));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(null);

                //======== panel1 ========
                {
                    panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));

                    //---- label1 ----
                    label1.setText(bundle.getString("label1.text"));
                    label1.setHorizontalAlignment(SwingConstants.LEFT);
                    panel1.add(label1);

                    //---- textField1 ----
                    textField1.setColumns(14);
                    panel1.add(textField1);
                }
                contentPanel.add(panel1);
                panel1.setBounds(15, 20, 275, 40);

                //======== panel2 ========
                {
                    panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 5));

                    //---- label2 ----
                    label2.setText(bundle.getString("label2.text"));
                    panel2.add(label2);

                    //---- passwordField1 ----
                    passwordField1.setColumns(14);
                    panel2.add(passwordField1);
                }
                contentPanel.add(panel2);
                panel2.setBounds(15, 100, 275, 40);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < contentPanel.getComponentCount(); i++) {
                        Rectangle bounds = contentPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = contentPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    contentPanel.setMinimumSize(preferredSize);
                    contentPanel.setPreferredSize(preferredSize);
                }
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridLayout(1, 0, 40, 0));

                //---- okButton ----
                okButton.setText(bundle.getString("okButton.text"));
                okButton.addActionListener(e -> okButtonActionPerformed(e));
                buttonBar.add(okButton);

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("cancelButton.text"));
                cancelButton.addActionListener(e -> CancelButtonActionPerformed(e));
                buttonBar.add(cancelButton);
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(380, 295);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JPanel panel2;
    private JLabel label2;
    private JPasswordField passwordField1;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
