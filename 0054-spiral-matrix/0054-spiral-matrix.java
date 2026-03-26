class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        List<Integer> ans = new ArrayList<>();
        while(rowBegin<=rowEnd && colBegin <= colEnd){
            for(int i=colBegin;i<=colEnd;i++){
                ans.add(matrix[rowBegin][i]);
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){
                ans.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowBegin<=rowEnd){
            for(int i=colEnd;i>=colBegin;i--){
                ans.add(matrix[rowEnd][i]);
            }
            }
            rowEnd--;
            if(colBegin<=colEnd){
            for(int i=rowEnd;i>=rowBegin;i--){
                ans.add(matrix[i][colBegin]);
            }
            }
            colBegin++;
        }
        return ans;
    }
}