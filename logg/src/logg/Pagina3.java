package logg;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pagina3 {

	public static void main(String[] args) {
		
		Pagina3 pagina = new Pagina3();
		
	
		JFrame frame3 = new JFrame();
		frame3.setTitle("Home Page");
		frame3.setBounds(600, 250, 529, 382);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		JPanel Panel_Buscador = new JPanel();
		Panel_Buscador.setBackground(new Color(112, 128, 144));
		Panel_Buscador.setBounds(0, 0, 513, 49);
		frame3.getContentPane().add(Panel_Buscador);
		Panel_Buscador.setLayout(null);
		
		JButton Boton_Modelos = new JButton("Modelos");
		Boton_Modelos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Boton_Modelos.setBounds(415, 11, 89, 23);
		Panel_Buscador.add(Boton_Modelos);
		
		ImageIcon eyeIcon = new ImageIcon("E:\\\\5TO 2DA\\\\LPOO\\\\08-09-2023 Página Web HTML\\\\PAG_WEB_pag3\\/IMAGEN3/Menu1.png");
        Image image = eyeIcon.getImage();
        Image scaledImage = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon scaledEyeIcon = new ImageIcon(scaledImage);
		
		JButton Boton_MenuBarras = new JButton("");
	    Boton_MenuBarras.setBounds(10, 11, 30, 30);
		Boton_MenuBarras.setOpaque(true);
		Boton_MenuBarras.setIcon(scaledEyeIcon);
		Panel_Buscador.add(Boton_MenuBarras);
		
		ImageIcon eyeIcon2 = new ImageIcon("E:\\\\5TO 2DA\\\\LPOO\\\\08-09-2023 Página Web HTML\\\\PAG_WEB_pag3\\\\IMAGEN3\\\\LogoChico.png");
        Image image2 = eyeIcon2.getImage();
        Image scaledImage2 = image2.getScaledInstance(86, 26, Image.SCALE_SMOOTH);
        ImageIcon scaledEyeIcon2 = new ImageIcon(scaledImage2);
		
		JLabel Label_LogoMini = new JLabel("");
		Label_LogoMini.setBounds(50, 11, 86, 26);
		Label_LogoMini.setOpaque(true);
		Label_LogoMini.setIcon(scaledEyeIcon2);
		Panel_Buscador.add(Label_LogoMini);
		
		int cantidadLikes = InsertarUsuarios.obtenerCantidadLikes(1);
		
		JLabel labelLikes = new JLabel("Likes:"+cantidadLikes);
		labelLikes.setBounds(153, 19, 100, 30);
		Panel_Buscador.add(labelLikes);
		
		JPanel Panel_Fondo = new JPanel();
		Panel_Fondo.setBackground(new Color(0, 0, 0));
		Panel_Fondo.setBounds(0, 49, 513, 293);
		frame3.getContentPane().add(Panel_Fondo);
		Panel_Fondo.setLayout(null);
		
		ImageIcon eyeIcon3 = new ImageIcon("E:\\5TO 2DA\\LPOO\\08-09-2023 Página Web HTML\\PAG_WEB_pag3\\IMAGEN3\\porsche.png");
        Image image3 = eyeIcon3.getImage();
        Image scaledImage3 = image3.getScaledInstance(116, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledEyeIcon3 = new ImageIcon(scaledImage3);
		
		//Imagen del Porsche
		JLabel label_porsche = new JLabel();
		label_porsche.setHorizontalAlignment(SwingConstants.CENTER);
		label_porsche.setBounds(10, 60, 116, 100);
		label_porsche.setOpaque(true);
		label_porsche.setIcon(scaledEyeIcon3);
		Panel_Fondo.add(label_porsche);
		
		
		
		//descripcion de porsche
		JLabel label_marcaPorsche = new JLabel("<html>Sedán deportivo de lujo de Porsche</html>");
		label_marcaPorsche.setBackground(new Color(255, 255, 255));
		label_marcaPorsche.setForeground(new Color(240, 248, 255));
		label_marcaPorsche.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_marcaPorsche.setHorizontalAlignment(SwingConstants.CENTER);
		label_marcaPorsche.setBounds(10, 170, 116, 50); 
		Panel_Fondo.add(label_marcaPorsche);

		ImageIcon eyeIcon4 = new ImageIcon("E:\\5TO 2DA\\LPOO\\08-09-2023 Página Web HTML\\PAG_WEB_pag3\\IMAGEN3\\ferrari.png");
        Image image4 = eyeIcon4.getImage();
        Image scaledImage4 = image4.getScaledInstance(116, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledEyeIcon4 = new ImageIcon(scaledImage4);
		
		//Imagen del Ferrari
		JLabel label_ferrari = new JLabel();
		label_ferrari.setHorizontalAlignment(SwingConstants.CENTER);
		label_ferrari.setBounds(135, 60, 116, 100);
		label_porsche.setOpaque(true);
		label_ferrari.setIcon(scaledEyeIcon4);
		Panel_Fondo.add(label_ferrari);
		
		
		 
		//descripcion de ferrari
		JLabel label_marcaferrari = new JLabel("<html>Superdeportivo turboalimentado de Ferrari</html>"); // Agrega el nombre de la marca
		label_marcaferrari.setBackground(new Color(255, 255, 255));
		label_marcaferrari.setForeground(new Color(240, 248, 255));
		label_marcaferrari.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_marcaferrari.setHorizontalAlignment(SwingConstants.CENTER);
		label_marcaferrari.setBounds(135, 170, 116, 50); // Ajusta la posición y el tamaño según tu necesidad
		Panel_Fondo.add(label_marcaferrari);
		
		ImageIcon eyeIcon5 = new ImageIcon("E:\\5TO 2DA\\LPOO\\08-09-2023 Página Web HTML\\PAG_WEB_pag3\\IMAGEN3\\bugatti.png");
        Image image5 = eyeIcon5.getImage();
        Image scaledImage5 = image5.getScaledInstance(116, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledEyeIcon5 = new ImageIcon(scaledImage5);
		
		//Imagen del Bugatti
		JLabel label_bugatti = new JLabel();
		label_bugatti.setHorizontalAlignment(SwingConstants.CENTER);
		label_bugatti.setBounds(260, 60, 116, 100);
		label_bugatti.setOpaque(true);
		label_bugatti.setIcon(scaledEyeIcon5);
		Panel_Fondo.add(label_bugatti);
		
		//descripcion de bugatti.
		JLabel label_marcabugatti = new JLabel("<html>Hipercoche de alta velocidad y lujo de Bugatti</html>"); 
		label_marcabugatti.setBackground(new Color(255, 255, 255));
		label_marcabugatti.setForeground(new Color(240, 248, 255));
		label_marcabugatti.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_marcabugatti.setHorizontalAlignment(SwingConstants.CENTER);
		label_marcabugatti.setBounds(260, 170, 116, 55);
		Panel_Fondo.add(label_marcabugatti);
		
		ImageIcon eyeIcon6 = new ImageIcon("E:\\5TO 2DA\\LPOO\\08-09-2023 Página Web HTML\\PAG_WEB_pag3\\IMAGEN3\\rolls royce.png");
        Image image6 = eyeIcon6.getImage();
        Image scaledImage6 = image6.getScaledInstance(116, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledEyeIcon6 = new ImageIcon(scaledImage6);
		
		//Imagen del Rolls Royce
		JLabel label_rolls = new JLabel();
		label_rolls.setHorizontalAlignment(SwingConstants.CENTER);
		label_rolls.setBounds(385, 60, 116, 100);
		label_rolls.setOpaque(true);
		label_rolls.setIcon(scaledEyeIcon6);
		Panel_Fondo.add(label_rolls);

		//descripcion de rolls
		JLabel label_marcarolls = new JLabel("<html>Sedán de ultra lujo de Rolls-Royce</html>"); 
		label_marcarolls.setBackground(new Color(255, 255, 255));
		label_marcarolls.setForeground(new Color(240, 248, 255));
		label_marcarolls.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_marcarolls.setHorizontalAlignment(SwingConstants.CENTER);
		label_marcarolls.setBounds(385, 170, 116, 55); 
		Panel_Fondo.add(label_marcarolls);
		
		
		
		JLabel blNewLabel_4 = new JLabel("TU AUTO ENTRE 4 MARCAS LIDERES");
		blNewLabel_4.setBackground(new Color(255, 255, 255));
		blNewLabel_4.setForeground(new Color(240, 248, 255));
		blNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		blNewLabel_4.setBounds(100, 23, 500, 30);
		Panel_Fondo.add(blNewLabel_4);


		JLabel Label_Fondo = new JLabel();
		Label_Fondo.setHorizontalAlignment(SwingConstants.CENTER);
		Label_Fondo.setBounds(0, 0, 513, 293);
		Label_Fondo.setOpaque(true);
		
		ImageIcon eyeIcon7 = new ImageIcon("E:\\5TO 2DA\\LPOO\\08-09-2023 Página Web HTML\\PAG_WEB_pag3\\IMAGEN3\\FondoT.jpg");
        Image image7 = eyeIcon7.getImage();
        ImageIcon scaledEyeIcon7 = new ImageIcon(image7);
        
        JButton btnNewButton = new JButton("Like");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		InsertarUsuarios.insertarRegistro(1);
        		
        		int cantidad = InsertarUsuarios.obtenerCantidadLikes(1);
        		
        		labelLikes.setText("Likes:"+cantidad);
        	}
        });
		btnNewButton.setBounds(10, 245, 89, 23);
		Panel_Fondo.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Like");
		btnNewButton_1.setBounds(147, 245, 89, 23);
		Panel_Fondo.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Like");
		btnNewButton_2.setBounds(287, 245, 89, 23);
		Panel_Fondo.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Like");
		btnNewButton_3.setBounds(412, 245, 89, 23);
		Panel_Fondo.add(btnNewButton_3);
		
		Label_Fondo.setIcon(scaledEyeIcon7);
		Panel_Fondo.add(Label_Fondo);
        
        

		frame3.setVisible(true);
	}
}
