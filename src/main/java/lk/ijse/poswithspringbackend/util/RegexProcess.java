package lk.ijse.poswithspringbackend.util;

import java.util.regex.Pattern;

public class RegexProcess {

    public static boolean customerIdMatch(String customerId){
        String regexCusId = "^C\\d{3,}$\n";
        Pattern regexPattern = Pattern.compile(regexCusId);
        return regexPattern.matcher(customerId).matches();
    }
}
