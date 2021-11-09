class Traffic
{
	String police;
	int colors;
	short fine;
	float intencity;
	Traffic(String p)
	{
		police=p;
	}
	Traffic(String p,int c,short f,float i)
	{
		police=p;
		colors=c;
		fine=f;
		intencity=i;
	}
	String printAll()
	{
		String display=police + "\t" + colors + "\t" + fine + "\t" +intencity;
		return display;
	}
}
	