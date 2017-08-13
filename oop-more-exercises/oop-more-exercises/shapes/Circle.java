package shapes;

/** Represents a simplistic Circle. Used to illustrate encapsulation 
 *  (private instance variables and associated accessor methods) and
 *  JavaDoc (these comments).
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class Circle {
  private double radius;

  /** Builds a Circle with the given radius. */
  
  public Circle(double radius) {
    this.radius = radius;
  }

  /** Returns the current radius. The units are the same
   *  as for the area, so if you interpret the area in square feet,
   *  then the radius is in feet.
   */
  
  public double getRadius() {
    return(radius);
  }

  /** Sets the current radius. The units are the same
   *  as for the area, so if you interpret the area in square feet,
   *  then the radius is in feet.
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /** Calculates the area from the radius. The units are the same
   *  as for the radius, so if you interpret the radius in meters,
   *  then the area is in square meters. 
   */
  public double getArea() {
    return(Math.PI * radius * radius);
  }

  /** Prints info about the Circle. */
  @Override
  public String toString() {
    return("Circle (radius=" + radius + 
           ", area=" + getArea() + ")");
  }

  /** Indirectly sets the area by working backward to the radius.
   *  The resultant area may not be EXACTLY what you set, due to roundoff
   *  error when working with doubles.
   */
  public void setArea(double area) {
    radius = Math.sqrt(area / Math.PI);
  }
}