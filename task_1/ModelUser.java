package seminar_6.task_1;

// Класс для работы с данными (полями) пользователя
// в соответствии с принципом SRP (Single responsibility principle)
// отвечает только за работу с данными пользователя и не за что другое
// (в т.ч. имеет стандартные геттеры и сеттер)

// LSP (Liskov Substitution Principle)
// DIP (Dependency Inversion Principle)
public class ModelUser {
    private String name;
    private String login;
    private String password;
    private int userId;

    //    переменная для счётчика идентификаторов пользователей
    private static int count = 1;

    public ModelUser(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
        userId = count++;
    }

    //    геттеры и сеттер для пароля
    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getUserId() {
        return userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
