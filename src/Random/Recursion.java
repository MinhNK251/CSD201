package Random;

public class Recursion {
    public int Sum(int[] a, int n){
        if (n==0) return a[0];
        else return a[n] + Sum(a,n-1);
    }
    
    public int Max(int[] a, int n){
        if (n==0) return a[n];
        if(a[n]>a[n-1])
            a[n-1]=a[n];
        return Max(a,n-1);
    }
    
    public int countLt0(int[] a, int n){
        int count = 0;
        if (a[n]>0)
            count++;
        if(n==0)
            return count;
        return count + countLt0(a, n-1);
    }

    public static void main(String[] args) {
        int []a = {2,1,3,3,8,0,4,5,0,-1};
        int n=a.length-1;
        Recursion s = new Recursion();
        System.out.println("Sum = " + s.Sum(a,n));
        System.out.println("Max = " + s.Max(a,n));
        int m=s.countLt0(a,n)-1;
        System.out.println("Number of elements larger than 0 = " + m);
    }
}
