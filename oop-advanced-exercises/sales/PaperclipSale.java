package sales;

/** Represents a sale of boxes of paper clips (the clip color, the per-box price,
 *  the number of boxes being sold, and the total price).
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class PaperclipSale implements Sellable {
  private String color;
  private double boxPrice;
  private int numBoxes;

  public PaperclipSale(String color, double boxPrice, int numBoxes) {
    this.color = color;
    this.boxPrice = boxPrice;
    this.numBoxes = numBoxes;
  }

  public String getColor() {
    return(color);
  }

  public double getBoxPrice() {
    return(boxPrice);
  }


  public int getNumBoxes() {
    return(numBoxes);
  }


  @Override
  public double getCost() {
    return(boxPrice * numBoxes);
  }

  @Override
  public String toString() {
    return("PaperclipSale: " + numBoxes + " boxes of " + color + " clips at $" + boxPrice + "/box.");
  }
}
