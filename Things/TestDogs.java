class TestDogs{
public static void main(String []args){
Dogs mp=new Dogs();

byte weight=mp.weight;
String size=mp.size;
mp.structure();
String r=mp.color();
String re=mp.identify();
String res=mp.stay();
String resu=mp.grow();
System.out.println(Dogs.name);
System.out.println(Dogs.height);
System.out.println(Dogs.price);
System.out.println(weight);
System.out.println(size);
System.out.println(r);
System.out.println(re);
System.out.println(res);
System.out.println(resu);
}
}