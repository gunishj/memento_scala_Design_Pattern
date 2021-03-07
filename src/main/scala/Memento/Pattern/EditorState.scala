package Memento.Pattern

class EditorState(content1: String)  {

   protected var content:String= ""

  content =content1


   def getContent(): String ={
    return content;
  }
}