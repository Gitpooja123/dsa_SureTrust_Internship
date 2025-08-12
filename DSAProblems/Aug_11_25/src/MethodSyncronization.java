class Table{  //Yeh ek business logic class hai
    public synchronized void printTable(int n){ //Abhi yeh method thread-safe nahi hai
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}
class thread1 extends Thread{ //Yeh ek custom thread class hai jo Table ka object use karega.
    Table t; //refrence of table class
    thread1(Table t){ //Constructor me Table ka reference pass kiya jaata hai, taaki yeh thread usi Table object ke method ko call kare.
        this.t=t;  //humne jo t refrence bnaya tha object class ka vo abhi object ka part ban gaya
    }

    public void run(){ //thread class ka method for table print
        t.printTable(5);
    }
}
class thread2 extends Thread{
    Table t; //refrence of table class
    thread2(Table t){
        this.t=t;  //humne jo t refrence bnaya tha object class ka vo abhi object ka part ban gaya
    }

    public void run(){ //thread class ka method
        t.printTable(7);
    }
}
public class MethodSyncronization {
    public static void main(String[] args) {
         Table obj=new Table(); //obj k pass 1 lock

         thread1 t1=new thread1(obj);//Dono threads (t1, t2) ko same Table object ka reference diya jaata hai.
        thread2 t2=new thread2(obj);
     //   thread1 t2 = new thread2(obj);  Error-->Aap thread2 type ka object bana ke usko thread1 type ke variable me store kar rahe ho, jo Java me allowed nahi hai

        t1.start();
        t2.start();
    }
}

//if Not use public synchronized void printTable(int n){-->Jab threads start hote hain, wo ek hi time par printTable() method chalane ki koshish karte hain → is wajah se output mix hua hai (race condition).
