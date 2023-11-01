public class CodingTest {

    public static void main(String[] args) {
        //Given Scenarios
        //Scenario1
        int[] check1 = {3, 4, 5, 6};
        int sum1 = 1;
        System.out.println(checksum(check1, sum1));
        //Scenario2
        int[] check2 = {0, 15, 32, 2000, 15000};
        int sum2 = 15;
        System.out.println(checksum(check2, sum2));
        //Scenario3
        int[] check3 = {1, 1, 10, 32, 41};
        int sum3 = 42;
        System.out.println(checksum(check3, sum3));
        //Additional Scenarios
        int[] check4 = {1, 1, 10, 32, 41};
        int sum4 = 420;
        System.out.println(checksum(check4, sum4));
        int[] check5 = {};
        int sum5 = 0;
        System.out.println(checksum(check5, sum5));
    }

    public static int checksum(int[] arr, int X) {
        int count = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == X) {
                count++;
                left++;
                right--;
            } else if (currentSum < X) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

}
