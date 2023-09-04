class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new LinkedList<>();
        char[][] table = new char[n][n];
        for(int i = 0; i < n; i++) for(int j = 0; j < n; j++) table[i][j] = '.';
        dfs(result, table, 0, n);
        return result;
    }
    public void dfs(List<List<String>> result, char[][] table, int row, int n){
        if(row == n){
            List<String> temp = new LinkedList<>();
            for(int i = 0; i < n; i++){
                temp.add(new String(table[i]));
            }
            result.add(temp);
            return;
        }
        for(int i = 0; i < n; i++){
            if(check(table, row, i, n)){
                table[row][i] = 'Q';
                dfs(result, table, row + 1, n);
                table[row][i] = '.';
            }
        }
    }
    private boolean check(char[][] table, int row, int col, int n){
        for(int i = 0; i < n; i++){
            if(table[row][i] == 'Q') return false;
            if(table[i][col] == 'Q') return false;
        }
        int tempRow = row, tempCol = col;
        while(tempRow >= 0 && tempCol >= 0) if(table[tempRow--][tempCol--] == 'Q') return false;
        while(row >= 0 && col < n) if(table[row--][col++] == 'Q') return false;
        return true;
    }
}