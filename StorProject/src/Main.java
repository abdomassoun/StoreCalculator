import java.util.ArrayList;
import java.util.List;

public class Main {
	
	
	static Coin[] coins= {new Coin(200,4),new Coin(100,6),new Coin(50,10),new Coin(20,5),new Coin(10,7),};
	
	public static void main (String []arge) {
		
		int price =521;
		
		// coins= {new Coin(200,4),new Coin(100,6),new Coin(50,10),new Coin(20,5),new Coin(10,7),};
		
		//method(coins,price);
		Frame frame=new Frame(coins);
		frame.price();
		
		/*List<Integer> list=new ArrayList<Integer>() ;
		list.add(5);
		list.
		*/
	}
	
	public static int[] method(int price) {
	 
		int [] array=new int [24];
		int key=0;
		int j=0;
		int max;
		int min=10;
		do {
		max=0;
		for(int i=0;i<4;i++) {
			
			if( coins[i].getvalou()>max&&coins[i].getvalou()<=price) {max=coins[i].getvalou();key=i;}
			//add anouther condition if of number of coins
			
			
		}
		if(price<min) { break;}
		price=price-coins[key].getvalou();
		coins[key]=new Coin(coins[key].getvalou(),coins[key].getnumber()-1);
		//System.out.println(price +" "+coins[key].getnumber()+"  "+coins[key].getvalou());
		array[j]=coins[key].getvalou();j++;
		}while(price>0);
	
	
	
	return array;
	}
	

}
