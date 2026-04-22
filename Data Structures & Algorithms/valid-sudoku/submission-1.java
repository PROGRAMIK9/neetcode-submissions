class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Brute force 3 passs O(n^2) & O(n)
        // for(int i=0;i<9;i++){
        //     HashSet<Character> seen = new HashSet<>();
        //     for(int j=0;j<9;j++){
        //         if(board[i][j] == '.'){
        //             continue;
        //         }
        //         if(seen.contains(board[i][j])) return false;
        //         seen.add(board[i][j]);
        //     }
        // }
        // for(int i=0;i<9;i++){
        //     HashSet<Character> seen = new HashSet<>();
        //     for(int j=0;j<9;j++){
        //         if(board[j][i] == '.'){
        //             continue;
        //         }
        //         if(seen.contains(board[j][i])) return false;
        //         seen.add(board[j][i]);
        //     }
        // }
        // for (int square = 0; square < 9; square++) {
        //     Set<Character> seen = new HashSet<>();
        //     for (int i = 0; i < 3; i++) {
        //         for (int j = 0; j < 3; j++) {
        //             int row = (square / 3) * 3 + i;
        //             int col = (square % 3) * 3 + j;
        //             if (board[row][col] == '.') continue;
        //             if (seen.contains(board[row][col])) return false;
        //             seen.add(board[row][col]);
        //         }
        //     }
        // }

        // return true;
        //Bit Manipulation O(n^2) & O(n)
           int[] rows = new int[9];
        int[] cols = new int[9];
        int[] squares = new int[9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;

                int val = board[r][c] - '1';

                if ((rows[r] & (1 << val)) > 0 || (cols[c] & (1 << val)) > 0 ||
                    (squares[(r / 3) * 3 + (c / 3)] & (1 << val)) > 0) {
                    return false;
                }

                rows[r] |= (1 << val);
                cols[c] |= (1 << val);
                squares[(r / 3) * 3 + (c / 3)] |= (1 << val);
            }
        }
        return true;
    }
}
