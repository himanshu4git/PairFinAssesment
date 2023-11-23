import utilities.MyUtils;

public class Main {
    public static void main(String[] args) {
        int[] nums = MyUtils.getUserInputArray();
        int majorityElement = MyUtils.majorityElementMap(nums);
        System.out.println("The majority element is: " + majorityElement);
    }
}
