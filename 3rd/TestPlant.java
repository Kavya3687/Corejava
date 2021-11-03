class TestPlant{
public static void main(String []args){
Plant.growth();
Plant plant=new Plant();
byte Growth=Plant.growth();
byte Height=plant.height();
System.out.println(Growth);
System.out.println(Height);
}
}