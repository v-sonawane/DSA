class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        res=list()
        for i in range(len(intervals)-1):
            if intervals[i+1][1]>=intervals[i][1] and (intervals[i][0]>=intervals[i+1][0]):
                temp_min=min(intervals[i][0],intervals[i+1][0])
                temp_max=max(intervals[i][1].intervals[i+1][1])
            else:
                temp_min=intervals[i][0]
                temp_max=intervals[i][1]
            res.append([temp_min,temp_max])
        print(res)
        