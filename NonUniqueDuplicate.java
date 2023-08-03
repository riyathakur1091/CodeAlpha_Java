public class NonUniqueDuplicate 
{
    public static void main(String args[]) 
    {
        int [] a = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
        boolean count;
        
        for (int i =0;i<a.length;i++)
        { count=false;
            for (int j=0; j<a.length ;j++)
            {
                if (i!=j && a[i]==a[j])
                {
                    count=true;
                    break;
                }

            }
            if (!count)System.out.println(a[i]);

        }
    }

}


 