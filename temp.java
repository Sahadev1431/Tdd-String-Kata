import java.util.Arrays;

public class temp {
    public static void main(String[] args) {
        String numbers = "//;\n1;2";
        String[] splittedArr = numbers.split(",|\n|;");
        
        System.out.println(Arrays.toString(splittedArr));

        if (splittedArr[1].isEmpty()) System.out.println("ys");   
    }
}
