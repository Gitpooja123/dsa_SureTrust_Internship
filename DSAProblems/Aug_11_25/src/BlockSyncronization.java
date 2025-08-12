class msg{
    public void show(String name){
        //1000 line of code

       synchronized (this){
           for(int i=1; i<=3; i++){
               System.out.println("How are you all guys ?"+name);
           }
        }
        //1000 line of code
    }
}
class OurThread extends Thread{
    msg m; //refrence of msg class
    String name; //string type ki value pass karne k liye
    OurThread(msg m , String name){
        this.m=m;
        this.name=name;
    }
    public void run(){//predefind method of thread class
        m.show(name);
    }
}
public class BlockSyncronization {
    public static void main(String[] args) {
        msg m=new msg();

        OurThread t1=new OurThread(m,"Pooja Rathore");
        OurThread t2=new OurThread(m,"Aarti Rathore");

        t1.start();
        t2.start();

    }
}
