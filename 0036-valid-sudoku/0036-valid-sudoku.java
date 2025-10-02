class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            int arr[] = new int[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int a = board[i][j] - '1';
                arr[a]++;
                if (arr[a] > 1) {
                    return false;
                }
            }

            int a1[] = new int[9];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                int a = board[j][i] - '1';
                a1[a]++;
                if (a1[a] > 1) {
                    return false;
                }
            }

        }

        int count = 0;
        int i = 0;
        while (i < 9) {
            int si = i;
            int ei = 3*count;
            int a1[] = new int[9];
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (board[si][ei] != '.') {
                    int a = board[si][ei] - '1';
                    a1[a]++;
                    if (a1[a] > 1) {
                        return false;
                    }    
                    }
                    ei++;

                }
                si++;
                ei = 3 * count;
            }
            count++;
            if (count % 3 == 0) {
                i += 3;
                count = 0;
            }

        }
        return true;

    }
}