class TestRemote
{
	public static void main(String []args)
	{
		Remote remote=new Remote("sonyTV");
		String rem=remote.printAll();
		System.out.println(rem);
		short size=100;
		Remote remote2=new Remote("mostLG",20,size,90.50f);
		System.out.println(remote2.printAll());
	}
}