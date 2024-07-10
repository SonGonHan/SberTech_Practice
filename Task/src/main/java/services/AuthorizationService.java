package services;

import java.util.Arrays;
import java.util.List;

public class AuthorizationService implements Service {

    private static final List<String> logs = Arrays.asList(
            "SonGonHan",
            "Tomiks",
            "Brokoda",
            "Sunlitt"
    );

    @Override
    public boolean requestValidation(String login) {
        String latinLetters = "[A-Za-z]+";
        return login.matches(latinLetters);
    }

    @Override
    public boolean responseValidation(String login) {
        return logs.contains(login);
    }
}
