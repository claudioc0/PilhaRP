public class FullStackException extends RuntimeException{

    public FullStackException(){
        this("A pilha está cheia");
    }
    public FullStackException(String exception){
        super(exception);
    }
}
