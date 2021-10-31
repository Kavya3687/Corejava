class TestChair{
public static void main(String []args){
Chair mp=new Chair();

byte price=mp.price;
String color=mp.color;
mp.structure();
String r=mp.use();
String re=mp.kept();
String res=mp.cost();
String resu=mp.type();
System.out.println(Chair.shape);
System.out.println(Chair.height);
System.out.println(Chair.weight);
System.out.println(price);
System.out.println(color);
System.out.println(r);
System.out.println(re);
System.out.println(res);
System.out.println(resu);
}
}