import java.util.HashSet;

public class LC73 {

    public static void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for(int r: rows){
            for(int i = 0; i<matrix[r].length; i++){
                matrix[r][i] = 0;
            }
        }

        for(int i = 0; i<matrix.length; i++){
            for(int c: cols){
                matrix[i][c] = 0;
            }
        }

    }

    public static void main(String[] args) {
        int[][] input = {
                {1, 1, 1}, {1, 0, 1}, {1, 1, 1}
        };

        setZeroes(input);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + ",");
            }
            System.out.println("");
        }
    }
}
