package sales;

/** Represents any class that has a way of computing totalCost.
 *  Also has static methods that let you find the cheapest
 *  from an array of SameItem objects, and to compute the total
 *  cost of an array of SameItem objects.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public interface Sellable {
  double getCost();
  
  public static Sellable cheapest(Sellable[] items) {
    Sellable cheapestItem = null;
    double lowestCost = Double.MAX_VALUE;
    for(Sellable item: items) {
      double cost = item.getCost();
      if (cost < lowestCost) {
        cheapestItem = item;
        lowestCost = cost;
      }
    }
    return(cheapestItem);
  }
  
  public static double totalCost(Sellable[] items) {
    double total = 0;
    for(Sellable item: items) {
      total = total + item.getCost();
    }
    return(total);
  }
}
