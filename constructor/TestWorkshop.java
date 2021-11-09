class TestWorkshop
{
	public static void main(String []args)
	{
		Workshop workshop=new Workshop("elearning");
		String work=workshop.printAll();
		System.out.println(work);
		short group=10;
		Workshop workshop2=new Workshop("school",5000,group,90.50f);
		System.out.println(workshop2.printAll());
	}
}