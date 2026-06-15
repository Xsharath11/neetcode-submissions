class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        HashMap = {}
        for i in strs:
            map = [0]*26
            for j in i:
                map[ord(j)-ord('a')] += 1
            map = ",".join(str(item) for item in map)
            if map not in HashMap.keys():
                HashMap[map] = [i]
            else:
                HashMap[map].append(i)

        res = [i for i in HashMap.values()]
        return res

        