package Memento.withoutPattern

object main_student {
  def main(args: Array[String]): Unit = {
//    print("Hello");
var a : Student = new Student
    a.update("Gunish",1)
    a.getDetail()
    a.update("Manish",3)
    a.getDetail()
    a.update("Robin",4)
    a.getDetail()
    a.update("Sandy",7)
    a.getDetail()
    a.undo()
    a.getDetail()
    a.undo()
    a.getDetail()
    a.undo()
    a.getDetail()
    a.undo()
    a.getDetail()
    a.undo()
    a.getDetail()
    a.undo()
    a.getDetail()




  }
}
