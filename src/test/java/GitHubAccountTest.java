import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    private GitHubAccount gitHubAccount;
    private Repository repository;

    @Before
    public void before(){
        gitHubAccount = new GitHubAccount("Alan_Parley", "alanparley", AccountType.FREE);
        repository = new Repository("Bucket List Project", "A bucket list app", RepositoryType.PUBLIC);
    }

    @Test
    public void hasAccountName(){
        assertEquals("Alan_Parley", gitHubAccount.getAccountName());
    }

    @Test
    public void hasUserName(){
        assertEquals("alanparley", gitHubAccount.getUserName());
    }

    @Test
    public void hasAccountType(){
        assertEquals(AccountType.FREE, gitHubAccount.getAccountType());
    }

    @Test
    public void canAddRepository(){
        gitHubAccount.addRepository(repository);
        assertEquals(1, gitHubAccount.countRepositories() );
    }
}
