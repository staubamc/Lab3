import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a number to count down or up from:");
    int num = s.nextInt();
    System.out.println("\n\n");

    if (num >= 0){
      while (num >= 0) {
        System.out.println(num);
        num--;
      }
      }
    else{
      while (num <= 0) {
        System.out.println(num);
        num++;
    }
    }
    
    System.out.println("Blast off!");
  }
}