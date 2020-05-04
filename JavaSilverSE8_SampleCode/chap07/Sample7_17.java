import java.util.*;
import java.util.function.*;

public class Sample7_17 {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("Tanaka", "Sato");
    
    /*  //“½–¼ƒNƒ‰ƒX‚ÅÀ‘•‚µ‚½ê‡
    words.replaceAll(new UnaryOperator<String>() {
      public String apply(String str) {
        return str.toUpperCase();
      }
    });
    */
    words.replaceAll( (String str) -> { return str.toUpperCase(); } );
    //words.replaceAll( str -> str.toUpperCase() );
   
    System.out.println(words);
  }
}