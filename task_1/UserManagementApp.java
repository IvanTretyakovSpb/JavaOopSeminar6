package seminar_6.task_1;

//    Главный класс приложения, который является точкой входа в приложение.
public class UserManagementApp {
    public static void main(String[] args) {
        ModelStorage storage = new ModelStorage();
        UserView view = new UserView();
        UserPresenter presenter = new UserPresenter(storage, view);

        presenter.userAction();
    }
}
