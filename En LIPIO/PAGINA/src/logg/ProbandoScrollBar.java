package logg;
import javax.swing.*;
import java.awt.*;

public class ProbandoScrollBar {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Ejemplo de Scrollbar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Agregar contenido al panel
        for (int i = 0; i < 50; i++) {
            contentPanel.add(new JLabel("Elemento " + (i + 1)), gbc);
            gbc.gridy++;
        }

        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JButton button = new JButton("Botón al final");

        gbc.gridy++;
        gbc.weighty = 0;
        gbc.anchor = GridBagConstraints.PAGE_END;
        contentPanel.add(button, gbc);

        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
