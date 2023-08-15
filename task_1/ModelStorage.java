package seminar_6.task_1;

import java.util.ArrayList;
import java.util.List;

//   в соответствии с принципом SRP (Single responsibility principle)
//   4 метода для работы с данными пользователей в хранилище вынесены в отдельные интерфейсы,
//   которые реализует этот класс, чтобы сделать код более гибким при изменениях в каком-либо методе
//   или необходимости добавления данному классу ModelStorage новой функциональности
//   за счёт имплементации новых методов.

//   Также здесь используется принцип ISP (Interface Segregation Principle) для разделения интерфейсов
//   на отдельные специализированные сущности, вместо одного общего интерфейса для всех.
public class ModelStorage implements AddUserToStorage, EnterUser, ChangeUserPassword, ReplaceUser {
    //    хранилище для зарегистрированных пользователей
    public static List<ModelUserNew> usersBase;

    //    данные о зарегистрированных пользователях хранятся в ArrayList до завершения работы приложения
    ModelStorage() {
        usersBase = new ArrayList<>();
    }

    //    метод для добавления нового пользователя в базу
    void addUserToStorage(ModelUserNew user) {
        usersBase.add(user);
    }
}