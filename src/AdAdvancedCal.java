
public class AdAdvancedCal extends AdvancedCal{
 // total 5 abstract method inherited from Ical, IAreaCal
// Grandparent calcula = 2 = add and sub
// Parent AdvancedCal = 2 div and mul
// abstract = 1 .. areaOfSquare
	public int areaOfSquare(int side) {
		return side * side;
	}
}
