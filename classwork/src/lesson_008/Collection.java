package lesson_008;

public interface Collection  {

    boolean print();
    boolean addValue (String o);
    boolean  addIndexAndValue (int index, String o);
    boolean delete (String o);
    String  getIndex  (int index);
    boolean contain (String o);
     boolean equals (String[] str);
    boolean clear();
    int  size();

}
