object ListerApp {
  
  def main(args: Array[String]) {
    if(args.size < 2){
      println("Two arguments needed to run this application:")
      println("a directory, a word")
      System.exit(0)
    }

    println("Running lister as class:")
    val lister = new Lister(args(0),args(1))
    lister.listOfFilesContainWord().map ( e => println(e) )
    lister.listOfContentOfFilesContainWord().map ( e => println(e) )

    println("Running lister as object:")
    ListerObject.listOfFilesContainWord(args(0),args(1)).map ( e => println(e) )
    ListerObject.listOfContentOfFilesContainWord(args(0),args(1)).map ( e => println(e) )

  }

}
