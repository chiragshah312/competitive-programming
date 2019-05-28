class BFSTraversal
{
    static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[])
    {
       Queue<Integer> q = new LinkedList<Integer>();
       q.add(s);
       while(!q.isEmpty()){
           int current = q.remove();
           if(vis[current] == false){
               System.out.print(current);
               System.out.print(" ");
               vis[current] = true;
               for(int i:list.get(current)){
                   if(vis[i] == false){
                       q.add(i);
                   }
               }
           }
       }
    }
}  
