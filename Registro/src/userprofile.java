import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class userprofile {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JPasswordField passwordField;
	private static boolean visible=false;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 744, 466);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 744, 466);
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(60, 70, 72));
		panel_1.setBounds(0, 0, 323, 466);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\5TO 2DA\\LPOO\\08-09-2023 Página Web HTML\\Registro\\src\\676bf0e9f3c16649cd7f426c6dcd755a-signo-de-usuario-plano-con-fondo-redondo.png"));
		lblNewLabel_2.setBounds(35, 11, 244, 215);
		panel_1.add(lblNewLabel_2);
		
		ImageIcon eyeIcon = new ImageIcon("E:\\\\5TO 2DA\\\\LPOO\\\\08-09-2023 Página Web HTML\\\\Registro\\\\src\\\\Logo1-removebg-preview.png");
        Image image = eyeIcon.getImage();
        Image scaledImage = image.getScaledInstance(150, 50, Image.SCALE_SMOOTH);
        ImageIcon scaledEyeIcon = new ImageIcon(scaledImage);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(scaledEyeIcon);
		lblNewLabel_2_1.setBounds(83, 405, 150, 50);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Tu Perfil");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Harlow Solid Italic", Font.BOLD, 30));
		lblNewLabel_3.setBounds(94, 266, 156, 50);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Registrate:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		lblNewLabel.setBounds(519, 37, 94, 41);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_1.setBounds(401, 106, 289, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellido:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(401, 171, 289, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email:");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(401, 221, 289, 14);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_1_1_1_1.setBounds(401, 274, 289, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(401, 150, 289, 18);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(401, 208, 289, 18);
		panel.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(401, 262, 289, 18);
		panel.add(separator_1_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(401, 317, 289, 18);
		panel.add(separator_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(401, 131, 289, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Exit");
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(666, 11, 68, 23);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(401, 190, 289, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(401, 243, 289, 20);
		panel.add(textField_2);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setBounds(424, 379, 112, 35);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 14));
        btnNewButton_1.setBackground(new Color(192,192,192));
        btnNewButton_1.setForeground(new Color(0, 0, 0));
        btnNewButton_1.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        panel.add(btnNewButton_1);
        
        JButton btnNewButton_1_1 = new JButton("Registrar");
        btnNewButton_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_1_1.setForeground(Color.BLACK);
        btnNewButton_1_1.setFont(new Font("Arial", Font.BOLD, 14));
        btnNewButton_1_1.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        btnNewButton_1_1.setBackground(new Color(0, 153, 153));
        btnNewButton_1_1.setBounds(554, 379, 112, 35);
        panel.add(btnNewButton_1_1);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(401, 298, 289, 20);
        panel.add(passwordField);
        
        ImageIcon userIcon = new ImageIcon("E:\\5TO 2DA\\LPOO\\08-09-2023 Página Web HTML\\logg\\src\\logg\\ojo.png");
        Image imageUser = userIcon.getImage();
        Image scaleUser = imageUser.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon scaleUIcon = new ImageIcon(scaleUser);
        
        ImageIcon userIcon2= new ImageIcon("E:\\5TO 2DA\\LPOO\\08-09-2023 Página Web HTML\\logg\\src\\logg\\eye_closed.png");
        Image imageUser2 = userIcon2.getImage();
        Image scaleUser2 = imageUser2.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon scaleUIcon2 = new ImageIcon(scaleUser2);
        
        JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		if(visible){
        			btnNewButton_2.setIcon(scaleUIcon2);
        			passwordField.setEchoChar('•');
        			  visible=false;
        			   
        			 }else{
        			   
        			btnNewButton_2.setIcon(scaleUIcon);
        			passwordField.setEchoChar((char)0);
        			  visible=true;
        			 }
        	}
        });
        btnNewButton_2.setBorder(null);
        btnNewButton_2.setIcon(scaleUIcon2);
        btnNewButton_2.setBounds(700, 295, 30, 30);
        panel.add(btnNewButton_2);
        
        btnNewButton_2.setBackground(Color.WHITE);
        btnNewButton_2.setOpaque(true);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("E:\\5TO 2DA\\LPOO\\08-09-2023 Página Web HTML\\Registro\\src\\AutosFondo2.jpeg"));
        lblNewLabel_4.setBounds(318, 0, 426, 466);
        panel.add(lblNewLabel_4);
        
        
		
		frame.setVisible(true);
	}
}

