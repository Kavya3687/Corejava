class TestTrekking
{
	public static void main(String []args)
	{
		Trekking trekking=new Trekking("shravanabelagola");
		String tre=trekking.printAll();
		System.out.println(tre);
		short things=300;
		Trekking trekking2=new Trekking ("hillstation",10,things,100.60f);
		System.out.println( trekking2.printAll());
	}
}