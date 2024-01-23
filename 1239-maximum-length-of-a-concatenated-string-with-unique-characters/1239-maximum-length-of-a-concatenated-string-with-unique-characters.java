class Solution 
{
    public int maxLength(List<String> arr) 
    {
        int[] max = new int[1];
        backtrack(arr, 0, "", max);
        return max[0];
    }
    
    private static void backtrack(List<String> arr, int index, String current, int[] max) {
        if (index == arr.size()) {
            max[0] = Math.max(max[0], current.length());
            return;
        }

        // Include the current string
        if (isUnique(current + arr.get(index))) {
            backtrack(arr, index + 1, current + arr.get(index), max);
        }

        // Exclude the current string
        backtrack(arr, index + 1, current, max);
    }

    private static boolean isUnique(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (!set.add(ch)) {
                return false; // Character already present, not unique
            }
        }
        return true; // All characters are unique
    }
}