
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		// Exercice 1
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Donner l'annee : ");
		int y = sc.nextInt();
		System.out.print("Donner le mois : ");
		int m = sc.nextInt();
		System.out.print("Donner le jours : ");
		int j = sc.nextInt();
		
		LocalDate d = LocalDate.of(y,m,j);
		LocalDate n = LocalDate.now();
		
		Period p = Period.between(d, n);
		
		System.out.println("Votre age : " + p.getYears() + " ans " + p.getMonths() + " mois " + p.getDays() + " jours ");
		
		// Exercice 2
		String ch = "";
		for(String s: ZoneId.getAvailableZoneIds()) {
			if(s.indexOf("Egypt")!=-1) {
				ch = s;
				break;
			}
		}
		
		System.out.println("Zone Time Egypt : " + ch);
		ZoneId z = ZoneId.of(ch);
		LocalDateTime dateEgypt = LocalDateTime.now(z);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		System.out.println(format.format(dateEgypt));
		System.out.println(format.format(LocalDateTime.now()));
	}
}
