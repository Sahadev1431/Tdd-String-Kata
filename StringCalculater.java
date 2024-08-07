public class StringCalculater {
    int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        if (numbers.length() == 1) return Integer.parseInt(numbers);
        String[] splittedArr = numbers.split(",");

        int addition = 0;
        for (int i = 0; i < splittedArr.length; i++) {
            addition += Integer.parseInt(splittedArr[i]);
        }

        return addition;
    }
}