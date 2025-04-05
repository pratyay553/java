import java.util.*;
class Lsd implements Comparable<Object>{
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    Lsd(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    @Override
    public int compareTo(Object o){
        Lsd s = (Lsd) o;
        return this.id-s.id;
    }
    @Override
    public String toString(){
        return "[name: "+name+", Id: "+id+"]";
    }
}

public class ClasscastExcep {
    public static void main(String[] args) {
        Lsd[] k = {new Lsd(5, "ravi"),
                    new Lsd(9, "avi"),
                    new Lsd(1, "kavi"),
                    new Lsd(3, "uavi"),
                    new Lsd(0, "javi"),
                    };

                    Arrays.sort(k);
                    for (int i = 0; i < k.length; i++) {
                        System.out.println(k[i]);
                    }

    }
}
