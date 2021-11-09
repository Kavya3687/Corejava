class Skyscraper
{
	String name;
	int floor;
	short cost;
	float height;
	Skyscraper(String n)
	{
		name=n;
	}
	Skyscraper(String n,int f,short c,float h)
	{
		name=n;
		floor=f;
		cost=c;
		height=h;
	}
	String printAll()
	{
		String display= name+ "\t" +floor + "\t" +cost + "\t" +height;
		return display;
	}
}
	