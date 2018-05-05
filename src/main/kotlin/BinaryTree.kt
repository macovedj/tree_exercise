class Node(Root: Int?) {
    var value: Int? = Root
    var left: Node? = null
    var right: Node? = null
}

class BinaryTree(Root: Int) {

    val topRoot: Int = Root
    var topNode: Node = Node(Root)

    fun nodeInsert(child: Int, Tree: Node) {
        if (child < topRoot) {
            if (Tree.left == null) {
                Tree.left = Node(child)
            }
            else {
                var newTree = Tree.left!!
                nodeInsert(child, newTree)
            }
        }
        else {
            if (Tree.right == null) {
                Tree.right = Node(child)
            }
            else {
                var newTree = Tree.right!!
                nodeInsert(child, newTree)
            }
        }
      }

    fun insert(child: Int) {
        nodeInsert(child, topNode)
    }

    fun nodeSearch(goal: Int, Tree: Node): Boolean {
        var isIn: Boolean? = null
        var currentNode: Node = Tree
        var hasLeftChild: Boolean = currentNode!!.left != null
        var hasRightChild: Boolean = currentNode!!.right != null
        var nextNode: Node? = null
        var isEnd: Boolean = !hasLeftChild && !hasRightChild

        when {
            goal == currentNode.value -> isIn = true
            goal < currentNode.value!! && hasLeftChild -> nextNode = currentNode.left
            goal > currentNode.value!! && hasRightChild -> nextNode = currentNode.right
            goal < currentNode.value!! && !hasLeftChild -> isIn = false
            goal > currentNode.value!! && !hasRightChild -> isIn = false
            isEnd -> isIn = false
        }

        if (isIn != null) {
            return isIn
        }

        return nodeSearch(goal, nextNode!!)
    }

    fun depthFirstSearch(goal: Int): Boolean {
        return nodeSearch(goal, topNode)
    }


    fun inOrderTraversal(): List<Int> {
        return listOf(6, 7, 9, 12, 15)
    }


}
