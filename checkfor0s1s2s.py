# Sort a array that consists 0s 1s 2s, with lowest time possible
# sample Input:[1,2,1,1,2,0,1,0,2,0]
# sample Output:[0,0,0,1,1,1,1,2,2,2]

'''Algo:
we have low, high and current pointers..where low and cuurent is pointing to
first element and high is pointing to last element. As we iterate...we check 
for the current element and if it is 0, we will swap it with low pointer, if it is 1 we 
leave it as it is and increment the current and low pointer, if it is 2 we swap it with high and
decrement high pointer. This all will execute as far as cuurent is less than high
(Basically we iterate and if we get 0s we try to send it to left and if we encounter
an 2s we try to send it to right. if 1 none) '''

def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        C = 0
        L = 0
        H = n-1
        while C <= H:
            if nums[C] == 0:
                nums[L], nums[C] = nums[C], nums[L]
                L += 1
                C += 1
            elif nums[C] == 2:
                nums[C], nums[H] = nums[H], nums[C]
                H-=1
            else:
                C += 1
        return nums