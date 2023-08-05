import java.util.*;

public class program6 {

  public static void main(String[] args) {

    int length;
    int sum = 0;
    int i;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number=");
    length= sc.nextInt();
    long[] series = new long[length];
    series[0] = 0;
    series[1] = 1;
    for (i = 2; i < length; i++) {

      series[i] = series[i - 1] + series[i - 2];
    }

    System.out.print(Arrays.toString(series));
    for (i = 0; i < series.length; i++){
            sum += series[i];
    }
    System.out.print("sum is :"+sum);

  }

}