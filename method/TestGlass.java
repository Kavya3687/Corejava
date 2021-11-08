class TestGlass{
public static void main(String []args){
Glass.price();
Glass glass=new Glass();
byte tester=Glass.price();
byte tester1=glass.weight();
System.out.println(tester);
System.out.println(tester1);
}
}