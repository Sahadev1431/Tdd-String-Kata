public class StringCalculater {
    int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String[] splittedArr = numbers.split(",|\n|;");

        int ans = 0;
        if (splittedArr[0].startsWith("//")) {
            ans = addAll(1, splittedArr);
        } else {
            ans = addAll(0, splittedArr);
        }
        return ans;
    }

    int addAll(int start, String[]splittedArr) {
        int addition = 0;
        for (int i = start; i < splittedArr.length; i++) {
            if (!splittedArr[i].isEmpty()) {
                addition += Integer.parseInt(splittedArr[i]);
            }
        }
        return addition;
    }
}