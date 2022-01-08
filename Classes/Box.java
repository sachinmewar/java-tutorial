
  class BoxDim{
    double length;
    double breadth;
    double height;

    BoxDim(){
      System.out.println("Constructing box");
      length = 10;
      breadth = 10;
      height = 10;
    }

    double boxVolume(){
      double volume = length * breadth * height;
      return volume;
    }

    void setDimension(double l, double b, double h){
      length = l;
      breadth = b;
      height = h;
    }
  }

  class Box{
    public static void main(String[] args) {
      BoxDim myBox = new BoxDim();
      BoxDim myBox2 = new BoxDim();

      myBox.setDimension(10, 4, 5);

      double volume = myBox.boxVolume();
      System.out.println("Volume of myBox: " + volume);

      volume = myBox2.boxVolume();
      System.out.println("Volume of myBox2 using constructor: " + volume);
    }
  }