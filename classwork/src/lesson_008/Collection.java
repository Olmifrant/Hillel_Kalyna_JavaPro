package lesson_008;

import java.util.List;

public interface Collection  {

    void print();
    void  addValue (String o);
    void  addIndexAndValue (int index, String o);
    void delete (String o);
    void getIndex  (int index);
    void contain (String o);
    boolean equals (Object collection);
    void clear();
    int size();

}
