import java.util.Scanner;

public class Basic {
      //      Math.max(x,y)
       //      Math.min(x,y)
       //     Math.abs(y)
      //     Math.sqrt(x)
     //   Math.round(x)
    //   Math.ceil(x)
    //  Math.floor(x)
      public static void main(String[] args) {
          double x;
          double y;
          double z;

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter side x: ");
          x = sc.nextDouble();
          System.out.println("Enter side y: ");
          y = sc.nextDouble();

          z = Math.sqrt((x*x) + (y*y));
          System.out.println("The hypotenuse is: " +z);

          sc.close();




      }




}
