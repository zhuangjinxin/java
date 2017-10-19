package test.java.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapTest {

    private static Map<String,Object> map = Collections.synchronizedMap(new HashMap<String, Object>());

}
