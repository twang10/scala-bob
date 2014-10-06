object Bob {
  def main(args: Array[String]) {
    def hey(statement: String) {
      if (statement == null) {
        println("Fine. Be that way!")
      }

      val punctuation = statement.charAt(statement.length() - 1)
      
      if (punctuation == '?') {
        println("Sure.")
      } else if (punctuation == '!') {
        println("Woah, chill out!")
      } else {
        println("Whatever.")
      }
    }

    val statement = args.mkString(" ")
    hey(statement)
  }
}