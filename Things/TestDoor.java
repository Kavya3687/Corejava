class TestDoor{
public static void main(String []args){
Door mp=new Door();

byte price=mp.price;
String color=mp.color;
mp.structure();
String r=mp.use();
String re=mp.kept();
String res=mp.cost();
String resu=mp.type();
System.out.println(Door.shape);
System.out.println(Door.height);
System.out.println(Door.weight);
System.out.println(price);
System.out.println(color);
System.out.println(r);
System.out.println(re);
System.out.println(res);
System.out.println(resu);
}
}