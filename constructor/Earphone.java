class Earphone
{
	String color;
	int connections;
	short button;
	float cost;
	Earphone(String c)
	{
		color=c;
	}
	Earphone(String c,int C,short b,float co)
	{
		color=c;
		connections=C;
		button=b;
		cost=co;
	}
	String printAll()
	{
		String display= color+ "\t" + connections + "\t" + button + "\t" +cost;
		return display;
	}
}
	