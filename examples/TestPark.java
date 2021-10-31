class TestPark{
public static void main(String []args){
Park park=new Park();
park.name="cubbonpark";
String parkname=park.name;
System.out.println(parkname);
park.width=8.5f;
float parkwidth=park.width;
System.out.println(parkwidth);
int parkgames=park.games;
System.out.println(parkgames);
Park sentpark=new Park();
String sentparkname=sentpark.name;
System.out.println(sentparkname);
}
}