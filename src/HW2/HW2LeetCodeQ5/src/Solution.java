import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> A=new ArrayList<>();
        int row=matrix.length,col=matrix[0].length;
        int r=0,c=0;

        while(c<col && r<row){
            for(int i=c;i<col;i++)
                A.add(matrix[r][i]);
            r+=1;
            for(int i=r;i<row;i++)
                A.add(matrix[i][col-1]);
            col-=1;

            if(r<row){
                for(int i=col-1;i>=c;i--)
                    A.add(matrix[row-1][i]);
                row-=1;
            }

            if(c<col){
                for(int i=row-1;i>=r;i--)
                    A.add(matrix[i][c]);
                c+=1;
            }

        }
        return A;
    }

}
