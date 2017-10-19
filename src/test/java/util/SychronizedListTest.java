package test.java.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SychronizedListTest {

    private static List<String> list = Collections.synchronizedList( new ArrayList<String>());
}
