public class Main {

    public static void main(String[] args) {
        boolean result = Basic.first("java_skyprogo", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        if (result) {
            System.out.println("Все введено корректно");
        } else {
            System.out.println("Исправьте логин или пароль");
        }
    }
}