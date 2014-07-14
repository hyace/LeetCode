class Solution:
    def removeDuplicates(self, a):
        n = len(a)
        index = 2
        for i in a:
            if a[index - 2] != i:
                a[index] = i
                index += 1
        return index