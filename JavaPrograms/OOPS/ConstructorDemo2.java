package OOPS;
class Item
{
	int itemNum;
	String itemName;
	
	Item(int itemNum, String itemName) //Paramaterized Constructor
	{
		this.itemNum = itemNum;
		this.itemName = itemName;
	}
	//Item(){}//Defalut Constructor
	
	void display()
	{
		System.out.println("Item Number = "+itemNum);
		System.out.println("Item Name = "+itemName);
	}
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		Item I = new Item(111, "Mobile");
		I.display();
		Item I2 = new Item(222, "Bike");
		I2.display();
	}

}
