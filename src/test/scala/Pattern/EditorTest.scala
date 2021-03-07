package Pattern

import Memento.Pattern.{Editor, History}
import org.scalatest.FunSuite

class EditorTest extends  FunSuite {
  var editor:Editor = new Editor()
  var history :History = new  History()
  editor.setContent("a")
  history.push(editor.createState())
  editor.setContent("b")
  history.push(editor.createState())
  editor.setContent("c")
  editor.restore(history.pop())
  editor.restore(history.pop())

  assert(editor.getContent() === "a")

}
