class Solution:
    def findComplement(self, num: int) -> int:
        r = '{:08b}'.format(num).lstrip('0')
        r2 = ''
        for i in r:
            if i == '0':
                r2 += '1'
            else:
                r2 += '0'
        r3 = int(r2, 2)
        return r3


if __name__ == '__main__':
    s = Solution()
    r = s.findComplement(5)
    print(r)
