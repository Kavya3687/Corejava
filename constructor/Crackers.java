class Crackers
{
String brand;
String types;
short price;
boolean harm;
String[] args=new String[5];
Crackers(String []args){
System.out.println("types of crackers");
for(int i=0;i<args.length;i++){
System.out.println(args[i]);
}
}
Crackers(String b,String t,short p,boolean h){
this(b);
this.types=t;
this.price=p;
this.harm=n;
}
String printAll(){
String display=brand+" "+types+" "+price+" "+harm+;
return display;
}
}


