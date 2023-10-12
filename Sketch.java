import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {  
    // set variables
    float flowerX = 200;
    float flowerY = 200;
    float flowerDiameter = 75;
    float stemX = 190;
    float stemWidth = 20;
    float stemHeight = 140;
    float lineX1 = 200;
    float lineY1 = 200;
    float lineX2 = 270;
    float lineY2 = 270;

	  /** Use large rectangle to create the sky, make the rectangle blue */ 
    fill(105, 245, 231);
    rect(0, 0, 400, 250);

    /** Create thin vertical rectangle as the flower stem, make it dark green */    
    fill(0, 115, 25);
    rect(stemX, flowerY, stemWidth, stemHeight);
  
    /** Create circles for the flower petals */  
    fill(250, 238, 2);
    ellipse(flowerX - 40, flowerY - 40, flowerDiameter + 10, flowerDiameter + 10);
    ellipse(flowerX + 40, flowerY - 40, flowerDiameter + 10, flowerDiameter + 10);
    ellipse(flowerX - 40, flowerY + 40, flowerDiameter + 10, flowerDiameter + 10);
    ellipse(flowerX + 40, flowerY + 40, flowerDiameter + 10, flowerDiameter + 10);

    /** Create circle to represent the center of the flower */
    fill(20, 23, 20);
    ellipse(flowerX, flowerY, flowerDiameter, flowerDiameter);

    // Draw petal line
    line(lineX1, lineY1, lineX2, lineY2);
  }
}