import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    private Repository repository;
    private Commit commit1;
    private Commit commit2;

    @Before
    public void before(){
        repository = new Repository("Bucket_List_Project", "A bucket list app", RepositoryType.PUBLIC);
        commit1 = new Commit("Added CSS", "2779b0d4a23ce82132ac35a138e79820a1e334f1");
        commit2 = new Commit("Added HTML", "c52cfb035c8354cb93dbc83e317cf302d0bc2e73");
    }

    @Test
    public void hasRepositoryName(){
        assertEquals("Bucket_List_Project", repository.getRepositoryName());
    }

    @Test
    public void hasDescription(){
        assertEquals("A bucket list app", repository.getDescription());
    }

    @Test
    public void hasRepositoryType(){
        assertEquals(RepositoryType.PUBLIC, repository.getRepositoryType());
    }
    @Test
    public void canAddCommit(){
        repository.addCommit(commit1);
        assertEquals(1, repository.countCommits());

    }
//    @Test
//    public void canGetCommitByUniqueId(){
//        repository.addCommit(commit1);
//        repository.addCommit(commit2);
//        assertEquals("c52cfb035c8354cb93dbc83e317cf302d0bc2e73", repository.getCommitByUniqueId(commit2));
//    }

    @Test
    public void canGetCommitByUniqueId(){
        repository.addCommit(commit1);
        repository.addCommit(commit2);
        assertEquals(commit2, repository.getCommitByUniqueId("c52cfb035c8354cb93dbc83e317cf302d0bc2e73"));
    }
}
