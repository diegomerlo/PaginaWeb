import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaginaPrincipal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setTitle("Home Page");
            frame.setBounds(600, 250, 529, 381);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            PanelBuscador buscadorPanel = new PanelBuscador();
            PanelFondo fondoPanel = new PanelFondo();

            frame.getContentPane().setLayout(new BorderLayout());
            frame.getContentPane().add(buscadorPanel, BorderLayout.NORTH);
            frame.getContentPane().add(fondoPanel, BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }
}

class PanelBuscador extends JPanel {
    public PanelBuscador() {
        setBackground(new Color(112, 128, 144));
        setLayout(new FlowLayout());

        add(new BotonPersonalizado("Nosotros"));
        add(new BotonPersonalizado("Ubicación"));
        add(new BotonPersonalizado("Modelos"));

        JLabel labelMenuBarras = new JLabel(new ImageIcon(PaginaPrincipal.class.getResource("/Menu1.png")));
        add(labelMenuBarras);

        JLabel labelLogoMini = new JLabel(new ImageIcon(PaginaPrincipal.class.getResource("/LogoChico.png")));
        add(labelLogoMini);
    }
}

class BotonPersonalizado extends JButton {
    public BotonPersonalizado(String text) {
        super(text);
        setFont(new Font("Tahoma", Font.PLAIN, 10));
    }
}

class PanelFondo extends JPanel {
    public PanelFondo() {
        setBackground(new Color(0, 0, 0));
        setLayout(null);

        JLabel labelLogoMax = new JLabel(new ImageIcon(PaginaPrincipal.class.getResource("/LogoGrande.png")));
        labelLogoMax.setBounds(136, 106, 240, 72);
        add(labelLogoMax);

        JLabel labelTitulo = new JLabel("Merlo Molina Rolon Salgueiro");
        labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        labelTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
        labelTitulo.setBounds(159, 263, 194, 19);
        labelTitulo.setForeground(new Color(240, 248, 255));
        add(labelTitulo);
    }
}
