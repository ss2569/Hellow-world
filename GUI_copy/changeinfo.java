package GUI_assignment.GUI_copy;

import GUI_assignment.features_code.Dataprocessing;
import GUI_assignment.features_code.User;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author 12
 */
public class changeinfo extends JFrame {
    private String ID;
    private User obj;
    private JFrame br;
    public changeinfo(String ID, User obj, JFrame br) {
        this.ID = ID;
        this.obj =  obj;
        this.br =  br;
        initComponents();
    }

    private void cancelButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
       this.setVisible(false);
    }

    private void okButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        String oldpassword = textField2.getText();
        String newpassword = textField3.getText();
        String compassword = textField4.getText();
        String yuanpassword = obj.getPassword();
        //修改用户信息的具体代码
        if (yuanpassword.equals(oldpassword) && compassword.equals(newpassword)){
             Dataprocessing.update(obj.getName(),compassword,obj.getRole());
            JOptionPane.showMessageDialog(changeinfo.this,"口令修改成功","成功",JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            br.setVisible(false);
            new login_in().setVisible(true);

        }
        else if (!yuanpassword.equals(oldpassword))
        {
            JOptionPane.showMessageDialog(changeinfo.this,"原密码输入错误","错误",JOptionPane.ERROR_MESSAGE);
            //textField2.getText();
            textField2.setText("");
        }
        else {
            JOptionPane.showMessageDialog(changeinfo.this,"确认密码输入错误","错误",JOptionPane.ERROR_MESSAGE);
            //textField4.getText();
            textField4.setText("");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("GUI_assignment.Frame");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel1 = new JPanel();
        panel6 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        panel5 = new JPanel();
        label2 = new JLabel();
        textField2 = new JTextField();
        panel4 = new JPanel();
        label3 = new JLabel();
        textField3 = new JTextField();
        panel3 = new JPanel();
        label4 = new JLabel();
        textField4 = new JTextField();
        panel2 = new JPanel();
        label5 = new JLabel();
        textField5 = new JTextField();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setTitle(bundle.getString("this.title_4"));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new BorderLayout());

                //======== panel1 ========
                {
                    panel1.setLayout(new GridLayout(5, 1));

                    //======== panel6 ========
                    {
                        panel6.setLayout(new FlowLayout());

                        //---- label1 ----
                        label1.setText(bundle.getString("label1.text_2"));
                        panel6.add(label1);

                        //---- textField1 ----
                        textField1.setColumns(14);
                        textField1.setText(ID);
                        textField1.setEditable(false);
                        panel6.add(textField1);
                    }
                    panel1.add(panel6);

                    //======== panel5 ========
                    {
                        panel5.setLayout(new FlowLayout());

                        //---- label2 ----
                        label2.setText(bundle.getString("label2.text_2"));
                        panel5.add(label2);

                        //---- textField2 ----
                        textField2.setColumns(14);
                        panel5.add(textField2);
                    }
                    panel1.add(panel5);

                    //======== panel4 ========
                    {
                        panel4.setLayout(new FlowLayout());

                        //---- label3 ----
                        label3.setText(bundle.getString("label3.text"));
                        panel4.add(label3);

                        //---- textField3 ----
                        textField3.setColumns(14);
                        panel4.add(textField3);
                    }
                    panel1.add(panel4);

                    //======== panel3 ========
                    {
                        panel3.setLayout(new FlowLayout());

                        //---- label4 ----
                        label4.setText(bundle.getString("label4.text"));
                        panel3.add(label4);

                        //---- textField4 ----
                        textField4.setColumns(11);
                        panel3.add(textField4);
                    }
                    panel1.add(panel3);

                    //======== panel2 ========
                    {
                        panel2.setLayout(new FlowLayout());

                        //---- label5 ----
                        label5.setText(bundle.getString("label5.text"));
                        panel2.add(label5);

                        //---- textField5 ----
                        textField5.setColumns(14);
                        String role = obj.getRole();
                        textField5.setText(role);
                        textField5.setEditable(false);
                        panel2.add(textField5);
                    }
                    panel1.add(panel2);
                }
                contentPanel.add(panel1, BorderLayout.CENTER);
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 145, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText(bundle.getString("okButton.text_2"));
                okButton.addActionListener(e -> okButtonActionPerformed(e));
                buttonBar.add(okButton, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 65), 0, 0));

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("cancelButton.text_2"));
                cancelButton.addActionListener(e -> cancelButtonActionPerformed(e));
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(400, 300);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel1;
    private JPanel panel6;
    private JLabel label1;
    private JTextField textField1;
    private JPanel panel5;
    private JLabel label2;
    private JTextField textField2;
    private JPanel panel4;
    private JLabel label3;
    private JTextField textField3;
    private JPanel panel3;
    private JLabel label4;
    private JTextField textField4;
    private JPanel panel2;
    private JLabel label5;
    private JTextField textField5;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
