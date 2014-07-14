class Solution:
    def removeDuplicates(self, a):
        n = len(a)
        index = 0
        for i in a:
            if a[index] != i:
                index += 1
                a[index] = i
        return index + 1