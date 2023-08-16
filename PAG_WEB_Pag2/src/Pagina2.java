
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Pagina2 {
		
	
private JFrame frame2;
		public Pagina2() {
			
			

			frame2 = new JFrame();
			frame2.setTitle("Home Page");
			frame2.setBounds(600, 250, 529, 381);
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame2.getContentPane().setLayout(null);
			
			JPanel Panel_Buscador = new JPanel();
			Panel_Buscador.setBackground(new Color(112, 128, 144));
			Panel_Buscador.setBounds(0, 0, 513, 49);
			frame2.getContentPane().add(Panel_Buscador);
			Panel_Buscador.setLayout(null);
			
			JButton Boton_Nosotros = new JButton("Nosotros\r\n");
			Boton_Nosotros.setFont(new Font("Tahoma", Font.PLAIN, 10));
			Boton_Nosotros.setBounds(424, 11, 79, 23);
			Panel_Buscador.add(Boton_Nosotros);
			
			JButton Boton_Ubicacion = new JButton("Ubicación");
			Boton_Ubicacion.setFont(new Font("Tahoma", Font.PLAIN, 10));
			Boton_Ubicacion.setBounds(325, 11, 89, 23);
			Panel_Buscador.add(Boton_Ubicacion);
			
			JButton Boton_Modelos = new JButton("Modelos");
			Boton_Modelos.setFont(new Font("Tahoma", Font.PLAIN, 10));
			Boton_Modelos.setBounds(226, 11, 89, 23);
			Panel_Buscador.add(Boton_Modelos);
			
			JButton Boton_MenuBarras = new JButton("");
		    Boton_MenuBarras.setBounds(10, 11, 30, 30);
			Boton_MenuBarras.setOpaque(true);
			ImageIcon img = new ImageIcon(this.getClass().getResource("/Menu1.png"));
			Boton_MenuBarras.setIcon(img);
			Panel_Buscador.add(Boton_MenuBarras);
			
			JLabel Label_LogoMini = new JLabel("New label");
			Label_LogoMini.setBounds(50, 11, 86, 26);
			Label_LogoMini.setOpaque(true);
			ImageIcon img3 = new ImageIcon(this.getClass().getResource("/LogoChico.png"));
			Label_LogoMini.setIcon(img3);
			Panel_Buscador.add(Label_LogoMini);
			
			JPanel Panel_Fondo = new JPanel();
			Panel_Fondo.setBackground(new Color(0, 0, 0));
			Panel_Fondo.setBounds(0, 49, 513, 293);
			frame2.getContentPane().add(Panel_Fondo);
			Panel_Fondo.setLayout(null);
			
			JLabel Label_Fondo = new JLabel();
			Label_Fondo.setHorizontalAlignment(SwingConstants.CENTER);
			Label_Fondo.setBounds(0, 0, 513, 293);
			Label_Fondo.setOpaque(true);
			ImageIcon img4 = new ImageIcon(this.getClass().getResource("/Fondo2.png"));
			Label_Fondo.setIcon(img4);
			Panel_Fondo.add(Label_Fondo);
			
			
	
			JButton Boton_Explorar = new JButton("Expl orar");
			Boton_Explorar.setBackground(new Color(255, 255, 255));
			Boton_Explorar.setForeground(new Color(0, 0, 0));
			Label_Fondo.add(Boton_Explorar);
			Boton_Explorar .setFont(new Font("Tahoma", Font.PLAIN, 10));
			Boton_Explorar .setBounds(210, 120, 89, 23);
		
				JLabel lblNewLabel = new JLabel("Merlo Molina Rolon Salgueiro");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblNewLabel.setBounds(164, 248, 194, 19);
				lblNewLabel.setForeground(new Color(240, 248, 255));
				Label_Fondo.add(lblNewLabel);
				
					JLabel lblNewLabel_4 = new JLabel("Encontra el auto que queres");
					Label_Fondo.add(lblNewLabel_4);
					lblNewLabel_4.setBackground(new Color(255, 255, 255));
					lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
					lblNewLabel_4.setForeground(new Color(240, 248, 255));
					lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
					lblNewLabel_4.setBounds(155, 60, 200, 19);
	
	        
	        frame2.setVisible(true);
		
				
		}
	}


