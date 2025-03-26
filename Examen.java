import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;

public class Examen {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField txtCalle;
	private JTextField txtNombre;
	private JTextField textField_3;
	private JTextField textField_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen window = new Examen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Examen() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(54, 80, 254));
		panel_1.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panel_1.setBounds(0, 0, 584, 70);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura en Java-Eclipse-ArrayList Y Poo");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 407, 14);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 81, 564, 100);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Datos del cliente");
		lblNewLabel_1.setBounds(10, 11, 132, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Documento:");
		lblNewLabel_2.setBounds(10, 36, 70, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Direccion:");
		lblNewLabel_3.setBounds(10, 75, 59, 14);
		panel_2.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setText("#654321");
		textField.setBounds(90, 36, 160, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		txtCalle = new JTextField();
		txtCalle.setText("Calle");
		txtCalle.setBounds(90, 72, 160, 20);
		panel_2.add(txtCalle);
		txtCalle.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nombres:");
		lblNewLabel_4.setBounds(315, 36, 67, 14);
		panel_2.add(lblNewLabel_4);
		
		txtNombre = new JTextField();
		txtNombre.setText("Zahir Fernando");
		txtNombre.setColumns(10);
		txtNombre.setBounds(394, 33, 160, 20);
		panel_2.add(txtNombre);
		
		JLabel lblNewLabel_5 = new JLabel("Telefono:");
		lblNewLabel_5.setBounds(315, 75, 67, 14);
		panel_2.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setText("55-555-5555");
		textField_3.setColumns(10);
		textField_3.setBounds(394, 72, 160, 20);
		panel_2.add(textField_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 192, 564, 70);
		panel_3.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Datos de factura");
		lblNewLabel_6.setBounds(10, 11, 136, 14);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("No. Factura");
		lblNewLabel_7.setBounds(10, 36, 80, 14);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("1");
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_8.setBounds(100, 36, 46, 14);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Fecha:");
		lblNewLabel_9.setBounds(315, 36, 46, 14);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("3/11/2005");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_10.setBounds(390, 36, 89, 14);
		panel_3.add(lblNewLabel_10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 273, 564, 40);
		panel_4.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Ver listado de factura");
		lblNewLabel_11.setBounds(10, 13, 195, 18);
		panel_4.add(lblNewLabel_11);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setBounds(438, 11, 116, 23);
		panel_4.add(btnNewButton_2);
		ImageIcon eliminar =new ImageIcon("images/eliminar.png");
		Image port= eliminar.getImage();
		Image port2=port.getScaledInstance(22, 22,Image.SCALE_SMOOTH);
		btnNewButton_2.setIcon(new ImageIcon(port2));
		
		JButton btnNewButton_3 = new JButton("Añadir");
		btnNewButton_3.setBounds(312, 11, 116, 23);
		panel_4.add(btnNewButton_3);
		ImageIcon añadir =new ImageIcon("images/circulo.png");
		Image port3= añadir.getImage();
		Image port4=port3.getScaledInstance(22, 22,Image.SCALE_SMOOTH);
		btnNewButton_3.setIcon(new ImageIcon(port4));
		
		table = new JTable();
		table.setToolTipText("");
		table.setBounds(10, 313, 564, 100);
		table.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		table.setModel(new DefaultTableModel(
	            new Object[][] {
	            	{"Producto", "Cantidad", "Valor", "Sub Total"}, 
	                {"Agua", 2, 500, 1000.0},
	                {"Cereal", 5, 1000, 5000.0},
	                {"Leche", 2, 300, 600.0},
	            },
	            new String[] {"Producto", "Cantidad", "Valor", "Sub Total"} 
	        ));
		panel.add(table);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.setBounds(450, 577, 124, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Finalizar factura");
		btnNewButton_1.setBounds(313, 577, 127, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_12 = new JLabel("SubTotal:");
		lblNewLabel_12.setBounds(20, 424, 75, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("%Descuento:");
		lblNewLabel_13.setBounds(10, 469, 85, 14);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("IVA 16%:");
		lblNewLabel_14.setBounds(10, 504, 85, 14);
		panel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Total Factura:");
		lblNewLabel_15.setBounds(10, 541, 85, 14);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("6600.0");
		lblNewLabel_16.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_16.setBounds(118, 424, 46, 14);
		panel.add(lblNewLabel_16);
		
		textField_1 = new JTextField();
		textField_1.setText("5");
		textField_1.setBounds(102, 466, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(194, 463, 21, 23);
		panel.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_17 = new JLabel("Valor descontado:");
		lblNewLabel_17.setBounds(251, 469, 127, 14);
		panel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("330.0");
		lblNewLabel_18.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_18.setBounds(388, 469, 101, 14);
		panel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("1254.0");
		lblNewLabel_19.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_19.setBounds(102, 504, 86, 14);
		panel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("7524.0");
		lblNewLabel_20.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_20.setBounds(102, 541, 86, 14);
		panel.add(lblNewLabel_20);
	
	}

	
}