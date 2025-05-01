public class Array2d
 {
    public static void main(String[] args) 
    {
        int[][] matrix= new int[5][2];
        matrix[0][0]=5;
        matrix[0][1]=5;
        matrix[4][1]=5;
        matrix[3][0]=5;
        int i=0;
        int j=0;
        
        for(i=0;i<5;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();

        }
        

        
    }
    
}
