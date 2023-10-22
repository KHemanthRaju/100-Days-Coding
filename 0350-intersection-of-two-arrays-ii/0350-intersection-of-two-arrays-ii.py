class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        n1 = sorted(nums1)
        n2 = sorted(nums2)
        p1=0
        p2=0
        res=[]
        while p1<len(n1) and p2<len(n2):
            if(n1[p1]<n2[p2]):
                p1+=1
            elif(n1[p1]>n2[p2]):
                p2+=1
            else:
                res.append(n1[p1]);
                p1+=1
                p2+=1
        return res
        