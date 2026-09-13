class Solution {
    public int[] searchRange(int[] nums, int target) {
        int idx = -1;

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                idx = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (idx == -1) {
            return new int[]{-1, -1};
        }

        int start = idx;
        int end = idx;

        while (start > 0 && nums[start - 1] == target) {
            start--;
        }

        while (end < nums.length - 1 && nums[end + 1] == target) {
            end++;
        }

        return new int[]{start, end};
    }
}