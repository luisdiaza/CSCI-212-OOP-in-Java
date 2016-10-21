import java.util.*;

public class Project1 {
	public static void main(String[] args){
		
		Database d = new Database(); 
		String[] myArray = new String[100];
		myArray[0] = "Name\tPrice\tWeight\tPricePerPound\n";
		float grandTotal = 0;
		TextFileInput myFile = new TextFileInput("transactions.txt");
		
		
		int count = 1;
		
		while (true){
			
			String line = myFile.readLine();
			
			if (line == null){
				break;
			
			}
			else{
				StringTokenizer myTokens = new StringTokenizer(line,",");
				
				String code = myTokens.nextToken(); 
				float weight = Float.parseFloat(myTokens.nextToken());
				
				String name = d.getName(code);
				float price = d.getPrice(code);
				float pricePerPound = weight * price;
				grandTotal += pricePerPound;
				
				myArray[count] = name +"\t"+price+"\t"+weight+"\t"+pricePerPound+"\n"; 
				count++;

			}
			
			
		}
		myArray[count] = "\t\t" + grandTotal;
		count++;
		
		
		new GUIReceipt(myArray, count);
			
		
	}
	
}
