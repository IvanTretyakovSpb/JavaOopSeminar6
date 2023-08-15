package seminar_6.task_1;

public interface DisplayUserInfo {

    //    метод для вывода информации о пользователе
    default public void displayUserInfo(ModelUserNew user) {
        System.out.printf("ID: %d, name: %s, login: %s, password: %s, age: %d\n\n", user.getUserId(), user.getName(),
                user.getLogin(), user.getPassword(), user.getAge());
    }
}
