package vezbe;

import geometry.Circle;
import geometry.Donut;
import geometry.Line;
import geometry.Point;
import geometry.Rectangle;
import geometry.Shape;

public class TestingClass {
	public static void main(String[] args) {
	/*	System.out.println("Hello World!");
		
		int prviBroj = 55;
		double decimalniBroj = 20.50;
		System.out.println(prviBroj + decimalniBroj);
		System.out.println(prviBroj - decimalniBroj);
		System.out.println(prviBroj * decimalniBroj);
		System.out.println(prviBroj / decimalniBroj);
		
//		int drugiBroj = 40.40;
//		double drugiDecimalni = 20;
//		boolean tacnost = false;
//		String tekst = "Pozdrav studentima menadzmenta";
		//char jedanKarakter = 'a';
		
		int dnevnaTemperatura = 24;
		int jutarnjaTemperatura = 7;
		String testTekst = "Danas je suncano";
		boolean tacnost = false;
		
		int razlika = dnevnaTemperatura - jutarnjaTemperatura;
		System.out.println("Danasnja razlika u temperaturi je: " + razlika);
		System.out.println(testTekst + " sa " + dnevnaTemperatura + " stepena celzijusa");
		System.out.println(testTekst + ":" + tacnost);
		
		dnevnaTemperatura = 31;
		jutarnjaTemperatura = 10;
		
		if((dnevnaTemperatura-jutarnjaTemperatura) > 20) {
			System.out.println("Primer ispis 1");
		}else {
			System.out.println("Primer ispis 2");
		}
		
		if(dnevnaTemperatura > 30) {
			System.out.println("Primer ispis 3");
		}else {
			System.out.println("Primer ispis 4");
		}
		
//		ZADATAK 3 - PETLJE
		
		int zbir = 0;
		for(int i = 0; i<=200; i+=2) {
			zbir = zbir+i;
//			zbir += i;
		}
		System.out.println(zbir);
		int brojac = 0;
		zbir = 0;
		while(brojac<=200) {
			if(brojac%2 == 0) {
				zbir += brojac;
			}
			brojac++;
		}
		System.out.println(zbir);
		
//		ZADATAK 4 - PETLJE
		int brojPrestupnihGodina = 0;
		for(int godina = 2024; godina <=2100; godina+=4) {
			if(godina == 2024) {
				continue;
			}
			if(godina  % 4 == 0) {
				if(godina % 100 == 0) {
					if(godina % 400 == 0) {
						brojPrestupnihGodina++;
					}
				}
				else {
					brojPrestupnihGodina++;
				}
			}
		}
		
		System.out.println(brojPrestupnihGodina);
		*/
		
		/*==============================
		 * =============================
		 * 			VEZBE 3
		 *============================== 
		 */
		
		int broj = 20;
		Point p1 = new Point();
//		System.out.println(p1);
//		System.out.println("Vrednost x koordinate je: " + p1.x);
//		System.out.println("Vrednost y koordinate je: " + p1.y);
//		System.out.println("Vrednost selected koordinate je: " + p1.selected);
//		p1.setX(50);
//		p1.setY(10);
//		p1.setSelected(true);
		
		Point p2 = new Point();
//		p1 = p2;
//		System.out.println("Vrednost x koordinate tacke p1 je: " + p1.x);
//		p1.setX(50);
//		p2.setX(60);
//		System.out.println("Vrednost x koordinate p2 je: " + p2.x);
//		System.out.println("Vrednost x koordinate p1 je: " + p1.x);

		p1.setX(20);
//		System.out.println(p1);
		
//		System.out.println(p1.distance(p2));
		
		/*==============================
		 * =============================
		 * 			VEZBE 5
		 *============================== 
		 */
		Line l1 = new Line();
		
//		System.out.println(l1.getStartPoint().getX()); //NULL POINTER EXCEPTION
//   	System.out.println(l1.getEndPoint()); // NULL
		
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		
//		System.out.println(l1.getStartPoint().getX());
//		System.out.println(l1.getEndPoint());
		
		Point p3 = new Point(20,10,true);
//		System.out.println(p3.getX());
		
//		System.out.println(p3);
//		System.out.println(p1);
//		System.out.println(l1);
		
		/*==============================
		 * =============================
		 * 			VEZBE 6
		 *============================== 
		 */
		Circle c1 = new Circle(new Point(50,50), 20);
		Rectangle r1 = new Rectangle(new Point(25,25), 40, 40);
		
		System.out.println(p1);
		System.out.println(l1);
		System.out.println(c1);
		System.out.println(r1);
		
		System.out.println(p1 instanceof Object);
		Object obj = new Circle();
		System.out.println(obj instanceof Circle);
		
		System.out.println(p1);
		p2.setX(20);
		System.out.println(p2);
		System.out.println(p1.equals(p2));
		
		/*==============================
		 * =============================
		 * 			VEZBE 7
		 *============================== 
		 */
		Donut d1 = new Donut(new Point(30,30),30,15);
		System.out.println(d1);
		System.out.println(d1 instanceof Circle);
		System.out.println(d1 instanceof Donut);
		System.out.println(d1 instanceof Object);
		System.out.println(d1 instanceof Shape);
		System.out.println(d1.isSelected());
		
		Circle c2 = new Donut();
		Shape s1 = new Donut();
//		Shape s2 = new Shape(); Nije moguce
//		Donut d2 = new Circle();
		
//		s1.area(); Nije vidljivo putem reference tipa Shape
		
		
		
		
		
		
		
		
		
		
		
	}
}
