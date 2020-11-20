import java.util.ArrayList;

public class GitHubAccount {

    private String name;
    private String userName;
    private ArrayList<Repository> repositories;
    private String accountType;

    public GitHubAccount(String name, String userName, String accountType){
        this.name = name;
        this.userName = userName;
        this.repositories = new ArrayList<Repository>();
        this.accountType = accountType;
    }
    
}
