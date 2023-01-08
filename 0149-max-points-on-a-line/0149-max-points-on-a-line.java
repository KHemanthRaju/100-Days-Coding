class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        
        // If there are 0 or 1 points, there is at most one line that can be formed
        // (i.e., the line formed by the single point, or no line if there are no points)
        if(n <= 2) return n;
        
        // Initialize the maximum number of points on a line to 2, since there must be at least 2 points to form a line
        int ans = 2;
        
        // Iterate through all pairs of points
        for(int i = 0 ;i < n; i++){
            for(int j = i+1; j < n ; j++){
                // temp is the number of points on the line formed by point i and point j
                int temp = 2;
                // Check if any other points are on the same line as point i and point j
                for(int k = j+1 ; k<n ; k++ ){                   
                    // Check if point k is on the same line as point i and point j
                    // This is done by checking if the slope between point i and point k is equal to the slope between point i and point j
                    int x = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]);
                    int y = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]);
                    if(x == y){
                        // If the slopes are equal, point k is on the same line as point i and point j
                        temp++;
                    }
                }
                // Update the maximum number of points on a line if necessary
                if(temp > ans){
                    ans = temp;
                }
            }
        }   
        // Return the maximum number of points on a line
        return ans;
    }
}