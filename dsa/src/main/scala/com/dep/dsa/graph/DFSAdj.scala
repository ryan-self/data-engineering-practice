package com.dep.dsa.graph

import com.dep.dsa.graph.Graph._

object DFSAdj {

  def main(args: Array[String]): Unit = {
    val nodes: Array[Node[Int]] = Array(
      Node(0,1),
      Node(1,10),
      Node(2,3),
      Node(3,2),
      Node(4,45),
      Node(5,9)
    )
    println(dfs(nodes(0), adjGraph(nodes, Array(List(2),List(3,4),List(3),List(),List(),List(1,5))))) // [0,2,3]
    println(dfs(nodes(2), adjGraph(nodes, Array(List(1),List(4,5),List(2,1),List(3,0,2),List(),List(3))))) // [2,1,4,5,3,0]
  }

  private def dfs[T](root: Node[T], adj: AdjGraph[T]): List[Node[T]] = dfsHelper(Set(), root, adj)

  private def dfsHelper[T](visited: Set[Long], node: Node[T], adj: AdjGraph[T]): List[Node[T]] = {
    var acc: List[Node[T]] = List(node)
    val newVisited: Set[Long] = visited + node.id
    adj(node.id).foreach { neighbor =>
      if (!newVisited.contains(neighbor.id)) acc = acc ++ dfsHelper(newVisited, neighbor, adj)
    }
    acc
  }

}