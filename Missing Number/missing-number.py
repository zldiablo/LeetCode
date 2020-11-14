from typing import List


class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums.sort()
        for i in range(0, len(nums)):
            if i != nums[i]:
                return i
        return len(nums)


if __name__ == '__main__':
    s = Solution()
    r = s.missingNumber([3, 0, 2])
    print(r)
