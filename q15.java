public class q15 {
    public static void main(String args[])
    {
        int n = 7;
        int arr[][] = new int[n][4];

        System.out.println("n  n^2  n^3  n^4");
        for(int i = 0 ; i <n ; i ++)
        {
            // go through the array row by row 
            for (int j = 0 ; j<4 ; j++)
            {
                
                arr[i][j] = (int)Math.pow(i+1,j+1); // row index (i) gives us the number in column 1 of the row , column index tells us which power to calculate
                System.out.print(arr[i][j] + "  "); // printing j+1 th power of i+1 th number
            }
            System.out.println(" ");// go to next line
        }
        
    }
}
