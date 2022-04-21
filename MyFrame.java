import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;

public class MyFrame extends JFrame{
	JPanel panel11 ,panel12 , panel13, panel14, panel15;
	MyFrame(){
		panel11 =new JPanel();
         panel12 =new JPanel();
         panel13 =new JPanel();
         panel14 =new JPanel();
         panel15 =new JPanel();


        panel11.setBackground(Color.lightGray);
        panel12.setBackground(Color.lightGray);
        panel13.setBackground(Color.LIGHT_GRAY);
        panel14.setBackground(Color.DARK_GRAY);
        panel15.setBackground(new Color(123,59,78));

        panel11.setPreferredSize(new Dimension(50,50));
        panel12.setPreferredSize(new Dimension(50,50));
        panel13.setPreferredSize(new Dimension(50,50));
        panel14.setPreferredSize(new Dimension(70,70));
        panel15.setPreferredSize(new Dimension(150,150));

		panel15.setBorder(BorderFactory.createLineBorder( Color.white,3));
		panel15.setLayout(new BorderLayout());
        
        this.add(panel11,BorderLayout.NORTH);
        this.add(panel12,BorderLayout.WEST);
        this.add(panel13,BorderLayout.EAST);
        this.add(panel14,BorderLayout.SOUTH);
        this.add(panel15,BorderLayout.CENTER);
		this.setTitle("FrozenBubble");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(680,420);
		this.setVisible(true);
        ImageIcon image= new ImageIcon("logo.jpg");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(123,59,78));
		 

	}
}