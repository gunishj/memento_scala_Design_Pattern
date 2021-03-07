package Memento.Pattern

 object Pattern {
  def main(args: Array[String]): Unit = {
    var editor = new Editor()
    var history = new  History()

    editor.setContent("a")
    history.push(editor.createState())
    editor.setContent("b")
    history.push(editor.createState())
    editor.setContent("c")
    editor.restore(history.pop())
    editor.restore(history.pop())

    print(editor.getContent())

  }

}
