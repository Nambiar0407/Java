package shapes;

/** Represents a simplistic Rectangle. Also see the Square subclass.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class Rectangle {
  private double width, height;

  /** Builds a Rectangle with the given width and height. */
  
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /** Returns the width that was previously set. */
  
  public double getWidth() {
    return(width);
  }

  /** Sets the width. */
  
  public void setWidth(double width) {
    this.width = width;
  }

  /** Returns the height that was previously set. */
  
  public double getHeight() {
    return(height);
  }
  
  /** Sets the height. */

  public void setHeight(double height) {
    this.height = height;
  }

  /** Calculates and returns the area (width * height). */
  
  public double getArea() {
    return(width * height);
  }
  
  /** Prints info about the Rectangle. */
  
  @Override
  public String toString() {
    return("Rectangle (width=" + width + 
           ", height=" + height +
           ", area=" + getArea() + ")");
  }
}