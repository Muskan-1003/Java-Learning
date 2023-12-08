public class AllPath {
    public static void main(String[] args) {

    }
    static void AllPath(String p,boolean[][] maze,int r,int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(maze[r][c]==false){
            return;
        }
        if(r< maze.length-1){
           AllPath(p+'D' ,maze,r+1,c);
        }
        if(c<maze[0].length-1){
            AllPath(p+'R' ,maze,r,c+1);
        }
        if(r>0){
            AllPath(p+'U' ,maze,r-1,c);
        }
        if(c>0){
            AllPath(p+'U' ,maze,r,c-1);
        }
    }
}
