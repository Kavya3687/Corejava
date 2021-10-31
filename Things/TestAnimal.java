class TestAnimal{
public static void main(String []args){
Animals mp=new Animals();

byte noOfHands=mp.noOfHands;
String size=mp.size;
mp.grow();

String r=mp.drink();
String re=mp.eat();
String res=mp.walk();
String resu=mp.sleep();
System.out.println(Animals.name);
System.out.println(Animals.height);
System.out.println(Animals.noOfLegs);
System.out.println(noOfHands);
System.out.println(size);
System.out.println(r);
System.out.println(re);
System.out.println(res);
System.out.println(resu);
}
}