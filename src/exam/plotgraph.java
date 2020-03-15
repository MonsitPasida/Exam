
package exam;


public class plotgraph 
{
    public static int CountEven(int[]a, int Size)
    {
    int i, evenCount = 0;
    System.out.print("\n มีเลขคู่คือ ");
    for(i = 0; i < Size; i++)
    {
        if (a[i] % 2==0){
            System.out.print("*"+" ");
            evenCount++;
        }
    }
    return evenCount;
    }
    
    public static int CountOdd(int[]a, int Size)
    {
    int i, OddConut = 0;
    System.out.print("\n มีเลขคี่คือ ");
    for(i = 0; i < Size; i++)
    {
        if (a[i] % 2 != 0){
            System.out.print("*"+" ");
            OddConut++;
        }
    }
    return OddConut;
    }
}
