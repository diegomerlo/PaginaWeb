package logg;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Pagina2 {
		
	
private JFrame frame2;
		public Pagina2(int id_u) {
			Color Gris = new Color(112, 128, 144);
			
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
			
		
			JButton Boton_Usuario = new JButton("");
			Boton_Usuario.setBounds(473, 11, 30, 30);
            Boton_Usuario.setBorderPainted(false);
            Boton_Usuario.setContentAreaFilled(false);
            Boton_Usuario.setFocusPainted(false);
			ImageIcon img5 = new ImageIcon(this.getClass().getResource("/Usuario .png"));
			Boton_Usuario.setIcon(img5);
			Panel_Buscador.add(Boton_Usuario);
		
			JButton Boton_Modelos = new JButton("Modelos");
			Boton_Modelos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					PaginaPrincipal.main(null);
					
					frame2.setVisible(false);
				}
			});
			Boton_Modelos.setFont(new Font("Tahoma", Font.PLAIN, 15));  //aca
			Boton_Modelos.setBounds(379,12, 89, 23);  //aca
			Boton_Modelos.setBorderPainted(false); // aca
			Boton_Modelos.setContentAreaFilled(false); //aca
			Boton_Modelos.setFocusPainted(false); //aca
			Panel_Buscador.add(Boton_Modelos);
			
			JButton Boton_MenuBarras = new JButton("");
		    Boton_MenuBarras.setBounds(10, 11, 30, 30);
			Boton_MenuBarras.setOpaque(true);
			Boton_MenuBarras.setBorderPainted(false); //aca
			Boton_MenuBarras.setContentAreaFilled(false); //aca
			Boton_MenuBarras.setFocusPainted(false); //aca
			ImageIcon img = new ImageIcon(this.getClass().getResource("/Menu1.png"));
			Boton_MenuBarras.setIcon(img);
			Panel_Buscador.add(Boton_MenuBarras);
			
			 JPopupMenu menuDesplegable = new JPopupMenu();
			 
		        JMenuItem menuItem1 = new JMenuItem("Opción 1");
		        JMenuItem menuItem2 = new JMenuItem("Opción 2");
		        JMenuItem menuItem3 = new JMenuItem("Opción 3");
		        menuDesplegable.setBackground(Gris); //aca
		        menuItem1.setBackground(Gris); //aca
		        menuItem1.setForeground(Color.WHITE); //aca
		        menuItem2.setBackground(Gris); //aca
		        menuItem2.setForeground(Color.WHITE); //aca
		        menuItem3.setBackground(Gris);   //aca
		        menuItem3.setForeground(Color.WHITE); //aca
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
			frame2.getContentPane().add(Panel_Fondo);
			Panel_Fondo.setLayout(null);
			
			JLabel Label_Fondo = new JLabel();
			Label_Fondo.setHorizontalAlignment(SwingConstants.CENTER);
			Label_Fondo.setBounds(0, 0, 513, 300);
			Label_Fondo.setOpaque(true);
			ImageIcon img4 = new ImageIcon(this.getClass().getResource("/Fondo2.png"));
			Label_Fondo.setIcon(img4);
			Panel_Fondo.add(Label_Fondo);
			
			
			JLabel Label_LogoMax = new JLabel("New label");
			Label_LogoMax.setBounds(136, 40, 240, 72);
			Label_LogoMax.setOpaque(true);
			ImageIcon img2 = new ImageIcon(this.getClass().getResource("/LogoGrande.png"));
			Label_LogoMax.setIcon(img2);
			Label_Fondo.add(Label_LogoMax);
			
			JButton Boton_Explorar = new JButton("Encontra el auto que queres");
			Boton_Explorar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					frame2.setVisible(false);
					
					Pagina3.main(id_u);
				}
			});
			Boton_Explorar.setBackground(new Color(255, 255, 255));
			Boton_Explorar.setForeground(new Color(0, 0, 0));
			Label_Fondo.add(Boton_Explorar);
			Boton_Explorar .setFont(new Font("Tahoma", Font.PLAIN, 10));
			Boton_Explorar .setBounds(180, 120, 170, 23); 
		
				JLabel lblNewLabel = new JLabel("Merlo Molina Rolon Salgueiro");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblNewLabel.setBounds(164, 248, 194, 19);
				lblNewLabel.setForeground(new Color(240, 248, 255));
				Label_Fondo.add(lblNewLabel);
				
	
	        
	        frame2.setVisible(true);
		
				
		}
	}


