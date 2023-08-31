import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JaiShreeRamGUI extends JFrame implements ActionListener {

    private int x = 20;
    private Timer timer;

    public JaiShreeRamGUI() {
        super("जय श्री राम");
        setSize(800, 300); // Adjusted the size for better visibility
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setResizable(false);
        setVisible(true);

        timer = new Timer(50, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        Font font = new Font("Arial", Font.BOLD, 80); // Changed the font to Arial
        g.setFont(font);
        g.drawString("जय श्री राम", x, 150);
    }

    public void actionPerformed(ActionEvent e) {
        if (x < getWidth()) {
            x += 5;
        } else {
            x = -500; // Adjusted the starting position
        }
        repaint();
    }

    public static void main(String[] args) {
        new JaiShreeRamGUI();
    }
}
