class Helmet
{
String shape;
String color;
short price;
boolean safety;
String[] args=new String[5];
Helmet(String []args){
System.out.println("details of helmet");
for(int i=0;i<args.length;i++){
System.out.println(args[i]);
}
}
Helmet(String s)
{
shape=s;
}
Helmet(String s,String c,short p,boolean S){
this(s);
this.color=c;
this.price=p;
this.safety=S;
}
String printAll(){
String display=shape+"\t "+color+"\t "+price+" \t"+safety;
return display;
}
}


