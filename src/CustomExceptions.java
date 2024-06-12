public class CustomExceptions extends Exception {

    private String message;

    public CustomExceptions(String message) {
        this.message = "니가 그러고도 코더냐? 에러 발생했다 : " + message;
    }

    public String getMessage(){
        return message;
    }

}
