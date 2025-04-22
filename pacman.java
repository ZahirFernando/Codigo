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

public class pacman implements KeyListener {

	private JFrame frame;
	private DrawingPanel tablero;
	private player pacman;
	private List<player> paredes = new ArrayList<>();
	private List<Bolita> bolitas = new ArrayList<>(); 
	Timer timer;
	private int lastPress = 0;
	private int score = 0;

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

	public pacman() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pacman = new player(280, 250, 30, 30, Color.yellow);

		// PAREDES
		paredes.add(new player(530,0,20,205, Color.white));
		paredes.add(new player(530,285,20,225, Color.white));
		paredes.add(new player(0,460,600,20, Color.white));
		paredes.add(new player(0,0,600,20, Color.white));
		paredes.add(new player(0,10,20,200, Color.white));
		paredes.add(new player(0,290,20,200, Color.white));
		paredes.add(new player(80,0,20,100, Color.white));
		paredes.add(new player(80,150,20,200, Color.white));
		paredes.add(new player(80,400,20,60, Color.white));
		paredes.add(new player(150,350,20,50, Color.white));
		paredes.add(new player(160,380,270,20, Color.white));
		paredes.add(new player(410,350,20,50, Color.white));
		paredes.add(new player(150,80,270,20, Color.white));
		paredes.add(new player(150,80,20,50, Color.white));
		paredes.add(new player(410,80,20,50, Color.white));
		paredes.add(new player(380,20,20,80, Color.white));
		paredes.add(new player(220,50,20,30, Color.white));
		paredes.add(new player(380,380,20,80, Color.white));
		paredes.add(new player(220,400,20,30, Color.white));
		paredes.add(new player(350,220,20,70, Color.white));
		paredes.add(new player(220,220,20,70, Color.white));
		paredes.add(new player(220,290,150,20, Color.white));
		paredes.add(new player(220,220,50,20, Color.white));
		paredes.add(new player(320,220,40,20, Color.white));
		paredes.add(new player(490,380,50,20, Color.white));
		paredes.add(new player(490,80,50,20, Color.white));

