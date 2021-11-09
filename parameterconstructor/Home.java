class Home
{
String name;
String color;
short rooms;
boolean sweethome;
String[] args=new String[5];
Home(String []args){
System.out.println("home is my comfortable zone");
for(int i=0;i<args.length;i++){
System.out.println(args[i]);
}
}
Home(String n)
{
name=n;
}
Home(String n,String c,short r,boolean s){
this(n);
this.color=c;
this.rooms=r;
this.sweethome=s;
}
String printAll(){
String display=name+"\t "+color+"\t "+rooms+" \t"+sweethome;
return display;
}
}


