public class Recursion1 {
    public int Recursive1(int n)
    {
        if(n<=1)
            return n;

       //System.out.print(Recursive1(n-1) + " " + Recursive1(n-2) + " ");
        //System.out.print((n -1) + " "+(n-2));
     int result= Recursive1(n - 1) + Recursive1(n - 2);
        System.out.print(result + " ");

        return result;
        //return Recursive1(n-1) + Recursive1(n-2);
    }

    public static void main(String[] args) {
        Recursion1 r = new Recursion1();
        int res= r.Recursive1(6);
        //System.out.println(res);
        }
}
