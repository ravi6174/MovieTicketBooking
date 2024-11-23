import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

    // static void paymentAnimation(){
    //     System.out.println(Main.yellow);
    //     String message = "Processing payment";
    //     System.out.print(message);

    //     int width = 5;  // Width of the bouncing area
    //     boolean forward = true;
    //     int position = 0;

    //     for (int i = 0; i < 10; i++) {
    //         System.out.print("\r" + message + " ".repeat(position) + ".");
    //         try {
    //             Thread.sleep(200);
    //         } catch (InterruptedException e) {
    //             e.printStackTrace();
    //         } // Adjust speed if necessary
            
    //         if (forward) {
    //             position++;
    //             if (position >= width) forward = false;  // Change direction
    //         } else {
    //             position--;
    //             if (position <= 0) forward = true;  // Change direction
    //         }
    //     }
    //     System.out.println(Main.reset);


        // System.out.print(Main.green+"Processing payment  ");
        // char[] spinner = {'|', '/', '-', '\\'};
        // int rotations = 3;
        // for (int i = 0; i < rotations * spinner.length; i++) {
        //     System.out.print("\b" + spinner[i % spinner.length]); 
        //     try {
        //         Thread.sleep(150);
        //     } 
        //     catch (InterruptedException e) {
        //         e.printStackTrace();
        //     } 
        // }
        // System.out.println(Main.reset);

    //}
    static String getCurrentTime(){
        LocalDateTime now = LocalDateTime.now();
        String date=now.toString();
        return date.substring(0, 10)+" "+date.substring(12, 19);
    }
    public static void main(String[] args) throws InterruptedException {
       // getTransactionID();

        // System.out.println(Main.green+"Ticket "+"ticketcount"+Main.reset);
        // System.out.println();
        // System.out.println("Theater Name   :"+Main.purple+"ticket.theater"+Main.reset);
        // System.out.println("Movie Name     :"+Main.purple+"ticket.movie"+Main.reset);
        // System.out.println("Date           :"+Main.purple+"ticket.date"+Main.reset);
        // System.out.println("Show Timings   : "+Main.purple+"ticket.show"+Main.reset);
        // System.out.println("Seat Numbers   : "+Main.purple+"seats"+Main.reset);
        // System.out.println("Transaction ID : "+Main.purple+"ticket.trans_id"+Main.reset);

        // String a[][]=new String[2][2];
        // a[0][0]="hi";

        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[i].length; j++) {
        //         if(a[i][j]==null)
        //             System.out.print("null"+" ");
        //         else
        //             System.out.print("notnull"+" ");
        //     }
        //     System.out.println();
        // }

        // a[0][0]=null;
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[i].length; j++) {
        //         if(a[i][j]==null)
        //             System.out.print("null"+" ");
        //         else
        //             System.out.print("notnull"+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("--------------");

        //     for (int i = 0; i < 5; i++) {
        //         for (int j = 0; j < 5; j++) {
        //             System.out.print("|");
        //             System.out.print("  ");
        //         }
        //         System.out.println();
        //         System.out.println("------------");          
            }
        //Wallet.totalamount(5);
        //    System.out.println();
        //    System.out.println(Main.red+"    AUDIENCE DASHBOARD");
        //    System.out.println("    ------------------"+Main.reset);
    
       // paymentAnimation();
        //new LocalDateTime();
       // System.out.println(Transaction.getTransactionID());
       //User.emailInput();
        //System.out.println(User.phonenumberinput());
        //User.loadingAnimation();
        // System.out.println(Main.purple+"--------------------------------------");
        // System.out.println("-------------            -------------");
        // System.out.println(".....                            .....");
        // System.out.println("             This is screen "+Main.reset);
        // System.out.println();
        //Wallet.totalamount(4);
    }
 
    // static void displayMovieDetails(String theater,String Movie,String Date,String Show){
    //     System.out.println("---Movie Details---");
    // }
    // Test(String username,String password,String email){
    //     super(username,password, email);

    // }
    // void register(){
    //         System.out.println("Register");
    // }
    // void login(){
    //     System.out.println("login");
    // }

    // static void  takeDatesList(int noofdays){
    //     String[] dateslist=new String[noofdays];
    //     Scanner sc=new Scanner(System.in);

    //     //setting date format in what way we want
    //     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 

    //     System.out.print("Enter First Day date in (dd-MM-yyyy) Format: ");
    //     String inputdate = sc.next();

    //     try {
    //         LocalDate firstday_date = LocalDate.parse(inputdate, formatter);
    //         String fdateString = firstday_date.format(formatter); // Convert LocalDate to String
    //         dateslist[0]=fdateString;
    //         for (int i = 0; i < noofdays-1; i++) {
    //             LocalDate date=firstday_date.plusDays(i+1);
    //             String dateString = date.format(formatter); // Convert LocalDate to String
    //             dateslist[i+1]=dateString;
    //         }

    //         for (int i = 0; i < dateslist.length; i++) {
    //             System.out.println(dateslist[i]);
    //         }
    //     } 
    //     catch (DateTimeParseException e) {
    //         System.out.println("Invalid date format.Please try again");
    //         takeDatesList(noofdays);
    //     }
    //     catch(Exception e){
    //         System.out.println("Something went wrong");
    //     }
    // }



            // System.out.println("enter date");
            // day=sc.nextInt();
    
            // System.out.println("enter month");
            // month=sc.nextInt()-1;
    
            // System.out.println("enter year");
            // year=sc.nextInt();
    
       // DateTimeFormatter obj = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // Define date format
    //    DateTimeFormatter obj = DateTimeFormatter.ofPattern("35-54-8000"); // Define date format

    //         System.out.println(obj.ofPattern("dd-MM-yyyy"));
            
    //     } catch (Exception e) {
    //     }

    // }
    // public static void main(String[] args) throws Exception {
       // takeDatesList(0);

    //     takeDates(0);
        
    
        //int[] a={0};
        //Wallet.totalamount(5);
        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader br=new BufferedReader(in);
        // int a=br.read();
        //System.out.println(a[1]);
        
        // System.out.print("----------------------------------------");
        // System.out.println();
        // System.out.print("|");
        // System.out.print(Main.yellow+"         ---Movie Details---"+Main.reset);
        // System.out.print("|");
        // System.out.println();
        // System.out.print("|");
        // System.out.print(" Title: "+Main.Cyan+"hi"+Main.reset);
        // System.out.print("|");
        // System.out.println();
        // System.out.print("|");

        // System.out.print(" Description: "+Main.Cyan+ "erusfhjbqrd"+Main.reset);
        // System.out.print("|");
        // System.out.println();
        // System.out.print("|");

        // System.out.print(" Language: "+Main.Cyan+"hi"+Main.reset);
        // System.out.print("|");
        // System.out.println();
        // System.out.println("----------------------------------------");
        // Test obj=new Test("hi", "nhiiull", "null");
        // System.out.println(obj.email);
        // System.out.println(obj.getPassword());
        // obj.login();
        
        // System.out.print("Your otp is:");
        // int otp=(int)(Math.random()*10000);
        // System.out.println(otp);
        //System.out.println("Language: "+Main.Cyan+ "jo"+Main.reset);

        // Wallet.totalamount(3);


        //showTheaterlist();
        // System.out.println(Database.theaterlist.size());
        // System.out.println(Database.audiencelist.size());
        //Shows.viewSeats(Shows.seating);
    //     Theaters obj=new Theaters("dhb", null, null);
    //     Database.theaterlist.add(obj);
    //     Movies obj1=Movies.returnMovies();
    //     Movies obj2=Movies.returnMovies();
    //     Movies obj3=Movies.returnMovies();

    //     Database.theaterlist.get(0).movieslist.add(obj2);
    //     Database.theaterlist.get(0).movieslist.add(obj3);
    //     System.out.println("==================");
    //     System.out.println(Database.theaterlist.get(0).movieslist.size());
    //     System.out.println("==================");
    //     for (int i = 0; i < Database.theaterlist.size(); i++) {
    //         Theaters ob=Database.theaterlist.get(i);
    //         for (int j = 0; j < obj.movieslist.size(); j++) {
    //             System.out.println(obj.movieslist.get(j).Title); 
    //         }
    //     }

    //     //String[][] seating=new String[7][10];
    //    // viewSeats(seating);
    // }


    //     Audience[][] obj=new Audience[7][10];
    //     //obj[3][4]=new Audience("uivb", "ull", 0, null, null, 0);
    //     viewSeats(obj);



    // }
    
    // static void viewSeats(Audience[][] obj){
    //     int c=0;
    //     System.out.print("   ");
    //     for (int i = 0; i < obj[0].length; i++) {
    //         System.out.print(" "+(i+1)+"  ");
    //     }
    //     System.out.println();
    //     for (int i = 0; i < obj.length; i++) {
    //         c++;
    //         if(c==1){
                
    //             System.out.println("  -----------------------------------------");
    //         }
    //         System.out.print((char)(65+i)+" ");
    //         System.out.print("|");
    //         for (int j = 0; j < obj[i].length; j++) {
    //             if(obj[i][j]==null)
    //                 System.out.print(" "+(char)(i+65)+""+(j+1));
    //             else
    //                 System.out.print(" X ");
    //             System.out.print("|");

    //         }
    //         //System.out.print("|");
    //         System.out.println();
    //         System.out.println("  -----------------------------------------");
    //    
    

