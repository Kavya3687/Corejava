class OddEven{
public static void main(String []kav){
for(int index=0;index<kav.length;index++){
String number=kav[index];
System.out.print(number +"\t");
int n=Integer.parseInt(number);
System.out.println(n);
float nu=Float.parseFloat(number);
System.out.println(nu);
byte num=Byte.parseByte(number);
System.out.println(num);
long numb=Long.parseLong(number);
System.out.println(numb);
short numbe=Short.parseShort(number);
System.out.println(numbe);
double Number=Double.parseDouble(number);
System.out.println(Number);
boolean numbers=Boolean.parseBoolean(number);
System.out.println(numbers);
}
}
}