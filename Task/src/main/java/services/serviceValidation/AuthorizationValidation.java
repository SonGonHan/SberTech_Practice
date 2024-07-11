package services.serviceValidation;

import java.util.Arrays;
import java.util.List;

public class AuthorizationValidation implements Validation<String> {

    private static final List<String> LOGINS = Arrays.asList(
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
        return LOGINS.contains(login);
    }
}
