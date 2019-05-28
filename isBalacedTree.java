class GfG
{
    
     /* This function should return true if passed  tree 
     is balanced, else false. */
    boolean isBalanced(Node root)
    {
    	if(root == null){
    	    return true;
    	}
    	if(Math.abs(maxHeight(root.left) - maxHeight(root.right)) > 1){
    	    return false;
    	}
    	if(!(isBalanced(root.left) && isBalanced(root.right))){
    	    return false;
    	}
    	return true;
    }
    
    int maxHeight(Node node){
        if(node == null){
            return 0;
        }
        return (1 + Math.max(maxHeight(node.left), maxHeight(node.right)));
    }
}
