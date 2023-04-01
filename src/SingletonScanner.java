import java.util.Scanner;
public class SingletonScanner {

    private static volatile SingletonScanner instance;

    private static Scanner scanner;

    private SingletonScanner() {
        scanner = new Scanner(System.in);
    }

    public static SingletonScanner getInstance() {
        if (instance == null) {
            synchronized (SingletonScanner.class) {
                if (instance == null) {
                    instance = new SingletonScanner();
                }
            }
        }
        return instance;
    }

    public int getNextInt(){
        int a = scanner.nextInt();
        return a;
    }

    public String getNextLine(){
        String a = scanner.nextLine();
        return a;
    }

}
