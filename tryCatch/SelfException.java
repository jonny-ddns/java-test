package tryCatch;

class SelfException extends Exception{
    String msg = "미성년자는 입장불가";
    public SelfException(String msg) {
        super(msg);
    }
}