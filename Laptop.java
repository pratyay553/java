package mjava;

class Props {
    String name;
    String version;
    int ram;
    public Props( int ram,String version,String name)//constructor have no return type and modifiers
    {
        // this.name = name;
        // this.ram = ram;
        // this.version = version;
        // return this.name;//error void method can not return a value

        // System.out.println("device name : "+this.name);
        // System.out.println("device name : " + this.ram+"GB");
        // System.out.println("device name : " + this.version+" GEN");
        // System.out.println("------------------------------");

        System.out.println("device name : " + name);
        System.out.println("device name : " + ram + "GB");
        System.out.println("device name : " + version + " GEN");
        System.out.println("------------------------------");
    }
}
public class Laptop {

    public static void main(String[] args) {
        Props p1 = new Props(12,"13-th","hp");
        Props p2 = new Props(32, "11-th", "DELL");
        // System.out.println(p1);
        // System.out.println(p2);

        // System.out.println("device name : " + p1.name);
        // System.out.println("device name : " + p1.ram+"GB");
        // System.out.println("device name : " + p1.version+" GEN");
        // System.out.println("------------------------------");
        // System.out.println("device name : " + p2.name);
        // System.out.println("device name : " + p2.ram + "GB");
        // System.out.println("device name : " + p2.version + " GEN");
        // System.out.println("------------------------------");
    }
}
