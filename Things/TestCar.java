class TestCar{
public static void main(String []args){
Car mp=new Car();

byte price=mp.price;
String type=mp.type;
mp.structure();
String r=mp.color();
String re=mp.drive();
String res=mp.cost();
String resu=mp.carry();
System.out.println(Car.name);
System.out.println(Car.height);
System.out.println(Car.weight);
System.out.println(price);
System.out.println(type);
System.out.println(r);
System.out.println(re);
System.out.println(res);
System.out.println(resu);
}
}