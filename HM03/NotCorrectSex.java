package HM03;

public class NotCorrectSex extends Exception{
    public String getMesage() {
        return "Пол указан не верно. Допустимы только 'f' или 'm'";
    }
}
