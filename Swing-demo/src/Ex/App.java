package Ex;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import java.awt.*;

public class App {
    public static void main(String[] args) {        

        JFrame finestra = new JFrame("Demo Swing");
        finestra.setSize(800, 600);
        finestra.setLocation(450, 200);
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        finestra.setLayout(fl);
        // finestra.setResizable(false); // non posso ingrandirla o rimpicciolirla
        JLabel label = new JLabel("Hello Swing"); 
        finestra.add(label);
        JLabel label1 = new JLabel("from TSP");
        finestra.add(label1);
        JButton btn = new JButton("ClickMe"); // aggiungo un bottone
        finestra.add(btn);
        finestra.setVisible(true);
        finestra.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // il main termina ma il sottoprogramma non termina
        
    }
}
