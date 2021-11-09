class TestKeyboard
{
	public static void main(String []args)
	{
		Keyboard keyboard=new Keyboard("Black");
		String key=keyboard.printAll();
		System.out.println(key);
		short size=1631;
		Keyboard keyboard2=new Keyboard ("Black",50,size,70.50f);
		System.out.println(keyboard2.printAll());
	}
}