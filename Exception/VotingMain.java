
import java.util.Scanner;

class notEligibleException extends RuntimeException { 
    public notEligibleException(String message) {
        super(message);
    }
}

class EligibleException extends RuntimeException {
  
    public EligibleException(String message) {
        super(message);
    }
}

class Voting {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void chechEligibility(int n) throws Exception {
        if (n < 18) {
            throw new notEligibleException("your are not eligible, your age is " + age);
        } else {
            throw new EligibleException("you are " + age + " years old, you re eligible for voting");
        }
    }

}

public class VotingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();
            Voting v = new Voting();
            try {
                v.chechEligibility(age);
            } catch (notEligibleException e) {
                e.getMessage();
            } catch (EligibleException e) {
                e.getMessage();
            }

        } catch (Exception e) {
            System.out.println("Invalid input");
        }

    }

}
