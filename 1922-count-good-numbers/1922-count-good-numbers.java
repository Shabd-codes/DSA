class Solution {
    public int countGoodNumbers(long n) {

        long ans;

        if (n % 2 == 0) {

            long ans1 = power(5, n / 2);
            long ans2 = power(4, n / 2);

            ans = (ans1 * ans2) % 1000000007;
        }
        else {

            long ans1 = power(5, (n / 2) + 1);
            long ans2 = power(4, n / 2);

            ans = (ans1 * ans2) % 1000000007;
        }

        return (int) ans;
    }

    public long power(long base, long n) {

        if (n == 0) {
            return 1;
        }

        long half = power(base, n / 2);

        if (n % 2 == 0) {
            return (half * half) % 1000000007;
        }
        else {
            return (half * half * base) % 1000000007;
        }
    }
}