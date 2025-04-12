import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class pacman implements KeyListener{

	private JFrame frame;
	private DrawingPanel tablero;
	
	private player pacman; 
	private List<player> paredes = new ArrayList<>();
	Timer timer;
	private int lastPress = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pacman window = new pacman();
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
	public pacman() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pacman= new player(200,200,30,30,Color.yellow);
		paredes.add(new player(530,100,20,200,Color.white));
		paredes.add(new player(60,450,230,20,Color.white));
		paredes.add(new player(140,20,140,20,Color.white));
		paredes.add(new player(30,140,20,200,Color.white));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);

		JPanel footer = new JPanel();
 		footer.setBackground(new Color(109, 89, 213));
 		frame.getContentPane().add(footer, BorderLayout.SOUTH);
 		
 		tablero = new DrawingPanel();
 		tablero.setBackground(new Color(0, 0, 0));
 		frame.getContentPane().add(tablero, BorderLayout.CENTER);
 		
 		tablero.addKeyListener(this);
 		tablero.setFocusable(true);
		
 		JButton reiniciar = new JButton("Reiniciar");
 		reiniciar.addActionListener(new ActionListener() {
 
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				// TODO Auto-generated method stub
 				pacman.x = 200;
 				pacman.y = 100;
 				
 				tablero.repaint();
 				
 				tablero.requestFocus();
 			}
 			
 		});
 		footer.add(reiniciar);
		

	
	
	ActionListener taskPerformer = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			update();
		}
	};
	timer = new Timer(3,taskPerformer);

	
		}
	class DrawingPanel extends JPanel {
		public DrawingPanel() {
			 setBackground(Color.WHITE);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;

			
			g2d.setColor(pacman.c);
			g2d.fillOval(pacman.x, pacman.y, pacman.w, pacman.h);
			
			for (player pared : paredes) {
				g2d.setColor(pared.c);
				g2d.fillRect(pared.x, pared.y, pared.w, pared.h);
				
				
			}
			
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		lastPress = e.getKeyCode();
		timer.start();
		update();
		
	}	
	public void update()
	{
	Boolean colision =false;
		
		for (player pared : paredes) {
			
			
			if(pacman.colision(pared)) {
				colision=true;
			}
			
		}
			
		
		
		
		 if (lastPress == 87) { // W (arriba)
		        if (!colision) {
		            pacman.y -= 1;
		            // sale por arriba, aparece abajo
		            if (pacman.y + pacman.h < 0) {
		                pacman.y = tablero.getHeight();
		            }
		        } else {
		            pacman.y += 1;
		            lastPress = 0;
		        }
		    }
		    if (lastPress == 83) { // S (abajo)
		        if (!colision) {
		            pacman.y += 1;
		            // sale por abajo, aparece arriba
		            if (pacman.y > tablero.getHeight()) {
		                pacman.y = -pacman.h;
		            }
		        } else {
		            pacman.y -= 1;
		            lastPress = 0;
		        }
		    }
		    if (lastPress == 65) { //	A (izquierda)
		        if (!colision) {
		            pacman.x -= 1;
		            // sale por la izquierda, aparece derecha
		            if (pacman.x + pacman.w < 0) {
		                pacman.x = tablero.getWidth();
		            }
		        } else {
		            pacman.x += 1;
		            lastPress = 0;
		        }
		    }
		    if (lastPress == 68) { // D (derecha)
		        if (!colision) {
		            pacman.x += 1;
		            // sale por la derecha, aparece izquierda
		            if (pacman.x > tablero.getWidth()) {
		                pacman.x = -pacman.w;
		            }
		        } else {
		            pacman.x -= 1;
		            lastPress = 0;
		        }
		    }
		    tablero.repaint();

	
	}
	
	class player {
		int x,y,w,h;
		Color c;
		
		public player (int x, int y, int w, int h, Color c) {
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			this.c = c; 
			
		}
		public boolean colision(player target) {
			if(this.x < target.x + target.w &&

					this.x + this.w > target.x &&

					this.y < target.y + target.h &&

					this.y + this.h > target.y) {

					return true;
		}
		return false;
	}

	

	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
