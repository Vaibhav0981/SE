import java.util.*;

public class containsduplicate{

    static Scanner sc = new Scanner(System.in);

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        boolean ans = containsDuplicate(nums);

        System.out.println(ans);
    }
}
