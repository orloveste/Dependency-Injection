import java.util.logging.Logger;

public class MyClass {
    private Logger orlov;
    public  MyClass(Logger orlov){
        this.orlov = orlov;
        orlov.info("How is your new crisis?");
    }
}
