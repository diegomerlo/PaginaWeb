

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Pagina1 {

	private JFrame frame;
	
	
	public Pagina1() {
		
		

		frame = new JFrame();
		frame.setTitle("Home Page");
		frame.setBounds(600, 250, 529, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Panel_Buscador = new JPanel();
		Panel_Buscador.setBackground(new Color(112, 128, 144));
		Panel_Buscador.setBounds(0, 0, 513, 49);
		frame.getContentPane().add(Panel_Buscador);
		Panel_Buscador.setLayout(null);
		
		JButton Boton_Usuario = new JButton("");
		Boton_Usuario.setBounds(473, 11, 30, 30);
        Boton_Usuario.setBorderPainted(false);
        Boton_Usuario.setContentAreaFilled(false);
        Boton_Usuario.setFocusPainted(false);
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/Usuario .png"));
		Boton_Usuario.setIcon(img5);
		Panel_Buscador.add(Boton_Usuario);
		
		JButton Boton_Modelos = new JButton("Modelos");
		Boton_Modelos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Boton_Modelos.setBounds(369, 18, 89, 23);
		Panel_Buscador.add(Boton_Modelos);
		
		JButton Boton_MenuBarras = new JButton("");
	    Boton_MenuBarras.setBounds(10, 11, 30, 30);
		Boton_MenuBarras.setOpaque(true);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Menu1.png"));
		Boton_MenuBarras.setIcon(img);
		Panel_Buscador.add(Boton_MenuBarras);
		 
		
		 JPopupMenu menuDesplegable = new JPopupMenu();
	        JMenuItem menuItem1 = new JMenuItem("Opción 1");
	        JMenuItem menuItem2 = new JMenuItem("Opción 2");
	        JMenuItem menuItem3 = new JMenuItem("Opción 3");
	        menuDesplegable.add(menuItem1);
	        menuDesplegable.add(menuItem2);
	        menuDesplegable.add(menuItem3);
	        
	        Boton_MenuBarras.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                menuDesplegable.show(Boton_MenuBarras, 0, Boton_MenuBarras.getHeight());
	            }
	        });
		
		
		JPanel Panel_Fondo = new JPanel();
		Panel_Fondo.setBackground(new Color(0, 0, 0));
		Panel_Fondo.setBounds(0, 49, 513, 293);
		frame.getContentPane().add(Panel_Fondo);
		Panel_Fondo.setLayout(null);
		
		JLabel Label_Fondo = new JLabel();
		Label_Fondo.setHorizontalAlignment(SwingConstants.CENTER);
		Label_Fondo.setBounds(0, 0, 513, 293);
		Label_Fondo.setOpaque(true);
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/FondoT.jpg"));
		Label_Fondo.setIcon(img4);
		Panel_Fondo.add(Label_Fondo);


		JLabel lblNewLabel = new JLabel("Merlo Molina Rolon Salgueiro");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(159, 263, 194, 19);
		lblNewLabel.setForeground(new Color(240, 248, 255));
		Label_Fondo.add(lblNewLabel);
		
		JLabel Label_LogoMax = new JLabel("New label");
		Label_LogoMax.setBounds(136, 106, 240, 72);
		Label_LogoMax.setOpaque(true);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/LogoGrande.png"));
		Label_LogoMax.setIcon(img2);
		Label_Fondo.add(Label_LogoMax);
		
		
      
        
        frame.setVisible(true);
	
			
	}
}

   