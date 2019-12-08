package GUI_assignment.GUI_copy;

import GUI_assignment.features_code.Dataprocessing;
import GUI_assignment.features_code.User;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.table.*;

/**
 * @author 12
 */
public class User_adm extends JFrame {//用户管理界面
    public User_adm() {
        initComponents();
        createarry();
    }

    private void button4ActionPerformed(ActionEvent e) {//“增加”按钮
        // TODO add your code here
        String ID = textField2.getText();
        String password = textField3.getText();
        String role = comboBox3.getItemAt(comboBox3.getSelectedIndex());
        if (Dataprocessing.insert(ID,password,role)){
            JOptionPane.showMessageDialog(User_adm.this,"添加成功","提示",
                    JOptionPane.INFORMATION_MESSAGE);
            comboBox1.addItem(ID);//更新修改栏下拉菜单列表内容
        }
        else{
            JOptionPane.showMessageDialog(User_adm.this,"用户名重复添加失败","提示",
                    JOptionPane.ERROR_MESSAGE);//用户名重复时提示用户
            textField2.setText("");
        }

    }

    private void button5ActionPerformed(ActionEvent e) {//取消按钮
        // TODO add your code here
        this.setVisible(false);
    }

    private void button2ActionPerformed(ActionEvent e) {//修改按钮
        // TODO add your code here
        String ID = comboBox1.getItemAt(comboBox1.getSelectedIndex());
        String password = textField1.getText();
        String role = comboBox2.getItemAt(comboBox2.getSelectedIndex());
        if (Dataprocessing.update(ID,password,role)){
            JOptionPane.showMessageDialog(User_adm.this,"修改成功","提示",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(User_adm.this,"修改失败","提示",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void button3ActionPerformed(ActionEvent e) {//取消按钮
        // TODO add your code here
        this.setVisible(false);
    }

    private void button1ActionPerformed(ActionEvent e) {//删除按钮
        // TODO add your code here
        DefaultTableModel tableModel = (DefaultTableModel) table1.getModel();
        int selectedRowIndex = table1.getSelectedRow();
        //System.out.println("................"+selectedRowIndex);
        String ID = (String) tableModel.getValueAt(selectedRowIndex,0);
        if (Dataprocessing.delete(ID)){
            JOptionPane.showMessageDialog(User_adm.this,"删除成功","提示",
                    JOptionPane.INFORMATION_MESSAGE);
            int index = comboBox1.getItemCount();
            int delindex = 0;
            while (--index>=0){
                if (ID.equals(comboBox1.getItemAt(index)))
                {
                    delindex = index;
                    break;
                }
            }
            //更新删除后“修改栏”下拉列表内容
            DefaultComboBoxModel Model = (DefaultComboBoxModel) comboBox1.getModel();
            Model.removeElementAt(delindex);
            //更新表格信息
            createarry();
        }
        else {
            JOptionPane.showMessageDialog(User_adm.this,"删除失败","警告",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private void button6ActionPerformed(ActionEvent e) {//取消按钮
        // TODO add your code here
        this.setVisible(false);
    }

    private void tabbedPane1StateChanged(ChangeEvent e) {//用来刷新修改信息后表格数据
        // TODO add your code here
        createarry();//切标签的时候更新用户表格内容
    }
    private void createarry() {//修改表格信息
        Enumeration<User> e = Dataprocessing.getAllUser();
        DefaultTableModel tableModel = (DefaultTableModel) table1.getModel();
        tableModel.setRowCount(0);
        User one = null;
        while (e.hasMoreElements()) {
            one = e.nextElement();
            String[] arr = new String[3];
            arr[0] = one.getName();
            arr[1] = one.getPassword();
            arr[2] = one.getRole();
            tableModel.addRow(arr);
        }
        table1.invalidate();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("GUI_assignment.Frame");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        buttonBar = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel6 = new JPanel();
        panel8 = new JPanel();
        label4 = new JLabel();
        textField2 = new JTextField();
        panel9 = new JPanel();
        label5 = new JLabel();
        textField3 = new JTextField();
        panel10 = new JPanel();
        label6 = new JLabel();
        comboBox3 = new JComboBox<>();
        panel11 = new JPanel();
        button4 = new JButton();
        button5 = new JButton();
        panel1 = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel();
        comboBox1 = new JComboBox<>();
        panel4 = new JPanel();
        label2 = new JLabel();
        textField1 = new JTextField();
        panel5 = new JPanel();
        label3 = new JLabel();
        comboBox2 = new JComboBox<>();
        panel7 = new JPanel();
        button2 = new JButton();
        button3 = new JButton();
        panel3 = new JPanel();
        panel12 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel13 = new JPanel();
        button1 = new JButton();
        button6 = new JButton();

        //======== this ========
        setTitle(bundle.getString("this.title_6"));
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new FlowLayout());
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //======== tabbedPane1 ========
            {
                tabbedPane1.addChangeListener(e -> tabbedPane1StateChanged(e));

                //======== panel6 ========
                {
                    panel6.setLayout(new GridLayout(4, 1));

                    //======== panel8 ========
                    {
                        panel8.setLayout(new FlowLayout());

                        //---- label4 ----
                        label4.setText(bundle.getString("label4.text_2"));
                        panel8.add(label4);

                        //---- textField2 ----
                        textField2.setColumns(12);
                        panel8.add(textField2);
                    }
                    panel6.add(panel8);

                    //======== panel9 ========
                    {
                        panel9.setLayout(new FlowLayout());

                        //---- label5 ----
                        label5.setText(bundle.getString("label5.text_2"));
                        panel9.add(label5);

                        //---- textField3 ----
                        textField3.setColumns(12);
                        panel9.add(textField3);
                    }
                    panel6.add(panel9);

                    //======== panel10 ========
                    {
                        panel10.setLayout(new FlowLayout());

                        //---- label6 ----
                        label6.setText(bundle.getString("label6.text"));
                        panel10.add(label6);

                        //---- comboBox3 ----
                        comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
                                "browser",
                                "administrator",
                                "operator"
                        }));
                        panel10.add(comboBox3);
                    }
                    panel6.add(panel10);

                    //======== panel11 ========
                    {
                        panel11.setLayout(new FlowLayout());

                        //---- button4 ----
                        button4.setText(bundle.getString("button4.text_2"));
                        button4.addActionListener(e -> button4ActionPerformed(e));
                        panel11.add(button4);

                        //---- button5 ----
                        button5.setText(bundle.getString("button5.text_2"));
                        button5.addActionListener(e -> button5ActionPerformed(e));
                        panel11.add(button5);
                    }
                    panel6.add(panel11);
                }
                tabbedPane1.addTab(bundle.getString("panel6.tab.title"), panel6);

                //======== panel1 ========
                {
                    panel1.setLayout(new GridLayout(4, 1));

                    //======== panel2 ========
                    {
                        panel2.setLayout(new FlowLayout());

                        //---- label1 ----
                        label1.setText(bundle.getString("label1.text_4"));
                        panel2.add(label1);

                        //---- comboBox1 ----
                        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
                                "jack",
                                "rose",
                                "kate"
                        }));
                        panel2.add(comboBox1);
                    }
                    panel1.add(panel2);

                    //======== panel4 ========
                    {
                        panel4.setLayout(new FlowLayout());

                        //---- label2 ----
                        label2.setText(bundle.getString("label2.text_4"));
                        panel4.add(label2);

                        //---- textField1 ----
                        textField1.setColumns(11);
                        panel4.add(textField1);
                    }
                    panel1.add(panel4);

                    //======== panel5 ========
                    {
                        panel5.setLayout(new FlowLayout());

                        //---- label3 ----
                        label3.setText(bundle.getString("label3.text_3"));
                        panel5.add(label3);

                        //---- comboBox2 ----
                        comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
                                "administrator",
                                "browser",
                                "operator"
                        }));
                        comboBox2.setSelectedIndex(1);
                        panel5.add(comboBox2);
                    }
                    panel1.add(panel5);

