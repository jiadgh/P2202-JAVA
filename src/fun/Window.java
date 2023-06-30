package fun;

import javax.swing.*;
import java.awt.*;

public class Window {


    /**
     * 使窗口居中
     *
     * @param frame 窗口
     *
     */
    public static void  tocenter(JFrame frame){

        int[] position = new int[2];
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double S_width = screenSize.getWidth();
        double S_height = screenSize.getHeight();
        double F_width = frame.getWidth();
        double F_height=frame.getHeight();
        frame.setLocation((int) (S_width/2-F_width/2),(int)(S_height/2-F_height/2));
    }





    public static void tocenter(JPanel register) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double S_width = screenSize.getWidth();
        double S_height = screenSize.getHeight();
        double F_width = register.getWidth();
        double F_height=register.getHeight();
        register.setLocation((int) (S_width/2-F_width/2),(int)(S_height/2-F_height/2));
    }
}
