package coreservlets.shapes;
/** Tests using mixed Shape types and the static sumAreas method.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */

public class ShapeTest {
  public static void main(String[] args) {
    Shape[] shapes = { new Circle(10),            // Area is about 314.159
                       new Rectangle(5, 10),      // Area is 50
                       new Square(10) };          // Area is 100
    System.out.println("Sum of areas: " +
                       Shape.sumAreas(shapes));   // Area is about 464.159
  }
}