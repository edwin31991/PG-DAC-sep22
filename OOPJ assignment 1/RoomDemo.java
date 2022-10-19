



import java.util.Scanner;
class Room {
    int height;
    int width;
    int breadth;

    Room(){}

    Room(int h, int w, int b){
        height = h;
        width = w;
        breadth = b;
    }

    int volume(){
        return height * width * breadth;
    }
}

class RoomDemo{
    public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Height h1 and h2= ");
		int h1=sc.nextInt();
		int h2=sc.nextInt();
		
		System.out.println("Enter width w1 and w2= ");
		int w1=sc.nextInt();
		int w2=sc.nextInt();
		
		System.out.println("Enter breadth b1 and b2= ");
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		
        Room r1 = new Room(h1,w1,b1);
        Room r2 = new Room(h2,w2,b2);

        System.out.println("The volume of room 1 is " + r1.volume());
        System.out.println("The volume of room 2 is " + r2.volume());

    }
}