package Ex;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MainWindow extends JFrame {

    JTextField op1, op2;
    JButton add, sub, mul, div;
    JLabel result;

    public MainWindow(String title){
        super (title);
        this.setBounds(200, 200, 500 , 300);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        op1 = new JTextField(10);
        op2 = new JTextField(10);
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        result = new JLabel(" ");
        this.add(op1);
        this.add(op2);
        this.add(add);
        this.add(sub);
        this.add(mul);
        this.add(div);
        this.add(result);
        // ascoltare il click
        add.addActionListener(this::onAdd);
    }

    private void onAdd(ActionEvent e){   
        try {     
        int v1 = Integer.parseInt(op1.getText());
        int v2 = Integer.parseInt(op2.getText());
        int ris = v1 + v2;
        result.setText("Il risultato è: " + ris);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(this,"Numeri non validi!");
            op1.setText("");
            op2.setText("");
        }
    }

}
