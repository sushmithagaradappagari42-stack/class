class Plane{
void takeoff(){
System.out.println("Plane is taking off");
}
void fly(){
System.out.println("Plane is flying");
}
void land(){
System.out.println("Plane is landing");
}
}
class CargoPlane extends Plane{
void fly(){
System.out.println("CargoPlane is flying at low heights");
}
}
class PassengerPlane extends Plane{
void passengers(){
System.out.println("Passengers are waiting for CargoPlane");
}
}
class FighterPlane extends Plane{
void cargoplane(){
System.out.println("Passengers are waiting for CargoPlane");
}
}

class Airport extends Plane{
void permit(Plane ref){
ref.takeoff();
ref.fly();
ref.land();
}
}
public class Methods{
public static void main(String [] args){
CargoPlane cp=new CargoPlane();
PassengerPlane pp=new PassengerPlane();
FighterPlane fp=new FighterPlane();
Airport a=new Airport();
a.permit(cp);
a.permit(pp);
a.permit(fp);
}
}