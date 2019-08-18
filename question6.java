public class question6
{
    private long sumOfSquares()
    {
        long total = 0;
        for ( int i = 1; i < 101; i++)
        {
            total += i*i;
        }

        return total;
    }

    private long squareOfSums()
    {
        long total = 0;
        for ( int i = 1; i < 101; i++ )
        {
            total += i;
        }
        return total*total;
    }

    public long answer()
    {
        return squareOfSums() - sumOfSquares();
    }
}