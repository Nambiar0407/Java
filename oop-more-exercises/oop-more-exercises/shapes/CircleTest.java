package shapes;

/** Tests some Circle capabilities. Relies on Circles having a toString that
 *  shows the radius and area.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class CircleTest {
  public static void main(String[] args) {
    for(int i=0; i<10; i++) {
      Circle c = new Circle(10*Math.random());
      System.out.println(c);
    }
  }
}