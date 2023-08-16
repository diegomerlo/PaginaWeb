import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JPanel imagePanel;
    private int currentIndex = 0;
    private String[] imagePaths = {"./Aaudi.png", "./LogoChico.jpg", "./LogoGrande.jpg"};

    public Ventana() {
        setTitle("Image Carousel");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imagePanel = new JPanel(new FlowLayout()); // Cambio de diseño a FlowLayout
        add(imagePanel, BorderLayout.CENTER);

        JButton prevButton = new JButton("Previous");
        JButton nextButton = new JButton("Next");

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showImage(currentIndex - 1);
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showImage(currentIndex + 1);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        add(buttonPanel, BorderLayout.SOUTH);

        showImage(currentIndex);
    }

    private void showImage(int index) {
        if (index < 0) {
            index = imagePaths.length - 1;
        } else if (index >= imagePaths.length) {
            index = 0;
        }
        currentIndex = index;

        ImageIcon imageIcon = new ImageIcon(imagePaths[currentIndex]);
        Image scaledImage = imageIcon.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        imagePanel.removeAll();
        imagePanel.add(new JLabel(new ImageIcon(scaledImage)));
        imagePanel.revalidate();
        imagePanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
}
