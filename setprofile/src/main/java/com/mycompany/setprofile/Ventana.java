package com.mycompany.setprofile;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame implements ActionListener {

    JButton prev, next;
    JLabel imagen;
    ImageIcon[] imagenes;
    int index = 0;

    public Ventana() {
        super("Galeria");
        setLayout(null);

        prev = new JButton("<");
        prev.setBounds(10, 135, 60, 30);
        prev.addActionListener(this);

        imagenes = new ImageIcon[3]; // Change this to the number of images you have
        imagenes[0] = new ImageIcon("/Aaudi.png"); // Change this to your image paths
        // Add more images to imagenes array

        imagen = new JLabel();
        imagen.setIcon(imagenes[index]);
        imagen.setBounds(80, 50, 200, 200);

        next = new JButton(">");
        next.setBounds(290, 135, 60, 30);
        next.addActionListener(this);

        add(prev);
        add(imagen);
        add(next);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == prev) {
            index = (index - 1 + imagenes.length) % imagenes.length;
            imagen.setIcon(imagenes[index]);
        } else if (e.getSource() == next) {
            index = (index + 1) % imagenes.length;
            imagen.setIcon(imagenes[index]);
        }
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setVisible(true);
    }
}
