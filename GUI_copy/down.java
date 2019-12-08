package GUI_assignment.GUI_copy;

import GUI_assignment.features_code.Dataprocessing;
import GUI_assignment.features_code.Doc;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;

/**
 * @author 12
 */
public class down extends JFrame {
    private String s1 = "H:\\新桌面\\test folder\\upload\\";

    public down() {
        initComponents();
        createarry();
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.setVisible(false);
    }

    private void button2ActionPerformed(ActionEvent e) {//下载文件
        // TODO add your code here
        //获取表格选中项
        DefaultTableModel tableModel = (DefaultTableModel) table1.getModel();
        int selectedRowIndex = table1.getSelectedRow();
        String Filename = s1 + tableModel.getValueAt(selectedRowIndex, 3);
        JFileChooser chooser = new JFileChooser();
        int operation = chooser.showSaveDialog(down.this);
        File bcfile = chooser.getSelectedFile();//获取保存的新建文件对象
        //保存处理
        if (operation == JFileChooser.APPROVE_OPTION) {
            FileReader fr = null;
            FileWriter fw = null;
            try {
                int n;
                char[] bj = new char[1024];
                fr = new FileReader(Filename);
                fw = new FileWriter(bcfile);
                while ((n = fr.read(bj)) != -1) {
                    fw.write(bj, 0, n);
                }
                JOptionPane.showMessageDialog(chooser, "下载成功", "提示", JOptionPane.PLAIN_MESSAGE);
            } catch (IOException e1) {
                System.out.println("文件下载失败");
            } finally {
                try {
                    if (fr != null)
                        fr.close();
                } catch (IOException e1) {
                    System.out.println("文件输入流关闭失败");
                }
                try {
                    if (fw != null)
                        fw.close();
                } catch (IOException e1) {
                    System.out.println("文件输出流关闭失败");
                }
            }
        }
    }

    private void createarry() {
        Enumeration<Doc> e = Dataprocessing.getAllDocs();
        DefaultTableModel tableModel = (DefaultTableModel) table1.getModel();
        tableModel.setRowCount(0);
        Doc one = null;
        while (e.hasMoreElements()) {
            one = e.nextElement();
            String[] arr = new String[5];
            arr[0] = one.getID();
            arr[1] = one.getCreator();
            arr[2] = String.valueOf(one.getTimestamp());
            arr[3] = one.getFilename();
            arr[4] = one.getDescription();
            tableModel.addRow(arr);
        }
        table1.invalidate();
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
                                new Object[][]{
                                        {null, null, null, null, null},
                                        {null, null, null, null, null},
                                        {null, null, null, null, null},
                                        {null, null, null, null, null},
                                        {null, null, null, null, null},
                                        {null, null, null, null, null},
                                        {null, null, null, null, null},
                                },
                                new String[]{
                                        "\u6863\u6848\u53f7", "\u521b\u5efa\u8005", "\u65f6\u95f4", "\u6587\u4ef6\u540d", "\u63cf\u8ff0"
                                }
                        ) {
                            boolean[] columnEditable = new boolean[]{
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
// JFormDesigner - End of variables declaration  //GEN-END:variables
}
