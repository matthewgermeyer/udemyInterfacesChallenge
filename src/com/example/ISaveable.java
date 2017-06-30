package com.example;

import java.util.List;

/**
 * Created by MattyG on 6/30/17.
 */
public interface ISaveable {

    List<String> write();

    void read(List<String> savedValues);
}
