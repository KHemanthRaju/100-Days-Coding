class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        // Initialize the output array.
        int[] output = new int[n];
        
        // Step 1: Compute the left products and store in output array.
        output[0] = 1;  // Nothing to the left of the first element, so set to 1.
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        
        // Step 2: Compute the right products and update output array.
        int rightProduct = 1;  // Nothing to the right of the last element, so start with 1.
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightProduct;  // Multiply the current left product with the right product.
            rightProduct *= nums[i];    // Update the right product for the next iteration.
        }
        
        return output;
    }
}