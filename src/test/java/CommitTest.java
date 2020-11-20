import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    private Commit commit;

    @Before
    public void before(){
        commit = new Commit("added CSS", "2779b0d4a23ce82132ac35a138e79820a1e334f1");
    }

    @Test
    public void canGetDescription(){
        assertEquals("added CSS", commit.getDescription());
    }

    @Test
    public void canGetUniqueId(){
        assertEquals("2779b0d4a23ce82132ac35a138e79820a1e334f1", commit.getUniqueId());
    }

}
