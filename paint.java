import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
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
    private List<Rectangle> figuras = new ArrayList<>();
    private List<Triangle> figuras2 = new ArrayList<>();
    private List<Circle> figuras3 = new ArrayList<>();
    
    private Color currentColor = Color.BLACK; // Color por defecto
    private int strokeWidth = 3; // Grosor del trazo
    private String currentTool = "Brush"; // Herramienta seleccionada ("Brush", "Eraser", etc.)
    
    // 1 = Pincel, 2 = Cuadrado
    private int method = 1;
    
   
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
               
        JButton btnNewButton = new JButton("Pincel");
        controlPanel.add(btnNewButton, BorderLayout.NORTH);
 		btnNewButton.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				
 				method = 1;
 				
 			}
 		});
        JButton botonBorrador = new JButton("Borrar");
        botonBorrador.addActionListener(e -> currentTool = "Borrar");
        controlPanel.add(botonBorrador, BorderLayout.CENTER);
       
        JButton botonRectangulo = new JButton("Rectángulo");
        controlPanel.add(botonRectangulo, BorderLayout.LINE_START);
        botonRectangulo.addActionListener(new ActionListener() {
       
       
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			method = 2;
		}
        
        
        });
        
        JButton botonTriangulo = new JButton("Triángulo");
        controlPanel.add(botonTriangulo, BorderLayout.CENTER);
        botonTriangulo.addActionListener(new ActionListener() {
        	
        	@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			method = 3;
    		}
            
            
            });
        JButton botonCirculo = new JButton("Círculo");
        controlPanel.add(botonCirculo, BorderLayout.LINE_END);
        botonCirculo.addActionListener(new ActionListener() {
        	
        	@Override
    		public void actionPerformed(ActionEvent e) {
    			// TODO Auto-generated method stub
    			method = 4;
    		}
            
            
            });
        
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
		 if(method==1)
			 points.add(newPoint);  

	     drawingPanel.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {
    	if(method==2) {
 			Rectangle tmp = new Rectangle(e.getX(),e.getY(),100,100);
 			figuras.add(tmp);
 		}
    	if(method == 3) {
   
           
            int base = 100; 
            int altura = e.getY(); 

         
            Triangle tmp2 = new Triangle(base, altura);
            figuras2.add(tmp2);
        }
    	if (method == 4) {
            
            int radio = 50; 
            Circle tmp3 = new Circle(e.getX(), e.getY(), radio); 
            figuras3.add(tmp3);  
        }
    
 		
 		drawingPanel.repaint();
 	}

    		

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
            for (Iterator iterator = figuras.iterator(); iterator.hasNext();) {
 				Rectangle rectangle = (Rectangle) iterator.next();
 				
 				g2d.drawRect(rectangle.x, rectangle.y, rectangle.w, rectangle.h);
 				
 			}
            for (Iterator<Triangle> iterator = figuras2.iterator(); iterator.hasNext();) {
                Triangle triangle = iterator.next();
                int base = triangle.getBase();
                int altura = triangle.getAltura();
            
                int[] xPoints = {triangle.getX(), triangle.getX() - base / 2, triangle.getX() + base / 2};
                int[] yPoints = {triangle.getY(), triangle.getY() + altura, triangle.getY() + altura};
                g2d.drawPolygon(xPoints, yPoints, 3); // Dibuja el triángulo
            }
            for (Iterator<Circle> iterator = figuras3.iterator(); iterator.hasNext();) {
                Circle circle = iterator.next();
                int x = circle.getX();
                int y = circle.getY();
                int radio = circle.getRadio();
                
                // Dibujar el círculo usando el método fillOval (rellenar)
                g2d.drawOval(x - radio, y - radio, 2 * radio, 2 * radio); // Dibuja el círculo
            }
 	    }
 	}
 	
 			class Rectangle{
 		
 				private int x,y,w,h;
 		
 				public Rectangle(int x, int y,int w, int h)
 		{
 			this.x = x;
 			this.y = y;
 			this.w = w;
 			this.h = h;
 		}
 	}
 			
 			class Triangle {
 			    private int base;   
 			    private int altura; 

 			  
 			    public Triangle(int base, int altura) {
 			        this.base = base;
 			        this.altura = altura;
 			    }

 			    
 			    public int getX() {
					// TODO Auto-generated method stub
					return 0;
				}


				public int getY() {
					// TODO Auto-generated method stub
					return 0;
				}


				public int getBase() {
 			        return base;
 			    }

 			    public int getAltura() {
 			        return altura;
 			    }

 			  
 			    public double calcularArea() {
 			        return (base * altura) / 2.0;
 			    }
 			}

 			class Circle {
 			   
 				private int x, y, radio;

 			    public Circle(int x, int y, int radio) {
 			        this.x = x;
 			        this.y = y;
 			        this.radio = radio;
 			    }

 			
 			    public int getX() {
 			        return x;
 			    }

 			    public int getY() {
 			        return y;
 			    }

 			    public int getRadio() {
 			        return radio;
 			    }	
 				
 			
 		
         /*  if ("Rectángulo".equals(currentTool) && points.size() == 2) {
                Point p1 = points.get(0);
                Point p2 = points.get(1);
                int x = Math.min(p1.x, p2.x);
                int y = Math.min(p1.y, p2.y);
                int width = Math.abs(p1.x - p2.x);
                int height = Math.abs(p1.y - p2.y);
                g2d.drawRect(x, y, width, height); 
            }

           
            if ("Triángulo".equals(currentTool) && points.size() == 2) {
                Point p1 = points.get(0);
                Point p2 = points.get(1);
                int[] xPoints = {p1.x, (p1.x + p2.x) / 2, p2.x};
                int[] yPoints = {p1.y, p2.y, p1.y};
                g2d.drawPolygon(xPoints, yPoints, 3);
            }

            
            if ("Círculo".equals(currentTool) && points.size() == 2) {
                Point p1 = points.get(0);
                Point p2 = points.get(1);
                int x = Math.min(p1.x, p2.x);
                int y = Math.min(p1.y, p2.y);
                int width = Math.abs(p1.x - p2.x);
                int height = Math.abs(p1.y - p2.y);
                g2d.drawOval(x, y, width, height);
            }*/
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
