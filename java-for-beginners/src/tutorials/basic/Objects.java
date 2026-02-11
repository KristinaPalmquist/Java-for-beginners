package tutorials.basic;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Objects {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("My Window");
        window.setSize(800, 600);
        

        JLabel label = new JLabel();
        label.setText("Hello, World!");


        window.add(label);
        // window.setVisible(true);

        String s = "hi! how are you today?";
        System.out.println(s.split(" ")[0]);

    }
}
