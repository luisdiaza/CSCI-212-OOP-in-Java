import java.util.*;

public class Database {

	public ProduceItem[] fruitItem = new ProduceItem [100];//fruitItemArray that goes through ProduceItem class
	public static TextFileInput myFile;
	public static String line; 
	public static StringTokenizer myTokens;
	public static String[] stuff;
	public static int count = 0;
	
	public Database() {  
	myFile = new TextFileInput("database.txt");
	//line = myFile.readLine();
	
	
	while(true){
		line = myFile.readLine();
		
		if (line == null){
			break;
		}
		
		else{
			myTokens = new StringTokenizer(line,",");
			
			
				String code = myTokens.nextToken(); 
		    	String name = myTokens.nextToken();
		    	float price = Float.parseFloat(myTokens.nextToken());
		    	
		    	fruitItem[count] = new ProduceItem();
		    	fruitItem[count].setBarcode(code);
		    	fruitItem[count].setName(name);
		    	fruitItem[count].setPrice(price);
		    	
		    	System.out.println(fruitItem[count]);
		    	count++;
			}
			}
}

public String getName(String barcode)
{
	String foundName = "";  
	for (int i = 0; i < count; i++)
	{
		if (barcode.equals(fruitItem[i].getBarcode()))
			foundName = fruitItem[i].getName();
	}
	return foundName;
}

public float getPrice(String barcode)
{
	float foundPrice = 0;   
	for (int i = 0; i < count; i++)
	{
		if (barcode.equals(fruitItem[i].getBarcode()))
			foundPrice = fruitItem[i].getPrice();
	}
	return foundPrice;
}
	



public static void main (String[]args){
	Database d = new Database();
}
}