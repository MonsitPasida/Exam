package exam;

public class evenodd {

    public static int CountEven(int[] a, int Size) {
        int i, evenCount = 0;
        System.out.print("\n มีเลขคู่คือ ");
        for (i = 0; i < Size; i++) {
            if (a[i] % 2 == 0) {
                System.out.print("*" + " ");
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
    
    public static int evensum(int[]a, int Size)
    {
    
    System.out.print("ผลรวมของเลขคู่คือ ");
    int i, Evensum = 0;
    for(i = 0; i < Size; i++)
    {
        if (a[i] % 2 == 0){
            Evensum = Evensum +a[i];
        }
    }
    System.out.print(Evensum);
    return Evensum;
    }
    
    public static int oddsum(int[]a, int Size)
    {
    
    System.out.print("\nผลรวมของเลขคี่คือ ");
    int i, Oddsum = 0;
    for(i = 0; i < Size; i++)
    {
        if (a[i] % 2 != 0){
            Oddsum = Oddsum +a[i];
        }
    }
    System.out.print(Oddsum);
    return Oddsum;
    }
    
    
}
