package encapsulation_8.square_8_1;

public class Square {
    
    private int side;
    
    public Square (int side){
        if (side>0){
            this.side = side;
        }
        else {
            this.side = 0;
        }
    }
    
    public int getSide(){
        return side;
    }
    
    public void setSide(int side){
        if (side>0){
            this.side = side;
        }
        else {
            this.side = 0;
        }
    }
    
    public int area() {
        return side*side;
    }
    
    public int perimeter() {
        return side*4;
    }

}