package urban.common.data_structure.trie;

public class Trie {

    private TrieNode rootNode;
    private final char endOfWordMarker = '\0';

    public Trie() {
        this.rootNode = new TrieNode();
    }

    public boolean checkPresentAndAdd(String word) {

        TrieNode currentNode = this.rootNode;
        boolean isNewWord = false;

        // Work downwards through the trie, adding nodes
        // as needed, and keeping track of whether we add
        // any nodes.
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);

            if (!currentNode.hasChildNode(character)) {
                isNewWord = true;
                currentNode.makeChildNode(character);
            }

            currentNode = currentNode.getChildNode(character);
        }

        // Explicitly mark the end of a word.
        // Otherwise, we might say a word is
        // present if it is a prefix of a different,
        // longer word that was added earlier.
        if (!currentNode.hasChildNode(endOfWordMarker)) {
            isNewWord = true;
            currentNode.makeChildNode(endOfWordMarker);
        }

        return isNewWord;
    }
}
