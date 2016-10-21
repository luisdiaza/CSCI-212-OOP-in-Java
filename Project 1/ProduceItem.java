public class ProduceItem 
{
	private String barcode;
	private String name; 
	private float price;
	
	public ProduceItem(){
		barcode = "";
		name = "";
		price = 0;
	}
	
	public ProduceItem(String b, String n, float p){//argument constructor
		barcode = b;
		name = n;
		price = p;
	}
	
	public String getBarcode(){
		return barcode;
	}
	
	public String getName(){
		return name;
	}
	
	public float getPrice(){
		return price;
	}
	
	public void setBarcode(String b){
		barcode = b;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setPrice(float p){
		price = p;
	}
	
	public String toString()//Overrides
	{
		return "Code: " + barcode + "\nName: " + name + "\nPrice: " + price;
	}
	
	public boolean equals(Object o)
	{
		return (o != null
				&& getClass() == o.getClass()
				&& barcode == ((ProduceItem)o).barcode
				&& name == ((ProduceItem)o).name
				&& price == ((ProduceItem)o).price
				);
				
	}
}
	

