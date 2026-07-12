# Last updated: 12/07/2026, 09:01:59
1class Solution(object):
2    def secondsBetweenTimes(self, startTime, endTime):
3        h1,m1,s1=map(int,startTime.split(":"))
4        h2,m2,s2=map(int,endTime.split(":"))
5        start=h1*3600+m1*60+s1
6        end=h2*3600+m2*60+s2
7        return end-start