class TestDance{
public static void main(String []args){
Dance.types();
Dance dance = new Dance();
short Type=dance.types();
short Step=dance.steps();
System.out.println(Type);
System.out.println(Step);
}
}