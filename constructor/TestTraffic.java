class TestTraffic
{
	public static void main(String []args)
	{
		Traffic traffic=new Traffic("XYZ");
		String traf=traffic.printAll();
		System.out.println(traf);
		short fine=160;
		Traffic traffic2=new Traffic ("Black",50,fine,70.50f);
		System.out.println(traffic2.printAll());
	}
}