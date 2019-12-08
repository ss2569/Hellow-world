package GUI_assignment.GUI_copy;

import GUI_assignment.features_code.User;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author 12
 */
public class browser extends JFrame {
    private User obj;//当前对象名
    private String name1;
    public browser(User obj) {
        this.obj = obj;
        name1 = obj.getName();
        initComponents();
    }

    private void menuItem6ActionPerformed(ActionEvent e) {//下载文档
        // TODO add your code here
        down downloadGUI = new down();
        downloadGUI.setVisible(true);

    }

    private void menuItem4ActionPerformed(ActionEvent e) {//个人信息修改
        // TODO add your code here
        //obj作为用户对象传到修改界面中
        String ID = name1;
        changeinfo Changeinfo = new changeinfo(ID,obj,browser.this);
        Changeinfo.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("GUI_assignment.Frame");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        panel1 = new JPanel();
        menuBar1 = new JMenuBar();
        menu2 = new JMenu();
        menu3 = new JMenu();
        menuItem5 = new JMenuItem();
        menuItem6 = new JMenuItem();
        menu1 = new JMenu();
        menuItem4 = new JMenuItem();

        //======== this ========
        setTitle(bundle.getString("this.title"));
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

            //======== panel1 ========
            {
                panel1.setLayout(new FlowLayout());

                //======== menuBar1 ========
                {

                    //======== menu2 ========
                    {
                        menu2.setText(bundle.getString("menu2.text"));
                        menu2.setEnabled(false);
                    }
                    menuBar1.add(menu2);

                    //======== menu3 ========
                    {
                        menu3.setText(bundle.getString("menu3.text"));

                        //---- menuItem5 ----
                        menuItem5.setText(bundle.getString("menuItem5.text"));
                        menuItem5.setEnabled(false);
                        menu3.add(menuItem5);

                        //---- menuItem6 ----
                        menuItem6.setText(bundle.getString("menuItem6.text"));
                        menuItem6.addActionListener(e -> menuItem6ActionPerformed(e));
                        menu3.add(menuItem6);
                    }
                    menuBar1.add(menu3);

                    //======== menu1 ========
                    {
                        menu1.setText(bundle.getString("menu1.text"));

                        //---- menuItem4 ----
                        menuItem4.setText(bundle.getString("menuItem4.text"));
                        menuItem4.addActionListener(e -> menuItem4ActionPerformed(e));
                        menu1.add(menuItem4);
                    }
                    menuBar1.add(menu1);
                }
                panel1.add(menuBar1);
            }
            dialogPane.add(panel1, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        setSize(455, 325);
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel panel1;
    private JMenuBar menuBar1;
    private JMenu menu2;
    private JMenu menu3;
    private JMenuItem menuItem5;
    private JMenuItem menuItem6;
    private JMenu menu1;
    private JMenuItem menuItem4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
