class Keyboard
{
	String color;
	int keys;
	short size;
	float price;
	Keyboard(String c)
	{
		color=c;
	}
	Keyboard(String c,int k,short s,float p)
	{
		color=c;
		keys=k;
		size=s;
		price=p;
	}
	String printAll()
	{
		String display=color + "\t" + keys + "\t" + size + "\t" +price;
		return display;
	}
}
	