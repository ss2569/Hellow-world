package GUI_assignment.GUI_copy;

import GUI_assignment.features_code.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;

/**
 * @author 12
 */
public class login_in extends JFrame {
    public login_in() {
        initComponents();
    }

    private void CancelButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        System.exit(1);
    }

    private void okButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        String name,password;
        char[] password1 = null;
        name = textField1.getText();
        password1 = passwordField1.getPassword();
        password = new String(password1);
        User obj = Dataprocessing.search(name, password);
        if (obj!=null)
        {
            if (obj instanceof Browser){
            this.setVisible(false);
            new browser(obj).setVisible(true);
         }
          else if (obj instanceof Operator){
            this.setVisible(false);
            new operator(obj).setVisible(true);
          }
         else if (obj instanceof Administrator){
            this.setVisible(false);
                new administrator(obj).setVisible(true);
          }
        }
        else {
            if (name.equals("")||password.equals(""))
                JOptionPane.showMessageDialog(login_in.this,"用户名或密码不可为空","警告",
                        JOptionPane.ERROR_MESSAGE);
            else
            {JOptionPane.showMessageDialog(login_in.this,"密码输入错误","警告",
                    JOptionPane.ERROR_MESSAGE);
            passwordField1.setText("");
            }
        }
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
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
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

