package treeset_treemap_25.treeset_treemap_2_1;

public class MyTree<T> {
    private TreeElement<T> root;

    private static class TreeElement<T>{
        private int key;
        private T value;
        private TreeElement<T> left;
        private TreeElement<T> right;

        public TreeElement(int key, T value) {
            this.key = key;
            this.value = value;
        }
    }

    public TreeElement<T> getRoot() {
        return root;
    }

    public void addElement(int key, T value){
        TreeElement<T> current = root;
        TreeElement<T> parent;
        TreeElement<T> newElement = new TreeElement<T>(key, value);
        if (root == null){
            root = newElement;
        } else {
            while (true){
                parent = current;
                if (key < current.key){
                    current = current.left;
                    if (current == null){
                        parent.left = newElement;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null){
                        parent.right = newElement;
                        return;
                    }
                }
            }
        }
    }

    public boolean contains(int key){
        TreeElement<T> current = root;
        while (current.key != key){
            if (key < current.key)
                current = current.left;
            else current = current.right;
            if (current == null)
                return false;
        }
        return true;
    }

    public boolean deleteElement(int key){
        TreeElement<T> current = root;
        TreeElement<T> parent = current;
        boolean isLeft = false;  //

        while (current.key != key){
            parent = current;
            if (key < current.key){
                current = current.left;
                isLeft = true;
            } else {
                current = current.right;
                isLeft = false;
            }
            if (current == null)
                return false;
        }

        if (current.left == null && current.right == null){   //have no descendant
            if (current == root)
                current = null;
            else if (isLeft)
                parent.left = null;
            else parent.right = null;
        }

        else if (current.right == null){      //have 1 descendant
            if (current == root)
                root = current.left;
            else if (isLeft)
                parent.left = current.left;
            else parent.right = current.left;
        }

        else if (current.left == null){
            if (current == root)
                root = current.right;
            else if (isLeft)
                parent.left = current.right;
            else parent.right = current.right;
        }

        else {                                //have 2 descendants
            TreeElement<T> descendant = findDescendant(current);
            if (current == root)
                root = descendant;
            else if (isLeft)
                parent.left = descendant;
            else parent.right = descendant;

            descendant.left = current.left;
        }
        return true;
    }

    private TreeElement<T> findDescendant(TreeElement<T> deleteTreeElement){
        TreeElement<T> parentDescendant = deleteTreeElement;
        TreeElement<T> descendant = deleteTreeElement;
        TreeElement<T> current = descendant.right;

        while (current != null){
            parentDescendant = descendant;
            descendant = current;
            current = current.left;
        }

        if (descendant != deleteTreeElement.right){
            parentDescendant.left = descendant.right;
            descendant.right = deleteTreeElement.right;
        }
        return descendant;
    }

    public void print(TreeElement<T> currentElement){
        if (currentElement.left != null){
            print(currentElement.left);
        }
        System.out.println("Key=" + currentElement.key + "; Value=" + currentElement.value);
        if (currentElement.right != null){
            print(currentElement.right);
        }
    }
}
