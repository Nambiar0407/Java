package shapes;

/** Represents a simplistic Square. Designed so that Squares are Rectangles,
 *  although it is not entirely clear that this is the best design in real
 *  life, as discussed on the exercise handout.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class Square extends Rectangle {
  
  /** Builds a Square with the given side as both its width and its height. */
  
  public Square(double side) {
    super(side, side);
  }

  private void setSides(double side) {
    super.setWidth(side);
    super.setHeight(side);
  }
  
  /** Sets BOTH the width and the height. */
  
  @Override
  public void setHeight(double height) {
    setSides(height);
  }
  
  /** Sets BOTH the width and the height. */
  
  @Override
  public void setWidth(double width) {
    setSides(width);
  }

  /** Indirectly sets the area by working backward to the side length.
   *  The resultant area may not be EXACTLY what you set, due to roundoff
   *  error when working with doubles.
   */
  public void setArea(double area) {
    setSides(Math.sqrt(area));
  }
  
  /** Prints info about the Square. */
  
  @Override
  public String toString() {
    return("Square (width/height=" + getWidth() + 
           ", area=" + getArea() + ")");
  }
}