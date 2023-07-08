package Doit;

public class App {

    private static App app;
    private App(){
        System.out.println("app is created");
    }
    
    public static App getInstance(App app){
        if(app == null){
            app = new App();
        }
        return app;
    }
    public static void main(String[] args) {
        App.getInstance(app);
    }
}
