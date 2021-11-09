class TestHelmet{
public static void main(String []args){
Helmet helm=new Helmet(args);
Helmet mle=new Helmet("round");
String res=mle.printAll();
System.out.println(res);
short price=2000;
boolean safety=true;
Helmet ke=new Helmet("circle","black",price,safety);
String result=ke.printAll();
System.out.println(result);
}
}