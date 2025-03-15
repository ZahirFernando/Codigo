import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



//hola

public class Ventana extends JFrame {
	

   public Ventana() {	//commit login
        this.setVisible(true);
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setMaximumSize(new Dimension(800, 800));
        this.setMinimumSize(new Dimension(300, 300));
        
		JMenuBar barra = new JMenuBar();
		   	
   		JMenu file = new JMenu("Archivo");
   		barra.add(file);
   	
   		JMenuItem open = new JMenuItem("Abrir");
   		file.add(open);
   	
   		JMenuItem close = new JMenuItem("Cerrar");
   		file.add(close);
   
   		JMenuItem op_1 = new JMenuItem("Ayuda");
   		file.add(op_1);
   		
   		JMenu file2 = new JMenu("Cuenta");
   		barra.add(file2);
   		
   		JMenuItem cnta = new JMenuItem("registro");
   		file2.add(cnta);
   		file2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					router("Registro");
			}
   			
   		});
   		
   		JMenuItem logn = new JMenuItem("Login");
   		file2.add(logn);
   		file2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					router("Login");
			}
   		
			
   		});
   		
   		JMenu file3 = new JMenu("Usuarios");
   		barra.add(file3);
   		
   		JMenuItem alta = new JMenuItem("Alta");
   		file3.add(alta);
   		
   		JMenuItem baja = new JMenuItem("Baja");
   		file3.add(baja);
   		
   		JMenuItem consultar = new JMenuItem("Consultar");
   		file3.add(consultar);
   		file3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					router("Consultar");
			}
   			
   		});
   		
   		JMenu ayuda = new JMenu("Ayuda");
   		barra.add(ayuda);
   		
   		JMenuItem msj = new JMenuItem("¿Cómo crear un usuario?");
   		ayuda.add(msj);
   		
   		JMenuItem msj2 = new JMenuItem("¿Cómo acceder al sistema?");
   		ayuda.add(msj2);
   		
   		JMenuItem msj3 = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
   		ayuda.add(msj3);
   		
   		
   		
   		
   		

       this.add(this.login());
       this.add(this.registro()); 
       //this.add(this.user());
       //this.add(this.calculadora());
       //this.add(this.calculadora2());
       //this.add(this.interes());
       this.setJMenuBar(barra);
       this.revalidate();
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
        
       /* ImageIcon imagen = new ImageIcon("///Users/zahirdiazbarrera/eclipse-workspace/Codigo/images/Login.png");
		JLabel icon_img = new JLabel();
		icon_img.setBounds(400, 0, 500, 500);
		icon_img.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(icon_img.getWidth(), icon_img.getHeight(),Image.SCALE_DEFAULT)));
		mipanel.add(icon_img);*/
		
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
        forgot_user.setLocation(140, 330);
        mipanel.add(forgot_user);

        JButton access = new JButton("Log In");
        access.setBounds(110, 350, 200, 50);
        access.setFont(fuente);
        access.setBackground(Color.BLACK);
        mipanel.add(access);
        
        JButton regist_but = new JButton("");
        regist_but.setBounds(110, 400, 200, 50);
        regist_but.setBackground(Color.black);
        mipanel.add(regist_but);
        
        regist_but.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				router("Registro");
			}
        	
        	
        });
        
        
       access.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//Boolean flag1 = false, flag2 = false;
			
			if( email.getText().equals("")) {
				email.setBorder(BorderFactory.createLineBorder(Color.red, 3));
			} else 
				email.setBorder(BorderFactory.createLineBorder(Color.green, 3));
			//flag1 = true;
				
			
    	   
			String password = new String(password_tag.getPassword());  
		 
	        if (password.equals("")) {
	        	password_tag.setBorder(BorderFactory.createLineBorder(Color.red, 3));
	        } else {
	        	password_tag.setBorder(BorderFactory.createLineBorder(Color.green, 3));
	        	//flag2 = true;
	        }
    	   /*if (flag1 && flag2)
    		   
    		   if(email.getText().equals("zahir@alu.uabcs.mx"))
    			   if(password.equals("Password"))
    		   JOptionPane.showMessageDialog(null, "Bienvenido");
			
			else
			{
				JOptionPane.showMessageDialog(null, "Bienvenido", "usuario no encontrado",JOptionPane.WARNING_MESSAGE);
			
			}else
				
			{
				JOptionPane.showMessageDialog(null, "Error al Inicio de Sesion", "usuario no encontrado", JOptionPane.WARNING_MESSAGE);
		
			} */
    	
    	}
		
       });   
       
    	
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
        
        JButton login_but = new JButton("");
        login_but.setBounds(110, 400, 200, 50);
        login_but.setBackground(Color.black);
        registro.add(login_but);
        
        login_but.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				router("Login");
			}
        	
        	
        });
     
        registerButton.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (user_tag.getText().equals("")) {
					user_tag.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				} else 
					user_tag.setBorder(BorderFactory.createLineBorder(Color.green, 3));
					
				if (biogra.getText().equals("")) {
					biogra.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				} else 
					biogra.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				
				
				if (preferencia.getText().equals("")) {
					preferencia.setBorder(BorderFactory.createLineBorder(Color.red, 3));
				} else 
					preferencia.setBorder(BorderFactory.createLineBorder(Color.green, 3));
			
			}

  		});	
       
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
  	
  	public void router (String route) {
  		
  		this.getContentPane().removeAll();
  		
  		if(route.equals("registro")) {
  			this.add(this.registro());
  		}
  		if(route.equals("login")) {
  			this.add(this.login());
  		}
  		
  		this.repaint();
  		this.revalidate();
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
  	
  	public JPanel calculadora2() {
  		
  		/*JPanel panel_ = new JPanel();
  		panel_.setBackground(Color.decode("#FFFFFF"));
  		panel_.setSize(400, 500);
  		panel_.setLayout(null); */
  		
  		Font fuente = new Font("Arial", Font.BOLD, 40);
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#380038")); 
		mipanel.setOpaque(true);		
		mipanel.setLayout(new BorderLayout());
		
		JLabel results = new JLabel("20.00");
		results.setBackground(Color.WHITE);
		results.setOpaque(true);
		results.setFont(fuente);
		results.setHorizontalAlignment(JLabel.RIGHT);
		mipanel.add(results,BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.BLUE);
		centro.setOpaque(true);
		centro.setLayout(new BorderLayout());
		mipanel.add(centro,BorderLayout.CENTER);
		
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(4,3));
		centro.add(botones,BorderLayout.CENTER);
		
		String[] textos = {"9", "8", "7", "6", "5", "4", "3", "2", "1", "0", ".","%"};
		
		for(String texto_boton : textos) {
			JButton boton = new JButton(texto_boton);
			botones.add(boton);
		}
		
		JPanel orilla = new JPanel();
		orilla.setLayout(new GridLayout(6,1));
		centro.add(orilla,BorderLayout.LINE_END);
		
		String[] textos2 = {"+", "-", "*", "/", "=", "CE"};
		
		for(String texto_boton : textos2) {
			JButton boton = new JButton(texto_boton);
			orilla.add(boton);
		}
		
		return mipanel;
  		
	
  	
  	}
  	
  	public JPanel interes() {
  		
  		JPanel panel_ = new JPanel();
  		panel_.setBackground(Color.decode("#FFFFFF"));
  		panel_.setSize(400, 500);
  		panel_.setLayout(null); 
  		
  		panel_.setBackground(Color.decode("#380038")); 
		panel_.setOpaque(true);		
		panel_.setLayout(new BorderLayout());
  		
  		JPanel centro = new JPanel();
		centro.setBackground(Color.GREEN);
		centro.setOpaque(true);
		centro.setLayout(new BorderLayout());
		panel_.add(centro,BorderLayout.CENTER);
		
		JLabel results = new JLabel("INTERES");
		results.setBackground(Color.WHITE);
		results.setOpaque(true);
		results.setHorizontalAlignment(JLabel.LEFT);
		panel_.add(results,BorderLayout.NORTH);
		
		JPanel sur = new JPanel();
		sur.setOpaque(true);
		sur.setBackground(Color.cyan);
	    sur.setLayout(new GridLayout(2,2,0,40));
	    panel_.add(sur, BorderLayout.SOUTH);
	    
	    JLabel text = new JLabel("Interes");
	    text.setBorder(BorderFactory.createMatteBorder(30,80,1,1, Color.cyan));
	    sur.add(text);
	    
	    JTextField text1 = new JTextField("315.0000002");
	    sur.add(text1);
	    
	    
	    
	    
	    
		
		
			
		
		
		
	/*	JPanel calcular = new JPanel();
		calcular.setBackground(Color.WHITE);
		calcular.setOpaque(true);
		calcular.setSize(100, 50);
		calcular.setLocation(10, 100);
		calcular.setLayout(new BorderLayout());
		panel_.add(centro,BorderLayout.CENTER); */
		
		
		
		
		
		
  		
  		
  		
  		return panel_;
  		
  	}
  	
}
  	
  /*@Override
  	public void paint(Graphics g) {
  		
  		super.paint(g);
  		
  		Graphics2D g2d = (Graphics2D) g.create ();
  		g2d.setStroke(new BasicStroke(5));
  		
  		g2d.setColor(Color.decode("#413CC3"));
        g2d.fillRect(0, 0, 800, 600);
        
        g2d.setColor(Color.BLACK);
		g2d.setStroke(new BasicStroke(10));
		g2d.drawRect(0, 500, 1300, 100);
		
		g2d.setColor(Color.decode("#AF8260"));
		g2d.fillRect(0, 500, 1300, 100);
		
		g2d.setColor(Color.WHITE);
		g2d.fillRoundRect(40, 70, 140, 30, 50, 50);
		g2d.fillRoundRect(40, 110, 190, 30, 50, 50);
		g2d.fillRoundRect(300, 50, 190, 30, 50, 50);
		g2d.fillRoundRect(230, 200, 100, 30, 50, 50);
		g2d.fillRoundRect(180, 300, 100, 30, 50, 50);
		g2d.fillOval(100, 80, 10, 10);
		
		g2d.setColor(Color.decode("#A9B5DF"));
		g2d.fillRect(75, 225, 150, 270);
		g2d.fillOval(75, 170, 150, 110);
		
		
		
		g2d.setColor(Color.decode("#0C84F5"));
		g2d.fillRect(-50, 396, 200, 100);
		g2d.fillOval(-50, 345, 200, 100);
		
		g2d.setColor(Color.decode("#A9B5DF"));
		g2d.fillRect(300, 225, 150, 270);
		g2d.fillOval(300, 170, 150, 110);
		
		g2d.fillRect(450, 145, 150, 350);
		g2d.fillOval(450, 95, 150, 110);
		
		g2d.setColor(Color.WHITE);
		g2d.fillRoundRect(350, 250, 300, 30, 50, 50);
		g2d.fillRoundRect(550, 200, 200, 30, 50, 50);
		
		g2d.setColor(Color.decode("#0C84F5"));
		g2d.fillRect(300, 396, 165, 100);
		g2d.fillOval(300, 345, 165, 100);
		
		g2d.fillRect(475, 250, 200, 246);
		g2d.fillOval(475, 200, 200, 100);
		
		g2d.setColor(Color.BLACK);
		g2d.setStroke(new BasicStroke(7));
		g2d.drawRect(600, 445, 50, 50);
		g2d.drawRect(600, 390, 50, 50);
		g2d.drawRect(600, 335, 50, 50);
		g2d.drawRect(600, 280, 50, 50);
		g2d.drawRect(654, 280, 50, 50);
		g2d.drawRect(707, 280, 50, 50);
		g2d.drawRect(760, 280, 50, 50);
		g2d.drawRect(700, 415, 140, 80);
		g2d.fillRect(690, 414, 140, 85);
		g2d.drawRect(680, 350, 160, 62);

		g2d.drawRect(300, 370, 130, 125);
		g2d.fillRect(310, 370, 130, 130);
		g2d.drawRoundRect(285, 300, 160, 65, 20, 20);
		g2d.fillRoundRect(295, 300, 160, 75, 20, 20);
		
		
		g2d.setColor(Color.decode("#9AA6B2"));
		g2d.fillRect(600, 445, 50, 50);
		g2d.fillRect(600, 390, 50, 50);
		g2d.fillRect(600, 335, 50, 50);
		g2d.fillRect(600, 280, 50, 50);
		
		g2d.setColor(Color.yellow);
		g2d.fillRect(654, 280, 50, 50);
		g2d.fillRect(707, 280, 50, 50);
		g2d.fillRect(760, 280, 50, 50);
		
		g2d.setColor(Color.decode("#A0C878"));
		g2d.fillRect(700, 415, 140, 80);
		g2d.fillRect(680, 350, 160, 62);
		g2d.fillRect(300, 370, 130, 125);
		g2d.fillRoundRect(285, 300, 160, 65, 20, 20);
		
		g2d.setColor(Color.decode("#A0C878"));
		g2d.fillRect(410, 375, 20, 120);
		g2d.fillRoundRect(425, 300, 20, 65, 5, 5);
		
		
		g2d.setColor(Color.decode("#A0C878"));
		g2d.fillRect(695, 415, 10, 80);
		g2d.fillRect(680, 355, 10, 57);
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(290, 365, 145, 10, 10, 10);

		try {
			BufferedImage image = ImageIO.read(new File("images/mario.2.png"));
			g2d.drawImage(image, 50, 355, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			BufferedImage image = ImageIO.read(new File("images/planta5.png"));
			g2d.drawImage(image, 290, 220, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				
		g2d.setColor(Color.BLACK);
		g2d.drawRect(0, 500, 800, 40);
		g2d.setColor(Color.green);
		g2d.fillRect(0, 500, 800, 40);
		
	}
	
  	
  
}	

  		
  		
  		
  		
  		
  		
	/*   setVisible(true);
			setTitle("Ejemplo");
			setSize(400 + getInsets().left,600 + getInsets().top + getInsets().bottom);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE); 

			Toolkit tk = Toolkit.getDefaultToolkit();
			Image myIcon = tk.getImage("///Users/zahirdiazbarrera/eclipse-workspace/Codigo/images/Login.png");
			setIconImage(myIcon); */
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		/*g2d.setColor(Color.decode("#5ED3E0"));
  		g2d.drawRect(0, 0, 1500, 1000);
  		g2d.fillRect(0, 0, 1500, 1000);
  		
  		g2d.setColor(Color.black);
  		g2d.drawRect(0, 750, 1500, 100);
  		g2d.setColor(Color.decode("#C19A6B"));
  		g2d.fillRect(0, 750, 1500, 100);
  		
  		g2d.setColor(Color.black);
  		g2d.drawRect(0, 750, 1500, 30);
  		g2d.setColor(Color.decode("#FCD9BB"));
  		g2d.fillRect(0, 750, 1500, 30);
  		
  		g2d.setColor(Color.black);
  		g2d.drawRoundRect(670, 455, 130, 290, 30, 30);
  		g2d.fillRoundRect(670, 455, 130, 290, 30, 30);
  		g2d.setColor(Color.black);
  		g2d.drawRoundRect(400, 345, 300, 400, 30, 30);
  		g2d.setColor(Color.decode("#ADFAFC"));
  		g2d.fillRoundRect(400, 345, 300, 400, 30, 30);	
  		g2d.setColor(Color.black);
  		g2d.drawRoundRect(520, 545, 150, 200, 30, 30);
  		g2d.fillRoundRect(520, 545, 150, 200, 30, 30);	
  		g2d.setColor(Color.black);
  		g2d.drawRoundRect(300, 495, 300, 250, 30, 30);
  		g2d.setColor(Color.decode("#FFC5B9"));
  		g2d.fillRoundRect(300, 495, 300, 250, 30, 30);
  		g2d.setColor(Color.black);
  		g2d.drawRoundRect(1250, 495, 300, 250, 30, 30);
  		g2d.setColor(Color.decode("#92FF99"));
  		g2d.fillRoundRect(1250, 495, 300, 250, 30, 30);	
  		
  		g2d.setColor(Color.BLACK);
  		g2d.drawRect(950, 545, 120, 200);
  		g2d.setColor(Color.decode("#006910"));
  		g2d.fillRect(990, 545, 80, 200);
  		g2d.setColor(Color.BLACK);
  		g2d.drawRoundRect(920, 485, 175, 60, 20, 20);
  		g2d.setColor(Color.decode("#006910"));
  		g2d.fillRoundRect(980, 485, 115, 60, 20, 20);	
  		
  		g2d.setColor(Color.BLACK);
  		g2d.drawRoundRect(300, 120, 220, 100, 10, 5);
  		g2d.drawRoundRect(300, 120, 230, 100, 10, 5);
  		g2d.fillRoundRect(300, 120, 230, 100, 10, 5);	
  		g2d.setColor(Color.decode("#FAA317"));
  		g2d.fillRoundRect(300, 120, 230, 100, 10, 5);	
  		g2d.setColor(Color.BLACK);
  		g2d.drawRoundRect(415, 120, 0, 100, 10, 5);
  		
  		g2d.setColor(Color.BLACK);
  		g2d.drawRoundRect(1200, 200, 100, 100, 10, 5);
  		g2d.drawRoundRect(1190, 200, 100, 100, 10, 5);
  		g2d.fillRoundRect(1190, 200, 100, 100, 10, 5);
  		g2d.setColor(Color.decode("#FAA317"));
  		g2d.fillRoundRect(1200, 200, 100, 100, 10, 5);
  		
  		g2d.setColor(Color.BLACK);
  		g2d.drawRoundRect(70, 350, 100, 100, 10, 5);
  		g2d.drawRoundRect(60, 350, 100, 100, 10, 5);
  		g2d.fillRoundRect(60, 350, 100, 100, 10, 5);
  		g2d.setColor(Color.decode("#FAA317"));
  		g2d.fillRoundRect(70, 350, 100, 100, 10, 5);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(305, 500, 20, 20, 0, 360);
  		g2d.setColor(Color.gray);
  		g2d.fillArc(305, 500, 20, 20, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(575, 500, 20, 20, 0, 360);
  		g2d.setColor(Color.gray);
  		g2d.fillArc(575, 500, 20, 20, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(305, 720, 20, 20, 0, 360);
  		g2d.setColor(Color.gray);
  		g2d.fillArc(305, 720, 20, 20, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(575, 720, 20, 20, 0, 360);
  		g2d.setColor(Color.gray);
  		g2d.fillArc(575, 720, 20, 20, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(675, 720, 20, 20, 0, 360);
  		g2d.setColor(Color.gray);
  		g2d.fillArc(675, 720, 20, 20, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(675, 350, 20, 20, 0, 360);
  		g2d.setColor(Color.gray);
  		g2d.fillArc(675, 350, 20, 20, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(405, 350, 20, 20, 0, 360);
  		g2d.setColor(Color.gray);
  		g2d.fillArc(405, 350, 20, 20, 0, 360);

  		g2d.setColor(Color.black);
  		g2d.drawArc(1255, 500, 20, 20, 0, 360);
  		g2d.setColor(Color.gray);
  		g2d.fillArc(1255, 500, 20, 20, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(1255, 720, 20, 20, 0, 360);
  		g2d.setColor(Color.gray);
  		g2d.fillArc(1255, 720, 20, 20, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(75, 355, 5, 5, 0, 360);
  		g2d.fillArc(75, 355, 5, 5, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(75, 435, 5, 5, 0, 360);
  		g2d.fillArc(75, 435, 5, 5, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(155, 435, 5, 5, 0, 360);
  		g2d.fillArc(155, 435, 5, 5, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(155, 355, 5, 5, 0, 360);
  		g2d.fillArc(155, 355, 5, 5, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(305, 125, 5, 5, 0, 360);
  		g2d.fillArc(305, 125, 5, 5, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(305, 210, 5, 5, 0, 360);
  		g2d.fillArc(305, 210, 5, 5, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(400, 125, 5, 5, 0, 360);
  		g2d.fillArc(400, 125, 5, 5, 0, 360);
  	
  		g2d.setColor(Color.black);
  		g2d.drawArc(400, 210, 5, 5, 0, 360);
  		g2d.fillArc(400, 210, 5, 5, 0, 360);
  		  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(515, 125, 5, 5, 0, 360);
  		g2d.fillArc(515, 125, 5, 5, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(515, 210, 5, 5, 0, 360);
  		g2d.fillArc(515, 210, 5, 5, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(425, 125, 5, 5, 0, 360);
  		g2d.fillArc(425, 125, 5, 5, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(425, 210, 5, 5, 0, 360);
  		g2d.fillArc(425, 210, 5, 5, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(1290, 205, 5, 5, 0, 360);
  		g2d.fillArc(1290, 205, 5, 5, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(1290, 290, 5, 5, 0, 360);
  		g2d.fillArc(1290, 290, 5, 5, 0, 360);
  		
  		g2d.setColor(Color.black);
  		g2d.drawArc(1205, 290, 5, 5, 0, 360);
  		g2d.fillArc(1205, 290, 5, 5, 0, 360);

  		g2d.setColor(Color.black);
  		g2d.drawArc(1205, 205, 5, 5, 0, 360);
  		g2d.fillArc(1205, 205, 5, 5, 0, 360);
  		
  
  		
  		try 	
  		{
  			BufferedImage image = ImageIO.read(new File("images/mario.2.png")); 
  			g2d.drawImage(image, 650, 610, null);
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			}
  		
  		try 	
  		{
  			BufferedImage image = ImageIO.read(new File("images/planta4.png")); 
  			g2d.drawImage(image, 900, 365, null);
				 
		} catch (IOException e) {
			// TODO: handle exception
//			e.printStackTrace();
			}
  		try 	
  		{
  			BufferedImage image = ImageIO.read(new File("images/estrella.png")); 
  			g2d.drawImage(image, 300, 50, null);
				 
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			}
  		try 	
  		{
  			BufferedImage image = ImageIO.read(new File("images/interrogacion2.png")); 
  			g2d.drawImage(image, 440, 130, null);
				 
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			}
  		
  		try 	
  		{
  			BufferedImage image = ImageIO.read(new File("images/interrogacion2.png")); 
  			g2d.drawImage(image, 1215, 210, null);
				 
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			}
  		
  		try 	
  		{
  			BufferedImage image = ImageIO.read(new File("images/interrogacion2.png")); 
  			g2d.drawImage(image, 85, 360, null);
				 
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			}
  		
  		
  		
	
  	/*	g2d.setColor(Color.yellow);
  		g2d.drawArc(30, 50, 60, 60, 0, 360);
  		g2d.fillArc(30, 50, 60, 60, 0, 360);
  		g2d.setColor(Color.orange);
  		g2d.drawRect(200, 200, 380, 380);
  		g2d.fillRect(200, 200, 380, 380);
  		g2d.setColor(Color.red);
  		g2d.drawRect(240, 380, 100, 200);
  		g2d.fillRect(240,380,100,200);
  		g2d.setColor(Color.gray);
  		g2d.drawRect(140, 585, 500, 100);
  		g2d.fillRect(140, 585, 500, 100);
  		g2d.setColor(Color.white);
  		g2d.drawRect(420, 280, 100, 80);
  		g2d.fillRect(420, 280, 100, 80);
  		g2d.setColor(Color.red);
  		g2d.drawRect(465, 280, 5, 75);
  		g2d.fillRect(465, 280, 5, 75);
  		g2d.drawRect(420, 320, 95, 5);
  		g2d.fillRect(420, 320, 95, 5);
  		g2d.drawRect(420, 280, 100, 80);
  		g2d.setColor(Color.decode("#008000"));
  		g2d.drawRect(0, 650, 800, 40);
  		g2d.fillRect(0, 650, 800, 40);
  		g2d.setColor(Color.decode("#39FF14"));
  		g2d.drawRect(0, 690, 800, 50);
  		g2d.fillRect(0, 690, 800, 50);
  		g2d.setColor(Color.decode("#F5F5DC"));
  		g2d.drawRect(0, 730, 800, 30);
  		g2d.fillRect(0, 730, 800, 30);
  		g2d.setColor(Color.decode("#C19A6B"));
  		g2d.drawRect(0, 760, 800, 40);
  		g2d.fillRect(0, 760, 800, 40);
  		g2d.setColor(Color.decode("#C19A6B"));
  		g2d.drawArc(245, 470, 10, 10, 0, 360);
        
        g2d.setColor(Color.GRAY);
  		g2d.drawRect(250, 120, 50, 60);
  		g2d.fillRect(250, 120, 50, 60);
  		
  		int[] xs = {450, 200, 580};
        int[] ys = {120, 200, 200};
        
        g2d.setColor(Color.DARK_GRAY);
        
        g2d.drawPolygon(xs, ys, 3);
        g2d.fillPolygon(xs, ys, 3);
        
        g2d.setColor(Color.decode("#C19A6B"));
  		g2d.drawRect(0, 460, 195, 10);
  		g2d.fillRect(0, 460, 195, 10);
  		g2d.drawRect(0, 520, 195, 10);
  		g2d.fillRect(0, 520, 195, 10);
  		g2d.drawRect(585, 460, 215, 10);
  		g2d.fillRect(585, 460, 215, 10);
  		g2d.drawRect(585, 520, 215, 10);
  		g2d.fillRect(585, 520, 215, 10);
  		g2d.drawRect(645, 600, 155, 10);
  		g2d.fillRect(645, 600, 155, 10);
  		g2d.drawRect(0, 600, 135, 10);
  		g2d.fillRect(0, 600, 135, 10);
  		
  		g2d.setColor(Color.decode("#C19A6B"));
  		g2d.drawRect(10, 445, 15, 200);
  		g2d.fillRect(10, 445, 15, 200);
  		g2d.drawRect(40, 445, 15, 200);
  		g2d.fillRect(40, 445, 15, 200);
  		g2d.drawRect(70, 445, 15, 200);
  		g2d.fillRect(70, 445, 15, 200);
  		g2d.drawRect(100, 445, 15, 200);
  		g2d.fillRect(100, 445, 15, 200);
  		g2d.drawRect(130, 445, 15, 200);
  		g2d.fillRect(130, 445, 15, 200);
  		g2d.drawRect(160, 445, 15, 135);
  		g2d.fillRect(160, 445, 15, 135);
  		g2d.drawRect(610, 445, 15, 135);
  		g2d.fillRect(610, 445, 15, 135);
  		g2d.drawRect(645, 445, 15, 200);
  		g2d.fillRect(645, 445, 15, 200);
  		g2d.drawRect(678, 445, 15, 200);
  		g2d.fillRect(678, 445, 15, 200);
  		g2d.drawRect(708, 445, 15, 200);
  		g2d.fillRect(708, 445, 15, 200);
  		g2d.drawRect(738, 445, 15, 200);
  		g2d.fillRect(738, 445, 15, 200);
  		g2d.drawRect(770, 445, 15, 200);
  		g2d.fillRect(770, 445, 15, 200); */
        
  	
  		/*g2d.setColor(Color.BLUE);
  		
  		g2d.setFont(new Font("Times New Roman", Font.BOLD, 20)); // no se le puede agregar texto M1
  		g2d.drawString("", 160, 200);
  		
  		g2d.drawLine(0, 0, 400, 400);
  		g2d.drawArc(420, 100, 100, 100, 0, 360); //se puede poner en 180 como si fuera medicion de angulo
  		g2d.setColor(Color.green);
  		g2d.drawArc(300, 100, 100, 100, 0, 360);
  		g2d.setColor(Color.GREEN);
  		g2d.fillArc(300, 100, 100, 100, 0, 180);
  		g2d.setColor(Color.RED);
  		g2d.drawOval(50, 400, 90, 190);
  		g2d.fillOval(100, 400, 90, 190);
  		
  		
  		g2d.drawString("Hola",0,0);
  		
  		try 	
  		{
  			BufferedImage image = ImageIO.read(new File("images/yone.png")); 
  			g2d.drawImage(image, 500, 150, null);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
  		
  		
  		
  		int[] xs = {400,350,450};
  		int[] ys = {200,250,250};
  		
  		g2d.drawPolygon(xs, ys, 3);
  		
  		int[] xs2 = {400,350,450};
  		int[] ys2 = {200,250,250};
  		
  		g2d.fillPolygon(xs2, ys2, 3);
  		
  		g2d.setColor(Color.BLACK);
  		g2d.drawRect(400, 400, 160, 160);
  		g2d.fillRect(420, 420, 160, 160);
  		
  		
  	} */

	  	
  	
  	






		