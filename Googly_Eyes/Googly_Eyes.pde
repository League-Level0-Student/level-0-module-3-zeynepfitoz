void setup(){
  PImage face = loadImage("images.jpg");
size(500,500);
face.resize(width,height);
background(face);
}
void draw (){
  fill(255,255,255);
  ellipse(305,114,46,40);
ellipse(154,106,46,40);
  if(mousePressed){
  println(mouseX+" "+mouseY);
 
  }
  fill(0,0,0);
  ellipse(mouseX+151,mouseY+8,18,12);
  ellipse(mouseX,mouseY,18,12);
  if(mouseX<305){
mouseX=305;
  }
if(mouseY<114){
  mouseY=114;
}

}