class TestSkyscraper
{
	public static void main(String []args)
	{
		Skyscraper skyscraper=new Skyscraper("burjkalifa");
		String sky=skyscraper.printAll();
		System.out.println(sky);
		short cost=30000;
		Skyscraper skyscraper2=new Skyscraper("lenova",5,cost,60.50f);
		System.out.println(skyscraper2.printAll());
	}
}