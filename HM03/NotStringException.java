package HM03;

public class NotStringException extends Exception{
    private String checkString;
    public NotStringException(String str) {
        this.checkString = str;

    }

    public String getMesage() {
        String message = "В веденном " + checkString + " содержатся не только буквы";
        return message;
    }
}
