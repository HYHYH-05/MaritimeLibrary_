import javax.swing.*;
import java.awt.*;

public class BlankWindow{
    public static void main(String[] args){
        JFrame w = new JFrame();
        w.setTitle("练习窗口");
        w.setSize(500,500);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setLocationRelativeTo(null);
        JPanel pa = new JPanel();
        pa.setLayout(new GridLayout(7,7));
        for(int i=1;i<=7*7;i++){
            JButton bt = new JButton(String.valueOf(i));
            bt.setBackground(Color.RED);
            bt.addActionListener(e -> {
                System.out.println("Click:"+bt.getText());
            });
            pa.add(bt);
        }
        w.add(pa);
        w.setVisible(true);
    }
}