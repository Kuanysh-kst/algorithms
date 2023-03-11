package patterns.command;

public class SelectCommand implements Command{
    private final DataBase dataBase;

    public SelectCommand (DataBase dataBase){
        this.dataBase = dataBase;
    }
    @Override
    public void execute() {
        dataBase.select();
    }
}
