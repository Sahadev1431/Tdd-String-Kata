public class StringCalculater {
    int add(String numbers) {
        if (numbers.isEmpty()) return 0;
        // if (numbers.length() == 1) return Integer.parseInt(numbers);
        String[] splittedArr = numbers.split(",|\n|;");

        int addition = 0;
        if (splittedArr[0].startsWith("//")) {
            for (int i = 1; i < splittedArr.length; i++) {

                if (!splittedArr[i].isEmpty()) {
                    addition += Integer.parseInt(splittedArr[i]);
                }
            }
        } else {
            for (int i = 0; i < splittedArr.length; i++) {
                addition += Integer.parseInt(splittedArr[i]);
            }
        }
        

        return addition;
    }
}