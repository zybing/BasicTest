package zyb.com.Basic

/**
  * Created by yanbing1 on 1/25/2017.
  */
object Valtest{
  def main(args: Array[String]) {
    var test11=1
    val hehe=test(test11)
    val hehhe=Tuple5("er",123,345,45,55)
    def test222 =test11
    test11=180
    println(test222)
    println(hehe)
    val person=new haha1()
    person.hehe_=(20)
  }
  def test(num:Int):Int ={
    val num1=num+1
    num1
  }
}
class haha1{
  var hehe:Int=0
  class diaosi{
    hehe=3

  }
}
class person{
  var name="zyb"
  var age=24
  def this(name:String,age:Int){
    this()
    this.name=name
    this.age=age
  }
}
class employee(name:String,age:Int,salary:Int) extends person(name,age){
  private val _Salary=salary
  def Salary = _Salary
  def Salary_=(newvalue:Int)=newvalue-1

}
