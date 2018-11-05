/* class Users.
*
* ver.: 0.0.1
*
* Информации об авторском параве нет
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** Реализация структуры данных MAP.
 * @version   0.1 27 Oct 2018
 * @author    Georgiy Krasko
 */

public class Users {

    private static Map<String, String> map = new HashMap<String, String>();
    private static Scanner input = new Scanner(System.in);

    private static int getNumberOfUsers() {
       System.out.println("Введите количество пользователей");
       int num;
       num = Integer.parseInt(input.nextLine());
       return num;
    }

    private static void inputUsers(final int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("Введите login пользователя");
            String user = input.nextLine();
            System.out.println("Введите пароль");
            String pass = input.nextLine();
            map.put(user, pass);
        }
        System.out.println("Ввод данных окончен");

    }

    private static void getUserInfo() {
        boolean confirm = true;
        while (confirm) {
            System.out.println("Введите login пользователя для поиска");
            String login = input.nextLine();
            String pass = map.get(login);
            System.out.println("Login - " + login + "; пароль - " + pass);
            System.out.println("Выполнить очередной поиск: y/n");
            String yes = input.nextLine();
            confirm = yes.equals("y");
        }
    }

    public static void main(final String[] args) {
        int numberOfUsers;
        numberOfUsers = getNumberOfUsers();
        inputUsers(numberOfUsers);
        getUserInfo();
        input.close();
    }
}