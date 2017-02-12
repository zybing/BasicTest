package zyb.com
import scala.collection.immutable._
import scala.collection.mutable
/**
  * Created by yanbing1 on 2/7/2017.
  */
class operator_test(init:Int) {
  var data=init
  def *(d: operator_test) =new operator_test(d.data*this.data)
  def _09(d: operator_test) =new operator_test(d.data+this.data)

  override def toString: String = data.toString
}
case class case_test(h:Double,b:Int){

}
object operator_test{
  def main(args: Array[String]): Unit = {
//    val hehe=new operator_test(100)
//    println(hehe*hehe _09 hehe)
//    val test=(1 to 9).reduceLeft(_*_)
//    println(test)
//    def heheda(f: (Int,Int,Int)=>Int )=f(1,2,3)
//    println(heheda(_+_+2*_))
//    "mary has a little lamb".split("\\s+").sortWith(_.length<_.length)
//    val a=scala.Array("12","34")
//    val b=scala.Array("12","34")
//    val hehe11=a.corresponds(b)(_.equalsIgnoreCase(_))
//    println(hehe11)
//    def multify(f:Int)=f*(_:Int)
//    println(multify(5){6})
//    val nih=multify(7)
//    println(nih(8))
//    def siwang:Int={return 1}
//    val lst=scala.collection.mutable.LinkedList(1,-2,3)
//    lst.next=scala.collection.mutable.LinkedList.empty
//    val hehehe=Set(1,2,6,3,4,5)
//    println(hehehe)
//    val hehehe11=SortedSet(1,3,2,6,4)
//    println(hehehe11)
//    val mm=(Map[Char,Int]() /: "mississippi"){
//      (m,c)=>{println(m);m+(c -> (m.getOrElse(c,0)+1))}
//    }
//    val mm=mutable.Map[String,String]("a" -> "123")
//    mm+=("a"->"234")
//    println(mm)
//    (0/:List(1,3,5,6)){_-_}
//    (List(1,3,5,6):\0){_-_}
//    implicit val hhhh=Ordering.by[(Char, Int), Int](_._1)
//    val ww="scala".zipWithIndex.max._1
//    println(ww)
//    val powers=(0 to 100).view.map(math.pow(2,_))
//    val vv=powers(5)
//    println(vv)
//    println((1 to 10).par.aggregate(Set[Int](22))((a,b)=>{println(a+b);a+b},_--_))
//    var sign = -2
//    val ch:Char='9'
//    ch match {
//        case '+' => sign=0
//        case _ if(Character.isDigit(ch)) => sign=Character.digit(ch,10)
//        case '-' =>sign=1
//        case _ =>sign= -1
//    }
//    println(sign)
    val hhh=case_test(1.2,23)
  }
}
