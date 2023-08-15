package seminar_6.task_1;

public class UserPresenter {
    private ModelStorage storage;
    private UserView view;

    public UserPresenter(ModelStorage storage, UserView view) {
        this.storage = storage;
        this.view = view;
    }

    public void userAction() {
        boolean flag = true; // флаг для остановки работы программы

        do {
            char userAction = view.getAction();

            switch (userAction) {
                case '1':
                    String userName = view.getStringInfoFromUser("имя");
                    String userLogin = view.getStringInfoFromUser("логин");
                    String userPassword = view.getStringInfoFromUser("пароль");
                    int userAge = Integer.parseInt(view.getStringInfoFromUser("возраст"));
                    ModelUserNew newUser = new ModelUserNew(userName, userLogin, userPassword, userAge);
                    storage.addUserToStorage(newUser);
                    System.out.print("Зарегистрирован новый пользователь: ");
                    view.displayUserInfo(newUser);
                    break;

                case '2':
                    String enterLogin = view.getStringInfoFromUser("логин");
                    String enterPassword = view.getStringInfoFromUser("пароль");
                    storage.enterUser(enterLogin, enterPassword);
                    break;

                case '3':
                    int userId = Integer.parseInt(view.getStringInfoFromUser("номер идентификатора"));
                    ModelUserNew foundUser = storage.getUserData(userId);
                    if (foundUser != null) {
                        view.displayUserInfo(foundUser);
                    } else System.out.println("Пользователь с идентификатором " + userId + " в базе не найден!");
                    ;
                    break;

                case '4':
                    String changeLogin = view.getStringInfoFromUser("логин");
                    String oldPassword = view.getStringInfoFromUser("старый пароль");
                    String newPassword = view.getStringInfoFromUser("новый пароль");
                    storage.changeUserPassword(changeLogin, oldPassword, newPassword);
                    break;

                case '5':
                    String replaceLogin = view.getStringInfoFromUser("логин удаляемого");
                    String replacePassword = view.getStringInfoFromUser("пароль");
                    storage.replaceUser(replaceLogin, replacePassword);
                    break;

                case '6':
                    flag = false;
                    break;

                default:
                    System.out.println("Номер действия введен некорректно!");
            }
        } while (flag);
    }
}
