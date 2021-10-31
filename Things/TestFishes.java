class TestFishes{
public static void main(String []args){
Fishes mp=new Fishes();

byte weight=mp.weight;
String size=mp.size;
mp.structure();
String r=mp.color();
String re=mp.lifespan();
String res=mp.stay();
String resu=mp.grow();
System.out.println(Fishes.name);
System.out.println(Fishes.height);
System.out.println(Fishes.price);
System.out.println(weight);
System.out.println(size);
System.out.println(r);
System.out.println(re);
System.out.println(res);
System.out.println(resu);
}
}