class Trekking
{
	String place;
	int people;
	short things;
	float totalcost;
	Trekking(String p)
	{
		 place=p;
	}
	Trekking(String p,int P,short t,float c)
	{
		place=p;
		people=P;
		things=t;
		totalcost=c;
	}
	String printAll()
	{
		String display=place+ "\t" +people + "\t" +things + "\t" +totalcost;
		return display;
	}
}
	