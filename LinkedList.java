
// --== CS400 File Header Information ==--
// Helper class, linked list class
// Name: Nicole Welsh
// Email: Newelsh@wisc.edu
// Team: GB
// TA: Dan
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
/**
 * This class is a helper so I can get and set my keytypes and value types.
 *
 * @author Nicole Welsh
 *
 * @param <KeyType>   type of key of array
 * @param <ValueType> type of value of array
 */
public class LinkedList<KeyType, ValueType> {
  private LinkedList next; // the linked list

  private KeyType key;
  private ValueType val;

  /**
   * Constructor that creates the linked list
   *
   * @param key number of the key
   * @param val type of input
   */
  public LinkedList(KeyType key, ValueType val) {
    this.key = key; // sets to the inputs
    this.val = val;
  }

  /**
   * Gets the key
   *
   * @return the key
   */
  public KeyType getKeyType() {
    return this.key; // the key
  }


  /**
   * sets the key type
   *
   * @param key number of the key
   */
  public void setKeyType(KeyType key) {
    this.key = key; // key
  }

  /**
   * Gets the type of value
   *
   * @return the kind of key
   */
  public ValueType getValueType() {
    return this.val; // value
  }

  /**
   * sets the kind of value
   *
   * @param val the kind of key
   */
  public void setValueType(ValueType val) {
    this.val = val; // value
  }


  /**
   * Gets the next Node
   *
   * @return next node
   */
  public LinkedList getNext() {
    return this.next; // gets next

  }

  /**
   * sets the next node
   *
   * @param next the next node
   */
  public void setNext​(LinkedList next) {
    this.next = next; // sets next
  }

  /**
   * Helper method for the size of the linked list
   *
   * @return size of the linked list
   */
  public int size() {
    LinkedList copy = this;
    int size = 0;

    while (copy.getNext() != null) { // goes through the arrays
      size++; // calculates how many nodes
      copy.getNext();
    }
    return size;
  }


}
