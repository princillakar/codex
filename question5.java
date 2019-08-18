public class question5 {
	long s = 21;
	{
	while (1==1) {
	    boolean all = true;
	    for (int i = 1; i < 21; i++)
	    {
	        all = true;
	        if ( s % i != 0 )
	        {
	            all = false;
	            break;
	        }
	    }
	    if ( all )
	    {
	        System.out.println( "smallest positive number ="+s );
	        System.exit(0);
	    }

	    s++;
	}

	}
