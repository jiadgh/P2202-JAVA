package GUI;

import fun.RegisterFUN;

import javax.swing.*;
import java.awt.event.*;

public class RegisterGUI extends JDialog {
    private JPanel register;
    private JButton buttonnext;
    private JButton buttonCancel;
    private JTextField username;
    private JPasswordField passwordField1;
    private JTextField phonenum;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JPanel question;
    private JPasswordField passwordField2;
    private JPanel basicdata;
    private JTextField textField1;

    public RegisterGUI() {
        setContentPane(register);
        setModal(true);
        getRootPane().setDefaultButton(buttonnext);
        this.setLocationRelativeTo(null);
        question.setVisible(false);
        buttonnext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // 点击 X 时调用 onCancel()
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // 遇到 ESCAPE 时调用 onCancel()
        register.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // 在此处添加您的代码
        int Status=0;

        if(Status==0){
            String user = username.getText();
            String pass1 = String.valueOf(passwordField1.getPassword());
            String pass2 = String.valueOf(passwordField2.getPassword());
            String phone = phonenum.getText();
            String whileRegister =RegisterFUN.Register(user, pass1, pass2, phone);
            if(whileRegister== ""){
                Status=1;
                question.setVisible(true);

            }else {
                JOptionPane.showMessageDialog(this,whileRegister);
            }
        }else {

            dispose();
        }

    }

    private void onCancel() {
        // 必要时在此处添加您的代码
        dispose();
    }

    public static void main(String[] args) {
        RegisterGUI dialog = new RegisterGUI();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }


}
