import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToggleJLayeredPaneExample {

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Toggle JLayeredPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Create the first panel (panel1)
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.CYAN);
        panel1.add(new JLabel("This is the content of panel1."));

        // Create the second panel (panel2)
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.add(new JLabel("This is the content of panel2."));

        // Create the button
        JButton toggleButton = new JButton("panel2");

        // Create a JLayeredPane to hold the panels
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(300, 300));

        // Add the panels to the JLayeredPane
        layeredPane.add(panel1, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(panel2, JLayeredPane.DEFAULT_LAYER);
        
        // Set bounds for the panels
        panel1.setBounds(0, 0, 300, 300);
        panel2.setBounds(0, 0, 300, 300);

        // Initially set panel2 to be visible and panel1 to be invisible
        panel1.setVisible(false);
        panel2.setVisible(true);

        // Add an ActionListener to the button
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Toggle visibility between the panels
                if (toggleButton.getText().equals("panel2")) {
                    // Hide panel1 and show panel2
                    panel1.setVisible(false);
                    panel2.setVisible(true);
                    // Update button text
                    toggleButton.setText("panel1");
                } else {
                    // Hide panel2 and show panel1
                    panel1.setVisible(true);
                    panel2.setVisible(false);
                    // Update button text
                    toggleButton.setText("panel2");
                }
            }
        });

        // Create a main panel to hold the toggle button and the JLayeredPane
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(toggleButton, BorderLayout.NORTH);
        mainPanel.add(layeredPane, BorderLayout.CENTER);

        // Add the main panel to the frame
        frame.add(mainPanel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
