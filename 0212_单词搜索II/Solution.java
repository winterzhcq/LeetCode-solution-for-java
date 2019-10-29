
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * @author winter
 * @date 2019/10/29 20:48
 */
 class Node{
    public String word;
    public boolean isWord;
    public TreeMap<Character,Node> next;

    public Node(boolean isWord) {
        this.isWord = isWord;
        this.next = new TreeMap<>();
    }

    public Node() {
        this(false);
    }
}
class Trie{
    public Node root;
    public Trie(){
        root = new Node();
    }

    public void add(String word){
        Node cur = root;
        for (int i = 0; i < word.length() ; i++) {
            char c = word.charAt(i);
            if (cur.next.get(c) == null){
                cur.next.put(c,new Node());
            }
            cur = cur.next.get(c);
        }
        cur.isWord = true;
        cur.word = word;
    }
}
public class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        for(String word : words)
            trie.add(word);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[0].length ; j++) {
                find(board,i,j,list,trie.root);
            }
        }
        return list;
    }

    private void find(char[][] board, int i, int j, List<String> list, Node cur) {
        if (cur.isWord) {
            list.add(cur.word);
            cur.isWord = false;
        }
        if( cur==null || i < 0 || i >= board.length || j < 0 ||
                j >= board[0].length ||  cur.next.get(board[i][j]) == null )return;
        cur = cur.next.get(board[i][j]);
        char c = board[i][j];
        board[i][j] = '#';
        find(board,i+1,j,list,cur) ;
        find(board,i-1,j,list,cur);
        find(board,i,j+1,list,cur);
        find(board,i,j-1,list,cur);
        board[i][j] = c;
    }
}
