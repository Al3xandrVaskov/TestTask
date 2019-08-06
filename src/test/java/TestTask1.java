import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestTask1 {

    private Task1 task1;
    private ArrayList<String> fourthOctetList = new ArrayList<>();
    private int thirdOctet;


    @Before
    public void init() {
        fourthOctetList.add("243.175.21.4");
        fourthOctetList.add("243.175.21.5");
        fourthOctetList.add("243.175.21.6");

        thirdOctet = 515;
    }

    @Test
    public void fourthJctet() {
        task1 = new Task1("243.175.21.3", "243.175.21.7");
        Assert.assertTrue(fourthOctetList.equals(task1.printAndCheckRange()));
    }

    @Test
    public void emptyIp() {
        task1 = new Task1("", "243.175.21.7");
        Assert.assertNull(task1.printAndCheckRange());
    }

    @Test
    public void inversionIp() {
        task1 = new Task1("243.175.21.7", "243.175.21.3");
        Assert.assertTrue(fourthOctetList.equals(task1.printAndCheckRange()));
    }

    @Test
    public void thirdJctet() {
        task1 = new Task1("243.175.21.3", "243.175.23.7");
        int cnt = task1.printAndCheckRange().size();
        Assert.assertTrue(cnt == thirdOctet);
    }

    @Test
    public void nullWork() {
        task1 = new Task1(null, null);
        Assert.assertNull(task1.printAndCheckRange());

    }
}
