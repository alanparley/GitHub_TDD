import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private ArrayList<Commit> commits;
    private RepositoryType repositoryType;

    public Repository(String name, String description, RepositoryType repositoryType){
        this.name = name;
        this.description = description;
        this.repositoryType = repositoryType;
        this.commits = new ArrayList<Commit>();
    }

    public String getRepositoryName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public RepositoryType getRepositoryType(){
        return this.repositoryType;
    }

    public int countCommits(){
        return this.commits.size();
    }

    public void addCommit (Commit commit){
        this.commits.add(commit);
    }


    public Commit getCommitByUniqueId(String uniqueId){
        Commit foundId = null;
        for (Commit commit: this.commits){
            if (commit.getUniqueId().equals(uniqueId)){
                foundId = commit;

            }
        }
        return foundId;
    }
    public RepositoryType changeToPrivate(RepositoryType repositoryType){
        return this.repositoryType = repositoryType;
    }

    public RepositoryType changeToPublic(RepositoryType repositoryType){
        return this.repositoryType = repositoryType;
    }

}
