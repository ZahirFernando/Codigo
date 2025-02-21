import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class Ventana extends JFrame {
	
	//esto es un comentario

    public Ventana() {
        this.setVisible(true);
        this.setSize(1000, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setMaximumSize(new Dimension(800, 800));
        this.setMinimumSize(new Dimension(400, 400));

        //this.add(this.login());
      //  this.add(this.registro()); 
        this.add(this.user());
        this.repaint();
    }

    public JPanel login() {
        Font fuente = new Font("Arial", Font.BOLD, 20);

        JPanel mipanel = new JPanel();
        mipanel.setBackground(Color.decode("#D3D3D3"));
        mipanel.setOpaque(true);
        mipanel.setSize(1000, 500);
        mipanel.setLocation(0, 0);
        mipanel.setLayout(null);

        JLabel etiqueta1 = new JLabel("Usuarios");
        etiqueta1.setSize(260, 30);
        etiqueta1.setLocation(360,10);
        etiqueta1.setHorizontalAlignment(JLabel.CENTER);
        etiqueta1.setFont(new Font("American Typewriter", Font.BOLD, 24));
        mipanel.add(etiqueta1);

        JLabel etiqueta2 = new JLabel("Ingrese su correo:");
        etiqueta2.setSize(200, 30);
        etiqueta2.setLocation(40, 80);
        etiqueta2.setFont(fuente);
        mipanel.add(etiqueta2);

        JTextField email = new JTextField();
        email.setSize(300, 30);
        email.setLocation(38, 110);
        email.setFont(fuente);
        mipanel.add(email);

        JLabel password = new JLabel("Ingrese su contraseña:");
        password.setSize(250, 30);
        password.setLocation(40, 150);
        password.setFont(fuente);
        mipanel.add(password);

        JPasswordField password_tag = new JPasswordField();
        password_tag.setBounds(38, 180, 300, 30);
        password_tag.setFont(fuente);
        mipanel.add(password_tag);

        JCheckBox terms = new JCheckBox("Recordarme", false);
        terms.setSize(250, 30);
        terms.setLocation(40, 210);
        terms.setBackground(Color.decode("#D3D3D3"));
        mipanel.add(terms);

        JLabel forgot_tag = new JLabel("¿Olvidó su contraseña?");
        forgot_tag.setSize(250, 30);
        forgot_tag.setLocation(200, 240);
        mipanel.add(forgot_tag);

        JButton access = new JButton("ACCEDER");
        access.setBounds(110, 350, 200, 50);
        access.setFont(fuente);
        access.setBackground(Color.BLACK);
        mipanel.add(access);
         
       /*  String dataset []= {"Camino real", "Centro", "La Fuente", "Villas del Encanto"};
		JComboBox colonias = new JComboBox(dataset);
		colonias.setSize(200, 40);
		colonias.setLocation(40,410);
		colonias.setOpaque(true);
		mipanel.add(colonias);
		
        JRadioButton terms1 = new JRadioButton("Acepto los términos");
        terms1.setSize(200, 40);
        terms1.setLocation(40, 460);
        mipanel.add(terms1);

        JRadioButton terms2 = new JRadioButton("No acepto los términos");
        terms2.setSize(200, 40);
        terms2.setLocation(40, 500);
        mipanel.add(terms2);

        ButtonGroup terms_group = new ButtonGroup();
        terms_group.add(terms1);
        terms_group.add(terms2); */

        this.repaint();
        return mipanel;
    }

  		public JPanel registro() {
        JPanel registro = new JPanel();
        registro.setOpaque(true);
        registro.setSize(500, 500);
        registro.setLocation(500, 0);
        registro.setLayout(null);

        JLabel title_R = new JLabel("Registro");
        title_R.setHorizontalAlignment(JLabel.CENTER);
        title_R.setFont(new Font("American Typewriter", Font.BOLD, 24));
        title_R.setSize(200, 30);
        title_R.setLocation(150, 10);
        registro.add(title_R);

        JLabel user_tag = new JLabel("Nombre de Usuario:");
        user_tag.setFont(new Font("Agency FB", Font.BOLD, 15));
        user_tag.setSize(200, 20);
        user_tag.setLocation(10, 70);
        registro.add(user_tag);

        JTextField user_field = new JTextField();
        user_field.setBounds(10, 90, 480, 35);
        registro.add(user_field);
        
        JLabel biogra = new JLabel("Bio:");
        biogra.setFont(new Font("Agency FB", Font.BOLD, 15));
        biogra.setSize(260, 160);
        biogra.setLocation(10, 70);
        registro.add(biogra);
        
        JTextField text_biogra = new JTextField();
        text_biogra.setBounds(10, 160, 480, 70);
        registro.add(text_biogra);
        
        JLabel preferencia = new JLabel("Preferencias:");
        preferencia.setFont(new Font("Agency FB", Font.BOLD, 15));
        preferencia.setSize(260, 360);
        preferencia.setLocation(10, 70);
        registro.add(preferencia);
        
        JTextField user_preference = new JTextField();
        user_preference.setBounds(10, 180, 280, 35);
        registro.add(user_preference);

        JCheckBox gusto1 = new JCheckBox("Salado");
        gusto1.setBounds(10, 260, 200, 30);
        registro.add(gusto1);

        JCheckBox gusto2 = new JCheckBox("Dulce");
        gusto2.setBounds(180, 260, 200, 30);
        registro.add(gusto2);

        JCheckBox gusto3 = new JCheckBox("Saludable");
        gusto3.setBounds(340, 260, 300, 30);
        registro.add(gusto3);
        
        JLabel terms = new JLabel("Terminos:");
        terms.setFont(new Font("Agency FB", Font.BOLD, 15));
        terms.setSize(200, 470);
        terms.setLocation(10, 70);
        registro.add(terms);
         
        JRadioButton terms1 = new JRadioButton("Acepto los terminos");
        terms1.setBounds(10, 320, 200, 30);
        registro.add(terms1);

        JRadioButton terms2 = new JRadioButton("No acepto los Terminos");
        terms2.setBounds(200, 320, 200, 30);
        registro.add(terms2);
        
        ButtonGroup terms_group = new ButtonGroup();
        terms_group.add(terms1);
        terms_group.add(terms2); 
        
        String dataset []= {"Camino real", "Centro", "La Fuente", "Villas del Encanto"};
		JComboBox colonias = new JComboBox(dataset);
		colonias.setSize(470, 20);
		colonias.setLocation(10,360);
		colonias.setOpaque(true);
		colonias.setBackground(Color.WHITE);
		registro.add(colonias);
        
        JButton registerButton = new JButton("Crear cuenta");
        registerButton.setBounds(150, 400, 200, 50);
        registerButton.setFont(new Font("Arial", Font.BOLD, 18));
        registerButton.setBackground(Color.BLACK);
       // registerButton.setForeground(Color.WHITE);
        registro.add(registerButton);
        
        /*String columnas [] = {"Nombre","Apellidos","Edad","Genero","Carrera"};
        String users[][] = {
        		{"Zahir", "Diaz Barrera", "19", "Hombre", "IDS"},
        		{"Keyra", "Grijalva Ochoa", "19", "Mujer", "IDS"},
        		{"Aron", "Hernandez Cota", "21", "Hombre", "ITC"},
        		{"Rene", "Leyva Estrada", "23", "Hombre", "IPA"},
        		{"Jorge", "Lopez", "19", "Hombre", "IDS"},
        		{"Carlos", "Hernandez Armenta", "19", "Hombre", "IDS"},
        		{"Jose", "Reyes Pineda", "19", "Hombre", "IDS"},
        		{"Mario", "Cazares", "19", "Hombre", "IDS"},
        		{"Fernando", "Diaz Cota", "19", "Hombre", "IDS"}
        		
        };
        
        JTable tabla = new JTable(users,columnas);
        JScrollPane scroll_pane = new JScrollPane(tabla);
        scroll_pane.setSize(850, 300);
        scroll_pane.setLocation(60, 120);
        registro.add(scroll_pane);*/

        this.repaint();
        return registro;
    }
    
  		public JPanel user() {
        Font fuente = new Font("Arial", Font.BOLD, 20);

        JPanel mipanel = new JPanel();
        mipanel.setBackground(Color.decode("#D3D3D3"));
        mipanel.setOpaque(true);
        mipanel.setSize(1000, 500);
        mipanel.setLocation(0, 0);
        mipanel.setLayout(null);

        JLabel etiqueta1 = new JLabel("Usuarios");
        etiqueta1.setSize(260, 30);
        etiqueta1.setLocation(360,10);
        etiqueta1.setHorizontalAlignment(JLabel.CENTER);
        etiqueta1.setFont(new Font("American Typewriter", Font.BOLD, 24));
        mipanel.add(etiqueta1);
        
        String columnas [] = {"Nombre","Apellidos","Edad","Genero","Carrera"};
        String users[][] = {
        		{"Zahir", "Diaz Barrera", "19", "Hombre", "IDS"},
        		{"Keyra", "Grijalva Ochoa", "19", "Mujer", "IDS"},
        		{"Aron", "Hernandez Cota", "21", "Hombre", "ITC"},
        		{"Rene", "Leyva Estrada", "23", "Hombre", "IPA"},
        		{"Jorge", "Lopez", "19", "Hombre", "IDS"},
        		{"Carlos", "Hernandez Armenta", "19", "Hombre", "IDS"},
        		{"Jose", "Reyes Pineda", "24", "Hombre", "IDS"},
        		{"Mario", "Cazares", "22", "Hombre", "IDS"},
        		{"Fernando", "Diaz Cota", "25", "Hombre", "IDS"},
        		{"Raul", "Cota Robles", "19", "Hombre", "IDS"},
        		{"Valentina", "Chavez Ochoa", "20", "Mujer", "IDS"},
        		{"Carlos", "Hernandez Hernandez", "21", "Hombre", "Turismo"},
        		{"Cristopher", "Chavez Dominguez", "23", "Hombre", "IPA"},
        		{"Jhonatan", "Chairez Dominguez", "24", "Hombre", "IAG"},
        		{"Michael", "Suarez", "19", "Hombre", "IDS"},
        		{"James", "Villalobos godinez", "21", "Hombre", "ITC"},
        		{"Jesus", "Manriquez Villarino", "20", "Hombre", "IDS"},
        		{"Cesar", "Avilez Cota", "23", "Hombre", "Turismo"},
        		{"Jorge", "Godinez Meza", "21", "Hombre", "ITC"},
        		{"Mario", "Villavicencio ", "20", "Hombre", "IDS"},
        		{"Eddy", "Peters", "23", "Hombre", "IAG"},

        };
        
        JTable tabla2 = new JTable(users,columnas);
        JScrollPane scroll_pane = new JScrollPane(tabla2);
        scroll_pane.setSize(850, 300);
        scroll_pane.setLocation(60, 120);
        mipanel.add(scroll_pane);
		
		JLabel usuario= new JLabel("Usuarios");
	    usuario.setFont(new Font("Agency FB", Font.BOLD, 20));
	    usuario.setSize(100, 20);
	    usuario.setLocation(50, 50);
	    usuario.setOpaque(true);
	    usuario.setBackground(Color.WHITE);
	    mipanel.add(usuario);
	    
		JLabel numeros = new JLabel("21");
	    numeros.setFont(new Font("Agency FB", Font.BOLD, 20));
	    numeros.setSize(30, 20);
	    numeros.setLocation(80, 70);
	    numeros.setOpaque(true);
	    numeros.setBackground(Color.WHITE);
	    mipanel.add(numeros);
	    
		JLabel relleno = new JLabel("");
	    relleno.setSize(120, 50);
		relleno.setLocation(40,40);
		relleno.setOpaque(true);
		relleno.setBackground(Color.BLACK);
		mipanel.add(relleno);
		
		JButton access = new JButton("Aceptar");
        access.setBounds(700, 60, 100, 50);
        access.setFont(fuente);
        access.setBackground(Color.BLACK);
        mipanel.add(access);	
        
        JButton access2 = new JButton("Borrar");
        access2.setBounds(800, 60, 100, 50);
        access2.setFont(fuente);
        access2.setBackground(Color.BLACK);
        mipanel.add(access2);
        
    
	        return mipanel;
			
    
     }  
}


/*import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Ventana extends JFrame{

	public Ventana() {
		
		this.setVisible(true);
		this.setSize(1000, 500);
		this.setLocationRelativeTo(null);
		
		this.setTitle("Login");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true); 
		
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(400,400));
		
		this.add(this.login());
		this.repaint();
	} */		