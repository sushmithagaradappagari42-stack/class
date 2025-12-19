abstract class Plane
{
abstract void takeoff();
abstract void fly();
abstract void land();
}
class CargoPlane extends Plane
{
void takeoff()
{
System.out.println("Cargoplane is takeoff low height);
}
void fly()
{
System.out.println("Cargoplane is flying medium height);
}
void land()
{
System.out.println("Cargoplane is  landing);
}
}
class Passengerplane extends Plane
{
void takeoff()
{
System.out.println("Passengerplane is takeoff low height);
}
void fly()
{
System.out.println("Passengerplane is flying medium height);
}
void land()
{
System.out.println("Passengerplane is  landing);
}
}
class FighterPlane extends Plane
{
void takeoff()
{
System.out.println("FighterPlane is takeoff low height);
}
void fly()
{
System.out.println("FighterPlane is flying medium height);
}
void land()
{
System.out.println("FighterPlane is  landing);
}
}
class Airport extends Plane
{
void permit(Plane ref)
{
ref.takeoff();
ref.fly();
ref.land();
}
}
public class ExampleForAbstraction{
public static void main(String args[]){
CargoPlane cp=new CargoPlane();
PassengerPlane pp=new PassengerPlane();
FighterPlane fp=new FighterPlane();
Airport a=new Airport();
a.permit(cp);
a.permit(pp);
a.permit(fp);
}
}






