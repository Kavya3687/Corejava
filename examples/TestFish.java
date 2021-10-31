class TestFish{
public static void main(String []args){
Fish fish=new Fish();
fish.name="shark";
String fishname=fish.name;
System.out.println(fishname);
fish.height=8.5f;
float fishheight=fish.height;
System.out.println(fishheight);
int fishprice=fish.price;
System.out.println(fishprice);
Fish sentfish=new Fish();
String sentfishname=sentfish.name;
System.out.println(sentfishname);
}
}