class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        str1 = '{0:032b}'.format(x)
        str2 = '{0:032b}'.format(y)
        result = 0
        for i in range(0, 32):
            if str1[i] != str2[i]:
                result += 1
        return result


if __name__ == '__main__':
    s = Solution()
    r = s.hammingDistance(1, 4)
    print(r)
