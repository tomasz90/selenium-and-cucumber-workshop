package utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Util {
    public static String getRandom(String data) {
        List<String> dataList = new ArrayList<>();
        while (data.contains(",")) {
            int commaPlace = data.indexOf(",");
            dataList.add(data.substring(0, commaPlace));
            data = data.substring(commaPlace + 1);
        }
        dataList.add(data);
        Collections.shuffle(dataList);
        return dataList.get(0);
    }
}
