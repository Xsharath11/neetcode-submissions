class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        order = []
        map = {}
        for i in nums:
            map[i] = 1 + map.get(i, 0)
        order = [(value, key) for key, value in map.items()]
        order = sorted(order, reverse=True)
        return [order[i][1] for i in range(k)]
             