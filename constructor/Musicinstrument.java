class Musicinstrument
{
	String name;
	int types;
	short size;
	float price;
	Musicinstrument(String n)
	{
		name=n;
	}
	Musicinstrument(String n,int t,short s,float p)
	{
		name=n;
		types=t;
		size=s;
		price=p;
	}
	String printAll()
	{
		String display=name + "\t" + types + "\t" + size + "\t" +price;
		return display;
	}
}
	