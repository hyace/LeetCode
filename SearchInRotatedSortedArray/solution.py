class Solution:
    def search(self, A, target):
        left = 0
        right = len(A) - 1
        while left <= right:
            mid = (left + right) / 2
            if A[mid] == target:
                return mid
            if A[left] < A[mid]:
                if A[left] <= target < A[mid]:
                    right = mid - 1
                else:
                    left = mid + 1
            else:
                if A[mid] < target <= A[right]:
                    left = mid + 1
                else:
                    right = mid - 1
        return -1
