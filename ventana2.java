import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.GridBagLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana2 {

	private JFrame frame;
	private JTextField txtZahirFernando;
	private JTextField txtDiaz;
	private JTextField txtBarrera;
	private JTextField textField_3;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana2 window = new ventana2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 64));
		panel.setBorder(new LineBorder(new Color(0, 255, 64),20));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 64));
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setBorder(new LineBorder(new Color(0, 255, 64),10));
		panel_1.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Datos Generales");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_2.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 255, 255));
		panel_2.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new GridLayout(6, 6, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("Nombres");
		lblNewLabel_2.setBorder(BorderFactory.createMatteBorder(10, 30, 10, 0, new Color(0, 255, 255) ));
		panel_7.add(lblNewLabel_2);
		
		txtZahirFernando = new JTextField();
		txtZahirFernando.setText("");
		txtZahirFernando.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 20, new Color(0, 255, 255) ));
		panel_7.add(txtZahirFernando);
		txtZahirFernando.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido Paterno");
		lblNewLabel_3.setBorder(BorderFactory.createMatteBorder(10, 30, 10, 0, new Color(0, 255, 255) ));
		panel_7.add(lblNewLabel_3);
		
		txtDiaz = new JTextField();
		txtDiaz.setText("");
		txtDiaz.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 20, new Color(0, 255, 255) ));
		panel_7.add(txtDiaz);
		txtDiaz.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido Materno");
		lblNewLabel_4.setBorder(BorderFactory.createMatteBorder(10, 30, 10, 0, new Color(0, 255, 255) ));
		panel_7.add(lblNewLabel_4);
		
		txtBarrera = new JTextField();
		txtBarrera.setText("");
		txtBarrera.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 20, new Color(0, 255, 255) ));
		panel_7.add(txtBarrera);
		txtBarrera.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha Nacimiento");
		lblNewLabel_5.setBorder(BorderFactory.createMatteBorder(10, 30, 10, 0, new Color(0, 255, 255) ));
		panel_7.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setText("00/00/000");
		textField_3.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 20, new Color(0, 255, 255) ));
		panel_7.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Sexo");
		lblNewLabel_6.setBorder(BorderFactory.createMatteBorder(10, 30, 10, 0, new Color(0, 255, 255) ));
		panel_7.add(lblNewLabel_6);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(0, 255, 255));
		panel_8.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 20, new Color(0, 255, 255) ));
		panel_7.add(panel_8);
		panel_8.setLayout(new GridLayout(2, 2, 5, 5));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBackground(new Color(0, 255, 255));
		panel_8.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBackground(new Color(0, 255, 255));
		panel_8.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Nacionalidad");
		lblNewLabel_7.setBorder(BorderFactory.createMatteBorder(10, 30, 10, 0, new Color(0, 255, 255) ));
		panel_7.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(BorderFactory.createMatteBorder(10, 0, 10, 20, new Color(0, 255, 255) ));
		panel_7.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mexico", "Brasil"}));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 128, 255));
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBorder(BorderFactory.createMatteBorder(10, 225, 10, 0, new Color(255, 128, 255) ));
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\PC WHITE WOLF\\Downloads\\user (1).png"));
		panel_4.add(lblNewLabel_11, BorderLayout.CENTER);
		
		JLabel lblNewLabel_12 = new JLabel("Perfil De Usuario");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_4.add(lblNewLabel_12, BorderLayout.NORTH);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 128, 255));
		panel_4.add(panel_9, BorderLayout.SOUTH);
		panel_9.setLayout(new GridLayout(2, 2, 50, 50));
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxNewCheckBox_1.setBorder(BorderFactory.createMatteBorder(10, 225, 10, 0, new Color(255, 128, 255) ));
		chckbxNewCheckBox_1.setBackground(new Color(255, 128, 255));
		panel_9.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxNewCheckBox.setBorder(BorderFactory.createMatteBorder(10, 200, 10, 0, new Color(255, 128, 255) ));
		chckbxNewCheckBox.setBackground(new Color(255, 128, 255));
		panel_9.add(chckbxNewCheckBox);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 128));
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("Datos Opcionales");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_3.add(lblNewLabel_8, BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 128, 128));
		panel_3.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new GridLayout(2, 2, 10, 10));
		
		JLabel lblNewLabel_10 = new JLabel("Descripcion");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_10.setBorder(BorderFactory.createMatteBorder(30, 100, 30, 0, new Color(255, 128, 128) ));
		panel_6.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("Preferencias ");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_9.setBorder(BorderFactory.createMatteBorder(30, 100, 30, 0, new Color(255, 128, 128) ));
		panel_6.add(lblNewLabel_9);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(BorderFactory.createMatteBorder(30, 30, 30, 30, new Color(255, 128, 128) ));
		panel_6.add(scrollPane);
		
		JTextArea txtrDarkSoulsEs = new JTextArea(10,30);
		scrollPane.setViewportView(txtrDarkSoulsEs);
		txtrDarkSoulsEs.setText("Hola Amigos de Youtube sabian que ¿los hates de la paz son mas buenos que los de sonora?.");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(BorderFactory.createMatteBorder(30, 30, 30, 30, new Color(255, 128, 128) ));
		panel_6.add(scrollPane_1);
		
		JTextArea txtrVideojuegosMusicaLeer = new JTextArea(10,30);
		txtrVideojuegosMusicaLeer.setText("Videojuegos \r\nMusica \r\nLeer \r\nOtros\r\n.\r\n.\r\n.\r\n.\r\n.\r\n .");
		scrollPane_1.setViewportView(txtrVideojuegosMusicaLeer);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 255, 255));
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setIcon(new ImageIcon("C:///Users/zahirdiazbarrera/eclipse-workspace/Codigo/images/6492359.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton.setBounds(222, 83, 200, 50);
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setIcon(new ImageIcon("C:/Users/zahirdiazbarrera/eclipse-workspace/Codigo/images/6492359.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton_1.setBounds(222, 186, 200, 50);
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setIcon(new ImageIcon("C:/Users/zahirdiazbarrera/eclipse-workspace/Codigo/images/6492359.png"));
		btnNewButton_2.setBackground(new Color(240, 240, 240));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton_2.setBounds(222, 289, 200, 50);
		panel_5.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Regristro de Usuario");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel, BorderLayout.NORTH);
		frame.setBackground(new Color(0, 255, 255));
		frame.setBounds(100,0, 1300, 900);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
	}
}