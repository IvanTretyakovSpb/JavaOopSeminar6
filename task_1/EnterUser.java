package seminar_6.task_1;

public interface EnterUser {

    //    метод для входа пользователя в приложение по логину и паролю
    default void enterUser(String login, String password) {
        for (ModelUserNew user : ModelStorage.usersBase) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                System.out.println("===".repeat(20));
                System.out.println("Поздравляем! Вы вошли в приложение!");
                System.out.println("===".repeat(20));
                return;
            }
        }
        System.out.println("Неверно введен логин и(или) пароль!");
    }
}
