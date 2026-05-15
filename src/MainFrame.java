import javax.swing.*;
import java.awt.*;

public class MainFrame{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setTitle("海风座席 - 图书馆预约系统");
        frame.setSize(900,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JPanel panel =new JPanel();
        panel.setLayout(new GridLayout(8,6));
        for(int i=1;i<=48;i++){
            JButton btn =new JButton("座"+i);
            btn.setBackground(Color.GREEN);
            btn.addActionListener(e -> {
                System.out.println("预约："+btn.getText());
            });
            panel.add(btn);
        }
        frame.add(panel);
        frame.setVisible(true);
    }
}