class TestHouse{
public static void main(String []args){
House mp=new House();

byte price=mp.price;
String rooms=mp.rooms;
mp.plan();
String r=mp.color();
String re=mp.stay();
String res=mp.keep();
String resu=mp.construct();
System.out.println(House.name);
System.out.println(House.height);
System.out.println(House.shape);
System.out.println(price);
System.out.println(rooms);
System.out.println(r);
System.out.println(re);
System.out.println(res);
System.out.println(resu);
}
}