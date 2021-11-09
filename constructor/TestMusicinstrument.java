class TestMusicinstrument
{
	public static void main(String []args)
	{
		Musicinstrument musicinstrument=new Musicinstrument("guitar");
		String music=musicinstrument.printAll();
		System.out.println(music);
		short size=1600;
		Musicinstrument  musicinstrument2=new Musicinstrument  ("piano",50,size,70.50f);
		System.out.println(musicinstrument2.printAll());
	}
}