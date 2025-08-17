public class FactorialExample {
    static void print(int i, int n){
        if (i >= n){ //True for both
            return; //Iska return type void hai
        }
        System.out.println(i);
        print(++i,n); //Recursive call with pre incremented i.
    }
    static int fact(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        print(1, 5);
        System.out.println(fact(5));
    }
}
