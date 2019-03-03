package spring_1.helloworld;

public class HelloWorld {
    private String user;

    public HelloWorld(){
        System.out.println("HellowWorld's constructor...");
    }

    public void setUser(String user) {
        this.user = user;
    }

    public HelloWorld(String user){
        this.user = user;
    }

    public void hello(){
        System.out.println("Hello: " + user);
    }
}
