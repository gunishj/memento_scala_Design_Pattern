package Memento.Pattern

class Editor  {
    var content:String= ""
   def createState():EditorState={
  return new EditorState(content)
  }
   def restore(state: EditorState):Unit= {
    content=state.getContent
    return content
  }


   def getContent(): String ={
    return content;
  }

  def setContent(content : String): Unit ={
    this.content=content
  }
}
