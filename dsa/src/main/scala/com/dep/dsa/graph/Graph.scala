package com.dep.dsa.graph

object Graph {

  case class Node[T](id: Int, data: T)

  type AdjGraph[T] = Array[List[Node[T]]]
  def adjGraph[T](nodes: Array[Node[T]], edges: Array[List[Int]]): AdjGraph[T] = edges.map(_.map(nodes(_)))

}