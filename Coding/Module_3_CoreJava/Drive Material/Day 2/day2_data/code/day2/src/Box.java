class Box {
//state (non static data member : instance vars) - tight encapsulation
  private double width;
  private double depth;
  private double height;
   //parameterized constructro to init complete state
   Box(double w,double d,double height)
   {
     this.width=w;
	 this.depth=d;
	 this.height=height;//this : keyword mandatory
   }
   //add instance method to return box dimensions in string form
   String getBoxDimensions()
   {
	   return "Box dims are "+this.width+" "+this.depth+" "+this.height;
   }
   //add instance method to return box volume
   double getVolume() {
	   return this.width*this.depth*this.height;
   }
   
}