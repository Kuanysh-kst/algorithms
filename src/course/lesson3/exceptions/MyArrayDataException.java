package course.lesson3.exceptions;

public class MyArrayDataException extends MyException {

    private int row;
    private int column;
    private String value;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getValue() {
        return value;
    }

    public MyArrayDataException(int row, int column, String[][] value) {
        super("в ячейке массива лежит что-то не то в " + "[" + row + " ; " + column + "] :" + value[row][column]);
        this.row = row;
        this.column = column;
        this.value = value[row][column];
    }
}
