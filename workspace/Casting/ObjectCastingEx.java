public class ObjectCastingEx{
  public static void main(String[] args){
	Car obj = new Ford();
//    Following will result in compilation error
   // obj.fordMethod();	//As the method fordMethod is undefined for the Car Type
//  Following will result in compilation error
//    ((HeavyVehicle)obj).fordMethod();    //As the method fordMethod is undefined for the HeavyVehicle Type
//  Following will result in compilation error
    
	((Ford)obj).fordMethod();
    
    //Following will compile and run
	//Honda hondaObj = (Ford)obj;	//Cannot convert from Ford to Honda as they are sibblings

  }
}