class Earphone
{
String company;
String color;
short price;
boolean nodisturbance;
String[] args=new String[5];
Earphone(String []args){
System.out.println("details of earphone");
for(int i=0;i<args.length;i++){
System.out.println(args[i]);
}
}
Earphone(String c)
{
company=c;
}
Earphone(String c,String C,short p,boolean n){
this(c);
this.color=C;
this.price=p;
this.nodisturbance=n;
}
String printAll(){
String display=company+"\t "+color+"\t "+price+" \t"+nodisturbance;
return display;
}
}


