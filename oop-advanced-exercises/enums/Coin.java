package enums;

/** Exercise solutions: a Coin enum with values HEADS and TAILS. 
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public enum Coin {
  HEADS, TAILS;
  
  /** Returns Coin.HEADS and Coin.TAILS with equal probability. */
  
  public static Coin flip() {
    if (Math.random() < 0.5) {
      return(HEADS);
    } else {
      return(TAILS);
    }
  }
}
