// 42.	Create a class Tile to store the edge length of a square tile, and create another 
// class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t)
//  in Floor class with Tile as argument to calculate the whole number of tiles needed to 
//  cover the floor completely.
import java.util.Scanner;
import java.lang.Math;
class Tile{
    private int tlenght;
    
    Tile(int tlenght){
        this.tlenght=tlenght;
    }

    int getTLength(){
        return tlenght;
    }
}

class Floor{
    private int length;
    private int width;

    Floor(int length,int width){
        this.length=length;
        this.width=width;
    }
    
    int totalTiles(Tile t){
        int tiles = Math.round((length*width)/(t.getLength()*t.getLength()));
		return tiles;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the edge of tile : ");
        int edge = sc.nextInt();
        Tile t = new Tile(edge);
        System.out.print("Enter the Length of floor : ");
        int length = sc.nextInt();
        System.out.print("Enter the Width of floor : ");
        int width = sc.nextInt();
        Floor f= new Floor(length,width);

        System.out.print("Total tiles required is : "+f.totalTiles(t));
    }
}