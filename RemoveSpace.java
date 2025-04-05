public class RemoveSpace {
// public static String concat(String s)
// {
//     String s1 = "";
//         for (int i = 0; i < s.length(); i++) {
//             if(s.charAt(i)!=' '){
//                 s1 = s1 + s.charAt(i);
//             }
//         }
//         return s1;
// }

public static String concat(String s) {
    String s1="";
    for (int i = 0; i < s.length(); i++) {
        if(s.charAt(i)!=' '){
            s1=s1+s.charAt(i);
        }
    }
    return s1;
}

public static void everyFirstChar(String s) {
  for (int i = 0; i < s.length(); i++) {
    if(i==0 && s.charAt(i)!=' '){
        System.out.print(s.charAt(i));
    }else if(i>0 && s.charAt(i)==' ' ){
        System.out.println(s.charAt(i+1));
    }
  }
}
    public static void main(String[] args) {
        String s = "pratyay , are you fine!";
        System.out.println(concat(s));
    }
}
