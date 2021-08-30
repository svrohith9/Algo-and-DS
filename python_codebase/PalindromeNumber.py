class Solution:
    def isPalindrome(self, x: int) -> bool:
        txt = str(x)
        if txt == txt[::-1]:
            return True
        else:
            return False
