package lesson_008;

public interface Collection  {

    void print();
    void addValue (String o);
    void addIndexAndValue (int index, String o);
    void delete (String o);
    void getIndex  (int index);
    void contain (String o);
    void  eequals (Object str);
    void clear();
    void size();

}
