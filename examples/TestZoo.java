class TestZoo{
public static void main(String []args){
Zoo zoo=new Zoo();
zoo.name="mysorezoo";
String zooname=zoo.name;
System.out.println(zooname);
zoo.ratings=8.5f;
float zooratings=zoo.ratings;
System.out.println(zooratings);
int zooanimals=zoo.animals;
System.out.println(zooanimals);
Zoo sentzoo=new Zoo();
String sentzooname=sentzoo.name;
System.out.println(sentzooname);
}
}