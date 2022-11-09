package co.uniquindio.programacion1.cineuq.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField buscarCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginUsuarios frame = new loginUsuarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loginUsuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox Fechas = new JComboBox();
		Fechas.setBounds(58, 10, 58, 22);
		contentPane.add(Fechas);
		
		// agregar las fechas al combobox//
		Fechas.addItem("22/10/06");
		Fechas.addItem("22/10/07");
		Fechas.addItem("22/10/08");
		
		JTextPane txtpnFecha = new JTextPane();
		txtpnFecha.setText("Fecha :");
		txtpnFecha.setBounds(10, 12, 47, 20);
		contentPane.add(txtpnFecha);
		
		JTextPane txtpnCliente = new JTextPane();
		txtpnCliente.setBackground(new Color(240, 240, 240));
		txtpnCliente.setText("Cliente :");
		txtpnCliente.setBounds(10, 307, 52, 20);
		contentPane.add(txtpnCliente);
		
		buscarCliente = new JTextField();
		buscarCliente.setBounds(72, 307, 86, 20);
		contentPane.add(buscarCliente);
		buscarCliente.setColumns(10);
		
		JButton btnRecargar = new JButton("Recarga");
		btnRecargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Recargas frame= new Recargas();
				frame.setVisible(true);
				
			}
		});
		
		btnRecargar.setBounds(583, 304, 89, 23);
		contentPane.add(btnRecargar);
		//pasar a la otra pagina//
		JButton Siguiente = new JButton("Siguiente");
		Siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				sillasCine frame= new sillasCine();
				frame.setVisible(true);
			}
			
		});
		Siguiente.setBounds(703, 304, 89, 23);
		contentPane.add(Siguiente);
	
		// pelicula 1//
		
		JButton Pelicula1 = new JButton("");
		Pelicula1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Pelicula1.setBounds(72, 62, 170, 180);
		contentPane.add(Pelicula1);
		
		JButton Pelicula2 = new JButton("");
		Pelicula2.setBounds(363, 62, 170, 180);
		contentPane.add(Pelicula2);
		
		JButton Pelicula3 = new JButton("");
		Pelicula3.setBounds(655, 62, 170, 180);
		contentPane.add(Pelicula3);
		
		JTextPane txtpnUsuario = new JTextPane();
		txtpnUsuario.setText("Usuario");
		txtpnUsuario.setBackground(new Color(240, 240, 240));
		txtpnUsuario.setBounds(168, 307, 144, 20);
		contentPane.add(txtpnUsuario);
		
		JButton crearUsuario = new JButton("Crear Usuario");
		crearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevoUsuario frame= new nuevoUsuario();
				frame.setVisible(true);
			}
		});
		crearUsuario.setBounds(354, 304, 114, 23);
		contentPane.add(crearUsuario);
		
		
	}
}
