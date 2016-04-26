/*
 * Verbesserung der frame Klasse:
 * 					Mehr Buttons, Koordinaten automatisch auswählen
 * Verbesserung der Gui Klasse:
 * 					Kein KeyAction, durch Randomklasse automatisch laufen				
 * 					Update Klasse
 * 
 */






package Projekt;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class gui extends JPanel implements ActionListener{
	Timer time;
	Image img;
	int key;
	int X_Bild;
	int lauf;
	
	public gui(){
		key = 0;
		lauf = 0;
		setFocusable(true);
		ImageIcon u = new ImageIcon("C:/HintergrundEclipse.jpg");
		img = u.getImage();
		addKeyListener(new AL());
		time = new Timer(5, this);
		time.start();
	}
	
	public void actionPerformed(ActionEvent e){
		bewegen();
		repaint();
	}
	
	public void bewegen(){
		X_Bild += lauf;
	}
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D f2 = (Graphics2D)g;
		
		f2.drawImage(img, X_Bild, 0, null);
	}
	
	private class AL extends KeyAdapter{
		
		public AL(){
			
		}
		public void keyPressed(KeyEvent e){
			key = e.getKeyCode();
			
			if(key == KeyEvent.VK_UP){
				lauf = 1;
			}
			if(key == KeyEvent.VK_DOWN){
				lauf = -1;	
			}
		}
		
		public void keyReleased(KeyEvent e){
			key = e.getKeyCode();
			if(key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN){
				lauf = 0;
			}
		}
	}
	
}
