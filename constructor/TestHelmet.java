class TestHelmet
{
	public static void main(String []args)
	{
		Helmet helmet=new Helmet("black");
		String helm= helmet.printAll();
		System.out.println(helm);
		short size=300;
		Helmet helmet2=new Helmet ("blue",100,size,true);
		System.out.println( helmet2.printAll());
	}
}