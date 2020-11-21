import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    private GitHubAccount gitHubAccount;
    private GitHubAccount gitHubAccount1;
    private Repository repository;

    @Before
    public void before(){
        gitHubAccount = new GitHubAccount("Alan_Parley", "alanparley", AccountType.FREE);
        gitHubAccount1 = new GitHubAccount("Clive Sinclair", "clivesinclair", AccountType.PRO);
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

    @Test
    public void canGetRepoByName(){
        gitHubAccount.addRepository(repository);
        assertEquals(repository, gitHubAccount.getRepoByName("Bucket List Project"));
    }

    @Test
    public void canUpgradeAccount(){
        assertEquals(AccountType.PRO, gitHubAccount.upgradeAccountType(AccountType.PRO));
    }

    @Test
    public void canDowngradeAccount(){
        assertEquals(AccountType.FREE, gitHubAccount1.downgradeAccountType(AccountType.FREE));
    }
}
