public class Task {
    public static String GetNums(final int COUNT, final int NUM) {
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i <= COUNT; ++i) {
            InsertNum(NUM, ans, i);
        }
        return ans.toString().strip();
    }

    private static void InsertNum(int NUM, StringBuilder ans, int i) {
        ans.append(NUM * i).append(" ");
    }

    public static void main(String[] args) {
        final int COUNT = 14, NUM = 7;
        System.out.println(GetNums(COUNT, NUM));
    }
}
