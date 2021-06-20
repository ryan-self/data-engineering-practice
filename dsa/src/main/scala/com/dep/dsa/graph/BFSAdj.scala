package com.dep.dsa.graph

import com.dep.dsa.graph.Graph._

import scala.collection.mutable.ListBuffer

object BFSAdj {

  def main(args: Array[String]): Unit = {
    val nodes: Array[Node[Int]] = Array(
      Node(0,1),
      Node(1,10),
      Node(2,3),
      Node(3,2),
      Node(4,45),
      Node(5,9)
    )
    println(bfs(nodes(0), adjGraph(nodes, Array(List(2),List(3,4),List(3),List(),List(),List(1,5))))) // [0,2,3]
    println(bfs(nodes(2), adjGraph(nodes, Array(List(1),List(4,5),List(2,1),List(3,0,2),List(),List(3))))) // [2,1,4,5,3,0]
  }

  private def bfs[T](root: Node[T], adj: AdjGraph[T]): List[Node[T]] = {
    var queue: ListBuffer[Node[T]] = new ListBuffer()
    var visited: Set[Int] = Set.empty
    var acc: List[Node[T]] = List.empty
    queue.addOne(root)
    while (queue.nonEmpty) {
      val pop = queue.head
      acc = acc :+ pop
      visited = visited + pop.id
      queue = queue.tail
      adj(pop.id).foreach { neighbor => if (!visited.contains(neighbor.id)) queue.addOne(neighbor) }
    }
    acc
  }

}
