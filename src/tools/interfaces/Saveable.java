package tools.interfaces;

import java.util.List;


public interface Saveable {
    public void saveToFile(List arrayList,String fileName); 
    public List loadFromFile(String fileName);
}