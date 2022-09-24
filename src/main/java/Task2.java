public class Task2 {


    static int[] massive = {1,2,3,1,2,3,4,4,5,5,2,2,43};
    public static boolean checkNumbers(int[] massive) {
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == 1 || massive[i] == 4) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(checkNumbers(massive));
    }
}
