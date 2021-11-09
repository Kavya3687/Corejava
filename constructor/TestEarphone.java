class TestEarphone
{
	public static void main(String []args)
	{
		Earphone earphone=new Earphone("samsung");
		String ear=earphone.printAll();
		System.out.println(ear);
		short button=3;
		Earphone earphone2=new Earphone("lenova",5,button,60.50f);
		System.out.println(earphone2.printAll());
	}
}