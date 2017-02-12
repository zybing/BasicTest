package zyb.com

/**
  * Created by yanbing1 on 2/7/2017.
  */
class zhen{}
trait loged {
    val haha=100
    def log(Str:String){}
}
trait nihaologed extends loged with haologed{
    abstract override def log(Str:String) {
        println("nihao")
        super.log("123")
    }
}
trait haologed{
  def log(Str:String) {
    println("hao")
  }
}
class shen extends zhen with nihaologed{
  val `val`=233
    def print(): Unit ={
      log("123")
      println(`val`)
    }

  //override def log(Str: String): Unit = {println(Str)}
}
object shen{
  def main(args: Array[String]): Unit = {
    val sh=new shen
    sh.print()
    val hhh=sh.asInstanceOf[zhen]
    val zzz=sh.asInstanceOf[nihaologed]
    zzz.log("234")
  }
}