package GUI_assignment.GUI_copy;

import GUI_assignment.features_code.Dataprocessing;
import GUI_assignment.features_code.User;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;

/**
 * @author 12
 */
public class up extends JFrame {
    private User obj;
    private String filename;
    private String s1 = "H:\\新桌面\\test folder\\upload\\";

    File secfile;
    public up(User obj) {
        this.obj = obj;
        initComponents();
    }

    private void button6ActionPerformed(ActionEvent e) {//打开文件预览GUI
        // TODO add your code here
        JFileChooser chooser = new JFileChooser();
        int operation = chooser.showOpenDialog(up.this);
        if (operation == JFileChooser.APPROVE_OPTION){
             secfile = chooser.getSelectedFile();
            filename = secfile.getName();
            textField2.setText(filename);
        }

    }

    private void button4ActionPerformed(ActionEvent e) {//上传文件
        // TODO add your code here

        String fileID = textField1.getText();
        String filedesc = textArea1.getText();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String user = obj.getName();
        if(Dataprocessing.insertDoc(fileID,user,timestamp,filedesc,filename)){
            JOptionPane.showMessageDialog(up.this,"上传成功");
            FileReader fr = null;
            FileWriter fw = null;
            try {
                int n;
                char[] bj = new char[1024];
                fr = new FileReader(secfile);
                fw = new FileWriter(s1+filename);
                while ((n = fr.read(bj)) != -1) {
                    fw.write(bj, 0, n);
                }
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
            this.setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(up.this,"文件编号错误","文件上传失败",
                    JOptionPane.ERROR_MESSAGE);
            textField1.setText("");
        }



    }

    private void button5ActionPerformed(ActionEvent e) {//取消选择
        // TODO add your code here
        this.setVisible(false);
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("GUI_assignment.Frame");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        tabbedPane1 = new JTabbedPane();
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
