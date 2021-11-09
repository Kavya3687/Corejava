class Craker
{
	String name;
	int cost;
	short weight;
	float height;
	Craker(String n)
	{
		name=n;
	}
	Craker(String n,int c,short w,float h)
	{
		name=n;
		cost=c;
		weight=w;
		height=h;
	}
	String printAll()
	{
		String display=name + "\t" + cost + "\t" + weight + "\t" +height;
		return display;
	}
}
	