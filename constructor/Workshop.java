class Workshop
{
	String project;
	int requirements;
	short group;
	float cost;
	Workshop(String p)
	{
		project=p;
	}
	Workshop(String p,int r,short g,float c)
	{
		project=p;
		requirements=r;
		group=g;
		cost=c;
	}
	String printAll()
	{
		String display= project+ "\t" + requirements + "\t" + group + "\t" +cost;
		return display;
	}
}
	