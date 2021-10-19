import org.apache.commons.lang3.StringUtils;

public class Task8_2 {
    String Abbreviate() {
        String s =  "Привет всем кто живет на луне!";

        s = StringUtils.abbreviate(s, 10);
        System.out.println(s);
        return s;
    }






}
