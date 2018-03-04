package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }


    println("Parentheses balancing : ")
    println(balance("(if (zero? x) max (/ 1 x))".toList))
    println(balance(")(".toList))
  }

  /**
   * Exercise 1 : Pascal’s Triangle
   */
    def pascal(c: Int, r: Int): Int = {
      if (c==0 || c==r) 1
      else pascal(c-1,r-1) + pascal(c,r-1)
    }
  
  /**
   * Exercise 2 : Parentheses Balancing
   */
    def balance(chars: List[Char]): Boolean = {
      def  parBalancing(chars: List[Char], acc: Int):Boolean = {
        if (chars.isEmpty) acc == 0
          else if (chars.head == '(') parBalancing(chars.tail,acc+1)
          else if (chars.head == ')') {acc>0 && parBalancing(chars.tail,acc-1)}
          else parBalancing(chars.tail,acc)
      }
      parBalancing(chars,0)
    }
  
  /**
   * Exercise 3 : Counting Change
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
