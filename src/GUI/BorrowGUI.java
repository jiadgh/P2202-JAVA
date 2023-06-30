package GUI;

import fun.Window;

import javax.swing.*;

public class BorrowGUI {
    private JPanel borrow;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton 搜索Button;
    private JButton 借阅Button;
    private JButton 加入书单Button;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public static void show() {
        JFrame frame = new JFrame("BorrowGUI");
        frame.setContentPane(new BorrowGUI().borrow);
        frame.pack();
        frame.setVisible(true);
        Window.tocenter(frame);
    }
}
