import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



//hola

public class Ventana extends JFrame {
	

    public Ventana() {	//commit login
        this.setVisible(true);
        this.setSize(365, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setMaximumSize(new Dimension(800, 800));
        this.setMinimumSize(new Dimension(300, 300));

       //this.add(this.login());
       //this.add(this.registro()); 
       //this.add(this.user());
        this.add(this.calculadora());
        this.repaint();
    }

    public JPanel login() { 
        Font fuente = new Font("Times New Roman", Font.BOLD, 20);
     	
        JPanel mipanel = new JPanel();
        mipanel.setBackground(Color.decode("#4682B4"));
        mipanel.setOpaque(true);
        mipanel.setSize(1000, 500);
        mipanel.setLocation(0, 0);
        mipanel.setLayout(null);
        
        ImageIcon imagen = new ImageIcon("///Users/zahirdiazbarrera/eclipse-workspace/Codigo/images/Login.png");
		JLabel icon_img = new JLabel();
		icon_img.setBounds(400, 0, 500, 500);
		icon_img.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(icon_img.getWidth(), icon_img.getHeight(),Image.SCALE_DEFAULT)));
		mipanel.add(icon_img);
		
        JLabel etiqueta1 = new JLabel("Welcome");
        etiqueta1.setSize(300, 30);
        etiqueta1.setLocation(60,10);
        etiqueta1.setHorizontalAlignment(JLabel.CENTER);
        etiqueta1.setFont(new Font("American Typewriter", Font.BOLD, 24));
        mipanel.add(etiqueta1);

        JLabel etiqueta2 = new JLabel("Username:");
        etiqueta2.setSize(300, 30);
        etiqueta2.setLocation(60, 80);
        etiqueta2.setFont(fuente);
        mipanel.add(etiqueta2);

        JTextField email = new JTextField();
        email.setSize(300, 30);
        email.setLocation(58, 110);
        email.setFont(fuente);
        mipanel.add(email);

        JLabel password = new JLabel("Password:");
        password.setSize(360, 30);
        password.setLocation(60, 150);
        password.setFont(fuente);
        mipanel.add(password);

        JPasswordField password_tag = new JPasswordField();
        password_tag.setBounds(58, 180, 300, 30);
        password_tag.setFont(fuente);
        mipanel.add(password_tag);

        JCheckBox terms = new JCheckBox("Remember me", false);
        terms.setSize(250, 30);
        terms.setLocation(55, 210);
        terms.setBackground(Color.decode("#D3D3D3"));
        mipanel.add(terms);

        JLabel forgot_tag = new JLabel("Forgot your password?");
        forgot_tag.setSize(250, 30);
        forgot_tag.setLocation(215, 240);
        mipanel.add(forgot_tag);
        
        JLabel forgot_user = new JLabel("Don't have a account?");
        forgot_user.setSize(250, 30);
        forgot_user.setLocation(140, 400);
        mipanel.add(forgot_user);

        JButton access = new JButton("Log In");
        access.setBounds(110, 350, 200, 50);
        access.setFont(fuente);
        access.setBackground(Color.BLACK);
        mipanel.add(access);
        
       
       
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
        
   
        this.repaint();
        return registro;
    } // ejercicio usuario
    
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
  	
  	public JPanel calculadora() {
  		
  		JPanel panel = new JPanel();
  		panel.setBackground(Color.decode("#FFFFFF"));
  		panel.setSize(400, 500);
  		panel.setLayout(null);
  		
  		JTextField pantalla = new JTextField();
  		pantalla.setSize(345, 90);
  		pantalla.setOpaque(true);
  		pantalla.setHorizontalAlignment(JLabel.HEIGHT);
  		pantalla.setLocation(10, 10);
  		panel.add(pantalla);
  		
  		JButton num0 = new JButton("0");
  		num0.setSize(80, 60);
  		num0.setBackground(Color.GRAY);
  		num0.setLocation(10, 390);
  		panel.add(num0);
  		
  		JButton num1 = new JButton("1");
  		num1.setSize(80, 60);
  		num1.setBackground(Color.GRAY);
  		num1.setLocation(10, 320);
  		panel.add(num1);
  		
  		JButton num2 = new JButton("2");
  		num2.setSize(80, 60);
  		num2.setBackground(Color.GRAY);
  		num2.setLocation(100, 320);
  		panel.add(num2);
  		
  		JButton num3 = new JButton("3");
  		num3.setSize(80, 60);
  		num3.setBackground(Color.GRAY);
  		num3.setLocation(190, 320);
  		panel.add(num3);
  		
  		JButton resta = new JButton("-");
  		resta.setSize(80, 60);
  		resta.setBackground(Color.GRAY);
  		resta.setLocation(280, 320);
  		panel.add(resta);
  		
  		JButton button = new JButton(".");
  		button.setSize(80, 60);
  		button.setBackground(Color.GRAY);
  		button.setLocation(100, 390);
  		panel.add(button);
  		
  		JButton igual = new JButton("=");
  		igual.setSize(80, 60	);
  		igual.setBackground(Color.GRAY);
  		igual.setLocation(190, 390);
  		panel.add(igual);
  		
  		JButton suma = new JButton("+");
  		suma.setSize(80, 60);
  		suma.setBackground(Color.GRAY);
  		suma.setLocation(280, 390);
  		panel.add(suma);
  		
  		JButton num4 = new JButton("4");
  		num4.setSize(80, 60);
  		num4.setBackground(Color.GRAY);
  		num4.setLocation(10, 250);
  		panel.add(num4);
  		
  		JButton num5 = new JButton("5");
  		num5.setSize(80, 60);
  		num5.setBackground(Color.GRAY);
  		num5.setLocation(100, 250);
  		panel.add(num5);
  		
  		JButton num6 = new JButton("6");
  		num6.setSize(80, 60);
  		num6.setBackground(Color.GRAY);
  		num6.setLocation(190, 250);
  		panel.add(num6);
  		
  		JButton multi = new JButton("*");
  		multi.setSize(80, 60);
  		multi.setBackground(Color.GRAY);
  		multi.setLocation(280, 250);
  		panel.add(multi);
  		
  		JButton num7 = new JButton("7");
  		num7.setSize(80, 60);
  		num7.setBackground(Color.GRAY);
  		num7.setLocation(10, 180);
  		panel.add(num7);
  		
  		JButton num8 = new JButton("8");
  		num8.setSize(80, 60);
  		num8.setBackground(Color.GRAY);
  		num8.setLocation(100, 180);
  		panel.add(num8);
  		
  		JButton num9 = new JButton("9");
  		num9.setSize(80, 60);
  		num9.setBackground(Color.GRAY);
  		num9.setLocation(190, 180);
  		panel.add(num9);
  		
  		JButton divi = new JButton("/");
  		divi.setSize(80, 60);
  		divi.setBackground(Color.GRAY);
  		divi.setLocation(280, 180);
  		panel.add(divi);
  		
  		JButton ce = new JButton("CE");
  		ce.setSize(100, 60);
  		ce.setBackground(Color.GRAY);
  		ce.setLocation(10, 110);
  		panel.add(ce);
  		
  		JButton barra = new JButton("");
  		barra.setSize(240, 60);
  		barra.setBackground(Color.GRAY);
  		barra.setLocation(120, 110);
  		panel.add(barra);

 	
  		
  		return panel;
  		
  		
  	}
}

		