package serviceWork;

import services.AuthorizationService;
import exceptions.ValidationException;

public class AuthorizationWork implements Work {

    AuthorizationService as = new AuthorizationService();
    String login;

    public AuthorizationWork(String login) {
        this.login = login;
    }

    @Override
    public void work() throws ValidationException {
        if (!as.requestValidation(login)){
            throw new ValidationException();
        }
        System.out.println("Логин введен корректно");
        if (!as.responseValidation(login)){
            throw new ValidationException();
        }
        System.out.println("Авторизация прошла успешно");
    }
}
