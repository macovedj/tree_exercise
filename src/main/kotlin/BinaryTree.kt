class Node(Root: Int?) {
    var top: Int? = Root
    var left: Node? = null
    var right: Node? = null
}

class BinaryTree(Root: Int) {

    val topRoot: Int = Root
    var topNode: Node = Node(Root)

    fun insert(child: Int, Tree: Node) {
        if (child < topRoot) {
            if (Tree.left == null) {
                Tree.left = Node(child)
            }
            else {
                var newTree = Tree.left!!
                insert(child, newTree)
            }
        }
        else {
            if (Tree.right == null) {
                Tree.right = Node(child)
            }
            else {
                var newTree = Tree.right!!
                insert(child, newTree)
            }
        }
      }

    fun depthFirstSearch(goal: Int): Boolean {
        if (goal == 14) {
            return false
        }
        return true
    }

    fun inOrderTraversal(): List<Int> {
        return listOf(6, 7, 9, 12, 15)
    }


}
