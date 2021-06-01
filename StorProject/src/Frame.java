import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Frame extends Main implements ActionListener  {
	
	//List list;
   //	int []array;
	JTextField text;
	JButton button ;
	JLabel [] labels=new JLabel[25];;
	Font font= new Font("",Font.BOLD,20);
	
	int numbers; 
	
	
	Frame(Coin [] coins){

		
		
	  
		
		
		
		
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		 text=new JTextField();
		 button=new JButton();
		
		
		
		
		text.setBounds(200, 50, 200, 50);
		text.setFont(font);
		
		
		button.setBounds(400, 50, 140, 50);
		button.setText("calculate");
		button.setFont(font);
		button.setBackground(Color.lightGray);
		button.setFocusable(false);
		button.addActionListener(this);//.numbers=Integer.parseInt(text.getText()));
			if(this.numbers>0) {
				
				
				for(int i=1;i<26;i++) {
					labels[i-1]=new JLabel();
				    panel.add(labels[i-1]);
					//labels[i-1].setText(String.valueOf(i));;
				   // labels[i-1].setText(String.valueOf(method(coins, this.numbers)[2]));
				    labels[i-1].setOpaque(true);
					if(i%2==0) {labels[i-1].setBackground(Color.white);}
					else {labels[i-1].setBackground(Color.black);}
			    	
					
					
				} 
				
			}
			
		
		
		
		
		
		
		panel.setBounds(50, 110,454 ,454 );
		panel.setLayout(new GridLayout(5,5,1,1));
		
		
		for(int i=1;i<26;i++) {
			labels[i-1]=new JLabel();
		    panel.add(labels[i-1]);
			//labels[i-1].setText(String.valueOf(i));;
		   // labels[i-1].setText(String.valueOf(method(coins, this.numbers)[2]));
		    labels[i-1].setOpaque(true);
			/*if(i%2==0) {labels[i-1].setBackground(Color.white);}
			else {labels[i-1].setBackground(Color.black);}
	    	
			*/
			
		} 
		
		frame.setSize(600, 600);
		frame.setLayout(null);
		
		
		frame.add(panel);
		frame.add(text);
		frame.add(button);
		frame.setResizable(false);
		
		frame.setVisible(true);
	}
	
	 int price() {
		
		 
		return numbers;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			this.numbers=Integer.parseInt(text.getText());
			for(int i=1;i<25;i++) {
				
			if(method(this.numbers)[i-1]!=0) {	 
				
			   
				//labels[i-1].setText(String.valueOf(method( this.numbers)[i-1]));
				
				
					
					ImageIcon image = null;
					
					
					switch(method( this.numbers)[i-1]) {
					case 10: image=new ImageIcon("10.png");break;
					case 20: image=new ImageIcon("20.png");break;
					case 50: image=new ImageIcon("50.png");break;
					case 100: image=new ImageIcon("100.png");break;
					case 200: image=new ImageIcon("200.png");break;
					
					
					}
					labels[i-1].setIcon(image);
					
					
			    	
			    	 }
				
				
			}
			
			
			
		}
		
		}

	
		
	

}
