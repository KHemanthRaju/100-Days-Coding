/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    private int i;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> ans = new ArrayList<>();
        serializedfs(root, ans);
        return String.join(",", ans);
    }

    public void serializedfs(TreeNode root, List<String> ans){
        if(root == null){
            ans.add("N");
            return;
        }
        ans.add(String.valueOf(root.val));
        serializedfs(root.left, ans);
        serializedfs(root.right, ans);
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] tokens = data.split(",");
        return deserializeDfs(tokens);
    }

    public TreeNode deserializeDfs(String[] tokens){
        String token = tokens[this.i];
        if(token.equals("N")){
            this.i++;
            return null;
        }
        var node = new TreeNode(Integer.parseInt(token));
        this.i++;
        node.left  = deserializeDfs(tokens);
        node.right = deserializeDfs(tokens);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));