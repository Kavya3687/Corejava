class TestHuman{
public static void main(String []args){
Human mp=new Human();

byte weight=mp.weight;
String size=mp.size;
mp.structure();
String r=mp.color();
String re=mp.walk();
String res=mp.eat();
String resu=mp.grow();
System.out.println(Human.name);
System.out.println(Human.height);
System.out.println(Human.nooflegs);
System.out.println(weight);
System.out.println(size);
System.out.println(r);
System.out.println(re);
System.out.println(res);
System.out.println(resu);
}
}