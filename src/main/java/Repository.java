import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private ArrayList<Commit> commits;
    //repo type?

    public Repository(String name, String description){
        this.name = name;
        this.description = description;
        this.commits = new ArrayList<Commit>();

    }
}
