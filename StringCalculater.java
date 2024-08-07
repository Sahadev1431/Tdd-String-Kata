public class StringCalculater {
    int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        if (numbers.length() == 1) return Integer.parseInt(numbers);
        String[] splittedArr = numbers.split(",");

        return Integer.parseInt(splittedArr[0]) + Integer.parseInt(splittedArr[1]);
    }
}