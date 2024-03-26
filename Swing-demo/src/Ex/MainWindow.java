package Ex;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.function.ToDoubleBiFunction;

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

    public MainWindow(String title) {
        super(title);
        this.setBounds(1300, 200, 500, 300);
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
        add.addActionListener(v -> this.calculate((a, b) -> a + b));
        sub.addActionListener(v -> this.calculate((a, b) -> a - b));
        mul.addActionListener(v -> this.calculate((a, b) -> a * b));
        div.addActionListener(v -> this.calculate((a, b) -> (double) a / (double) b));
    }

    private void onAdd(ActionEvent e) {
        int res = converInput((op1)) + converInput((op2));
        result.setText("Il Risultato è: " + res);
    }


    private void onSub(ActionEvent e) {
        int res = converInput((op1)) - converInput((op2));
        result.setText("Il Risultato è: " + res);
    }
   
    private int converInput(JTextField input){
        try{
            return Integer.parseInt(input.getText());
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Numeri non validi!");
            input.setText("");
            return 0;

}
