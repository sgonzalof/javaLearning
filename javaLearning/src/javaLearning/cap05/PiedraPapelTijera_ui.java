import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class PiedraPapelTijera_ui extends JFrame {
    private final JButton piedraButton;
    private final JButton papelButton;
    private final JButton tijeraButton;
    private final JLabel resultLabel;
    private final JLabel userChoiceLabel;
    private final JLabel pcChoiceLabel;

    public PiedraPapelTijera_ui() {
        // Set up the frame
        setTitle("Piedra, Papel, Tijera");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Initialize the buttons
        piedraButton = new JButton("PIEDRA");
        papelButton = new JButton("PAPEL");
        tijeraButton = new JButton("TIJERA");

        // Set button sizes
        Dimension buttonSize = new Dimension(100, 100);
        piedraButton.setPreferredSize(buttonSize);
        papelButton.setPreferredSize(buttonSize);
        tijeraButton.setPreferredSize(buttonSize);

        // Set button colors
        piedraButton.setBackground(Color.RED);
        papelButton.setBackground(Color.GREEN);
        tijeraButton.setBackground(Color.BLUE);

        // Set text colors
        piedraButton.setForeground(Color.WHITE);
        tijeraButton.setForeground(Color.WHITE);

        // Add buttons to the panel
        buttonPanel.add(piedraButton);
        buttonPanel.add(papelButton);
        buttonPanel.add(tijeraButton);

        // Add the panel to the frame
        add(buttonPanel);

        // Initialize the labels
        userChoiceLabel = new JLabel("Tu elección: ");
        pcChoiceLabel = new JLabel("Elección del ordenador: ");
        resultLabel = new JLabel("Resultado: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 36)); // Set larger font for resultLabel
        resultLabel.setOpaque(true); // Make the background color visible

        // Add labels to the frame
        add(userChoiceLabel);
        add(pcChoiceLabel);
        add(resultLabel);

        // Add action listeners to the buttons using lambda expressions
        piedraButton.addActionListener(e -> playGame("PIEDRA"));
        papelButton.addActionListener(e -> playGame("PAPEL"));
        tijeraButton.addActionListener(e -> playGame("TIJERA"));
    }

    // Method to play the game
    private void playGame(String userChoice) {
        String pcChoice = handPc();
        userChoiceLabel.setText("Tu elección: " + userChoice);
        pcChoiceLabel.setText("Elección del ordenador: " + pcChoice);
        String result = compareHands(userChoice, pcChoice);
        resultLabel.setText("Resultado: " + result);

        // Set the color of the resultLabel based on the result
        if (result.equals("Ganaste")) {
            resultLabel.setForeground(Color.BLACK);
            resultLabel.setBackground(Color.GREEN);
        } 
        
        else if (result.equals("Perdiste")) {
            resultLabel.setForeground(Color.WHITE);
            resultLabel.setBackground(Color.RED);
        } 
        
        else {
            resultLabel.setForeground(Color.WHITE);
            resultLabel.setBackground(Color.BLUE);
        }
    }

    // Method to get the computer's choice
    public static String handPc() {
        String[] x = {"PIEDRA", "PAPEL", "TIJERA"};
        Random handPc = new Random();
        int n = handPc.nextInt(3);
        String z = x[n];
        return z;
    }

    // Method to compare the user's choice and the computer's choice
    public static String compareHands(String y, String z) {
        if (y.equals(z)) {
            return "Empate";
        } else if (y.equals("PIEDRA") && z.equals("TIJERA") || y.equals("PAPEL") && z.equals("PIEDRA") || y.equals("TIJERA") && z.equals("PAPEL")) {
            return "Ganaste";
        } else {
            return "Perdiste";
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PiedraPapelTijera_ui().setVisible(true));
    }
}