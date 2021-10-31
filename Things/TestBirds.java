class TestBirds{
public static void main(String []args){
Birds mp=new Birds();

byte weight=mp.weight;
String size=mp.size;
mp.fly();
String r=mp.color();
String re=mp.drink();
String res=mp.stay();
String resu=mp.grow();
System.out.println(Birds.name);
System.out.println(Birds.height);
System.out.println(Animals.noOfLegs);
System.out.println(weight);
System.out.println(size);
System.out.println(r);
System.out.println(re);
System.out.println(res);
System.out.println(resu);
}
}