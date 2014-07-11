__author__ = 'Hyace'
def removeDuplicates(arr):
    n=len(arr)
    index=0
    for i in range(1,n):
        if arr[index]!=arr[i]:
            index+=1
            arr[index]=arr[i]
    return index+1

arr=[1,1,1,2,2,3,3,4,4,4,5,5,6,6]
print removeDuplicates(arr)