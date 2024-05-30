import java.util.List;
import java.util.Optional;

public class Tree<T> {

    private T root;
    private List<Tree<T>> subtrees;

    private Tree(T root, List<Tree<T>> subtrees) {
        this.root = root;
        this.subtrees = subtrees;
    }

    private boolean isEmpty() {

        boolean is_empty = this.root == null;
        return is_empty;

    }

    private int Length() {
        if (this.isEmpty()) {
            return 0;
        }
        else {
            int size = 1;
            for (Tree<T> subtree : this.subtrees) {
                size += subtree.Length();
            }
            return size;
        }
    }

}
