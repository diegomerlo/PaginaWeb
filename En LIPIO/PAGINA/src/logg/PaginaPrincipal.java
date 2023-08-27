/*
 panel Buscador --> Barra horizontal gris arriba
 panel Fondo --> fondo negro debajo de la barra
 
 Botones --> se llaman igual que el texto que contienen
 Labels --> se llaman igual que la imagen que contienen, o aunque no se llamen exactamente igual hacen referencia al icono 
 
 imagePanel y imageLabel, son los que estan en el carrusel

Arrays de textos e images tambien son para el carrusel
 */
package logg;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel; 
import javax.swing.JPanel;
import javax.swing.BorderFactory;


public class PaginaPrincipal {

	private JFrame frame;
	
	
    private JPanel imagePanel;
    private JLabel imageLabel;
    private JLabel Label_Autos1;
    private JLabel Label_Autos2;
    private JLabel Label_Autos3;
    
 
    private int IndiceDeImagen = 0;
    private int IndiceDeTexto = 0;
    
    
 
  private String[] textos = {"l 488 GTB está propulsado por el nuevo motor V8 de 3902 centímetros cúbicos que entrega 670CV a 8.000 vueltas y que ofrece un par máximo de 760 Nm", "Acelera de 0 a 200 km/h en 8,3 segundos y es capaz de realizar una vuelta rápida al trazado de Fiorano en un minuto y veintitrés segundos", "El fin de la era  de los motores atmosféricos y el comienzo de un tiempo en el que todos sus motores V8 estarán sobrealimentados", "Texto 4", "Texto 5", "Texto 6", "Texto 7", "Texto 8", "Texto 9", "Texto 10", "Texto 11", "Texto 12"};
  
  
    private Image[] images = {
    	new ImageIcon(this.getClass().getResource("/car1.png")).getImage(),
        new ImageIcon(this.getClass().getResource("/car2.png")).getImage(),
        new ImageIcon(this.getClass().getResource("/car3.png")).getImage(),
        new ImageIcon(this.getClass().getResource("/car4.png")).getImage()
   
    };
    
    
    
    
    
 
	public PaginaPrincipal() {
		Color Gris = new Color(112, 128, 144);
	
		
		
		
		
		frame = new JFrame();
		frame.setTitle("Home Page");
		frame.setBounds(600, 250, 529, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Panel_Buscador = new JPanel();
		Panel_Buscador.setBackground(Gris);
		Panel_Buscador.setBounds(0, 0, 513, 49);
		frame.getContentPane().add(Panel_Buscador);
		Panel_Buscador.setLayout(null);
		

		
		JButton Boton_Modelos = new JButton("Modelos");
		Boton_Modelos.setFont(new Font("Tahoma", Font.PLAIN, 15));  
		Boton_Modelos.setBounds(379,12, 89, 23);  
		Boton_Modelos.setBorderPainted(false); 
		Boton_Modelos.setContentAreaFilled(false); 
		Boton_Modelos.setFocusPainted(false); 
		Panel_Buscador.add(Boton_Modelos);
		
		JButton Boton_Usuario = new JButton("");
		Boton_Usuario.setBounds(473, 11, 30, 30);
        Boton_Usuario.setBorderPainted(false);
        Boton_Usuario.setContentAreaFilled(false);
        Boton_Usuario.setFocusPainted(false);
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("/Usuario .png")); //Llamo al ImageIcon de la carpeta img
		Image Scaledimg1 = img1.getImage().getScaledInstance(Boton_Usuario.getWidth(), Boton_Usuario.getHeight(), Image.SCALE_SMOOTH); // Convierto ese ImageIcon en Image y lo escalo
		ImageIcon Scaledimg1ToIcon = new ImageIcon(Scaledimg1); //Hago que esa Image escalada vuelva a ser ImageIcon
		Boton_Usuario.setIcon(Scaledimg1ToIcon);
		Panel_Buscador.add(Boton_Usuario);
		
		
		
		
		
		JButton Boton_MenuBarras = new JButton("");
		Boton_MenuBarras.setBounds(10, 11, 30, 30);
		Boton_MenuBarras.setOpaque(true);
		Boton_MenuBarras.setBorderPainted(false); 
		Boton_MenuBarras.setContentAreaFilled(false); 
		Boton_MenuBarras.setFocusPainted(false); 
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Menu1.png"));
		Image Scaledimg2 = img2.getImage().getScaledInstance(Boton_MenuBarras.getWidth(), Boton_MenuBarras.getHeight(), Image.SCALE_SMOOTH); 
		ImageIcon Scaledimg2ToIcon = new ImageIcon(Scaledimg2); 
		Boton_MenuBarras.setIcon(Scaledimg2ToIcon);
		Panel_Buscador.add(Boton_MenuBarras);
		
		
		JPopupMenu menuDesplegable = new JPopupMenu();
        JMenuItem menuItem1 = new JMenuItem("Opción 1");
        JMenuItem menuItem2 = new JMenuItem("Opción 2");
        JMenuItem menuItem3 = new JMenuItem("Opción 3");
        menuDesplegable.setBackground(Gris); 
        menuItem1.setBackground(Gris); 
        menuItem1.setForeground(Color.WHITE); 
        menuItem2.setBackground(Gris); 
        menuItem2.setForeground(Color.WHITE);
        menuItem3.setBackground(Gris);   
        menuItem3.setForeground(Color.WHITE); 
        menuDesplegable.add(menuItem1);
        menuDesplegable.add(menuItem2);
        menuDesplegable.add(menuItem3);
        
        Boton_MenuBarras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuDesplegable.show(Boton_MenuBarras, 0, Boton_MenuBarras.getHeight());
            }
        });
		
		
		
		JLabel Label_LogoMini = new JLabel("");
		Label_LogoMini.setBounds(50, 11, 86, 26);
		Label_LogoMini.setOpaque(true);
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/LogoChico.png"));
		Image Scaledimg3 = img3.getImage().getScaledInstance(Label_LogoMini.getWidth(), Label_LogoMini.getHeight(), Image.SCALE_SMOOTH);  
		ImageIcon Scaledimg3ToIcon = new ImageIcon(Scaledimg3); 
		Label_LogoMini.setIcon(Scaledimg3ToIcon);
		Panel_Buscador.add(Label_LogoMini);
		
		
	
		
		JPanel Panel_Fondo = new JPanel();
		Panel_Fondo.setBackground(new Color(0, 0, 0));
		Panel_Fondo.setBounds(0, 49, 513, 293);
		frame.getContentPane().add(Panel_Fondo);
		Panel_Fondo.setLayout(null);
         
		
		
		
		imagePanel = new JPanel();
        imagePanel.setLayout(null);
        Panel_Fondo.add(imagePanel);
        imagePanel.setOpaque(false);
        imagePanel.setBounds(147, 11, 202, 112);	                
                imageLabel = new JLabel();
                imageLabel.setBounds(0, 0, 202, 112);
                imagePanel.add(imageLabel);
		 
                
        Image Imagen_AutoEscalado1 =  images[0].getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
        images[0] = Imagen_AutoEscalado1;
        
        Image Imagen_AutoEscalado2 =  images[1].getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
        images[1] = Imagen_AutoEscalado2;
        
        Image Imagen_AutoEscalado3 =  images[2].getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
        images[2] = Imagen_AutoEscalado3;
        
        Image Imagen_AutoEscalado4 =  images[3].getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
        images[3] = Imagen_AutoEscalado4;
        
  
	               
	                
	        JButton previousButton = new JButton("");
	        previousButton.setBounds(117, 54, 31, 33);
	        previousButton.setBorderPainted(false);
	        previousButton.setContentAreaFilled(false);
	        previousButton.setFocusPainted(false);
	        Panel_Fondo.add(previousButton);
	        
	        
	                JButton nextButton = new JButton("");
	                nextButton.setBounds(349, 48, 31, 33);
	                Panel_Fondo.add(nextButton);
	               
	                nextButton.setBorderPainted(false);
	                nextButton.setContentAreaFilled(false);
	                nextButton.setFocusPainted(false);
	                
	                
	                ImageIcon img4 = new ImageIcon(this.getClass().getResource("/FlechaI.png"));
	        		Image Scaledimg4 = img4.getImage().getScaledInstance(previousButton.getWidth(), previousButton.getHeight(), Image.SCALE_SMOOTH);  
	        		ImageIcon Scaledimg4ToIcon = new ImageIcon(Scaledimg4); 
	        		previousButton.setIcon(Scaledimg4ToIcon);
	        		
	        		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/FlechaD.png"));
	     			Image Scaledimg5 = img5.getImage().getScaledInstance(nextButton.getWidth(), nextButton.getHeight(), Image.SCALE_SMOOTH);  
	     			ImageIcon Scaledimg5ToIcon = new ImageIcon(Scaledimg5); 
	     			nextButton.setIcon(Scaledimg5ToIcon);
	     			
	                Label_Autos1 = new JLabel("");
	                Label_Autos1.setVerticalAlignment(SwingConstants.TOP);
	                Label_Autos1.setHorizontalAlignment(SwingConstants.CENTER);
	                Label_Autos1.setFont(new Font("Tahoma", Font.PLAIN, 12));
	                Label_Autos1.setBounds(60, 134, 115, 148);
	                Label_Autos1.setForeground(Color.WHITE);
	                Label_Autos1.setBackground(Gris);
	                Label_Autos1.setOpaque(true);
	                Label_Autos1.setBorder(BorderFactory.createEmptyBorder(0, 4, 0, 4)); // Para crearle "Padding" a los bordes, TOP RIGHT BOTTOM LEFT
	           
	        		Panel_Fondo.add(Label_Autos1);
	        		
	        	
	        		
	        		
	        		Label_Autos2 = new JLabel("");
	        		Label_Autos2.setHorizontalAlignment(SwingConstants.CENTER);
	        		Label_Autos2.setVerticalAlignment(SwingConstants.TOP);
	        		Label_Autos2.setForeground(new Color(240, 248, 255));
	        		Label_Autos2.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        		Label_Autos2.setBounds(194, 134, 115, 148);
	        		Label_Autos2.setBackground(Gris);
		            Label_Autos2.setOpaque(true);
		            Label_Autos2.setBorder(BorderFactory.createEmptyBorder(0, 4, 0, 4)); 
	                Panel_Fondo.add(Label_Autos2);
	             
	        		
	        		
	                Label_Autos3 = new JLabel("");
	                Label_Autos3.setVerticalAlignment(SwingConstants.TOP);
	                Label_Autos3.setHorizontalAlignment(JLabel.CENTER);
	                Label_Autos3.setForeground(new Color(240, 248, 255));
	                Label_Autos3.setFont(new Font("Tahoma", Font.PLAIN, 12));
	                Label_Autos3.setBounds(328, 134, 115, 148);
	                Label_Autos3.setBackground(Gris);
	                Label_Autos3.setOpaque(true);
	                Label_Autos3.setBorder(BorderFactory.createEmptyBorder(0, 4, 0, 4));
	                Panel_Fondo.add(Label_Autos3);
	                
	               
	           
	                
	                JLabel Label_FondoNegro = new JLabel("");
	                Label_FondoNegro.setBounds(0, 49, 513, 293);
	                frame.getContentPane().add(Label_FondoNegro);
	                ImageIcon img6 = new ImageIcon(this.getClass().getResource("/Fondo2.jpg"));
	        		Image Scaledimg6 = img6.getImage().getScaledInstance(Label_FondoNegro.getWidth(), Label_FondoNegro.getHeight(), Image.SCALE_SMOOTH); // Convierto ese ImageIcon en Image y lo escalo
	        		ImageIcon Scaledimg6ToIcon = new ImageIcon(Scaledimg6); //Hago que esa Image escalada vuelva a ser ImageIcon          
	        		Label_FondoNegro.setIcon(Scaledimg6ToIcon);
	                Panel_Fondo.setOpaque(false);
	                
	                
	                
	                
	                nextButton.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        nextImage();
	                    }
	                });
	        previousButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                previousImage();
	            }
	        });

	        
	 

 
	        
        frame.setVisible(true);
	
		

	
	}
	
	
	
	
	
	 private void previousImage() {
	        if (IndiceDeImagen > 0) {
	        	IndiceDeImagen--;
	        	IndiceDeTexto= IndiceDeTexto -3;
	            
	        } else {
	        	IndiceDeImagen = images.length - 1;
	        	IndiceDeTexto= IndiceDeImagen+6;
	           
	        }
	        updateImage();
	    }

	    private void nextImage() {
	        if (IndiceDeImagen < images.length - 1) {
	        	IndiceDeImagen++;
	        	IndiceDeTexto=IndiceDeTexto + 3;
	           
	        } else {
	        	IndiceDeImagen = 0;
	        	IndiceDeTexto=0;
	        }
	        updateImage();
	    }

	    private void updateImage() {
	        imageLabel.setIcon(new ImageIcon(images[IndiceDeImagen]));
	       
	        Label_Autos1.setText(textos[IndiceDeTexto]);
	        Label_Autos1.setText("<html>" + Label_Autos1.getText() + "</html>");
	        Label_Autos2.setText(textos[IndiceDeTexto+1]);
	        Label_Autos2.setText("<html>" + Label_Autos2.getText() + "</html>");
	        Label_Autos3.setText(textos[IndiceDeTexto+2]);
	        Label_Autos3.setText("<html>" + Label_Autos3.getText() + "</html>");
	        	
	        
	        	
	        	
	        }
            
	  
	    

	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	            	new PaginaPrincipal().updateImage();
	              
	            }
	        });
	    }
}


   