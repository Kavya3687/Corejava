class TestGrains{
public static void main(String []args){
Grains grains=new Grains();
grains.name="rice";
String grainsname=grains.name;
System.out.println(grainsname);
grains.size=8.5f;
float grainssize=grains.size;
System.out.println(grainssize);
int grainsprice=grains.price;
System.out.println(grainsprice);
Grains sentgrains=new Grains();
String sentgrainsname=sentgrains.name;
System.out.println(sentgrainsname);
}
}