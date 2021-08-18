import static ch.unibas.informatik.jturtle.TurtleCommands.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Squares {
  
  public static void main(String[] args) throws IOException {

    // Test dass ein Filenamen als Argument übergeben wurde
    if (args.length < 1) {
      System.out.println("Usage: Squares imageFilename");
      System.out.println("Example (Win): java -cp \".;jturtle-0.6.jar\" Squares out.png");
      System.out.println("Example (OS X, Linux): java -cp .;jturtle-0.6.jar\" Squares out.png");
      System.exit(-1);
    }

    String outputImageFileName = args[0];
   
    // Schreiben Sie zwischen dem und dem nächsten Kommentar Ihre Turtle Befehle hin

    // wir starten im zentrum des Bildes, also in der mitte des unrotierten Quadrats
    // als erstes bewegen wir uns zu einer Ecke (oben links) und drehen uns so, dass wir zu zeichnen beginnen können
    penUp();
    penSize(1);
    int sideLength = 50;
    forward(sideLength/2);
    turnLeft(90);
    forward(sideLength/2);
    turnRight(180);

    // nun zeichnen wir das quadrat
    penDown();
    for ( int i = 0; i<4; i++) {
      forward(sideLength);
      turnRight(90);
    }

    // wir sind wider an der oberen linken Ecke
    // wir gehen jetzt zur oberen spitze des zweiten Quadrats und schauen wider im Uhrzeigersinn entlang der Kante
    penUp();
    forward(sideLength/2);
    turnLeft(90);
    double diagonalLength = Math.sqrt(2.0*sideLength*sideLength);
    double offset = (diagonalLength-sideLength)/2;
    forward((int)offset);
    turnRight(135);
    
    // wir zeichnen das zweite Quadrat
    penDown();
    for ( int i = 0; i<4; i++) {
      forward(sideLength);
      turnRight(90);
    }


    // Schreiben des Bildes als File
    BufferedImage image = drawing();
    ImageIO.write(image, "png", new File(outputImageFileName));
  }
}

