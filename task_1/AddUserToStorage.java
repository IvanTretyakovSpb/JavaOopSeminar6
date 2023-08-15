package seminar_6.task_1;

public interface AddUserToStorage {
    //    метод для получения данных о пользователе из базы
    default ModelUserNew getUserData(int userId) {
        for (ModelUserNew user : ModelStorage.usersBase) {
            if (userId == user.getUserId()) {
                return user;
            }
        }
        return null;
    }
}
