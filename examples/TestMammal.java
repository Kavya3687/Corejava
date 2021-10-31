class TestMammal{
public static void main(String []args){
Mammal mammal=new Mammal();
mammal.name="horse";
String mammalname=mammal.name;
System.out.println(mammalname);
mammal.height=18.5f;
float mammalheight=mammal.height;
System.out.println(mammalheight);
int mammallegs=mammal.legs;
System.out.println(mammallegs);
Mammal sentmammal=new Mammal();
String sentmammalname=sentmammal.name;
System.out.println(sentmammalname);
}
}