package zyb.com.Array

import scala.collection.mutable.ArrayBuffer

/**
  * Created by yanbing1 on 12/26/2016.
  */
object Arraytest {
  def main(args: Array[String]) {
    val arraytmp=ArrayBuffer(-2,-1,0,1,2,3);
    arraytmp(1)=3
    println(arraytmp(1))
  }
}
