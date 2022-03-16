package scala99.logic_codes

import scala99.Utils

import scala.collection.mutable

object P50 {
    class Node(var data: (String, Int), var left: Node = null, var right: Node = null) {
        override def toString: String = {
            f"Node { data: $data, left: ${Utils.toStringOrNull(left)}, right: ${Utils.toStringOrNull(right)} }"
        }

        def isLeaf: Boolean = left == null && right == null
    }

    def huffman(list: List[(String, Int)]): List[(String, String)] = {
        val heap = mutable.PriorityQueue()(Ordering.by[Node, Int](_.data._2).reverse)

        for (data <- list) {
            heap.enqueue(new Node(data))
        }

        while (heap.size > 1) {
            val a = heap.dequeue()
            val b = heap.dequeue()

            heap.enqueue(new Node((null, a.data._2 + b.data._2), a, b))
        }

        val huffmanTree = heap.dequeue()

        def huffmanCodes(node: Node, code: String, result: List[(String, String)]): List[(String, String)] = {
            if (node == null) return result
            if (node.isLeaf) return (node.data._1, code) :: result

            val left = huffmanCodes(node.left, code + "0", result)
            huffmanCodes(node.right, code + "1", left)
        }

        huffmanCodes(huffmanTree, "", Nil).sorted
    }
}
