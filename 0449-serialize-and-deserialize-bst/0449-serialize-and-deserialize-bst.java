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

    // Encodes a tree to a single string.
    public String recserialize(TreeNode root, String str){
        if(root == null){
            str += "null,";
        }
        else{
            str += str.valueOf(root.val)+",";
            str = recserialize(root.left,str);
            str = recserialize(root.right,str);
        }
        return str;
    }
    
    public String serialize(TreeNode root) {
        return recserialize(root,"");
    }

    // Decodes your encoded data to tree.
    public TreeNode recdeserialize(List<String> data){
        if(data.get(0).equals("null")){
            data.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(data.get(0)));
        data.remove(0);
        root.left = recdeserialize(data);
        root.right = recdeserialize(data);
        return root;
    }
    
    public TreeNode deserialize(String data) {
        String[] ans = data.split(",");
        List<String> arr = new LinkedList<String>(Arrays.asList(ans));
        return recdeserialize(arr);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;