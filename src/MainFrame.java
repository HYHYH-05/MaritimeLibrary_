import javax.swing.*;

public class MainFrame {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("海风座席 - 海事图书馆预约系统");
        frame.setSize(900,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //关闭屏幕时结束程序
        frame.setLocationRelativeTo(null);                       //屏幕居中显示
        frame.setVisible(true);                                  //屏幕显示
    }
}
