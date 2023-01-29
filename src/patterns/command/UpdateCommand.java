package patterns.command;

public class UpdateCommand implements Command{
    private final DataBase dataBase;

    public UpdateCommand(DataBase dataBase){
        this.dataBase = dataBase;
    }
    @Override
    public void execute() {
        dataBase.update();
    }
}
