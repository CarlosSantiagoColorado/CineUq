 package co.uniquindio.programacion1.cineuq.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class nuevoUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtIngreseNmero;
	private JTextField txtIngreseNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nuevoUsuario frame = new nuevoUsuario();
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
	public nuevoUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnUsuarioNuevo = new JTextPane();
		txtpnUsuarioNuevo.setBackground(new Color(240, 240, 240));
		txtpnUsuarioNuevo.setText("Usuario Nuevo");
		txtpnUsuarioNuevo.setBounds(99, 11, 92, 20);
		contentPane.add(txtpnUsuarioNuevo);
		
		JTextPane Cedula = new JTextPane();
		Cedula.setBackground(new Color(240, 240, 240));
		Cedula.setText("Cédula");
		Cedula.setBounds(10, 49, 48, 20);
		contentPane.add(Cedula);
		
		JTextPane Nombre = new JTextPane();
		Nombre.setBackground(new Color(240, 240, 240));
		Nombre.setText("Nombre");
		Nombre.setBounds(10, 91, 48, 20);
		contentPane.add(Nombre);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Basic");
		chckbxNewCheckBox.setBounds(94, 133, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JTextPane txtpnRecarga = new JTextPane();
		txtpnRecarga.setBackground(new Color(240, 240, 240));
		txtpnRecarga.setText("Recarga");
		txtpnRecarga.setBounds(10, 174, 53, 20);
		contentPane.add(txtpnRecarga);
		
		txtName = new JTextField();
		txtName.setText("Ingrese cantidad");
		txtName.setBounds(105, 174, 103, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtIngreseNmero = new JTextField();
		txtIngreseNmero.setText("Ingrese número");
		txtIngreseNmero.setBounds(109, 49, 99, 20);
		contentPane.add(txtIngreseNmero);
		txtIngreseNmero.setColumns(10);
		
		txtIngreseNombre = new JTextField();
		txtIngreseNombre.setText("Ingrese nombre");
		txtIngreseNombre.setBounds(109, 91, 99, 20);
		contentPane.add(txtIngreseNombre);
		txtIngreseNombre.setColumns(10);
		
		JButton crearUsu = new JButton("Crear Usuario");
		crearUsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		crearUsu.setBounds(82, 237, 120, 41);
		contentPane.add(crearUsu);
	}
}
