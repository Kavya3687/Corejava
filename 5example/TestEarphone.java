class TestEarphone{
public static void main(String []args){
Earphone ear=new Earphone(args);
Earphone rae=new Earphone("samsung");
String res=rae.printAll();
System.out.println(res);
short price=2000;
boolean nodisturbance=true;
Earphone ke=new Earphone("samsung","blue",price,nodisturbance);
String result=ke.printAll();
System.out.println(result);
}
}