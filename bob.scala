

object Bob {
  def main(args: Array[String]) {
    
    def hey(statement: String) {
      val punctuation = get_punctuation(statement)
      println(respond(punctuation))
    }

    def get_punctuation(statement: String):Char = {
      return statement.charAt(statement.length() - 1)
    }

    def respond(punctuation: Char) = punctuation match {
      case '?' => "Sure."
      case '!' => "Woah, chill out!"
      case  _ => "Whatever."
    }
    
    val statement = args.mkString(" ")

    if (statement.isEmpty) 
      println("Fine. Be that way!")
    else 
      hey(statement)
  }
}

