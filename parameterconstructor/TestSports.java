class TestSports{
public static void main(String []args){
Sports spo=new Sports(args);
Sports ops=new Sports("cricket");
String res=ops.printAll();
System.out.println(res);
short players=11;
boolean won=true;
Sports ke=new Sports("throwball","outdoor",players,won);
String result=ke.printAll();
System.out.println(result);
}
}