import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class okno extends JFrame {
    private JButton przycisk1, przycisk2, przycisk3, przycisk4;

    public okno() {
        setTitle("Kolorowe Przyciski");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(2, 2));

        przycisk1 = new JButton("Czerwony");
        przycisk2 = new JButton("Zielony");
        przycisk3 = new JButton("Niebieski");
        przycisk4 = new JButton("Żółty");

        przycisk1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.RED);
            }
        });

        przycisk2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.GREEN);
            }
        });

        przycisk3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.BLUE);
            }
        });

        przycisk4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.YELLOW);
            }
        });

        add(przycisk1);
        add(przycisk2);
        add(przycisk3);
        add(przycisk4);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new okno();
            }
        });
    }
}
