package shapes;

/** Tests some Square capabilities. Relies on Squares having a toString that
 *  shows the side length and area.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class SquareTest {
  public static void main(String[] args) {
    System.out.println("Creating square with side 10");
    Square s = new Square(10);
    System.out.println(s);
    System.out.println("Setting width to 5");
    s.setWidth(5);
    System.out.println(s);
    System.out.println("Setting height to 6");
    s.setHeight(6);
    System.out.println(s);
    System.out.println("Setting area to 49");
    s.setArea(49);
    System.out.println(s);
  }
}