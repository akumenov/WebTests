import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task8_2Test {

    @Test
    void testAbbreviate() {

        Assert.assertEquals
                (StringUtils.abbreviate
                        ("Привет всем кто живет на луне!", 10), "Привет ...");
        Assert.assertEquals
                (StringUtils.abbreviate
                        ("Привет всем кто живет на луне!", 20), "Привет всем кто ж...");


    }
}
