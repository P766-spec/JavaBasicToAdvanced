import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(6) + 1; // to generate random no between 1 to 6  and not between 0 to 6
        // double y = random.nextDouble();
        // boolean z = random.nextBoolean();

        System.out.println(x);

    }


}
