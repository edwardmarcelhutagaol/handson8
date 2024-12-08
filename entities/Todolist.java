package entities;

public class Todolist {
    private String todo;

    public Todolist(final String todo) {
        this.todo = todo;
    }
    public String getTodo() {
        return todo;
    }

    public void setTodo(final String todo) {
        this.todo = todo;
    }
}
