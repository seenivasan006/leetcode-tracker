# Last updated: 09/07/2026, 10:06:11
class Solution(object):
    def maxDigitRange(self, nums):
        ranges=[]
        for n in nums:
            d = [int(d)for d in str(n)]
            ranges.append(max(d) - min(d))
        mr = max(ranges)
        return sum(n for i,n in enumerate(nums) if ranges[i]==mr)