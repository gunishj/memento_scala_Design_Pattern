package Memento.Pattern

class History {

  private var states = scala.collection.mutable.Stack[EditorState]();


//private var states = List(classOf[EditorState])
   def push(state: EditorState): Unit ={
    states.push(state)
  }

   def pop(): EditorState ={
    var laststate = states.pop()
    return  laststate
  }
}
