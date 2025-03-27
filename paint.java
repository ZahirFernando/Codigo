import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class paint implements MouseListener, MouseMotionListener {
	
    private JFrame frame;
    private DrawingPanel drawingPanel;
    private Point lastPoint;
    private List<Point> points = new ArrayList<>();
    private List<List<Point>> listaDePuntos = new ArrayList<>();
    
    private Color currentColor = Color.BLACK; // Color por defecto
    private int strokeWidth = 3; // Grosor del trazo
    private String currentTool = "Brush"; // Herramienta seleccionada ("Brush", "Eraser", etc.)
    
   
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                paint window = new paint();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public paint() {
        initialize();
    }

    private void initialize() {
    	
        frame = new JFrame();
        frame.setBounds(100, 100, 1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new BorderLayout(0, 0));
        
        JPanel controlPanel = new JPanel();
        panel.add(controlPanel, BorderLayout.WEST);
        controlPanel.setLayout(new BorderLayout(0, 0));
        
        JButton botonBrosha = new JButton("Brocha");
        botonBrosha.addActionListener(e -> currentTool = "Brocha");
        controlPanel.add(botonBrosha, BorderLayout.NORTH);
       
        JButton botonBorrador = new JButton("Borrar");
        botonBorrador.addActionListener(e -> currentTool = "Borrar");
        botonBorrador.setPreferredSize(new Dimension(40, 30));
        controlPanel.add(botonBorrador, BorderLayout.CENTER);
        
        JButton botonLimpiar = new JButton("Limpiar");
        botonLimpiar.addActionListener(e -> {
            listaDePuntos.clear();
            drawingPanel.repaint();
        	
        });
        controlPanel.add(botonLimpiar, BorderLayout.SOUTH);

        JPanel colorPanel2 = new JPanel();
        controlPanel.add(colorPanel2, BorderLayout.SOUTH);
        

      // Utilizamos un JSlider para ajustar el grozor del trazo de la brocha
        JSlider strokeSlider = new JSlider(1, 10, strokeWidth);
        strokeSlider.setMajorTickSpacing(1);
        strokeSlider.setPaintTicks(true);
        strokeSlider.addChangeListener(e -> strokeWidth = strokeSlider.getValue());
        controlPanel.add(strokeSlider, BorderLayout.SOUTH);

        drawingPanel = new DrawingPanel();
        panel.add(drawingPanel, BorderLayout.CENTER);

        drawingPanel.addMouseListener(this);
        drawingPanel.addMouseMotionListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        lastPoint = e.getPoint();
        points.add(lastPoint);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        List<Point> copiedPoints = new ArrayList<>(points);
        listaDePuntos.add(copiedPoints);
        points.clear();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point newPoint = e.getPoint();
        points.add(newPoint);
        drawingPanel.repaint();
        lastPoint = newPoint;
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    class DrawingPanel extends JPanel {
        public DrawingPanel() {
            setBackground(Color.WHITE);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            
            g2d.setColor(currentColor);
            g2d.setStroke(new BasicStroke(strokeWidth));

           
            for (List<Point> trazo : listaDePuntos) {
                if (trazo.size() > 1) {
                    for (int i = 1; i < trazo.size(); i++) {
                        Point p1 = trazo.get(i - 1);
                        Point p2 = trazo.get(i);
                        g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
                    }
                }
            }

           
            if (points.size() > 1) {
                for (int i = 1; i < points.size(); i++) {
                    Point p1 = points.get(i - 1);
                    Point p2 = points.get(i);
                    g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }
        }
    }
}

        
        
		/*implement MouseListener
		 * @Override
 	public void mouseClicked(MouseEvent e) {
 		// TODO Auto-generated method stub
 		System.out.println("Hola");
 	}
 
 
 	@Override
 	public void mousePressed(MouseEvent e) {
 		// TODO Auto-generated method stub
 		System.out.println("Hola");
 	}
 
 
 	@Override
 	public void mouseReleased(MouseEvent e) {
 		// TODO Auto-generated method stub
 		System.out.println("Hola");
 	}
 
 
 	@Override
 	public void mouseEntered(MouseEvent e) {
 		// TODO Auto-generated method stub
 		System.out.println("Hola");
 	}
 
 
 	@Override
 	public void mouseExited(MouseEvent e) {
 		// TODO Auto-generated method stub
 		System.out.println("Hola");
 	}
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
