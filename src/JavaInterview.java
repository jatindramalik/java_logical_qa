public class JavaInterview{

    public static void main(String[] args) {
        Runnable r = ()->{
            for(int i=0;i<=10;i++){
                System.out.println("child t-1");
            }
        };
        Thread t = new Thread(r);
        t.start();;
       for(int i=0;i<=10;i++){
                System.out.println("main t-1");
            }
    }


}