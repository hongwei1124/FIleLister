import org.scalatest._

class ListerTester extends FlatSpec with Matchers {
  //Test class implementation
  "A Lister.listOfFilesContainWord" should "list all files under a directory which contain the word" in {
    val lister = new Lister("./src/test/resources","Scala")
    
    lister.listOfFilesContainWord().toList.size should be (2)
  }
  
  "A Lister.listOfContentOfFilesContainWord" should "list all files content under a directory which contain the word" in {
    val lister = new Lister("./src/test/resources","Scala")
    
    lister.listOfContentOfFilesContainWord().map(e=> e should be ("Scala1Scala2"))
  }
  
  //Test object implementation
  "A ListerObject.listOfFilesContainWord" should "list all files under a directory which contain the word" in {
    
    ListerObject.listOfFilesContainWord("./src/test/resources","Scala").toList.size should be (2)
  }
  
  "A ListerObject.listOfContentOfFilesContainWord" should "list all files content under a directory which contain the word" in {
    
    ListerObject.listOfContentOfFilesContainWord("./src/test/resources","Scala").map(e=> e should be ("Scala1Scala2"))
  }

  
}
