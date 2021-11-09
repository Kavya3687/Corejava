class TestCrackers{
public static void main(String []args){
Crackers rs=new Crackers(args);
Crackers cr=new Crackers("peacock");
String res=cr.printAll();
System.out.println(res);
short price=2000;
boolean harm=true;
Crackers ke=new Crackers("kavya","rocket",price,harm);
String result=ke.printAll();
System.out.println(result);
}
}