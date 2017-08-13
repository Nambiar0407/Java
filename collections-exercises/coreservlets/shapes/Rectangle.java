package coreservlets.shapes;
/** Represents a simplistic Rectangle. Also see the Square subclass.
 *   <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, 
 *  servlets, JSP, and Java 7 and Java 8 programming</a>.
 */
public class Rectangle implements Shape {
  private double width, height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return(width);
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return(height);
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double getArea() {
    return(width * height);
  }
}