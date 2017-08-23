package section;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class Plik {
public static void zapisPliku(String nazwa, int metoda, double x1, double y1, double x2, double y2, double d1, double d2, double x3, double y3) throws IOException {
	FileWriter plikWy = null;
	try {
		plikWy = new FileWriter(nazwa);
	} finally {
		if (plikWy != null) {
			if (metoda == 1) {
				plikWy.write("Raport - wciêcie liniowe" + "\r\n");
				plikWy.write("Dane wejœciowe \r\n");
				plikWy.write("Punkt A: \r\n");
				plikWy.write("x: " + x1 + "   " + "y: " + y1 +"\r\n");
				plikWy.write("Punkt B: \r\n");
				plikWy.write("x: " + x2 + "   " + "y: " + y2 +"\r\n");
				plikWy.write("Odleg³oœci obserwowane: \r\n");
				plikWy.write("A-W: " + d1 + "  " + "B-W: " + d2 +"\r\n");
				plikWy.write("Wyniki: \r\n");
				plikWy.write("Punkt W: \r\n");
				plikWy.write("x: " + x3 + "   " + "y: " + y3 +"\r\n");
			}
			if (metoda == 0) {
				plikWy.write("Raport - wciêcie k¹towe" + "\r\n");
				plikWy.write("Dane wejœciowe \r\n");
				plikWy.write("Punkt A: \r\n");
				plikWy.write("x: " + x1 + "   " + "y: " + y1 +"\r\n");
				plikWy.write("Punkt B: \r\n");
				plikWy.write("x: " + x2 + "   " + "y: " + y2 +"\r\n");
				plikWy.write("K¹ty obserwowane: \r\n");
				plikWy.write("K1: " + d1 + "  " + "K2: " + d2 +"\r\n");
				plikWy.write("Wyniki: \r\n");
				plikWy.write("Punkt W: \r\n");
				plikWy.write("x: " + x3 + "   " + "y: " + y3 +"\r\n");	
			}
			plikWy.close();
		}
	}
}
}