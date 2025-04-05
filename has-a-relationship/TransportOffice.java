
import java.lang.classfile.instruction.ThrowInstruction;

class Vehicle{
private String regNo;
private String owName;
private String veType;
private int fuelCapacity;
public void setRegNo(String regNo) {
    if(regNo!=null && regNo!=this.regNo){
        this.regNo = regNo;
    }else{
        System.out.println("enter valid regestration no : ");
    }
    
}
public String getRegNo() {
    return regNo;
}
public void setOwName(String owName) {
    this.owName = owName;
}
public String getOwName() {
    return owName;
}
public void setVeType(String veType) {
    this.veType = veType;
}
public String getVeType() {
    return veType;
}
public void setFuelCapacity(int fuelCapacity) {
    if(fuelCapacity!=0){
        this.fuelCapacity = fuelCapacity;
    }
}
public int getFuelCapacity() {
    return fuelCapacity;
}
public void updateFuelCapacity(int newCapacity){
    this.fuelCapacity=newCapacity;
}
public void vehicleInfo(){
    System.out.println("regNo :"+regNo);
    System.out.println("owner name :" + owName);
    System.out.println("fuelCapacity :" + fuelCapacity);
    System.out.println("vehicle type :" + veType);

}
 String s;
}

public class TransportOffice {
   
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setRegNo("");
        v.vehicleInfo();       
        System.out.println(v.s);
    }
}
