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
        tree.insert(7)
        tree.insert(12)
        tree.insert(6)
        tree.insert(15)
    }

    @Test
    fun depthFirstSearchTest() {
        assertTrue(tree.depthFirstSearch(7))
        assertTrue(tree.depthFirstSearch(12))
        assertTrue(tree.depthFirstSearch(6))
        assertFalse(tree.depthFirstSearch(14))
    }

    @Test
    fun inOrderTraversalTest() {
        assertEquals(listOf(6, 7, 9, 12, 15), tree.inOrderTraversal())
    }

}
