package HM03;

public class BirdayException extends Exception{
    public String getMesage() {
        return "Неверный формат даты";
    }
}
