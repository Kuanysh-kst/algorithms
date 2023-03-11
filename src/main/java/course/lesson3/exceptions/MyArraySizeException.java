package course.lesson3.exceptions;

public class MyArraySizeException extends MyException {
    public MyArraySizeException(){
        super("неправильный размер массива");
    }
}
