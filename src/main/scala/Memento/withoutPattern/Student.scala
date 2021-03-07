package Memento.withoutPattern

class Student() {
  var nameVar :String="Empty"
  var MarksVar :Int=0;
  var hist_nameVar = Vector(nameVar)
  var hist_MarksVar:Vector[Int] = Vector(MarksVar)


  def update(name: String, marks : Int): Unit ={

  this.nameVar = name;
  this.MarksVar = marks;
//  print(s"We have created the object for the student with the name : ${nameVar} and added the marks as ${MarksVar} ; \n ")

//  hist_nameVar :+ nameVar
//  hist_MarksVar  :+ MarksVar

      hist_nameVar = hist_nameVar :+ nameVar
      hist_MarksVar = hist_MarksVar :+ MarksVar

//    print(hist_nameVar.length,hist_MarksVar.length)

//    print(s"We have added entry in hist list with the name : ${hist_nameVar.last} and added the marks as ${hist_MarksVar.last} ; \n ")

  }

    def getDetail(): Int = {

//    print(s" the object last update value for the student with the name : ${nameVar} and added the marks as ${MarksVar} is available ; \n ")
    return MarksVar
  }

  def undo(): Unit = {
    if(hist_MarksVar.length > 1){

     hist_nameVar =  hist_nameVar.dropRight(1)
     hist_MarksVar =   hist_MarksVar.dropRight(1)
//      print(hist_MarksVar,hist_nameVar)
     this.nameVar = hist_nameVar.last;
     this.MarksVar = hist_MarksVar.last;

    }

  }

}
