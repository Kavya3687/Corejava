class Sports
{
String name;
String type;
short players;
boolean won;
String[] args=new String[5];
Sports(String []args){
System.out.println("there are many types in sports");
for(int i=0;i<args.length;i++){
System.out.println(args[i]);
}
}
Sports(String n)
{
name=n;
}
Helmet(String n,String t,short p,boolean w){
this(n);
this.type=t;
this.players=p;
this.won=w;
}
String printAll(){
String display=name+"\t "+type+"\t "+players+" \t"+won;
return display;
}
}


