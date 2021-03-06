import org.scalatest.FunSuite

class StudentTest extends FunSuite {

  test("Student_test.cube") {
    assert(27 === 27)
  }

  test("Student_test1.cube") {
    var a : Student = new Student
    a.update("Gunish",1)
    assert(a.getDetail() === 1)
  }
  test("Student_test2.cube") {
    var a : Student = new Student
    a.update("Manish",2)
    assert(a.getDetail() === 2)
  }
  test("Student_test3.cube") {
    var a : Student = new Student
    a.update("Robin",3)
    assert(a.getDetail() === 3)
  }

  test("Student_test4.cube") {
    var a : Student = new Student
    a.update("Gunish",1)
    a.update("Manish",3)
    a.update("Robin",4)
    a.update("Sandy",7)
    a.undo()
    assert(a.getDetail() === 4)
  }

  test("Student_test5.cube") {
    var a : Student = new Student
    a.update("Gunish",1)
    a.update("Manish",3)
    a.update("Robin",4)
    a.update("Sandy",7)
    a.undo()
    a.undo()
    assert(a.getDetail() === 3)
  }
  test("Student_test6.cube") {
    var a : Student = new Student
    a.update("Gunish",1)
    a.update("Manish",3)
    a.update("Robin",4)
    a.update("Sandy",7)
    a.undo()
    a.undo()
    a.undo()
    assert(a.getDetail() === 1)
  }
  test("Student_test7.cube") {
    var a : Student = new Student
    a.update("Gunish",1)
    a.update("Manish",3)
    a.update("Robin",4)
    a.update("Sandy",7)
    a.undo()
    a.undo()
    a.undo()
    a.undo()
    assert(a.getDetail() === 0)
  }
  test("Student_test8.cube") {
    var a : Student = new Student
    a.update("Gunish",1)
    a.update("Manish",3)
    a.update("Robin",4)
    a.update("Sandy",7)
    a.undo()
    a.undo()
    a.undo()
    a.undo()
    a.undo()
    assert(a.getDetail() === 0)
  }


}