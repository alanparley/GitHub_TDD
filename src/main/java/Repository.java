import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private ArrayList<Commit> commits;
    private String repoType;

    public Repository(String name, String description, String repoType){
        this.name = name;
        this.description = description;
        this.repoType = repoType;
        this.commits = new ArrayList<Commit>();

    }
}
