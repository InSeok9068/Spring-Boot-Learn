package blog;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidationDate {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        simpleDateFormat.setLenient(false);
        simpleDateFormat.parse("20223014");
    }
}
