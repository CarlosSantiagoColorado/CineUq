package co.uniquindio.programacion1.cineuq.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Recargas extends JFrame {

	private JPanel contentPane;
	private JTextField ponerRecarga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recargas frame = new Recargas();
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
	public Recargas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane Recarga = new JTextPane();
		Recarga.setBackground(new Color(240, 240, 240));
		Recarga.setText("RECARGA");
		Recarga.setBounds(109, 11, 62, 20);
		contentPane.add(Recarga);
		
		JTextPane Nombre = new JTextPane();
		Nombre.setBackground(new Color(240, 240, 240));
		Nombre.setText("Nombre");
		Nombre.setBounds(10, 60, 76, 20);
		contentPane.add(Nombre);
		
		JTextPane Cdula = new JTextPane();
		Cdula.setBackground(new Color(240, 240, 240));
		Cdula.setText("Cédula");
		Cdula.setBounds(10, 101, 76, 20);
		contentPane.add(Cdula);
		
		JCheckBox Basic = new JCheckBox("Basic");
		Basic.setBounds(61, 154, 97, 23);
		contentPane.add(Basic);
		
		JCheckBox Gold = new JCheckBox("Gold");
		Gold.setBounds(160, 154, 97, 23);
		contentPane.add(Gold);
		
		JTextPane saldoActual = new JTextPane();
		saldoActual.setBackground(new Color(240, 240, 240));
		saldoActual.setText("Saldo Actual");
		saldoActual.setBounds(10, 208, 76, 20);
		contentPane.add(saldoActual);
		
		JTextPane Recargar = new JTextPane();
		Recargar.setBackground(new Color(240, 240, 240));
		Recargar.setText("Recargar");
		Recargar.setBounds(10, 251, 76, 20);
		contentPane.add(Recargar);
		
		JButton comp = new JButton("Comprar");
		comp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comp.setBounds(160, 336, 97, 32);
		contentPane.add(comp);
		
		JTextPane Dinero = new JTextPane();
		Dinero.setBounds(131, 208, 97, 20);
		contentPane.add(Dinero);
		
		JTextPane Nombrecliente = new JTextPane();
		Nombrecliente.setBounds(131, 60, 113, 20);
		contentPane.add(Nombrecliente);
		
		JTextPane cedula = new JTextPane();
		cedula.setBounds(131, 101, 106, 20);
		contentPane.add(cedula);
		
		ponerRecarga = new JTextField();
		ponerRecarga.setBounds(131, 251, 97, 20);
		contentPane.add(ponerRecarga);
		ponerRecarga.setColumns(10);
	}
}
