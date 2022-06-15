public class gridTravelerMemoization { 
    public static findUniquePathsWithObstacles(int m, int n, int a[][]){     
        int r=a.length;
        int c=a[0].length;
        int paths[][]=new int[r];
        for (int i = 0; i < r; i++) {
            Arrays.fill(paths[i], -1);
          }
          return UniquePathHelper(0, 0, r, c, a, paths);
       
    }
    public static void main(String[] args){

    }
    
}
