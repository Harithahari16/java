import java.util.Scanner;
public class CountOccurrence_2
{
    public static void main(String[] args) 
    {
        int n, item, count = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter limit:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        item = s.nextInt();
        for(int i = 0; i < n; i++)
        {
          if(a[i] == item)
          {
            count++;
           }
         }
        System.out.println("The occurrences of the element in the array is:"+count);
    }
}