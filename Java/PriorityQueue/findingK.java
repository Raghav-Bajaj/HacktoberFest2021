import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
 
// A class to store a Trie node
class Trie
{
    // `count` and `key` will be set only for leaf nodes
    // `key` stores the string, and `count` stores its frequency so far
    int count = 0;
    String key = null;
 
    // each node stores a map to its child nodes
    Map<Character, Trie> character = new HashMap<>();
}
 
// A class to store a heap node
class Node implements Comparable
{
    String key;
    int count;
 
    // constructor
    Node(String key, int count)
    {
        this.key = key;
        this.count = count;
    }
 
    @Override
    public int compareTo(Object o)
    {
        Node node = (Node)o;
        return count - node.count;
    }
}
 
class Main
{
    // Iterative function to insert a string into a Trie
    private static void insert(Trie head, String str)
    {
        // start from the root node
        Trie curr = head;
 
        for (char c: str.toCharArray())
        {
            // create a new node if the path doesn't exist
            curr.character.putIfAbsent(c, new Trie());
 
            // go to the next node
            curr = curr.character.get(c);
        }
 
        // store key and its count in leaf nodes
        curr.key = str;
        curr.count += 1;
    }
 
    // Function to perform preorder traversal on Trie and insert
    // each distinct key along with its count in max-heap
    private static void preorder(Trie curr, PriorityQueue<Node> pq)
    {
        // base condition
        if (curr == null) {
            return;
        }
 
        for (var entry: curr.character.entrySet())
        {
            // if a leaf node is reached (leaf nodes have a non-zero count),
            // push the key with its frequency in max-heap
            if (entry.getValue().count != 0) {
                pq.add(new Node(entry.getValue().key, entry.getValue().count));
            }
 
            // recur for current node's children
            preorder(entry.getValue(), pq);
        }
    }
 
    // Function to find first k–maximum occurring words in a given
    // list of strings
    public static void findKfrequentWords(String[] dict, int k)
    {
        // insert all keys into a Trie and maintain each key
        // frequency in Trie's leaf nodes
        Trie head = new Trie();
        for (String word: dict) {
            insert(head, word);
        }
 
        // create an empty max-heap
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.reverseOrder());
 
        // perform preorder traversal on given Trie and push each
        // unique key with its frequency in max-heap
        preorder(head, pq);
 
        // run till max-heap becomes empty or `k` keys are printed
        while (k-- > 0 && !pq.isEmpty())
        {
            // extract the maximum node from the max-heap
            Node max = pq.poll();
 
            // print the maximum occurring element with its count
            System.out.println(max.key + " occurs " + max.count + " times");
        }
    }
 
    public static void main (String[] args)
    {
        // given set of keys
        String[] dict =
        {
            "code", "coder", "coding", "codable", "codec", "codecs", "coded",
            "codeless", "codec", "codecs", "codependence", "codex", "codify",
            "codependents", "codes", "code", "coder", "codesign", "codec",
            "codeveloper", "codrive", "codec", "codecs", "codiscovered"
        };
 
        int k = 4;
 
        findKfrequentWords(dict, k);
    }
}