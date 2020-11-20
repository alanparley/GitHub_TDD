import java.util.ArrayList;

public class GitHubAccount {

    private String accountName;
    private String userName;
    private ArrayList<Repository> repositories;
    private AccountType accountType;

    public GitHubAccount(String accountName, String userName, AccountType accountType){
        this.accountName = accountName;
        this.userName = userName;
        this.repositories = new ArrayList<Repository>();
        this.accountType = accountType;
    }

    public String getAccountName(){
        return this.accountName;
    }
    public String getUserName(){
        return this.userName;
    }
    public AccountType getAccountType(){
        return this.accountType;
    }

    public void addRepository(Repository repository){
        this.repositories.add(repository);
    }

    public int countRepositories(){
        return this.repositories.size();
    }

}
