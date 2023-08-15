package seminar_6.task_1;

public interface ChangeUserPassword {

    //    метод для смены пароля у зарегистрированного пользователя
    default void changeUserPassword(String login, String oldPassword, String newPassword) {
        for (ModelUserNew user : ModelStorage.usersBase) {
            if (login.equals(user.getLogin()) && oldPassword.equals(user.getPassword())) {
                user.setPassword(newPassword);
                System.out.println("===".repeat(20));
                System.out.println("Пароль успешно изменен!");
                System.out.println("===".repeat(20));
                return;
            }
        }
        System.out.println("Неверно введен логин и(или) пароль пользователя!");
    }
}
