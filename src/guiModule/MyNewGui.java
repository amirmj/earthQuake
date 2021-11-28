package guiModule;

import processing.core.PApplet;
import processing.core.PGraphics;



public class MyNewGui extends PApplet{
	
	PGraphics pg;
	
	public void setup() {
		size(400, 400);
		pg = createGraphics(250, 100);
		
	}
	
	public void draw() {

		 pg.beginDraw();
		 pg.background(100);
		 pg.stroke(255 , 255 , 0);
		 pg.line(20, 20, mouseX, mouseY);
		 pg.endDraw();
		 image(pg, 10, 80); 
		 triangle(250, 300, 232, 80, 344, 300);
	}

}
