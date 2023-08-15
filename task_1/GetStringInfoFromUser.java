package seminar_6.task_1;

import java.util.Scanner;

public interface GetStringInfoFromUser {
    Scanner scanner = new Scanner(System.in);

    //    метод для запроса текстовой информации у пользователя
    default public String getStringInfoFromUser(String message) {
        System.out.printf("Введите %s пользователя: ", message);
        return scanner.next();
    }
}
