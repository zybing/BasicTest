package zyb.com

import java.io.File
import java.nio.file.Path
import java.io.Serializable
/**
  * Created by yanbing1 on 1/29/2017.
  */
class Creature {
  val range:Int=10
  val env:Array[Int] =new Array[Int](range)
}
//class Ant extends Creature{
//  override val range: Int = 2
//}
class Ant extends{
  final val hehe=3
  override val range=2+hehe
} with Creature
object Creature{
  def main(args: Array[String]): Unit ={
    val ant =new Ant
    val creature =new Creature
    ant.synchronized{println(ant.hehe)}
    println("你好")
    for(d <- subdirs(new File("C:\\Apps"))){
      println(d)
    }
  }
  def subdirs(dir:File):Iterator[File]={
    val children=dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }
}
class htr extends Serializable{

}