class DFSTraversal
{
    static int getAdjUnVis(int current, ArrayList<ArrayList<Integer>> list, boolean vis[]){
        for(int i: list.get(current)){
            if(vis[i] == false){
                return i;
            }
        }
        return -1;
    }
    static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean vis[])
    {
       Stack<Integer> st = new Stack<Integer>();
       st.push(src);
       System.out.print(src);
       System.out.print(" ");
       while(!st.empty()){
           int current = st.pop();
           vis[current] = true;
           int temp = getAdjUnVis(current, list, vis);
           if(temp != -1){
               System.out.print(temp);
               System.out.print(" ");
               st.push(current);
               st.push(temp);
           }
       }
    }
}