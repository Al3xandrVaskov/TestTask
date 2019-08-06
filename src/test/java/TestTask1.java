import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class TestTask1  {

    Task1 task1 ;
    ArrayList<String> fourthOctetList = new ArrayList<>();
    ArrayList<String> nullResult;
    int thridOctet ;


    @Before
    public void init(){
        fourthOctetList.add("243.175.21.4");
        fourthOctetList.add("243.175.21.5");
        fourthOctetList.add("243.175.21.6");

        nullResult = null;

        thridOctet = 511;

    }

    @Test
    public void fourthJctet(){
        task1 = new Task1("243.175.21.3","243.175.21.7");
        fourthOctetList.equals(task1.printAndCheckRange());

        }

    @Test(expected = NullPointerException.class)
    public void emptyIp(){
        task1 = new Task1("","243.175.21.7");
        nullResult.equals(task1.printAndCheckRange());

    }

    @Test
    public void inversionIp(){
        task1 = new Task1("243.175.21.7","243.175.21.3");
        fourthOctetList.equals(task1.printAndCheckRange());

    }

    @Test
    public void thirdJctet(){
        task1 = new Task1("243.175.21.3","243.175.23.7");
        if (thridOctet == task1.printAndCheckRange().size()) {

        }
    }

    @Test
    public void nullWork(){
        task1 = new Task1(null,null);
        nullResult.equals(task1.printAndCheckRange());

    }
}
