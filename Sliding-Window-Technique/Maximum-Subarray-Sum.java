class MaxSumSubArrayOfSizeK {
  public static int findMaxSumSubArray(int k, int[] arr) {
    
    int result[] = new int[arr.length-k+1];
    int windowStart=0;
    int windowSum=0;
    for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
      windowSum += arr[windowEnd];
      if(windowEnd>=k-1){
        result[windowStart] = windowSum;
        windowSum -= arr[windowStart];
        windowStart++;
      }
      int max = result[0];
      for(int i=1;i<result.length;i++){
        if(max<result[i]){
          max=result[i];
        }
      }
      return max;
    }
    return -1;
  }
}
