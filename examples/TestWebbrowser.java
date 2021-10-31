class TestWebbrowser{
public static void main(String []args){
Webbrowser webbrowser=new Webbrowser();
webbrowser.name="crome";
String webbrowsername=webbrowser.name;
System.out.println(webbrowsername);
webbrowser.version=8.5f;
float webbrowserversion=webbrowser.version;
System.out.println(webbrowserversion);
int webbrowserapps=webbrowser.apps;
System.out.println(webbrowserapps);
Webbrowser sentwebbrowser=new Webbrowser();
String sentwebbrowsername=sentwebbrowser.name;
System.out.println(sentwebbrowsername);
}
}