class GfG
{
    boolean isBSTNew(Node current, int parent, int grandParent, int lrIndicator){
        if(current == null){
            return true;
        }
        System.out.println(current.data);
        boolean l = true;
        if(current.left != null){
            if(current.left.data > current.data){
                return false;
            }
            if(lrIndicator == 1){
                if(current.left.data > parent){
                    return false;
                }
            }
            else if(current.left.data < parent){
                return false;
            }
            l = isBSTNew(current.left, current.data, parent, 1);
        }
        boolean m = true;
        if(current.right != null){
            if(current.right.data < current.data){
                return false;
            }
            if(lrIndicator == 1){
                if(current.right.data > parent){
                    return false;
                }
            }
            else if(current.right.data < parent){
                return false;
            }
            m = isBSTNew(current.right, current.data, parent, 2);
        }
        return (l && m);
    }
    int isBST(Node root)  
    {
        int maxData = root.data;
        int n = 1;
        if(isBSTNew(root, maxData, maxData, n)){
            return 1;
        }
        return 0;
    }
}
