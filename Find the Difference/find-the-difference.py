class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        s = sorted(s)
        t = sorted(t)
        for i in range(0, len(s)):
            if s[i] != t[i]:
                return t[i]
        return t[-1]


if __name__ == '__main__':
    s = Solution()
    r = s.findTheDifference('ad', 'daq')
    print(r)
