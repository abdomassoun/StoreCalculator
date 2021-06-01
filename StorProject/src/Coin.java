
import java.lang.invoke.SwitchPoint;

import javax.swing.*;
import javax.swing.event.SwingPropertyChangeSupport;

import javafx.scene.image.Image;

public class Coin {
	
	int valou;
	int number;
	
	Coin(int valou,int number){
		
		this.number=number;
		this.valou=valou;
		
	}
	
	int getnumber() {
		return number;
		
	}
	int  getvalou() {
		return valou;
		
	}
	ImageIcon getimage() {
	
		ImageIcon image = null;
		
		switch(valou) {
		case 10: image=new ImageIcon("10.png");break;
		case 20: image=new ImageIcon("20.png");break;
		case 50: image=new ImageIcon("50.png");break;
		case 100: image=new ImageIcon("100.png");break;
		case 200: image=new ImageIcon("200.png");break;
		
		
		}
		
		
		
    	
    	
    	return image ;
    }
    	
    	
    
}
