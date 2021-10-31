class TestKingdom{
public static void main(String []args){
Kingdom kingdom=new Kingdom();
kingdom.name="animal";
String kingdomname=kingdom.name;
System.out.println(kingdomname);
kingdom.growth=8.5f;
float kingdomgrowth=kingdom.growth;
System.out.println(kingdomgrowth);
int kingdompeople=kingdom.people;
System.out.println(kingdompeople);
Kingdom sentkingdom=new Kingdom();
String sentkingdomname=sentkingdom.name;
System.out.println(sentkingdomname);
}
}