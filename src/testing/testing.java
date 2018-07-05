package testing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class testing{

	public static void main(String[] args) {
		
		JFrame myframe = new JFrame();
		myframe.setSize(new Dimension(1200, 1200));
		
		JPanel contentPane = new JPanel();
		JPanel dpOne = new JPanel();
		JPanel dpTwo = new JPanel();
		contentPane.setLayout(null); 
		contentPane.add(new IconSquare());
		contentPane.add(new IconCircle());


		//rectangle.setLocation(rectangle.getX(),rectangle.getY());
		

		

		dpOne.setSize(new Dimension(800,200));
		dpTwo.setSize(new Dimension(800,800));
		dpOne.setBorder(BorderFactory.createLineBorder(Color.black));
		dpTwo.setBorder(BorderFactory.createLineBorder(Color.black));
		dpOne.setLocation(100,0);
		dpTwo.setLocation(100,200);
		dpOne.setOpaque(false);
		dpTwo.setOpaque(false);
		contentPane.add(dpOne);
		contentPane.add(dpTwo);


		contentPane.setSize(1000,1000);
		//contentPane.setVisible(true);
		contentPane.setBackground(Color.white);
		myframe.add(contentPane);
		myframe.setVisible(true);

		
	}
	 
  

}
