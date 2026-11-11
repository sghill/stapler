package hudson.util;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RunList extends AbstractList<String> {

    private final List<String> builds = Arrays.asList("a", "b", "c", "d");

    @Override
    public String get(int index) {
        return builds.get(index);
    }

    @Override
    public int size() {
        throw new AssertionError("RunList.size() should not be called");
    }

    @Override
    public Iterator<String> iterator() {
        return builds.iterator();
    }
}
