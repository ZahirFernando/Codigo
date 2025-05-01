package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.AuthModel;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AuthView {
		
	public AuthView() {
		
	}
	
	public void login() {
		
		JFrame ventana = new JFrame();
		
		ventana.setVisible(true);
		ventana.setSize(800, 500);
		ventana.setLocationRelativeTo(null);
		ventana.setTitle("Login");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(true);
		ventana.setMaximumSize(new Dimension(800, 800));
		ventana.setMinimumSize(new Dimension(300, 300));
		

 		JTextField textField;
 		JPasswordField passwordField;
 		
 		JPanel mipanel = new JPanel();
 		
 		 Font fuente = new Font("Times New Roman", Font.BOLD, 20);
		
		mipanel.setBackground(Color.decode("#4682B4"));
	    mipanel.setOpaque(true);
	    mipanel.setSize(1000, 500);
	    mipanel.setLocation(0, 0);
	    mipanel.setLayout(null);
	    
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
			
			Boolean flag1 = false, flag2 = false;
			
			if( email.getText().equals("")) {
				email.setBorder(BorderFactory.createLineBorder(Color.red, 3));
			} else 
				email.setBorder(BorderFactory.createLineBorder(Color.green, 3));
			flag1 = true;
				
			
    	   
			String password = new String(password_tag.getPassword());  
		 
	        if (password.equals("")) {
	        	password_tag.setBorder(BorderFactory.createLineBorder(Color.red, 3));
	        } else {
	        	password_tag.setBorder(BorderFactory.createLineBorder(Color.green, 3));
	        	flag2 = true;
	        }
	        if (flag1 && flag2)
    		   
    		   if(email.getText().equals("zahir@alu.uabcs.mx"))
    			   if(password.equals("Password"))
    		   JOptionPane.showMessageDialog(null, "Bienvenido");
			
			else
			{
				JOptionPane.showMessageDialog(null, "Bienvenido", "usuario no encontrado",JOptionPane.WARNING_MESSAGE);
			
			}else
				
			{
				JOptionPane.showMessageDialog(null, "Error al Inicio de Sesion", "usuario no encontrado", JOptionPane.WARNING_MESSAGE);
		
			} 
    	
    	}
		
       }); 
       
       ventana.add(mipanel);
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
         
   
           return registro;
       

        
    }

	protected void router(String string) {
		// TODO Auto-generated method stub
		
	}
	
}

