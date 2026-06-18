class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        order = []
        map = {}
        for i in nums:
            if i in map:
                map[i] += 1
            else:
                map[i] = 1
        order = [(value, key) for key, value in map.items()]
        order = sorted(order, reverse=True)
        return [order[i][1] for i in range(k)]
             