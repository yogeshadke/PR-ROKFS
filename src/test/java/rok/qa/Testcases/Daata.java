package rok.qa.Testcases;

import org.testng.annotations.Test;

import Wrapper.ApachePOI;
import rok.qa.Utilities.BaseClass;

public class Daata extends BaseClass {
    
    @Test(dataProvider = "getData", dataProviderClass = ApachePOI.class)
    public void logictest(String name, String value) {
        String userdata[] = value.split(",");
        String rw = userdata[0];
        String username = userdata[1];
        String pws = userdata[2];
        System.out.println(rw);
    }
}
