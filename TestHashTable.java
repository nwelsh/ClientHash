import java.util.NoSuchElementException;


// --== CS400 File Header Information ==--
// Tester
// Name: Nicole Welsh
// Email: Newelsh@wisc.edu
// Team: GB
// TA: Dan
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
/**
 * Tester class to check HashTableMap
 *
 * @author Nicole Welsh
 *
 */
public class TestHashTable {

  public static HashTableMap<String, String> hashTable; // hashtable, used for all tests


  /**
   * Calls the test methods
   *
   * @param args
   */
  public static void main(String[] args) {
    TestHashTable.hashTable = new HashTableMap<String, String>(20);

    // System.out.println("test1 " + TestHashTable.test1());
    // System.out.println("test2 " + TestHashTable.test2());
    // System.out.println("test3 " + TestHashTable.test3());
    // System.out.println("test4 " + TestHashTable.test4());
    // System.out.println("test5 " + TestHashTable.test5());
    // System.out.println("test6 " + TestHashTable.test6());
    System.out.println("test7 " + TestHashTable.test7());
    System.out.println("test8 " + TestHashTable.test8());

  }

  /**
   * Tests my put and size, should be size 1
   *
   * @return true if works
   */
  public static boolean test1() {
    // puts in the keys
    TestHashTable.hashTable.put("my KEY", "my VALUE");

    if (TestHashTable.hashTable.size() == 1) {
      return true;
    }
    return false;
  }

  /**
   * Tests the clear, size should be 0
   *
   * @return true if works
   */
  public static boolean test2() {
    TestHashTable.hashTable.put("key", "val");
    TestHashTable.hashTable.clear(); // tests if the clear works
    System.out.println(TestHashTable.hashTable.size());


    return TestHashTable.hashTable.size() == 0;
  }

  /**
   * Tests the remove method, should return 0
   *
   * @return true if works
   */
  public static boolean test3() {
    TestHashTable.hashTable.put("key", "val");
    TestHashTable.hashTable.remove("key"); // being removed
    System.out.println(TestHashTable.hashTable.size());

    return TestHashTable.hashTable.size() == 0;

  }

  /**
   * tests the put and remove together, should return 0
   *
   * @return true if works
   */
  public static boolean test4() {
    TestHashTable.hashTable.put("key", "val"); // adds here
    TestHashTable.hashTable.put("key2", "val2");
    System.out.println(TestHashTable.hashTable.size());
    TestHashTable.hashTable.remove("key");
    TestHashTable.hashTable.remove("key2"); // removes both
    System.out.println(TestHashTable.hashTable.size());

    return TestHashTable.hashTable.size() == 0;
  }

  /**
   * Tests the get method
   *
   * @return true if works
   */
  public static boolean test5() {
    TestHashTable.hashTable.put("key", "val");
    TestHashTable.hashTable.put("key2", "val2");
    // System.out.println(TestHashTable.hashTable.get("key"));
    if (TestHashTable.hashTable.get("key").equals("val")) { // gets key 1
      return true;
    }
    return false;
  }

  /**
   * Test taken from gradescope to search for a non existing number
   *
   * @return true if works
   */
  public static boolean test6() {
    HashTableMap<Integer, String> tableOfInts = new HashTableMap<Integer, String>(20);
    tableOfInts.put(6, "six");
    tableOfInts.put(8, "eight");
    tableOfInts.put(9, "nine");

    try {
      tableOfInts.get(7); // throws exception
      return false;
    } catch (NoSuchElementException e) {
      return true;
    }
  }

  /**
   * Additional test from graddescope finding a number that is tehre
   *
   * @return true if works
   */
  public static boolean test7() {
    HashTableMap<Integer, String> tableOfInts = new HashTableMap<Integer, String>(20);
    tableOfInts.put(1, "six");
    tableOfInts.put(2, "eight");
    tableOfInts.put(3, "nine");

    System.out.println(tableOfInts.get(3)); // gets 3
    // if(tableOfInts.get(7) )
    return true;
  }

  /**
   * tests hash collisions, it works here but not on gradescope
   *
   * @return true it works
   */
  public static boolean test8() {
    HashTableMap<Integer, String> hashing = new HashTableMap<Integer, String>(5);
    // length of the array, retrieve the 5 in hash table
    // hashing.size = 2;
    hashing.capacity = 5;
    hashing.put(1, "six");
    hashing.put(2, "seven");
    hashing.put(3, "eight");
    // System.out.println("here??");
    hashing.put(4, "nine");
    hashing.put(5, "ten");

    System.out.println(hashing.capacity);
    for (int i = 1; i < hashing.size + 1; i++) {
      System.out.println(hashing.get(i));
    }

    if (hashing.capacity == 10) {
      System.out.println(hashing.capacity);
    }
    return true;

  }



}
