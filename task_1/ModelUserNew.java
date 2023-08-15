package seminar_6.task_1;

// расширение функциональности класса ModelUser при добавлении поля возраста пользователя с использованием
// принципа OCP (Open-Closed Principle), когда мы не меняем базовый класс в коде,
// но добавляем на его основе новую функциональность
public class ModelUserNew extends ModelUser{
    private int age; // добавили новое поле, не меняя класс ModelUser

    public ModelUserNew(String name, String login, String password, int age) {
        super(name, login, password);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}