package sales;

/** Represents a sale of a car (the car name, the list price in dollars,
 *  the discount in percent, and the total cost in dollars after applying
 *  the discount.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class CarSale implements Sellable {
  private final String carName;
  private final double listPrice;
  private final double discount;

  public CarSale(String carName, double listPrice, double discount) {
    this.carName = carName;
    this.listPrice = listPrice;
    this.discount = discount;
  }

  public String getCarName() {
    return(carName);
  }

  public double getListPrice() {
    return(listPrice);
  }

  /** The discount in percent. For example, if discount is 5, then the total cost is
   *  0.95 times the list price.
   */
  public double getDiscount() {
    return(discount);
  }

  @Override
  public double getCost() {
    return(listPrice * (1.0 - discount/100));
  }

  @Override
  public String toString() {
    return("CarSale: " + carName + " with list price of $" + listPrice 
           + " and discount of " + discount + "%.");
  }
}
