import java.util.Objects;

public class Basic {

    private static final String SYMBOLS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789_";
    private Basic(){
    }


    public static boolean first (String login, String password, String confirmPassword) {
        try {
            second(login, password, confirmPassword);
            return  true;
        } catch (WrongLoginException | WrongPasswordException e){
            return false;
        }
    }
    private static void  second(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if (Objects.isNull(login) || login.length() > 20 || !validSymbols(login)){
            throw new WrongLoginException ("Логин должен быть менее или равен 20 символов");
        }
        if (Objects.isNull(password) || password.length() >= 20 || !validSymbols(password) || (Objects.isNull(confirmPassword) || confirmPassword.length() > 20 || !validSymbols(confirmPassword))){
            throw new WrongPasswordException ("Пароль должен быть строго меньше 20 символов");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException ("Пароли должны совпадать");
        }

    }
    private  static boolean validSymbols(String a){
        char [] symbols = a.toCharArray();
        for (char symbol : symbols){
            if (!SYMBOLS.contains(String.valueOf(symbol))){
                return false;
            }
        }
        return true;
    }

}
