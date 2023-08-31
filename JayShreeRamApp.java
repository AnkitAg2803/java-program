import javax.swing.*;

public class JayShreeRamApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Jay Shree Ram");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        
        JLabel label = new JLabel("Jay Shree Ram", SwingConstants.CENTER);
        label.setFont(label.getFont().deriveFont(24.0f)); // Increase font size
        
        frame.add(label);
        frame.setVisible(true);
    }
}
