package seminar_6.task_1;

public interface ReplaceUser {

    //    метод для удаления ранее зарегистрированного пользователя из базы
    default void replaceUser(String login, String password) {
        for (int i = 0; i < ModelStorage.usersBase.size(); i++) {
            if (ModelStorage.usersBase.get(i).getLogin().equals(login) && ModelStorage.usersBase.get(i).getPassword().equals(password)) {
                ModelStorage.usersBase.remove(i);
                System.out.println("===".repeat(20));
                System.out.println("Пользователь успешно удален!");
                System.out.println("===".repeat(20));
                return;
            }
        }
        System.out.println("Неверно введен логин и(или) пароль пользователя!");
    }
}
