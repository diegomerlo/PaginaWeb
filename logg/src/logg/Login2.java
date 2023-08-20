package logg;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginFrame frame = new LoginFrame();
            frame.setVisible(true);
        });
    }
}

class LoginFrame extends JFrame {
    private JTextField textField;
    private JPasswordField passwordField;
    private boolean passwordVisible = false;

    public LoginFrame() {
        initUI();
    }
    private static boolean visible=false;
    private void initUI() {
        setTitle("Login App");
        setUndecorated(true);
        setSize(584, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);
        panel.setBounds(0, 0, 204, 361);
        getContentPane().add(panel);

        JLabel logoLabel = new JLabel("");
        logoLabel.setIcon(new ImageIcon("E:\\5TO 2DA\\LPOO\\08-09-2023 Página Web HTML\\JAVA Diego Pagina\\src\\LogoChico.png"));
        logoLabel.setBounds(56, 11, 86, 30);
        panel.add(logoLabel);

        JLabel lblNewLabel_2 = new JLabel("Log");
		lblNewLabel_2.setBorder(new MatteBorder(0, 0, 5, 0, (Color) new Color(255, 255, 0)));
		lblNewLabel_2.setFont(new Font("Haettenschweiler", Font.PLAIN, 35));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(69, 52, 41, 45);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("In");
		lblNewLabel_2_1.setBorder(new MatteBorder(0, 0, 5, 0, (Color) new Color(255, 255, 0)));
		lblNewLabel_2_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_2_1.setFont(new Font("Haettenschweiler", Font.PLAIN, 35));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(106, 52, 26, 45);
		panel.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBounds(35, 159, 127, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(35, 222, 127, 20);
		panel.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Email: ");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(35, 143, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contraseña:");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(35, 205, 75, 14);
		panel.add(lblNewLabel_4);
		
		
		ImageIcon eyeIcon = new ImageIcon("E:\\5TO 2DA\\LPOO\\08-09-2023 Página Web HTML\\logg\\src\\logg\\ojo.png");
        Image image = eyeIcon.getImage();
        Image scaledImage = image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon scaledEyeIcon = new ImageIcon(scaledImage);

        JButton btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(50, 263, 100, 25);
        panel.add(btnIngresar);
        btnIngresar.setFont(new Font("Arial", Font.BOLD, 14));
        btnIngresar.setBackground(new Color(41, 91, 200));
        btnIngresar.setForeground(Color.WHITE);
        btnIngresar.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginUser();
            }
        });
        
        ImageIcon eyeIcon2 = new ImageIcon("E:\\\\5TO 2DA\\\\LPOO\\\\08-09-2023 Página Web HTML\\\\imágenes\\\\1077063.png");
        Image image2 = eyeIcon2.getImage();
        Image scaledImage2 = image2.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon scaledEyeIcon2 = new ImageIcon(scaledImage2);
        
        JLabel lblNewLabel_5_1 = new JLabel("");
        lblNewLabel_5_1.setIcon(scaledEyeIcon2);
        lblNewLabel_5_1.setBounds(5, 150, 30, 30);
        panel.add(lblNewLabel_5_1);
        
        
        ImageIcon eyeIcon3 = new ImageIcon("E:\\\\5TO 2DA\\\\LPOO\\\\08-09-2023 Página Web HTML\\\\imágenes\\\\candado.png");
        Image image3 = eyeIcon3.getImage();
        Image scaledImage3 = image3.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon scaledEyeIcon3 = new ImageIcon(scaledImage3);

        JLabel lblNewLabel_5_1_1 = new JLabel("");
        lblNewLabel_5_1_1.setIcon(scaledEyeIcon3);
        lblNewLabel_5_1_1.setBounds(5, 213, 30, 30);
        panel.add(lblNewLabel_5_1_1);
        
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
        btnNewButton_2.setBounds(168, 216, 30, 30);
        panel.add(btnNewButton_2);
        
        btnNewButton_2.setBackground(Color.WHITE);
        btnNewButton_2.setOpaque(true);
        
        
        
        JButton btnTogglePassword = new JButton("");
        btnTogglePassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                togglePasswordVisibility();
            }
        });
        btnTogglePassword.setBorder(null);
        btnTogglePassword.setIcon(scaledEyeIcon2);
        btnTogglePassword.setBounds(168, 216, 30, 30);
        panel.add(btnTogglePassword);
        btnTogglePassword.setBackground(Color.WHITE);
        btnTogglePassword.setOpaque(true);


        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(201, 0, 383, 361);
        getContentPane().add(panel_1);
        panel_1.setLayout(null);
        JLabel backgroundLabel = new JLabel("");
        backgroundLabel.setIcon(new ImageIcon("E:\\\\5TO 2DA\\\\LPOO\\\\08-09-2023 Página Web HTML\\\\logg\\\\src\\\\logg\\\\AutosFondo.jpeg"));
        backgroundLabel.setBounds(30, 0, 560, 361);
        panel_1.add(backgroundLabel);

        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnExit.setBounds(284, 11, 89, 23);
        panel_1.add(btnExit);

        setVisible(true);
}

    private void loginUser() {
        String usuario = textField.getText().trim();
        String password = String.valueOf(passwordField.getPassword());

        if (!usuario.isEmpty() && !password.isEmpty()) {
            if (usuario.equals("admin") && password.equals("123456")) {
                JOptionPane.showMessageDialog(this, "Bienvenido al sistema " + usuario, "Mensaje de Bienvenida", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El campo usuario y contraseña son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void togglePasswordVisibility() {
        if (passwordVisible) {
            passwordField.setEchoChar('•');
        } else {
            passwordField.setEchoChar((char) 0);
        }
        passwordVisible = !passwordVisible;
    }
}
