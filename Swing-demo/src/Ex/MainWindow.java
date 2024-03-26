package Ex;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MainWindow extends JFrame {

    JTextField op1, op2;
    JButton add, sub, sum, div;
    JLabel result;

    public MainWindow(String title){
        super (title);
        this.setBounds(200, 200, 300 , 200);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
