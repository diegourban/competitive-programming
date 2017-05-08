package urban.common.data_structure.trie;

import java.util.HashMap;

class TrieNode {

    private HashMap<Character, TrieNode> nodeChildren;

    public TrieNode() {
        this.nodeChildren = new HashMap<Character, TrieNode>();
    }

    public boolean hasChildNode(char character) {
        return this.nodeChildren.containsKey(character);
    }

    public void makeChildNode(char character) {
        this.nodeChildren.put(character, new TrieNode());
    }

    public TrieNode getChildNode(char character) {
        return this.nodeChildren.get(character);
    }
}
