class TestHome{
public static void main(String []args){
Home ho=new Home(args);
Home oh=new Home("teddy");
String res=oh.printAll();
System.out.println(res);
short rooms=100;
boolean sweethome=true;
Home ke=new Home("panda","orange",rooms,sweethome);
String result=ke.printAll();
System.out.println(result);
}
}