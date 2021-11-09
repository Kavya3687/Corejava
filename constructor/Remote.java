class Remote
{
	String brand;
	int buttons;
	short size;
	float price;
	Remote(String b)
	{
		brand=b;
	}
	Remote(String b,int B,short s,float p)
	{
		brand=b;
		buttons=B;
		size=s;
		price=p;
	}
	String printAll()
	{
		String display= brand+ "\t" + buttons + "\t" + size + "\t" +price;
		return display;
	}
}
	