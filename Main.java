import config.Database;
import entities.TodoList;
import repositories.TodoListRepository;
import repositories.TodoListRepositoryImpl;
import services.TodoListService;
import services.TodoListServiceImpl;
import Views.TodoListTerminalView;
import Views.TodoListView;



public class Main {
    public static void main(String[] args) {
        Database database = new Database("databaseku", "root", "", "localhost", "3306");
        database.setup();
//        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
//        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
//        TodoListTerminalView todoListView = new TodoListTerminalView(todoListService);
//        todoListView.run();
    }
}