public class RottenOranges {
    class Pair
{
    int data;
    int value;
    public Pair(int data ,int value){
        this.data = data;
        this.value = value;
    }
    public int getKey(){
        return this.data;
    }
    public int getValue(){
        return this.value;
    }
}
class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
    Queue<Pair> q = new LinkedList<>();
   
    int r = grid.length;
    int c = grid[0].length;
    for( int i = 0;i<r;i++){
        for( int  j = 0 ; j<c;j++){
            if(grid[i][j] ==2)
            q.add(new Pair(i , j));
        }
    }
    int count =0;
    q.add(new Pair(-1,-1));
    while(!q.isEmpty()){
        int i = q.peek().getKey();
        int j = q.peek().getValue();
        //this is for last i.e., if we reach at the last of the queue
        if(i==-1 && j==-1 & q.size()==1){
            q.poll();
            break;
        }
        //this is when any deleimeter is reached and queue is still not empty
        else if(i==-1 && j==-1 & q.size()>1){
            count++;
            q.poll();
            //this will add (-1, -1)which tells another value of 2s is added
            q.add(new Pair(-1,-1));
        }
        else{
            if((i-1)>=0 && grid[i-1][j]==1){
                grid[i-1][j]=2;
                q.add(new Pair(i-1 , j));
            }
            if((j-1)>=0 && grid[i][j-1]==1){
                grid[i][j-1]=2;
                q.add(new Pair(i , j-1));
            }
            if((i+1)<r && grid[i+1][j]==1){
                grid[i+1][j]=2;
                q.add(new Pair(i+1 , j));
            }
            if((j+1)<c && grid[i][j+1]==1){
                grid[i][j+1]=2;
                q.add(new Pair(i, j+1));
            }
            q.poll();
        }
    }
    for( int i = 0;i<r;i++){
        for( int  j = 0 ; j<c;j++){
            if(grid[i][j]==1) return -1;
        }
    }
    return count;
    }
}
}
