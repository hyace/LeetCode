class Solution:
    def search(self, A, target):
        left = 0
        right = len(A) - 1
        while left <= right:
            mid = (left + right) / 2
            if A[mid] == target:
                return mid
            if A[left] >= A[mid]:
                if target < A[mid] or target >= A[left]:
                    right = mid - 1
                else:
                    left = mid + 1
            elif A[mid] >= A[right]:
                if target > A[mid] or target <= A[right]:
                    left = mid + 1
                else:
                    right = mid - 1
            else:
                if target < A[mid]:
                    right = mid - 1
                else:
                    left = mid + 1
        return -1
