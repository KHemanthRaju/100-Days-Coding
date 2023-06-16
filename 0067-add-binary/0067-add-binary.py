class Solution:
    def addBinary(self, a: str, b: str) -> str:
        res=""
        i,j,carry = len(a)-1,len(b)-1,0
        while i>=0 or j>=0:
            sum1 = carry;
            if i>=0 : sum1 += ord(a[i]) - ord('0')
            if j>=0 : sum1+=ord(b[j])-ord('0')
            i,j = i-1, j-1
            carry = 1 if sum1>1 else 0;
            res+=str(sum1%2)
        if carry!=0 : res+=str(carry)
        return res[::-1]
                
        