                    //======== panel7 ========
                    {
                        panel7.setLayout(new FlowLayout());

                        //---- button2 ----
                        button2.setText(bundle.getString("button2.text_2"));
                        button2.addActionListener(e -> button2ActionPerformed(e));
                        panel7.add(button2);

                        //---- button3 ----
                        button3.setText(bundle.getString("button3.text_2"));
                        button3.addActionListener(e -> button3ActionPerformed(e));
                        panel7.add(button3);
                    }
                    panel1.add(panel7);
                }
                tabbedPane1.addTab(bundle.getString("panel1.tab.title"), panel1);

                //======== panel3 ========
                {
                    panel3.setLayout(new GridLayout(2, 1));

                    //======== panel12 ========
                    {
                        panel12.setLayout(new FlowLayout());

                        //======== scrollPane1 ========
                        {

                            //---- table1 ----
                            table1.setPreferredScrollableViewportSize(new Dimension(400, 75));
                            table1.setModel(new DefaultTableModel(
                                    new Object[][] {
                                            {null, null, null},
                                            {null, null, null},
                                            {null, null, null},
                                            {null, null, null},
                                    },
                                    new String[] {
                                            "\u7528\u6237\u540d", "\u53e3\u4ee4", "\u89d2\u8272"
                                    }
                            ) {
                                boolean[] columnEditable = new boolean[] {
                                        false, false, false
                                };
                                @Override
                                public boolean isCellEditable(int rowIndex, int columnIndex) {
                                    return columnEditable[columnIndex];
                                }
                            });
                            scrollPane1.setViewportView(table1);
                        }
                        panel12.add(scrollPane1);
                    }
                    panel3.add(panel12);

                    //======== panel13 ========
                    {
                        panel13.setLayout(new FlowLayout());

                        //---- button1 ----
                        button1.setText(bundle.getString("button1.text"));
                        button1.addActionListener(e -> button1ActionPerformed(e));
                        panel13.add(button1);

                        //---- button6 ----
                        button6.setText(bundle.getString("button6.text_2"));
                        button6.addActionListener(e -> button6ActionPerformed(e));
                        panel13.add(button6);
                    }
                    panel3.add(panel13);
                }
                tabbedPane1.addTab(bundle.getString("panel3.tab.title_2"), panel3);
            }
            dialogPane.add(tabbedPane1, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(400, 300);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel buttonBar;
    private JTabbedPane tabbedPane1;
    private JPanel panel6;
    private JPanel panel8;
    private JLabel label4;
    private JTextField textField2;
    private JPanel panel9;
    private JLabel label5;
    private JTextField textField3;
    private JPanel panel10;
    private JLabel label6;
    private JComboBox<String> comboBox3;
    private JPanel panel11;
    private JButton button4;
    private JButton button5;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label1;
    private JComboBox<String> comboBox1;
    private JPanel panel4;
    private JLabel label2;
    private JTextField textField1;
    private JPanel panel5;
    private JLabel label3;
    private JComboBox<String> comboBox2;
    private JPanel panel7;
    private JButton button2;
    private JButton button3;
    private JPanel panel3;
    private JPanel panel12;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel13;
    private JButton button1;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
