class TestHotel{
public static void main(String []args){
Hotel hotel=new Hotel();
hotel.name="mahaveer";
String hotelname=hotel.name;
System.out.println(hotelname);
hotel.height=8.5f;
float hotelheight=hotel.height;
System.out.println(hotelheight);
int hotelfood=hotel.food;
System.out.println(hotelfood);
Hotel senthotel=new Hotel();
String senthotelname=senthotel.name;
System.out.println(senthotelname);
}
}