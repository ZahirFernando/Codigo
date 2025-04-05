import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Teclado2 implements KeyListener{

	private JFrame frame;
	private JLabel lblNewLabel_4, lblNewLabel_5;
	private JLabel [] labels = new JLabel[27];
	
	private String letras [] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	
	private List<String> palabras = new ArrayList<>();
	JLabel lblNewLabel_6;
	private int seg = 0;
	private int min = 0;
	private boolean juegoTerminado = false;
    private long tiempoInicio;
	
	Timer timer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teclado2 window = new Teclado2();
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
	public Teclado2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		palabras.add("Carro");
		palabras.add("Pizza");
		palabras.add("Hermana");
		palabras.add("Casa");
		palabras.add("Bicicleta");
		palabras.add("Hates");
		palabras.add("Pintura");
		palabras.add("Desarrollo");
        palabras.add("Aplicación");
        palabras.add("Interfaz");
        palabras.add("Usuario");
        palabras.add("Tecnología");
        palabras.add("Algoritmo");
        palabras.add("Variable");
        palabras.add("Función");
        palabras.add("Objeto");
        palabras.add("Clase");
        palabras.add("Herencia");
        palabras.add("Polimorfismo");
        palabras.add("Encapsulamiento");
        palabras.add("Abstracción");
        palabras.add("Instancia");
        palabras.add("Método");
        palabras.add("Parámetro");
        palabras.add("Retorno");
        palabras.add("Condicional");
        palabras.add("Bucle");
        palabras.add("Iteración");
        palabras.add("Arreglo");
        palabras.add("Colección");
        palabras.add("Lista");
        palabras.add("Mapa");
        palabras.add("Conjunto");
        palabras.add("Cadena");
        palabras.add("Entero");
        palabras.add("Flotante");
        palabras.add("Booleano");
        palabras.add("Carácter");
        palabras.add("Compilador");
        palabras.add("Ejecución");
        palabras.add("Depuración");
        palabras.add("Consola");
        palabras.add("Entrada");
        palabras.add("Salida");
        palabras.add("Archivo");
        palabras.add("Directorio");
        palabras.add("Sistema");
        palabras.add("Operativo");
        palabras.add("Proceso");
        palabras.add("Hilo");
        palabras.add("Memoria");
        palabras.add("Procesador");
        palabras.add("Disco");
        palabras.add("Duro");
        palabras.add("Red");
        palabras.add("Internet");
        palabras.add("Protocolo");
        palabras.add("Servidor");
        palabras.add("Cliente");
        palabras.add("Base");
        palabras.add("Datos");
        palabras.add("Tabla");
        palabras.add("Registro");
        palabras.add("Campo");
        palabras.add("Consulta");
        palabras.add("Transacción");
        palabras.add("Índice");
        palabras.add("Vista");
        palabras.add("Trigger");
        palabras.add("Procedimiento");
        palabras.add("Almacenado");
        palabras.add("Función");
        palabras.add("Disparador");
        palabras.add("Restricción");
        palabras.add("Llave");
        palabras.add("Primaria");
        palabras.add("Foránea");
        palabras.add("Unión");
        palabras.add("Interna");
        palabras.add("Externa");
        palabras.add("Izquierda");
        palabras.add("Derecha");
        palabras.add("Completa");
        palabras.add("Cruzada");
        palabras.add("Agrupación");
        palabras.add("Ordenación");
        palabras.add("Filtro");
        palabras.add("Condición");
        palabras.add("Comparación");
        palabras.add("Operador");
        palabras.add("Lógico");
        palabras.add("Aritmético");
        palabras.add("Relacional");
        palabras.add("Asignación");
        palabras.add("Incremento");
        palabras.add("Decremento");
        palabras.add("Negación");
        palabras.add("Computadora");
        palabras.add("Teclado");
        palabras.add("Programación");
        palabras.add("Java");
       
		
		frame.addKeyListener(this);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0,0));
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setFont(new Font ("ARIAL", Font.PLAIN, 30));
		panel.add(lblNewLabel_6);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Palabra");
		lblNewLabel.setFont(new Font ("ARIAL", Font.PLAIN, 20));
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("0:0");
		lblNewLabel_3.setFont(new Font ("ARIAL", Font.PLAIN, 30));
		panel.add(lblNewLabel_3, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("espacio");
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3,9,0,0));
		
		for (int i = 0; i < letras.length; i++) {
			
			labels[i] = new JLabel(letras[i]);
			labels[i].setHorizontalAlignment(JLabel.CENTER);
			panel_2.add(labels[i]);
		}
		
		Random randomNumbers = new Random();
		
		int t = randomNumbers.nextInt(palabras.size());
		
		lblNewLabel.setText(palabras.get(t));
		
		ActionListener taskPerfomer = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (juegoTerminado) {
                    timer.stop();
                   
                }

                String[] split_string = lblNewLabel_3.getText().split(":");
                int mil = Integer.parseInt(split_string[1]);
                mil += 1;

                if (mil >= 10) {
                    min++;
                    mil = 0;
                }

                lblNewLabel_3.setText(min + ":" + mil);
            }
        };

        timer = new Timer(100, taskPerfomer);
    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if (juegoTerminado) {
            
        }

		 if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	            juegoTerminado = true;
	            timer.stop();

	            
	            String tiempoFinal = min + ":" + seg;
	            JOptionPane.showMessageDialog(frame, "¡Felicidades! Has completado la palabra en " + tiempoFinal);

	         	 
        }

        timer.start();

        for (int i = 0; i < labels.length; i++) {
            if (labels[i] != null && e.getKeyChar() == labels[i].getText().charAt(0)) {
                labels[i].setOpaque(true);
                labels[i].setBackground(Color.green);
                lblNewLabel_6.setText(lblNewLabel_6.getText() + e.getKeyChar());
                
            } else if (labels[i] != null) {
                labels[i].setOpaque(true);
                labels[i].setBackground(Color.gray);
            }
        }

        
        if (lblNewLabel_6.getText().equals(lblNewLabel_4.getText())) {
            juegoTerminado = true;
            timer.stop(); 
         
            String tiempoFinal = min + ":" + seg;
            JOptionPane.showMessageDialog(frame, "Has completado la palabra en " + tiempoFinal);
            
 
        }
    }

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}	
	

}		
	

