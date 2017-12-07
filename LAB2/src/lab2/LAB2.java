
package lab2;


public class LAB2 {
public static int ages[] = {20, 45, 47, 38, 35, 67, 18, 34};


    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
           for(int i=0;i<ages.length;i++){
               System.out.println("ages"+ages[i]);
           }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<ages.length; i++){
               System.out.println(ages[i]-18); 
            }
            }
        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
               for(int i=0;i<ages.length;i++){
                   int f=(ages[i]-18)/5+1;
                   System.out.println(f);
               } 
            }
        });
        t1.start();
        try{
            t1.join();
        }catch(InterruptedException iex){
        }catch (Exception ex){
                
        
        }
        t2.start();
        t3.start();
        
    }
}
        /*}*/
        /*t1.start();
        t2.start();
        t3.start();*/

/*
application of threadpools
1. helps in multi threaded servers.
2. Dequeueing threads


*/
        