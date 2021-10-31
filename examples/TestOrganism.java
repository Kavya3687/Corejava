class TestOrganism{
public static void main(String []args){
Organism organism=new Organism();
organism.name="plant";
String organismname=organism.name;
System.out.println(organismname);
organism.growth=8.5f;
float organismgrowth=organism.growth;
System.out.println(organismgrowth);
int organismcells=organism.cells;
System.out.println(organismcells);
Organism sentorganism=new Organism();
String sentorganismname=sentorganism.name;
System.out.println(sentorganismname);
}
}