public class q14 {
    public static void main(String args[])
    {
        double pop= 80000; // total poppulation 
        int year = 0; // counting year using this variable

        while ( pop < 150000) // run while loop till population is 150000
        {
            pop= pop* 1.05 ; // increases at 5 percent
            year ++;
        }

        System.out.println(year);
    }
}
