public class EmptyStackException extends RuntimeException{
    public EmptyStackException(){
        this("Está pilha está vazia");
    }
    public EmptyStackException(String exception){
        super(exception);
    }
}
