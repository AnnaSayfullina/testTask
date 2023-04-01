public class Main {
    public static void main(String[] args) {

        SingletonScanner scanner = SingletonScanner.getInstance();

        System.out.println("Ввведите число");
        int a = scanner.getNextInt();
        System.out.println(a + 5);
        System.out.println("Введите строку");
// сканер не считывает строку... не понимаю в чем ошибка?
        String b = scanner.getNextLine();
        System.out.println(b);
        System.out.println("конец вывода");
    }

}