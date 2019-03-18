package homework6;

public class BinaryTree {
     public  Node root;  // корень дерева
     private int depth;  // глубина дерева

    BinaryTree(){
        this.depth = 0;
    }

    public int getDepth() {
        return depth;
    }

    /*Проверка на сбалансированность дерева*/
    public boolean isBalanced(Node root){
        int leftheight;
        int rightheight;
       if(root == null) return true;
       leftheight = height(root.leftChild);
       rightheight = height(root.rightChild);
       if(Math.abs(leftheight-rightheight)<=1 && isBalanced(root.leftChild) && isBalanced(root.rightChild)){
           return true;
       }
        return false;
    }
    /*Нахождение высоты*/
    public int height(Node node){
        if(node == null){
            return 0;
        }
        return 1 + Math.max(height(node.leftChild), height(node.rightChild));
    }

    /**
     * Нахождение уровня у минимального элемента
     * @return
     */
    public int minlevel(){
        int levelmin = 0;
        Node cur, last = null;
        cur = root;
        while(cur != null){
            last = cur;
            cur = cur.leftChild;
            levelmin++;
        }
        last.display();
        return levelmin;
    }

    /**
     * Нахождение уровня у максимального элемента
     * @return
     */
    public int maxlevel(){
        int levelmax = 0;
        Node cur, last = null;
        cur = root;
        while(cur != null){
            last = cur;
            cur = cur.rightChild;
            levelmax++;
        }
        last.display();
        return levelmax;
    }

     /*Вставка в дерево*/
     public void insert(){
         Node node = new Node();
         if(root == null){
             root = node;
             depth = 1;
         }
         else {
             Node current = root;
             Node parent;
             int d = 1;
             while(true){
                 parent = current;
                 boolean b = false;
                 if(node.key < current.key){
                     current = current.leftChild;
                     if(current == null){
                         parent.leftChild = node;
                         b = true;
                     }
                 }
                 else{
                     current = current.rightChild;
                     if(current == null){
                         parent.rightChild = node;
                         b = true;
                     }
                 }
                 d++;
                 if(d > depth) depth = d;
                 if(b) break;
             }
         }
     }
}
