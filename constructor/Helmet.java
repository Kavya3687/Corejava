class Helmet
{
	String color;
	int price;
	short size;
	boolean safety;
	Helmet(String c)
	{
		color=c;
	}
	Helmet(String c,int P,short s,boolean S)
	{
		color=c;
		price=P;
		size=s;
		safety=S;
	}
	String printAll()
	{
		String display=color+ "\t" +price + "\t" +size + "\t" +safety;
		return display;
	}
}
	