import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestTask2 {

    private Task2 task2;
    private ArrayList<String> trueNumbers = new ArrayList<>();
    private ArrayList<String> nullList ;

    @Before
    public void init(){
        task2 = new Task2() ;

        trueNumbers.add("+8 800 2000 500");
        trueNumbers.add("+8 800 200 600");

        nullList = null;
    }

    @Test
    public void trueWork(){
        Assert.assertTrue(trueNumbers.equals(task2.printResponse("Иванов И.И.")));
    }
    @Test
    public void nullWork(){
        Assert.assertNull(task2.printResponse(null));
    }
    @Test
    public void emptyWork(){
        Assert.assertNull(task2.printResponse(""));
    }

    @Test(expected = RuntimeException.class)
    public void wrongWork(){
        task2.printResponse("Пушенко В.Д.");
    }

}
