package services.serviceWork;

import services.serviceValidation.AuthorizationValidation;

import exceptions.LoginException;

public class AuthorizationWork implements Work {

    AuthorizationValidation as = new AuthorizationValidation();
    String login;

    public AuthorizationWork(String login) {
        this.login = login;
    }

    @Override
    public void work() throws LoginException {
        if (!as.requestValidation(login)){
            throw new LoginException();
        }
        System.out.println("Логин введен корректно");
        if (!as.responseValidation(login)){
            throw new LoginException();
        }
        System.out.println("Авторизация прошла успешно");
    }
}
