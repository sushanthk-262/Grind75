boolean maze[n][n];
boolean sol[n][n];

boolean solveMaze(){
    if(maze_solver(maze, 0, 0)) return true;
    return false;
}

boolean is_safe(in[][] maze, int r, int c){
    if(r < n && c < r && maze[r][c] == 1) return true;
    return false;
}

boolean maze_solver(int[][] maze, int r, int c){
    if(r == n-1 && c == n-1) {
        sol[r][c] = 1;
        return true;
    }
    if(is_safe(maze, r, c)){
        sol[r][c] = 1;
        
        if(maze_solver(maze, r+1, c)) return true;
        else if(maze_solver(maze, r, c+1)) return true;

        sol[r][c] = 0;
        return false;
    }

    return false;
}