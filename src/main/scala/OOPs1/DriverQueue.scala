package OOPs1

import scala.collection.mutable.ListBuffer

object DriverQueue extends App {

  val list = ListBuffer(2, 29, 10, 12, 71, 13)
  println("Originally the Queue is: ")
  for (i <- list.indices) println(list(i)+ " " )


  var double_list = new DoubleQueue(list)           //This will double the elements in the queue
  println("\n After doubling the elements in the Queue: ")
  for (i <- list.indices) println(list(i)+ " ")


  var squareQueue = new SquareQueue (list)       //Squaring the elements in the queue
  println("\n After squaring the elements in the Queue: ")
  for (i <- list.indices) println(list(i)+ " ")

  squareQueue.dequeue(list)

  println("\nAfter dequeue a element in Queue: ")
  for( i <- list.indices) print(list(i)+" ")
  squareQueue.enqueue(list)
  println("\nAfter a element is enqueued: ")
  for( i <- list.indices) print(list(i)+" ")

}