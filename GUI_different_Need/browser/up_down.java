/*
 * Created by JFormDesigner on Fri Nov 29 20:59:27 CST 2019
 */

package GUI_assignment.GUI_different_Need.browser;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;

/**
 * @author 12
 */
public class up_down extends JFrame {
    public up_down() {
        initComponents();
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button6ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button5ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("GUI_assignment.Frame");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        tabbedPane1 = new JTabbedPane();
        panel2 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        panel4 = new JPanel();
        button2 = new JButton();
        button3 = new JButton();
        panel3 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        panel7 = new JPanel();
        label2 = new JLabel();
        scrollPane2 = new JScrollPane();
        textArea1 = new JTextArea();
        panel8 = new JPanel();
        label3 = new JLabel();
        textField2 = new JTextField();
        button6 = new JButton();
        panel1 = new JPanel();
        button4 = new JButton();
        button5 = new JButton();

        //======== this ========
        setTitle(bundle.getString("this.title_5"));
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

            //======== tabbedPane1 ========
            {

                //======== panel2 ========
                {
                    panel2.setLayout(new BorderLayout());

                    //======== scrollPane1 ========
                    {

                        //---- table1 ----
                        table1.setPreferredScrollableViewportSize(new Dimension(45, 150));
                        table1.setModel(new DefaultTableModel(
                            new Object[][] {
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                            },
                            new String[] {
                                "\u6863\u6848\u53f7", "\u521b\u5efa\u8005", "\u65f6\u95f4", "\u6587\u4ef6\u540d", "\u63cf\u8ff0"
                            }
                        ) {
                            boolean[] columnEditable = new boolean[] {
                                false, false, false, false, false
                            };
                            @Override
                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return columnEditable[columnIndex];
                            }
                        });
                        scrollPane1.setViewportView(table1);
                    }
                    panel2.add(scrollPane1, BorderLayout.CENTER);

                    //======== panel4 ========
                    {
                        panel4.setLayout(new BorderLayout());

                        //---- button2 ----
                        button2.setText(bundle.getString("button2.text"));
                        button2.addActionListener(e -> button2ActionPerformed(e));
                        panel4.add(button2, BorderLayout.WEST);

                        //---- button3 ----
                        button3.setText(bundle.getString("button3.text"));
                        button3.addActionListener(e -> button3ActionPerformed(e));
                        panel4.add(button3, BorderLayout.EAST);
                    }
                    panel2.add(panel4, BorderLayout.SOUTH);
                }
                tabbedPane1.addTab(bundle.getString("panel2.tab.title"), panel2);

                //======== panel3 ========
                {
                    panel3.setLayout(new BorderLayout());

                    //======== panel5 ========
                    {
                        panel5.setLayout(new GridLayout(3, 0));

                        //======== panel6 ========
                        {
                            panel6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 18));

                            //---- label1 ----
                            label1.setText(bundle.getString("label1.text_3"));
                            panel6.add(label1);

                            //---- textField1 ----
                            textField1.setColumns(14);
                            panel6.add(textField1);
                        }
                        panel5.add(panel6);

                        //======== panel7 ========
                        {
                            panel7.setLayout(new FlowLayout());

                            //---- label2 ----
                            label2.setText(bundle.getString("label2.text_3"));
                            panel7.add(label2);

                            //======== scrollPane2 ========
                            {

                                //---- textArea1 ----
                                textArea1.setColumns(30);
                                textArea1.setRows(3);
                                scrollPane2.setViewportView(textArea1);
                            }
                            panel7.add(scrollPane2);
                        }
                        panel5.add(panel7);

                        //======== panel8 ========
                        {
                            panel8.setLayout(new FlowLayout());

                            //---- label3 ----
                            label3.setText(bundle.getString("label3.text_2"));
                            panel8.add(label3);

                            //---- textField2 ----
                            textField2.setColumns(10);
                            panel8.add(textField2);

                            //---- button6 ----
                            button6.setText(bundle.getString("button6.text"));
                            button6.addActionListener(e -> button6ActionPerformed(e));
                            panel8.add(button6);
                        }
                        panel5.add(panel8);
                    }
                    panel3.add(panel5, BorderLayout.NORTH);

                    //======== panel1 ========
                    {
                        panel1.setLayout(new FlowLayout());

                        //---- button4 ----
                        button4.setText(bundle.getString("button4.text"));
                        button4.addActionListener(e -> button4ActionPerformed(e));
                        panel1.add(button4);

                        //---- button5 ----
                        button5.setText(bundle.getString("button5.text"));
                        button5.addActionListener(e -> button5ActionPerformed(e));
                        panel1.add(button5);
                    }
                    panel3.add(panel1, BorderLayout.SOUTH);
                }
                tabbedPane1.addTab(bundle.getString("panel3.tab.title"), panel3);
            }
            dialogPane.add(tabbedPane1, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(455, 325);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTabbedPane tabbedPane1;
    private JPanel panel2;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel4;
    private JButton button2;
    private JButton button3;
    private JPanel panel3;
    private JPanel panel5;
    private JPanel panel6;
    private JLabel label1;
    private JTextField textField1;
    private JPanel panel7;
    private JLabel label2;
    private JScrollPane scrollPane2;
    private JTextArea textArea1;
    private JPanel panel8;
    private JLabel label3;
    private JTextField textField2;
    private JButton button6;
    private JPanel panel1;
    private JButton button4;
    private JButton button5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
