class TestCraker
{
	public static void main(String []args)
	{
		Craker craker=new Craker("ABC");
		String crak=craker.printAll();
		System.out.println(crak);
		short weight=16;
		Craker craker2=new Craker("XYZ",500,weight,70.50f);
		System.out.println(craker2.printAll());
	}
}