		// 	Bolitas
		bolitas.add(new Bolita(85,120,10, Color.white));
		bolitas.add(new Bolita(85,370,10, Color.white));
		bolitas.add(new Bolita(120,80,10, Color.white));
		bolitas.add(new Bolita(120,120,10, Color.white));
		bolitas.add(new Bolita(120,180,10, Color.white));
		bolitas.add(new Bolita(120,240,10, Color.white));
		bolitas.add(new Bolita(120,300,10, Color.white));
		bolitas.add(new Bolita(120,370,10, Color.white));
		bolitas.add(new Bolita(120,420,10, Color.white));
		bolitas.add(new Bolita(160,30,10, Color.white));
		bolitas.add(new Bolita(220,30,10, Color.white));
		bolitas.add(new Bolita(280,30,10, Color.white));
		bolitas.add(new Bolita(340,30,10, Color.white));
		bolitas.add(new Bolita(420,30,10, Color.white));
		bolitas.add(new Bolita(420,60,10, Color.white));
		bolitas.add(new Bolita(120,30,10, Color.white));
		bolitas.add(new Bolita(120,30,10, Color.white));
		bolitas.add(new Bolita(155,150,10, Color.white));
		bolitas.add(new Bolita(155,210,10, Color.white));
		bolitas.add(new Bolita(155,270,10, Color.white));
		bolitas.add(new Bolita(155,330,10, Color.white));
		//bolitas.add(new Bolita(400,150,10, Color.white));
		//bolitas.add(new Bolita(250,250,10, Color.white));
		bolitas.add(new Bolita(500,30,10, Color.white));
		bolitas.add(new Bolita(460,30,10, Color.white));
		bolitas.add(new Bolita(500,60,10, Color.white));
		bolitas.add(new Bolita(460,60,10, Color.white));
		bolitas.add(new Bolita(460,90,10, Color.white));
		bolitas.add(new Bolita(460,120,10, Color.white));
		bolitas.add(new Bolita(460,180,10, Color.white));
		bolitas.add(new Bolita(460,240,10, Color.white));
		bolitas.add(new Bolita(460,300,10, Color.white));
		bolitas.add(new Bolita(460,360,10, Color.white));
		bolitas.add(new Bolita(460,410,10, Color.white));
		bolitas.add(new Bolita(460,460,10, Color.white));
		bolitas.add(new Bolita(40,100,10, Color.white));
		bolitas.add(new Bolita(40,150,10, Color.white));
		bolitas.add(new Bolita(40,300,10, Color.white));
		bolitas.add(new Bolita(40,200,10, Color.white));
		bolitas.add(new Bolita(40,250,10, Color.white));
		bolitas.add(new Bolita(40,50,10, Color.white));
		bolitas.add(new Bolita(40,300,10, Color.white));
		bolitas.add(new Bolita(40,350,10, Color.white));
		bolitas.add(new Bolita(40,400,10, Color.white));
		bolitas.add(new Bolita(40,440,10, Color.white));
		bolitas.add(new Bolita(220,440,10, Color.white));
		bolitas.add(new Bolita(160,440,10, Color.white));
		bolitas.add(new Bolita(280,440,10, Color.white));
		bolitas.add(new Bolita(340,440,10, Color.white));
		bolitas.add(new Bolita(420,440,10, Color.white));
		bolitas.add(new Bolita(280,410,10, Color.white));
		bolitas.add(new Bolita(340,410,10, Color.white));
		//bolitas.add(new Bolita(290,180,10, Color.white));
		bolitas.add(new Bolita(340,320,10, Color.white));
		bolitas.add(new Bolita(340,350,10, Color.white));
		bolitas.add(new Bolita(340,180,10, Color.white));
		bolitas.add(new Bolita(340,120,10, Color.white));
		bolitas.add(new Bolita(300,320,10, Color.white));
		bolitas.add(new Bolita(300,350,10, Color.white));
		bolitas.add(new Bolita(260,320,10, Color.white));
		bolitas.add(new Bolita(260,350,10, Color.white));
		bolitas.add(new Bolita(220,320,10, Color.white));
		bolitas.add(new Bolita(220,350,10, Color.white));
		bolitas.add(new Bolita(380,320,10, Color.white));
		bolitas.add(new Bolita(380,350,10, Color.white));
		bolitas.add(new Bolita(180,320,10, Color.white));
		bolitas.add(new Bolita(180,350,10, Color.white));
		bolitas.add(new Bolita(180,240,10, Color.white));
		bolitas.add(new Bolita(180,280,10, Color.white));
		bolitas.add(new Bolita(180,160,10, Color.white));
		bolitas.add(new Bolita(180,200,10, Color.white));
		bolitas.add(new Bolita(180,120,10, Color.white));
		bolitas.add(new Bolita(240,120,10, Color.white));
		bolitas.add(new Bolita(240,200,10, Color.white));
		bolitas.add(new Bolita(240,160,10, Color.white));
		bolitas.add(new Bolita(300,160,10, Color.white));
		bolitas.add(new Bolita(300,200,10, Color.white));
		bolitas.add(new Bolita(300,120,10, Color.white));
		bolitas.add(new Bolita(380,280,10, Color.white));
		bolitas.add(new Bolita(380,220,10, Color.white));
		bolitas.add(new Bolita(380,180,10, Color.white));
		bolitas.add(new Bolita(380,120,10, Color.white));
		bolitas.add(new Bolita(380,280,10, Color.white));
		bolitas.add(new Bolita(415,200,10, Color.white));
		bolitas.add(new Bolita(415,270,10, Color.white));
		bolitas.add(new Bolita(415,330,10, Color.white));
		bolitas.add(new Bolita(415,150,10, Color.white));
		bolitas.add(new Bolita(500,160,10, Color.white));
		bolitas.add(new Bolita(500,220,10, Color.white));
		bolitas.add(new Bolita(500,280,10, Color.white));
		bolitas.add(new Bolita(500,340,10, Color.white));
		bolitas.add(new Bolita(500,120,10, Color.white));
		bolitas.add(new Bolita(500,440,10, Color.white));
		bolitas.add(new Bolita(500,410,10, Color.white));
		bolitas.add(new Bolita(460,440,10, Color.white));
		bolitas.add(new Bolita(420,410,10, Color.white));
		
		
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
				pacman.x = 280;
				pacman.y = 250;
				for (Bolita b : bolitas) {
					b.visible = true; // Reinicia las bolitas
				}
				tablero.repaint();
				tablero.requestFocus();
			}
		});
		footer.add(reiniciar);

		ActionListener taskPerformer = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				update();
			}
		};
		timer = new Timer(3, taskPerformer);
	}

	class DrawingPanel extends JPanel {
		public DrawingPanel() {
			setBackground(Color.WHITE);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;

			// Dibuja Pacman
			g2d.setColor(pacman.c);
			g2d.fillOval(pacman.x, pacman.y, pacman.w, pacman.h);

			// Dibuja Paredes
			for (player pared : paredes) {
				g2d.setColor(pared.c);
				g2d.fillRect(pared.x, pared.y, pared.w, pared.h);
			}

			// Dibuja Bolitas
			for (Bolita b : bolitas) {
				if (b.visible) {
					g2d.setColor(b.c);
					g2d.fillOval(b.x, b.y, b.r, b.r);
				}
			}
			
			g2d.setColor(Color.WHITE);
			g2d.drawString("Score: " + score, 10, 20);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		lastPress = e.getKeyCode();
		timer.start();
		update();
	}

	public void update() {
		boolean colision = false;
		for (player pared : paredes) {
			if (pacman.colision(pared)) {
				colision = true;
			}
		}

		if (lastPress == 87) { // W
			if (!colision) {
				pacman.y -= 1;
				if (pacman.y + pacman.h < 0) pacman.y = tablero.getHeight();
			} else {
				pacman.y += 1;
				lastPress = 0;
			}
		}
		if (lastPress == 83) { // S
			if (!colision) {
				pacman.y += 1;
				if (pacman.y > tablero.getHeight()) pacman.y = -pacman.h;
			} else {
				pacman.y -= 1;
				lastPress = 0;
			}
		}
		if (lastPress == 65) { // A
			if (!colision) {
				pacman.x -= 1;
				if (pacman.x + pacman.w < 0) pacman.x = tablero.getWidth();
			} else {
				pacman.x += 1;
				lastPress = 0;
			}
		}
		if (lastPress == 68) { // D
			if (!colision) {
				pacman.x += 1;
				if (pacman.x > tablero.getWidth()) pacman.x = -pacman.w;
			} else {
				pacman.x -= 1;
				lastPress = 0;
			}
		}

		// Colisión con bolitas
		for (Bolita b : bolitas) {
			if (b.visible && b.colision(pacman)) {
				b.visible = false;
				score += 10;
			}
		}

		boolean quedanBolitas = false;
		for (Bolita b : bolitas) {
			if (b.visible) {
				quedanBolitas = true;
				break;
			}
		}

		
		if (!quedanBolitas) {
			timer.stop();
			javax.swing.JOptionPane.showMessageDialog(frame, "¡Juego terminado!\nPuntaje final: " + score, "Fin del juego", javax.swing.JOptionPane.INFORMATION_MESSAGE);
			
			// Reiniciar juego
			pacman.x = 280;
			pacman.y = 250;
			score = 0;
			for (Bolita b : bolitas) {
				b.visible = true;
			}
			lastPress = 0;
			timer.start();
		}

		tablero.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	class player {
		int x, y, w, h;
		Color c;

		public player(int x, int y, int w, int h, Color c) {
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			this.c = c;
		}

		public boolean colision(player target) {
			if (this.x < target.x + target.w && this.x + this.w > target.x &&
				this.y < target.y + target.h && this.y + this.h > target.y) {
				return true;
			}
			return false;
		}
	}

	// clase bola
	class Bolita {
		int x, y, r;
		Color c;
		boolean visible = true;

		public Bolita(int x, int y, int r, Color c) {
			this.x = x;
			this.y = y;
			this.r = r;
			this.c = c;
		}

		public boolean colision(player p) {
			int centerX = x + r / 2;
			int centerY = y + r / 2;
			return (centerX > p.x && centerX < p.x + p.w &&
			        centerY > p.y && centerY < p.y + p.h);
		}
	}
}

