package co.uniquindio.programacion1.cineuq.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;

public class sillasCine extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sillasCine frame = new sillasCine();
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
	public sillasCine() {
		setTitle("ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1061, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		//pantalla//
		JPanel pantalla = new JPanel();
		pantalla.setBounds(10, 11, 1025, 28);
		contentPane.add(pantalla);
		
		JTextPane txtpnPantalla = new JTextPane();
		txtpnPantalla.setBackground(new Color(192, 192, 192));
		txtpnPantalla.setText("PANTALLA");
		pantalla.add(txtpnPantalla);
		
		// filas comunes (A-I)//
		// hacer las filas//
		
		JButton A1 = new JButton("A1");
		A1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A1.setBackground(Color.RED);
			}
		});
		A1.setBounds(10, 50, 50, 23);
		contentPane.add(A1);
		
		JButton A2 = new JButton("A2");
		A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A2.setBackground(Color.RED);
			}
		});
		A2.setBounds(70, 50, 50, 23);
		contentPane.add(A2);
		
		JButton A3 = new JButton("A3");
		
		A3.setBounds(130, 50, 50, 23);
		contentPane.add(A3);
		A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A3.setBackground(Color.RED);
			}
		});
		JButton A4 = new JButton("A4");
		A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A4.setBackground(Color.RED);
			}
		});
		A4.setBounds(190, 50, 50, 23);
		contentPane.add(A4);
		
		JButton A5 = new JButton("A5");
		A5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A5.setBackground(Color.RED);
			}
		});
		A5.setBounds(252, 50, 50, 23);
		contentPane.add(A5);
		
		JButton A6 = new JButton("A6");
		A6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A6.setBackground(Color.RED);
			}
		});
		A6.setBounds(312, 50, 50, 23);
		contentPane.add(A6);
		
		JButton A7 = new JButton("A7");
		A7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A7.setBackground(Color.RED);
			}
		});
		A7.setBounds(372, 50, 50, 23);
		contentPane.add(A7);
		
		JButton A8 = new JButton("A8");
		A8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A8.setBackground(Color.RED);
			}
		});
		A8.setBounds(432, 50, 50, 23);
		contentPane.add(A8);
		
		JButton A9 = new JButton("A9");
		A9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A9.setBackground(Color.RED);
			}
		});
		A9.setBounds(492, 50, 50, 23);
		contentPane.add(A9);
		
		JButton A10 = new JButton("A10");
		A10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A10.setBackground(Color.RED);
			}
		});
		A10.setBounds(552, 50, 57, 23);
		contentPane.add(A10);
		
		JButton A11 = new JButton("A11");
		A11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A11.setBackground(Color.RED);
			}
		});
		A11.setBounds(619, 50, 57, 23);
		contentPane.add(A11);
		
		JButton A12 = new JButton("A12");
		A12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A12.setBackground(Color.RED);
			}
		});
		A12.setBounds(686, 50, 57, 23);
		contentPane.add(A12);
		
		JButton A13 = new JButton("A13");
		A13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A13.setBackground(Color.RED);
			}
		});
		A13.setBounds(753, 50, 57, 23);
		contentPane.add(A13);
		
		JButton A14 = new JButton("A14");
		A14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A14.setBackground(Color.RED);
			}
		});
		A14.setBounds(820, 50, 65, 23);
		contentPane.add(A14);
		
		JButton A15 = new JButton("A15");
		A15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A15.setBackground(Color.RED);
			}
		});
		A15.setBounds(895, 50, 65, 23);
		contentPane.add(A15);
		
		JButton A16 = new JButton("A16");
		A16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				A16.setBackground(Color.RED);
			}
		});
		A16.setBounds(970, 50, 65, 23);
		contentPane.add(A16);
		
		// fila B//
		
		JButton B1 = new JButton("B1");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B1.setBackground(Color.RED);
			}
		});
		B1.setBounds(10, 79, 50, 23);
		contentPane.add(B1);
		
		JButton B2 = new JButton("B2");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B2.setBackground(Color.RED);
			}
		});
		B2.setBounds(70, 79, 50, 23);
		contentPane.add(B2);
		
		JButton B3 = new JButton("B3");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B3.setBackground(Color.RED);
			}
		});
		B3.setBounds(130, 79, 50, 23);
		contentPane.add(B3);
		
		JButton B4 = new JButton("B4");
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B4.setBackground(Color.RED);
			}
		});
		B4.setBounds(190, 79, 50, 23);
		contentPane.add(B4);
		
		JButton B5 = new JButton("B5");
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B5.setBackground(Color.RED);
			}
		});
		B5.setBounds(252, 79, 50, 23);
		contentPane.add(B5);
		
		JButton B6 = new JButton("B6");
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B6.setBackground(Color.RED);
			}
		});
		B6.setBounds(312, 79, 50, 23);
		contentPane.add(B6);
		
		JButton B7 = new JButton("B7");
		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B7.setBackground(Color.RED);
			}
		});
		B7.setBounds(372, 79, 50, 23);
		contentPane.add(B7);
		
		JButton B8 = new JButton("B8");
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B8.setBackground(Color.RED);
			}
		});
		B8.setBounds(432, 79, 50, 23);
		contentPane.add(B8);
		
		JButton B9 = new JButton("B9");
		B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B9.setBackground(Color.RED);
			}
		});
		B9.setBounds(492, 79, 50, 23);
		contentPane.add(B9);
		
		JButton B10 = new JButton("B10");
		B10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B10.setBackground(Color.RED);
			}
		});
		B10.setBounds(552, 79, 57, 23);
		contentPane.add(B10);
		
		JButton B11 = new JButton("B11");
		B11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B11.setBackground(Color.RED);
			}
		});
		B11.setBounds(619, 79, 57, 23);
		contentPane.add(B11);
		
		JButton B12 = new JButton("B12");
		B12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B12.setBackground(Color.RED);
			}
		});
		B12.setBounds(686, 79, 57, 23);
		contentPane.add(B12);
		
		JButton B13 = new JButton("B13");
		B13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B13.setBackground(Color.RED);
			}
		});
		B13.setBounds(753, 79, 57, 23);
		contentPane.add(B13);
		
		JButton B14 = new JButton("B14");
		B14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B14.setBackground(Color.RED);
			}
		});
		B14.setBounds(820, 79, 65, 23);
		contentPane.add(B14);
		
		JButton B15 = new JButton("B15");
		B15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B15.setBackground(Color.RED);
			}
		});
		B15.setBounds(895, 79, 65, 23);
		contentPane.add(B15);
		
		JButton B16 = new JButton("B16");
		B16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				B16.setBackground(Color.RED);
			}
		});
		B16.setBounds(970, 79, 65, 23);
		contentPane.add(B16);
		// sillas C//
		JButton C1 = new JButton("C1");
		C1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C1.setBackground(Color.RED);
			}
		});
		C1.setBounds(10, 109, 50, 23);
		contentPane.add(C1);
		
		JButton C2 = new JButton("C2");
		C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C2.setBackground(Color.RED);
			}
		});
		C2.setBounds(70, 109, 50, 23);
		contentPane.add(C2);
		
		JButton C3 = new JButton("C3");
		C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C3.setBackground(Color.RED);
			}
		});
		C3.setBounds(130, 109, 50, 23);
		contentPane.add(C3);
		
		JButton C4 = new JButton("C4");
		C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C4.setBackground(Color.RED);
			}
		});
		C4.setBounds(190, 109, 50, 23);
		contentPane.add(C4);
		
		JButton C5 = new JButton("C5");
		C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C5.setBackground(Color.RED);
			}
		});
		C5.setBounds(252, 109, 50, 23);
		contentPane.add(C5);
		
		JButton C6 = new JButton("C6");
		C6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C6.setBackground(Color.RED);
			}
		});
		C6.setBounds(312, 109, 50, 23);
		contentPane.add(C6);
		
		JButton C7 = new JButton("C7");
		C7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C7.setBackground(Color.RED);
			}
		});
		C7.setBounds(372, 109, 50, 23);
		contentPane.add(C7);
		
		JButton C8 = new JButton("C8");
		C8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C8.setBackground(Color.RED);
			}
		});
		C8.setBounds(432, 109, 50, 23);
		contentPane.add(C8);
		
		JButton C9 = new JButton("C9");
		C9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C9.setBackground(Color.RED);
			}
		});
		C9.setBounds(492, 109, 50, 23);
		contentPane.add(C9);
		
		JButton C10 = new JButton("C10");
		C10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C10.setBackground(Color.RED);
			}
		});
		C10.setBounds(552, 109, 57, 23);
		contentPane.add(C10);
		
		JButton C11 = new JButton("C11");
		C11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C11.setBackground(Color.RED);
			}
		});
		C11.setBounds(619, 109, 57, 23);
		contentPane.add(C11);
		
		JButton C12 = new JButton("C12");
		C12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C12.setBackground(Color.RED);
			}
		});
		C12.setBounds(686, 109, 57, 23);
		contentPane.add(C12);
		
		JButton C13 = new JButton("C13");
		C13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C13.setBackground(Color.RED);
			}
		});
		C13.setBounds(753, 109, 57, 23);
		contentPane.add(C13);
		
		JButton C14 = new JButton("C14");
		C14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C14.setBackground(Color.RED);
			}
		});
		C14.setBounds(820, 109, 65, 23);
		contentPane.add(C14);
		
		JButton C15 = new JButton("C15");
		C15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C15.setBackground(Color.RED);
			}
		});
		C15.setBounds(895, 109, 65, 23);
		contentPane.add(C15);
		
		JButton C16 = new JButton("C16");
		C16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C16.setBackground(Color.RED);
			}
		});
		C16.setBounds(970, 109, 65, 23);
		contentPane.add(C16);
		// sillas D//
		JButton D1 = new JButton("D1");
		D1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D1.setBackground(Color.RED);
			}
		});
		D1.setBounds(10, 138, 50, 23);
		contentPane.add(D1);
		
		JButton D2 = new JButton("D2");
		D2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D2.setBackground(Color.RED);
			}
		});
		D2.setBounds(70, 138, 50, 23);
		contentPane.add(D2);
		
		JButton D3 = new JButton("D3");
		D3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D3.setBackground(Color.RED);
			}
		});
		D3.setBounds(130, 138, 50, 23);
		contentPane.add(D3);
		
		JButton D4 = new JButton("D4");
		D4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D4.setBackground(Color.RED);
			}
		});
		D4.setBounds(190, 138, 50, 23);
		contentPane.add(D4);
		
		JButton D5 = new JButton("D5");
		D5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D5.setBackground(Color.RED);
			}
		});
		D5.setBounds(252, 138, 50, 23);
		contentPane.add(D5);
		
		JButton D6 = new JButton("D6");
		D6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D6.setBackground(Color.RED);
			}
		});
		D6.setBounds(312, 138, 50, 23);
		contentPane.add(D6);
		
		JButton D7 = new JButton("D7");
		D7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D7.setBackground(Color.RED);
			}
		});
		D7.setBounds(372, 138, 50, 23);
		contentPane.add(D7);
		
		JButton D8 = new JButton("D8");
		D8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D8.setBackground(Color.RED);
			}
		});
		D8.setBounds(432, 138, 50, 23);
		contentPane.add(D8);
		
		JButton D9 = new JButton("D9");
		D9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D9.setBackground(Color.RED);
			}
		});
		D9.setBounds(492, 138, 50, 23);
		contentPane.add(D9);
		
		JButton D10 = new JButton("D10");
		D10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D10.setBackground(Color.RED);
			}
		});
		D10.setBounds(552, 138, 57, 23);
		contentPane.add(D10);
		
		JButton D11 = new JButton("D11");
		D11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D11.setBackground(Color.RED);
			}
		});
		D11.setBounds(619, 138, 57, 23);
		contentPane.add(D11);
		
		JButton D12 = new JButton("D12");
		D12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D12.setBackground(Color.RED);
			}
		});
		D12.setBounds(686, 138, 57, 23);
		contentPane.add(D12);
		
		JButton D13 = new JButton("D13");
		D13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D13.setBackground(Color.RED);
			}
		});
		D13.setBounds(753, 138, 57, 23);
		contentPane.add(D13);
		
		JButton D14 = new JButton("D14");
		D14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D14.setBackground(Color.RED);
			}
		});
		D14.setBounds(820, 138, 65, 23);
		contentPane.add(D14);
		
		JButton D15 = new JButton("D15");
		D15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D15.setBackground(Color.RED);
			}
		});
		D15.setBounds(895, 138, 65, 23);
		contentPane.add(D15);
		
		JButton D16 = new JButton("D16");
		D16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				D16.setBackground(Color.RED);
			}
		});
		D16.setBounds(970, 138, 65, 23);
		contentPane.add(D16);
		// sillas E//
		JButton E1 = new JButton("E1");
		E1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E1.setBackground(Color.RED);
			}
		});
		E1.setBounds(10, 167, 50, 23);
		contentPane.add(E1);
		
		JButton E2 = new JButton("E2");
		E2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E2.setBackground(Color.RED);
			}
		});
		E2.setBounds(70, 167, 50, 23);
		contentPane.add(E2);
		
		JButton E3 = new JButton("E3");
		E3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E3.setBackground(Color.RED);
			}
		});
		E3.setBounds(130, 167, 50, 23);
		contentPane.add(E3);
		
		JButton E4 = new JButton("E4");
		E4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E4.setBackground(Color.RED);
			}
		});
		E4.setBounds(190, 167, 50, 23);
		contentPane.add(E4);
		
		JButton E5 = new JButton("E5");
		E5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E5.setBackground(Color.RED);
			}
		});
		E5.setBounds(252, 167, 50, 23);
		contentPane.add(E5);
		
		JButton E6 = new JButton("E6");
		E6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E6.setBackground(Color.RED);
			}
		});
		E6.setBounds(312, 167, 50, 23);
		contentPane.add(E6);
		
		JButton E7 = new JButton("E7");
		E7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E7.setBackground(Color.RED);
			}
		});
		E7.setBounds(372, 167, 50, 23);
		contentPane.add(E7);
		
		JButton E8 = new JButton("E8");
		E8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E8.setBackground(Color.RED);
			}
		});
		E8.setBounds(432, 167, 50, 23);
		contentPane.add(E8);
		
		JButton E9 = new JButton("E9");
		E9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E9.setBackground(Color.RED);
			}
		});
		E9.setBounds(492, 167, 50, 23);
		contentPane.add(E9);
		
		JButton E10 = new JButton("E10");
		E10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E10.setBackground(Color.RED);
			}
		});
		E10.setBounds(552, 167, 57, 23);
		contentPane.add(E10);
		
		JButton E11 = new JButton("E11");
		E11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E11.setBackground(Color.RED);
			}
		});
		E11.setBounds(619, 167, 57, 23);
		contentPane.add(E11);
		
		JButton E12 = new JButton("E12");
		E12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E12.setBackground(Color.RED);
			}
		});
		E12.setBounds(686, 167, 57, 23);
		contentPane.add(E12);
		
		JButton E13 = new JButton("E13");
		E13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E13.setBackground(Color.RED);
			}
		});
		E13.setBounds(753, 167, 57, 23);
		contentPane.add(E13);
		
		JButton E14 = new JButton("E14");
		E14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E14.setBackground(Color.RED);
			}
		});
		E14.setBounds(820, 167, 65, 23);
		contentPane.add(E14);
		
		JButton E15 = new JButton("E15");
		E15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E15.setBackground(Color.RED);
			}
		});
		E15.setBounds(895, 167, 65, 23);
		contentPane.add(E15);
		
		JButton E16 = new JButton("E16");
		E16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				E16.setBackground(Color.RED);
			}
		});
		E16.setBounds(970, 167, 65, 23);
		contentPane.add(E16);
		
		// sillas F//
		JButton F1 = new JButton("F1");
		F1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F1.setBackground(Color.RED);
			}
		});
		F1.setBounds(10, 195, 50, 23);
		contentPane.add(F1);
		
		JButton F2 = new JButton("F2");
		F2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F2.setBackground(Color.RED);
			}
		});
		F2.setBounds(70, 195, 50, 23);
		contentPane.add(F2);
		
		JButton F3 = new JButton("F3");
		F3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F3.setBackground(Color.RED);
			}
		});
		F3.setBounds(130, 195, 50, 23);
		contentPane.add(F3);
		
		JButton F4 = new JButton("F4");
		F4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F4.setBackground(Color.RED);
			}
		});
		F4.setBounds(190, 195, 50, 23);
		contentPane.add(F4);
		
		JButton F5 = new JButton("F5");
		F5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F5.setBackground(Color.RED);
			}
		});
		F5.setBounds(252, 195, 50, 23);
		contentPane.add(F5);
		
		JButton F6 = new JButton("F6");
		F6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F6.setBackground(Color.RED);
			}
		});
		F6.setBounds(312, 195, 50, 23);
		contentPane.add(F6);
		
		JButton F7 = new JButton("F7");
		F7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F7.setBackground(Color.RED);
			}
		});
		F7.setBounds(372, 195, 50, 23);
		contentPane.add(F7);
		
		JButton F8 = new JButton("F8");
		F8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F8.setBackground(Color.RED);
			}
		});
		F8.setBounds(432, 195, 50, 23);
		contentPane.add(F8);
		
		JButton F9 = new JButton("F9");
		F9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F9.setBackground(Color.RED);
			}
		});
		F9.setBounds(492, 195, 50, 23);
		contentPane.add(F9);
		
		JButton F10 = new JButton("F10");
		F10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F10.setBackground(Color.RED);
			}
		});
		F10.setBounds(552, 195, 57, 23);
		contentPane.add(F10);
		
		JButton F11 = new JButton("F11");
		F11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F11.setBackground(Color.RED);
			}
		});
		F11.setBounds(619, 195, 57, 23);
		contentPane.add(F11);
		
		JButton F12 = new JButton("F12");
		F12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F12.setBackground(Color.RED);
			}
		});
		F12.setBounds(686, 195, 57, 23);
		contentPane.add(F12);
		
		JButton F13 = new JButton("F13");
		F13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F13.setBackground(Color.RED);
			}
		});
		F13.setBounds(753, 195, 57, 23);
		contentPane.add(F13);
		
		JButton F14 = new JButton("F14");
		F14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F14.setBackground(Color.RED);
			}
		});
		F14.setBounds(820, 195, 65, 23);
		contentPane.add(F14);
		
		JButton F15 = new JButton("F15");
		F15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F15.setBackground(Color.RED);
			}
		});
		F15.setBounds(895, 195, 65, 23);
		contentPane.add(F15);
		
		JButton F16 = new JButton("F16");
		F16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F16.setBackground(Color.RED);
			}
		});
		F16.setBounds(970, 195, 65, 23);
		contentPane.add(F16);
		
		//sillas G// 
		JButton G1 = new JButton("G1");
		G1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G1.setBackground(Color.RED);
			}
		});
		G1.setBounds(10, 224, 50, 23);
		contentPane.add(G1);
		
		JButton G2 = new JButton("G2");
		G2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G2.setBackground(Color.RED);
			}
		});
		G2.setBounds(70, 224, 50, 23);
		contentPane.add(G2);
		
		JButton G3 = new JButton("G3");
		G3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G3.setBackground(Color.RED);
			}
		});
		G3.setBounds(130, 224, 50, 23);
		contentPane.add(G3);
		
		JButton G4 = new JButton("G4");
		G4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G4.setBackground(Color.RED);
			}
		});
		G4.setBounds(190, 224, 50, 23);
		contentPane.add(G4);
		
		JButton G5 = new JButton("G5");
		G5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G5.setBackground(Color.RED);
			}
		});
		G5.setBounds(252, 224, 50, 23);
		contentPane.add(G5);
		
		JButton G6 = new JButton("G6");
		G6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G6.setBackground(Color.RED);
			}
		});
		G6.setBounds(312, 224, 50, 23);
		contentPane.add(G6);
		
		JButton G7 = new JButton("G7");
		G7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G7.setBackground(Color.RED);
			}
		});
		G7.setBounds(372, 224, 50, 23);
		contentPane.add(G7);
		
		JButton G8 = new JButton("G8");
		G8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G8.setBackground(Color.RED);
			}
		});
		G8.setBounds(432, 224, 50, 23);
		contentPane.add(G8);
		
		JButton G9 = new JButton("G9");
		G9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G9.setBackground(Color.RED);
			}
		});
		G9.setBounds(492, 224, 50, 23);
		contentPane.add(G9);
		
		JButton G10 = new JButton("G10");
		G10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G10.setBackground(Color.RED);
			}
		});
		G10.setBounds(552, 224, 57, 23);
		contentPane.add(G10);
		
		JButton G11 = new JButton("G11");
		G11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G11.setBackground(Color.RED);
			}
		});
		G11.setBounds(619, 224, 57, 23);
		contentPane.add(G11);
		
		JButton G12 = new JButton("G12");
		G12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G12.setBackground(Color.RED);
			}
		});
		G12.setBounds(686, 224, 57, 23);
		contentPane.add(G12);
		
		JButton G13 = new JButton("G13");
		G13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G13.setBackground(Color.RED);
			}
		});
		G13.setBounds(753, 224, 57, 23);
		contentPane.add(G13);
		
		JButton G14 = new JButton("G14");
		G14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G14.setBackground(Color.RED);
			}
		});
		G14.setBounds(820, 224, 65, 23);
		contentPane.add(G14);
		
		JButton G15 = new JButton("G15");
		G15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G15.setBackground(Color.RED);
			}
		});
		G15.setBounds(895, 224, 65, 23);
		contentPane.add(G15);
		
		JButton G16 = new JButton("G16");
		G16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				G16.setBackground(Color.RED);
			}
		});
		G16.setBounds(970, 224, 65, 23);
		contentPane.add(G16);
		
		// sillas H//

		JButton H1 = new JButton("H1");
		H1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H1.setBackground(Color.RED);
			}
		});
		H1.setBounds(10, 252, 50, 23);
		contentPane.add(H1);
		
		JButton H2 = new JButton("H2");
		H2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H2.setBackground(Color.RED);
			}
		});
		H2.setBounds(70, 252, 50, 23);
		contentPane.add(H2);
		
		JButton H3 = new JButton("H3");
		H3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H3.setBackground(Color.RED);
			}
		});
		H3.setBounds(130, 252, 50, 23);
		contentPane.add(H3);
		
		JButton H4 = new JButton("H4");
		H4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H4.setBackground(Color.RED);
			}
		});
		H4.setBounds(190, 252, 50, 23);
		contentPane.add(H4);
		
		JButton H5 = new JButton("H5");
		H5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H5.setBackground(Color.RED);
			}
		});
		H5.setBounds(252, 252, 50, 23);
		contentPane.add(H5);
		
		JButton H6 = new JButton("H6");
		H6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H6.setBackground(Color.RED);
			}
		});
		H6.setBounds(312, 252, 50, 23);
		contentPane.add(H6);
		
		JButton H7 = new JButton("H7");
		H7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H7.setBackground(Color.RED);
			}
		});
		H7.setBounds(372, 252, 50, 23);
		contentPane.add(H7);
		
		JButton H8 = new JButton("H8");
		H8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H8.setBackground(Color.RED);
			}
		});
		H8.setBounds(432, 252, 50, 23);
		contentPane.add(H8);
		
		JButton H9 = new JButton("H9");
		H9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H9.setBackground(Color.RED);
			}
		});
		H9.setBounds(492, 252, 50, 23);
		contentPane.add(H9);
		
		JButton H10 = new JButton("H10");
		H10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H10.setBackground(Color.RED);
			}
		});
		H10.setBounds(552, 252, 57, 23);
		contentPane.add(H10);
		
		JButton H11 = new JButton("H11");
		H11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H11.setBackground(Color.RED);
			}
		});
		H11.setBounds(619, 252, 57, 23);
		contentPane.add(H11);
		
		JButton H12 = new JButton("H12");
		H12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H12.setBackground(Color.RED);
			}
		});
		H12.setBounds(686, 252, 57, 23);
		contentPane.add(H12);
		
		JButton H13 = new JButton("H13");
		H13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H13.setBackground(Color.RED);
			}
		});
		H13.setBounds(753, 252, 57, 23);
		contentPane.add(H13);
		
		JButton H14 = new JButton("H14");
		H14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H14.setBackground(Color.RED);
			}
		});
		H14.setBounds(820, 252, 65, 23);
		contentPane.add(H14);
		
		JButton H15 = new JButton("H15");
		H15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H15.setBackground(Color.RED);
			}
		});
		H15.setBounds(895, 252, 65, 23);
		contentPane.add(H15);
		
		JButton H16 = new JButton("H16");
		H16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				H16.setBackground(Color.RED);
			}
		});
		H16.setBounds(970, 252, 65, 23);
		contentPane.add(H16);
		
		//sillas I//
		JButton I1 = new JButton("I1");
		I1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I1.setBackground(Color.RED);
			}
		});
		I1.setBounds(10, 280, 50, 23);
		contentPane.add(I1);
		
		JButton I2 = new JButton("I2");
		I2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I2.setBackground(Color.RED);
			}
		});
		I2.setBounds(70, 280, 50, 23);
		contentPane.add(I2);
		
		JButton I3 = new JButton("I3");
		I3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I3.setBackground(Color.RED);
			}
		});
		I3.setBounds(130, 280, 50, 23);
		contentPane.add(I3);
		
		JButton I4 = new JButton("I4");
		I4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I4.setBackground(Color.RED);
			}
		});
		I4.setBounds(190, 280, 50, 23);
		contentPane.add(I4);
		
		JButton I5 = new JButton("I5");
		I5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I5.setBackground(Color.RED);
			}
		});
		I5.setBounds(252, 280, 50, 23);
		contentPane.add(I5);
		
		JButton I6 = new JButton("I6");
		I6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I6.setBackground(Color.RED);
			}
		});
		I6.setBounds(312, 280, 50, 23);
		contentPane.add(I6);
		
		JButton I7 = new JButton("I7");
		I7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I7.setBackground(Color.RED);
			}
		});
		I7.setBounds(372, 280, 50, 23);
		contentPane.add(I7);
		
		JButton I8 = new JButton("I8");
		I8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I8.setBackground(Color.RED);
			}
		});
		I8.setBounds(432, 280, 50, 23);
		contentPane.add(I8);
		
		JButton I9 = new JButton("I9");
		I9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I9.setBackground(Color.RED);
			}
		});
		I9.setBounds(492, 280, 50, 23);
		contentPane.add(I9);
		
		JButton I10 = new JButton("I10");
		I10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I10.setBackground(Color.RED);
			}
		});
		I10.setBounds(552, 280, 57, 23);
		contentPane.add(I10);
		
		JButton I11 = new JButton("I11");
		I11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I11.setBackground(Color.RED);
			}
		});
		I11.setBounds(619, 280, 57, 23);
		contentPane.add(I11);
		
		JButton I12 = new JButton("I12");
		I12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I12.setBackground(Color.RED);
			}
		});
		I12.setBounds(686, 280, 57, 23);
		contentPane.add(I12);
		
		JButton I13 = new JButton("I13");
		I13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I13.setBackground(Color.RED);
			}
		});
		I13.setBounds(753, 280, 57, 23);
		contentPane.add(I13);
		
		JButton I14 = new JButton("I14");
		I14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I14.setBackground(Color.RED);
			}
		});
		I14.setBounds(820, 280, 65, 23);
		contentPane.add(I14);
		
		JButton I15 = new JButton("I15");
		I15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I15.setBackground(Color.RED);
			}
		});
		I15.setBounds(895, 280, 65, 23);
		contentPane.add(I15);
		
		JButton I16 = new JButton("I16");
		I16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				I16.setBackground(Color.RED);
			}
		});
		I16.setBounds(970, 280, 65, 23);
		contentPane.add(I16);
		
		// sillas J//
		JButton J1 = new JButton("J1");
		J1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J1.setBackground(Color.RED);
			}
		});
		J1.setBackground(new Color(255, 255, 128));
		J1.setBounds(10, 309, 50, 23);
		contentPane.add(J1);
		
		JButton J2 = new JButton("J2");
		J2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J2.setBackground(Color.RED);
			}
		});
		J2.setBackground(new Color(255, 255, 128));
		J2.setBounds(70, 309, 50, 23);
		contentPane.add(J2);
		
		JButton J3 = new JButton("J3");
		J3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J3.setBackground(Color.RED);
			}
		});
		J3.setBackground(new Color(255, 255, 128));
		J3.setBounds(130, 309, 50, 23);
		contentPane.add(J3);
		
		JButton J4 = new JButton("J4");
		J4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J4.setBackground(Color.RED);
			}
		});
		J4.setBackground(new Color(255, 255, 128));
		J4.setBounds(190, 309, 50, 23);
		contentPane.add(J4);
		
		JButton J5 = new JButton("J5");
		J5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J5.setBackground(Color.RED);
			}
		});
		J5.setBackground(new Color(255, 255, 128));
		J5.setBounds(252, 309, 50, 23);
		contentPane.add(J5);
		
		JButton J6 = new JButton("J6");
		J6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J6.setBackground(Color.RED);
			}
		});
		J6.setBackground(new Color(255, 255, 128));
		J6.setBounds(312, 309, 50, 23);
		contentPane.add(J6);
		
		JButton J7 = new JButton("J7");
		J7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J7.setBackground(Color.RED);
			}
		});
		J7.setBackground(new Color(255, 255, 128));
		J7.setBounds(372, 309, 50, 23);
		contentPane.add(J7);
		
		JButton J8 = new JButton("J8");
		J8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J8.setBackground(Color.RED);
			}
		});
		J8.setBackground(new Color(255, 255, 128));
		J8.setBounds(432, 309, 50, 23);
		contentPane.add(J8);
		
		JButton J9 = new JButton("J9");
		J9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J9.setBackground(Color.RED);
			}
		});
		J9.setBackground(new Color(255, 255, 128));
		J9.setBounds(492, 309, 50, 23);
		contentPane.add(J9);
		
		JButton J10 = new JButton("J10");
		J10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J10.setBackground(Color.RED);
			}
		});
		J10.setBackground(new Color(255, 255, 128));
		J10.setBounds(552, 309, 57, 23);
		contentPane.add(J10);
		
		JButton J11 = new JButton("J11");
		J11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J11.setBackground(Color.RED);
			}
		});
		J11.setBackground(new Color(255, 255, 128));
		J11.setBounds(619, 309, 57, 23);
		contentPane.add(J11);
		
		JButton J12 = new JButton("J12");
		J12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J12.setBackground(Color.RED);
			}
		});
		J12.setBackground(new Color(255, 255, 128));
		J12.setBounds(686, 309, 57, 23);
		contentPane.add(J12);
		
		JButton J13 = new JButton("J13");
		J13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J13.setBackground(Color.RED);
			}
		});
		J13.setBackground(new Color(255, 255, 128));
		J13.setBounds(753, 309, 57, 23);
		contentPane.add(J13);
		
		JButton J14 = new JButton("J14");
		J14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J14.setBackground(Color.RED);
			}
		});
		J14.setBackground(new Color(255, 255, 128));
		J14.setBounds(820, 309, 65, 23);
		contentPane.add(J14);
		
		JButton J15 = new JButton("J15");
		J15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J15.setBackground(Color.RED);
			}
		});
		J15.setBackground(new Color(255, 255, 128));
		J15.setBounds(895, 309, 65, 23);
		contentPane.add(J15);
		
		JButton J16 = new JButton("J16");
		J16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				J16.setBackground(Color.RED);
			}
		});
		J16.setBackground(new Color(255, 255, 128));
		J16.setBounds(970, 309, 65, 23);
		contentPane.add(J16);
		
		//sillas K//
		JButton K1 = new JButton("K1");
		K1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K1.setBackground(Color.RED);
			}
		});
		K1.setBackground(new Color(255, 255, 128));
		K1.setBounds(10, 339, 50, 23);
		contentPane.add(K1);
		
		JButton K2 = new JButton("K2");
		K2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K2.setBackground(Color.RED);
			}
		});
		K2.setBackground(new Color(255, 255, 128));
		K2.setBounds(70, 339, 50, 23);
		contentPane.add(K2);
		
		JButton K3 = new JButton("K3");
		K3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K3.setBackground(Color.RED);
			}
		});
		K3.setBackground(new Color(255, 255, 128));
		K3.setBounds(130, 339, 50, 23);
		contentPane.add(K3);
		
		JButton K4 = new JButton("K4");
		K4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K4.setBackground(Color.RED);
			}
		});
		K4.setBackground(new Color(255, 255, 128));
		K4.setBounds(190, 339, 50, 23);
		contentPane.add(K4);
		
		JButton K5 = new JButton("K5");
		K5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K5.setBackground(Color.RED);
			}
		});
		K5.setBackground(new Color(255, 255, 128));
		K5.setBounds(252, 339, 50, 23);
		contentPane.add(K5);
		
		JButton K6 = new JButton("K6");
		K6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K6.setBackground(Color.RED);
			}
		});
		K6.setBackground(new Color(255, 255, 128));
		K6.setBounds(312, 339, 50, 23);
		contentPane.add(K6);
		
		JButton K7 = new JButton("K7");
		K7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K7.setBackground(Color.RED);
			}
		});
		K7.setBackground(new Color(255, 255, 128));
		K7.setBounds(372, 339, 50, 23);
		contentPane.add(K7);
		
		JButton K8 = new JButton("K8");
		K8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K8.setBackground(Color.RED);
			}
		});
		K8.setBackground(new Color(255, 255, 128));
		K8.setBounds(432, 339, 50, 23);
		contentPane.add(K8);
		
		JButton K9 = new JButton("K9");
		K9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K9.setBackground(Color.RED);
			}
		});
		K9.setBackground(new Color(255, 255, 128));
		K9.setBounds(492, 339, 50, 23);
		contentPane.add(K9);
		
		JButton K10 = new JButton("K10");
		K10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K10.setBackground(Color.RED);
			}
		});
		K10.setBackground(new Color(255, 255, 128));
		K10.setBounds(552, 339, 57, 23);
		contentPane.add(K10);
		
		JButton K11 = new JButton("K11");
		K11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K11.setBackground(Color.RED);
			}
		});
		K11.setBackground(new Color(255, 255, 128));
		K11.setBounds(619, 339, 57, 23);
		contentPane.add(K11);
		
		JButton K12 = new JButton("K12");
		K12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K12.setBackground(Color.RED);
			}
		});
		K12.setBackground(new Color(255, 255, 128));
		K12.setBounds(686, 339, 57, 23);
		contentPane.add(K12);
		
		JButton K13 = new JButton("K13");
		K13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K13.setBackground(Color.RED);
			}
		});
		K13.setBackground(new Color(255, 255, 128));
		K13.setBounds(753, 339, 57, 23);
		contentPane.add(K13);
		
		JButton K14 = new JButton("K14");
		K14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K14.setBackground(Color.RED);
			}
		});
		K14.setBackground(new Color(255, 255, 128));
		K14.setBounds(820, 339, 65, 23);
		contentPane.add(K14);
		
		JButton K15 = new JButton("K15");
		K15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K15.setBackground(Color.RED);
			}
		});
		K15.setBackground(new Color(255, 255, 128));
		K15.setBounds(895, 339, 65, 23);
		contentPane.add(K15);
		
		JButton K16 = new JButton("K16");
		K16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				K16.setBackground(Color.RED);
			}
		});
		K16.setBackground(new Color(255, 255, 128));
		K16.setBounds(970, 339, 65, 23);
		contentPane.add(K16);
		
		// sillas L//
		JButton L1 = new JButton("L1");
		L1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L1.setBackground(Color.RED);
			}
		});
		L1.setBackground(new Color(255, 255, 128));
		L1.setBounds(10, 366, 50, 23);
		contentPane.add(L1);
		
		JButton L2 = new JButton("L2");
		L2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L2.setBackground(Color.RED);
			}
		});
		L2.setBackground(new Color(255, 255, 128));
		L2.setBounds(70, 366, 50, 23);
		contentPane.add(L2);
		
		JButton L3 = new JButton("L3");
		L3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L3.setBackground(Color.RED);
			}
		});
		L3.setBackground(new Color(255, 255, 128));
		L3.setBounds(130, 366, 50, 23);
		contentPane.add(L3);
		
		JButton L4 = new JButton("L4");
		L4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L4.setBackground(Color.RED);
			}
		});
		L4.setBackground(new Color(255, 255, 128));
		L4.setBounds(190, 366, 50, 23);
		contentPane.add(L4);
		
		JButton L5 = new JButton("L5");
		L5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L5.setBackground(Color.RED);
			}
		});
		L5.setBackground(new Color(255, 255, 128));
		L5.setBounds(252, 366, 50, 23);
		contentPane.add(L5);
		
		JButton L6 = new JButton("L6");
		L6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L6.setBackground(Color.RED);
			}
		});
		L6.setBackground(new Color(255, 255, 128));
		L6.setBounds(312, 366, 50, 23);
		contentPane.add(L6);
		
		JButton L7 = new JButton("L7");
		L7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L7.setBackground(Color.RED);
			}
		});
		L7.setBackground(new Color(255, 255, 128));
		L7.setBounds(372, 366, 50, 23);
		contentPane.add(L7);
		
		JButton L8 = new JButton("L8");
		L8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L8.setBackground(Color.RED);
			}
		});
		L8.setBackground(new Color(255, 255, 128));
		L8.setBounds(432, 366, 50, 23);
		contentPane.add(L8);
		
		JButton L9 = new JButton("L9");
		L9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L9.setBackground(Color.RED);
			}
		});
		L9.setBackground(new Color(255, 255, 128));
		L9.setBounds(492, 366, 50, 23);
		contentPane.add(L9);
		
		JButton L10 = new JButton("L10");
		L10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L10.setBackground(Color.RED);
			}
		});
		L10.setBackground(new Color(255, 255, 128));
		L10.setBounds(552, 366, 57, 23);
		contentPane.add(L10);
		
		JButton L11 = new JButton("L11");
		L11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L11.setBackground(Color.RED);
			}
		});
		L11.setBackground(new Color(255, 255, 128));
		L11.setBounds(619, 366, 57, 23);
		contentPane.add(L11);
		
		JButton L12 = new JButton("L12");
		L12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L12.setBackground(Color.RED);
			}
		});
		L12.setBackground(new Color(255, 255, 128));
		L12.setBounds(686, 366, 57, 23);
		contentPane.add(L12);
		
		JButton L13 = new JButton("L13");
		L13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L13.setBackground(Color.RED);
			}
		});
		L13.setBackground(new Color(255, 255, 128));
		L13.setBounds(753, 366, 57, 23);
		contentPane.add(L13);
		
		JButton L14 = new JButton("L14");
		L14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L14.setBackground(Color.RED);
			}
		});
		L14.setBackground(new Color(255, 255, 128));
		L14.setBounds(820, 366, 65, 23);
		contentPane.add(L14);
		
		JButton L15 = new JButton("L15");
		L15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L15.setBackground(Color.RED);
			}
		});
		L15.setBackground(new Color(255, 255, 128));
		L15.setBounds(895, 366, 65, 23);
		contentPane.add(L15);
		
		JButton L16 = new JButton("L16");
		L16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				L16.setBackground(Color.RED);
			}
		});
		L16.setBackground(new Color(255, 255, 128));
		L16.setBounds(970, 366, 65, 23);
		contentPane.add(L16);
		
		// Sillas M// 
		
		JButton M1 = new JButton("M1");
		M1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M1.setBackground(Color.RED);
			}
		});
		M1.setBackground(new Color(255, 255, 128));
		M1.setBounds(10, 394, 57, 23);
		contentPane.add(M1);
		
		JButton M2 = new JButton("M2");
		M2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M2.setBackground(Color.RED);
			}
		});
		M2.setBackground(new Color(255, 255, 128));
		M2.setBounds(70, 394, 57, 23);
		contentPane.add(M2);
		
		JButton M3 = new JButton("M3");
		M3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M3.setBackground(Color.RED);
			}
		});
		M3.setBackground(new Color(255, 255, 128));
		M3.setBounds(130, 394, 57, 23);
		contentPane.add(M3);
		
		JButton M4 = new JButton("M4");
		M4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M4.setBackground(Color.RED);
			}
		});
		M4.setBackground(new Color(255, 255, 128));
		M4.setBounds(190, 394, 57, 23);
		contentPane.add(M4);
		
		JButton M5 = new JButton("M5");
		M5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M5.setBackground(Color.RED);
			}
		});
		M5.setBackground(new Color(255, 255, 128));
		M5.setBounds(252, 394, 57, 23);
		contentPane.add(M5);
		
		JButton M6 = new JButton("M6");
		M6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M6.setBackground(Color.RED);
			}
		});
		M6.setBackground(new Color(255, 255, 128));
		M6.setBounds(312, 394, 57, 23);
		contentPane.add(M6);
		
		JButton M7 = new JButton("M7");
		M7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M7.setBackground(Color.RED);
			}
		});
		M7.setBackground(new Color(255, 255, 128));
		M7.setBounds(372, 394, 57, 23);
		contentPane.add(M7);
		
		JButton M8 = new JButton("M8");
		M8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M8.setBackground(Color.RED);
			}
		});
		M8.setBackground(new Color(255, 255, 128));
		M8.setBounds(432, 394, 57, 23);
		contentPane.add(M8);
		
		JButton M9 = new JButton("M9");
		M9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M9.setBackground(Color.RED);
			}
		});
		M9.setBackground(new Color(255, 255, 128));
		M9.setBounds(492, 394, 57, 23);
		contentPane.add(M9);
		
		JButton M10 = new JButton("M10");
		M10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M10.setBackground(Color.RED);
			}
		});
		M10.setBackground(new Color(255, 255, 128));
		M10.setBounds(552, 394, 65, 23);
		contentPane.add(M10);
		
		JButton M11 = new JButton("M11");
		M11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M11.setBackground(Color.RED);
			}
		});
		M11.setBackground(new Color(255, 255, 128));
		M11.setBounds(619, 394, 65, 23);
		contentPane.add(M11);
		
		JButton M12 = new JButton("M12");
		M12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M12.setBackground(Color.RED);
			}
		});
		M12.setBackground(new Color(255, 255, 128));
		M12.setBounds(686, 394, 65, 23);
		contentPane.add(M12);
		
		JButton M13 = new JButton("M13");
		M13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M13.setBackground(Color.RED);
			}
		});
		M13.setBackground(new Color(255, 255, 128));
		M13.setBounds(753, 394, 65, 23);
		contentPane.add(M13);
		
		JButton M14 = new JButton("M14");
		M14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M14.setBackground(Color.RED);
			}
		});
		M14.setBackground(new Color(255, 255, 128));
		M14.setBounds(820, 394, 65, 23);
		contentPane.add(M14);
		
		JButton M15 = new JButton("M15");
		M15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M15.setBackground(Color.RED);
			}
		});
		M15.setBackground(new Color(255, 255, 128));
		M15.setBounds(895, 394, 65, 23);
		contentPane.add(M15);
		
		JButton M16 = new JButton("M16");
		M16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				M16.setBackground(Color.RED);
			}
		});
		M16.setBackground(new Color(255, 255, 128));
		M16.setBounds(970, 394, 65, 23);
		contentPane.add(M16);
		
		JButton Volver = new JButton("Volver");
		Volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginUsuarios frame= new loginUsuarios();
				frame.setVisible(true);
			}
		});
		Volver.setBounds(31, 428, 89, 23);
		contentPane.add(Volver);
		
		JButton Siguiente = new JButton("Siguiente");
		Siguiente.setBounds(926, 428, 89, 23);
		contentPane.add(Siguiente);
		
		
		
		
		
		
		
	}
}
