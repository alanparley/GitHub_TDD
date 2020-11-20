import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    private Repository repository;
    private Commit commit;

    @Before
    public void before(){
        repository = new Repository("Bucket_List_Project", "A bucket list app", RepositoryType.PUBLIC);
        commit = new Commit("Added CSS", "2779b0d4a23ce82132ac35a138e79820a1e334f1");
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
        repository.addCommit(commit);
        assertEquals(1, repository.countCommits());

    }
}
