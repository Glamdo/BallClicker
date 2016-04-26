package Projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame extends JFrame implements ActionListener{
	private JButton schliessen;
	private JButton einstellung;
	private JButton info;
	private JButton ende;
	
	
	
	
	public static void main(String[] args) {
		frame frame = new frame("BallClicker/Menü");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
	    int frameInnerWidth     = (int) frame.getContentPane().getBounds().getWidth();
        int frameInnerHeight    = (int) frame.getContentPane().getBounds().getHeight();
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public frame(String title){
		super(title);
		
		
		
		
		schliessen = new JButton("Spiel starten");
		schliessen.setBounds(120, 40, 160, 40);
		schliessen.addActionListener(this);
		add(schliessen);
		
		einstellung = new JButton("Einstellungen");
		einstellung.setBounds(120, 113, 160, 40);
		einstellung.addActionListener(this);
		add(einstellung);
		
		info = new JButton("Credits");
		info.setBounds(120, 186, 160, 40);
		info.addActionListener(this);
		add(info);
		
		ende = new JButton("Ende");
		ende.setBounds(120, 260, 160, 40);
		ende.addActionListener(this);
		add(ende);
	}

	public static void fenster(){
		JFrame fenster = new JFrame();
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(1150, 5050);
		fenster.setVisible(true);
		fenster.add(new gui());
	}
	
	public static void auswahl(){
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == schliessen){
			fenster();
		}
		if(e.getSource() == info){
			Object[] options = { "OK!" };
			JOptionPane.showOptionDialog(null, "Programmiert von nicht Miles Winkler aber Matthias Gergelyi!","Information",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
			
		}
		if(e.getSource() == einstellung){
			auswahl();

		}
		if(e.getSource() == ende){
			System.exit(0);
		}
		
	}
}


