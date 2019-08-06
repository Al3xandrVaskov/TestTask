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
        trueNumbers.equals(task2.printResponse("Иванов И.И."));
    }
    @Test(expected = NullPointerException.class)
    public void nullWork(){
        nullList.equals(task2.printResponse(null));
    }
    @Test(expected = NullPointerException.class)
    public void emptyWork(){
        nullList.equals(task2.printResponse(""));
    }

    @Test(expected = NullPointerException.class)
    public void wrongWork(){
        nullList.equals(task2.printResponse("Пушенко В.Д."));
    }

}
