import org.example.Cesar;
import org.junit.Assert;
import org.junit.Test;

public class CesarTest {

    @Test
    public void test3Change() {
        String res = Cesar.cesar("capital", 3);
        String res2 = Cesar.cesar("mom", 3);
        Assert.assertEquals("fdslwdo", res);
        Assert.assertEquals("prp", res2);
    }

    @Test
    public void test4Change() {
        String res = Cesar.cesar("capital", 4);
        Assert.assertEquals("getmxep", res);
        String res2 = Cesar.cesar("mom", 4);
        Assert.assertEquals("qsq", res2);
    }

}
