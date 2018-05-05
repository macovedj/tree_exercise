import com.sun.source.tree.BinaryTree
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BinaryTreeTest {

    var tree = BinaryTree(9)

    @Before
    fun setUp() {
        tree.insert(7, tree.topNode)
        tree.insert(12, tree.topNode)
        tree.insert(6, tree.topNode)
        tree.insert(15, tree.topNode)
    }

    @Test
    fun depthFirstSearchTest() {
        assertTrue(tree.depthFirstSearch(7, tree.topNode))
        assertTrue(tree.depthFirstSearch(12, tree.topNode))
        assertTrue(tree.depthFirstSearch(6, tree.topNode))
        assertFalse(tree.depthFirstSearch(14, tree.topNode))
    }

    @Test
    fun inOrderTraversalTest() {
        assertEquals(listOf(6, 7, 9, 12, 15), tree.inOrderTraversal())
    }

}
