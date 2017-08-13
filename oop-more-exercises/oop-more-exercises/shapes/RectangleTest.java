package shapes;

/** Tests some Rectangle capabilities. Relies on Rectangles having a toString that
 *  shows the width, height, and area.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class RectangleTest {
  public static void main(String[] args) {
    for(int i=0; i<10; i++) {
      Rectangle r = 
        new Rectangle(10*Math.random(), 20*Math.random());
      System.out.println(r);
    }
  }
}