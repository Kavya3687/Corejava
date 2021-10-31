class TestOs{
public static void main(String []args){
Os os=new Os();
os.name="Linux";
String osname=os.name;
System.out.println(osname);
os.version=2.5f;
float osversion=os.version;
System.out.println(osversion);
int osprice=os.price;
System.out.println(osprice);
Os sentos=new Os();
String sentosname=sentos.name;
System.out.println(sentosname);
}
}