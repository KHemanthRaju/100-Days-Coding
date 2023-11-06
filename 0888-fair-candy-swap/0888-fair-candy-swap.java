class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
    int bobTotal = 0;
    for (int candies : aliceSizes) aliceTotal += candies;
    for (int candies : bobSizes) bobTotal += candies;
    
    int m = aliceSizes.length, n = bobSizes.length;
    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++)
        if ((aliceTotal - aliceSizes[i] + bobSizes[j]) == (bobTotal - bobSizes[j] + aliceSizes[i]))
          return new int[] { aliceSizes[i], bobSizes[j] };

    return new int[0];
    }
}