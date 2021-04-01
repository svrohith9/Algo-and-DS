class Solution:
    def reverse(x: int) -> int:
        if x > 0:
            ans = str(x)
            ans = int(ans[::-1])
        else:
            ans = str(abs(x))
            ans = int("-" + ans[::-1])
        if abs(ans) <= pow(2, 31) and abs(ans) > 0:
            return ans
        else:
            return 0


print(Solution.reverse(x=123123))
