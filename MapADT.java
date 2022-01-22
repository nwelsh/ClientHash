// --== CS400 File Header Information ==--
// MapADT
// Name: Nicole Welsh
// Email: Newelsh@wisc.edu
// Team: GB
// TA: Dan
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
import java.util.NoSuchElementException;

/**
 * Given mapADT class
 *
 * @author Nicole Welsh
 *
 * @param <KeyType>
 * @param <ValueType>
 */
public interface MapADT<KeyType, ValueType> {
  public boolean put(KeyType key, ValueType value);

  public ValueType get(KeyType key) throws NoSuchElementException;

  public int size();

  public boolean containsKey(KeyType key);

  public ValueType remove(KeyType key);

  public void clear();
}
