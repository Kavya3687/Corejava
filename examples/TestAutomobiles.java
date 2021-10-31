class TestAutomobiles{
public static void main(String []args){
Automobiles automobiles=new Automobiles();
automobiles.name="electriccar";
String automobilesname=automobiles.name;
System.out.println(automobilesname);
automobiles.width=81.5f;
float automobileswidth=automobiles.width;
System.out.println(automobileswidth);
int automobilesseats=automobiles.seats;
System.out.println(automobilesseats);
Automobiles sentautomobiles=new Automobiles();
String sentautomobilesname=sentautomobiles.name;
System.out.println(sentautomobilesname);
}
}