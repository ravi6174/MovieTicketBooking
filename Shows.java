import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
public class Shows {
    static Scanner sc=new Scanner(System.in);
    Shows(){

    }
    String time;
    String[][] seating=new String[7][10];
    public static final String blue   = "\u001B[94m";

    Shows(String time){
        this.time=time;
    }
    public static Shows returnShows(String time){
        return new Shows(time);
    }


    static int viewSeats(String[][] obj){
        System.out.println();
        int c=0;
        int no_of_booked_seats=0;
        System.out.print("   ");
        for (int i = 0; i < obj[0].length; i++) {
            System.out.print(" "+(i+1)+"  ");
        }
        System.out.println();
        for (int i = 0; i < obj.length; i++) {
            c++;
            if(c==1){
                System.out.println(blue+"  -----------------------------------------"+Main.reset);
            }
            System.out.print((char)(65+i)+" ");
            System.out.print(blue+"|"+Main.reset);
            for (int j = 0; j < obj[i].length; j++) {
                if(obj[i][j]==null)
                    System.out.print("   ");
                else{
                    System.out.print(Main.red+" X "+Main.reset);
                    no_of_booked_seats++;
                }
                System.out.print(blue+"|"+Main.reset);
            }
            //System.out.print("|");
            System.out.println();
            System.out.println(blue+"  -----------------------------------------"+Main.reset);
        }
        return no_of_booked_seats;
    }


    void bookTickets(int[] booking_details){
        try {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter no.of tickets: ");
            int nooftickets=sc.nextInt();
        
            if(nooftickets<=0){
                System.out.println(Main.red+"Not valid..Enter number between 1 and 4"+Main.reset);
                bookTickets(booking_details);
            }
            else if(nooftickets>4){
                System.out.println(Main.red+"Max of 4 tickets can only be allowed"+Main.reset);
                bookTickets(booking_details);
            }
            else{
                            
                //conatins seats numbers in a1,a2 format, used for creating bookedtickets object
                ArrayList<String> seat_numbers=new ArrayList<String>();

                //this is used to store all people seating data at i,i+1 index
                //eg A9 seat is stored as A at 0 index and 9 at 1 index
                ArrayList<Integer> allseatingdetails=new ArrayList<Integer>();

                System.out.println(Main.clear);       

                for (int i = 0; i < nooftickets; i++) {
                    System.out.println();
                    System.out.println("Select seat for person "+(i+1));

                    //one person seating details
                    int[] seating_detils=Audience.takeSeatingdetails(booking_details);

                    //adding single person seating details to all people details
                    allseatingdetails.add(seating_detils[0]);
                    allseatingdetails.add(seating_detils[1]);

                    Shows selected_show=null;

                    switch (booking_details[3]) {
                        case 1:
                            selected_show=Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show1;
                            break;
                        case 2:
                            selected_show=Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show2;               
                            break;
                        case 3:
                            selected_show=Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show3;              
                            break;
                        case 4:
                            selected_show=Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show4;
                            break;
                        default:
                            System.out.println(Main.red+"Something went wrong"+Main.reset);
                            new Audience().loggedIn();
                            break;
                    }

                    if(selected_show.seating[seating_detils[0]][seating_detils[1]]!=null){
                        System.out.println(Main.red+"Seat already booked by others"+Main.reset);
                        seating_detils=Audience.takeSeatingdetails(booking_details);

                    }
                    //System.out.println(seat_num);
        
                    switch (booking_details[3]) {
                        case 1:
                            Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show1.seating[seating_detils[0]][seating_detils[1]]=Main.user.username;
                            break;
                        case 2:
                            Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show2.seating[seating_detils[0]][seating_detils[1]]=Main.user.username;               
                            break;
                        case 3:
                            Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show3.seating[seating_detils[0]][seating_detils[1]]=Main.user.username;              
                            break;
                        case 4:
                            Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show4.seating[seating_detils[0]][seating_detils[1]]=Main.user.username;
                            break;
                        default:
                            System.out.println(Main.red+"Something went wrong"+Main.reset);
                            new Audience().loggedIn();
                            break;
                        
                    }   
                    String seat_num=((char)(seating_detils[0]+65))+""+(seating_detils[1]+1);
                    seat_numbers.add(seat_num);   
                }
                        

                    //------------------------------------------------------------------
                    // payment
                    
                System.out.println(Main.clear);

                int totalamount=Wallet.totalamount(nooftickets);

                if(totalamount>Database.audiencelist.get(Main.audienceno).getBal()){
                    System.out.println();
                    System.out.println(Main.red+"Insufficient Balance. Please recharge your Wallet"+Main.reset);
                    for (int i = 0; i < allseatingdetails.size()/2; i++) {
                        switch (booking_details[3]) {
                            case 1:
                                Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show1.seating[allseatingdetails.get(2*i)][allseatingdetails.get((2*i)+1)]=null;
                                break;
                            case 2:
                                Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show2.seating[allseatingdetails.get(2*i)][allseatingdetails.get((2*i)+1)]=null;               
                                break;
                            case 3:
                                Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show3.seating[allseatingdetails.get(2*i)][allseatingdetails.get((2*i)+1)]=null;              
                                break;
                            case 4:
                                Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show4.seating[allseatingdetails.get(2*i)][allseatingdetails.get((2*i)+1)]=null;
                                break;
                            default:
                                System.out.println(Main.red+"Something went wrong"+Main.reset);
                                new Audience().loggedIn();
                                break;
                            
                        }   
                    }
                    System.out.println();
                    new Audience().loggedIn();

                    //clearing booked tickets 
                    
                }
                else{
                    //System.out.println(Main.clear);
                    // System.out.println("You need to pay: "+totalamount);
                    // System.out.println("1.continue");
                    // System.out.println("2.Back to login menu");
                    // System.out.print("Enter a option: ");
                    // String opt=sc.next();

                    int status=payment(totalamount);

                    if(status==1){

                        //create a transaction object and adding to db
                        String booked_theater_username=Database.theaterlist.get(Audience.selectedtheater).username;
                        Transaction newtransaction=new Transaction(Transaction.getTransactionID(), Main.user.username, booked_theater_username , totalamount, Transaction.getCurrentTime(),Transaction.getCurrentDate());
                        Database.transactionslist.add(newtransaction);

                        System.out.println(Main.clear);
                        
                        System.out.println(Main.green+"Amount debited Succesfully from your wallet"+Main.reset);
                        Bookedtickets booked_details=Bookedtickets.createBookedTicket(Main.user.username, booking_details[0], booking_details[1], booking_details[2], booking_details[3],seat_numbers,newtransaction.trans_id);
                        Database.bookedtickets.add(booked_details);
                        //System.out.println(Main.clear);

                        Audience.selectedtheater=0;
                        System.out.println();
                        System.out.println(Main.green+"Tickets booked Succesfully"+Main.reset);
                        System.out.println("You can see your booked tickets in History");
                        new Audience().loggedIn();
                    }

                    else if(status==2){                  
                        System.out.println(Main.clear);
                        //clearing booked tickets
                        for (int i = 0; i < nooftickets; i++) {
                            switch (booking_details[3]) {
                                case 1:
                                    Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show1.seating[allseatingdetails.get(2*i)][allseatingdetails.get((2*i)+1)]=null;
                                    break;
                                case 2:
                                    Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show2.seating[allseatingdetails.get(2*i)][allseatingdetails.get((2*i)+1)]=null;               
                                    break;
                                case 3:
                                    Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show3.seating[allseatingdetails.get(2*i)][allseatingdetails.get((2*i)+1)]=null;              
                                    break;
                                case 4:
                                    Database.theaterlist.get(booking_details[0]).movieslist.get(booking_details[1]).noofdays.get(booking_details[2]).show4.seating[allseatingdetails.get(2*i)][allseatingdetails.get((2*i)+1)]=null;
                                    break;
                                default:
                                    System.out.println(Main.red+"Something went wrong"+Main.reset);
                                    new Audience().loggedIn();
                                    break;
                                
                            }   
                        }
                        new Audience().loggedIn();

                    }

                    }
                }
        }
        catch (Exception e) {
            System.out.println(Main.clear);
            System.out.println(Main.red+"Invalid Input"+Main.clear);
            bookTickets(booking_details);
        }
        
    }
 
    static int payment(int totalamount){
        System.out.println("You need to pay: "+totalamount);
        System.out.println("1.continue");
        System.out.println("2.Back to login menu");
        System.out.print("Enter a option: ");
        String opt=sc.next();

    
        if(opt.equals("1")){                  
            System.out.println(Main.clear);
            User.paymentAnimation();

            //debiting amount from audience
            int current_balance=Database.audiencelist.get(Main.audienceno).getBal();
            Database.audiencelist.get(Main.audienceno).setBal(current_balance-totalamount);

            //crediting amount to theater
            int theater_curr_bal=Database.theaterlist.get(Audience.selectedtheater).getBal();
            Database.theaterlist.get(Audience.selectedtheater).setBal(theater_curr_bal+totalamount);
            return 1;
            
        }

        else if(opt.equals("2")){
            return 2;
        }                
        else{
            System.out.println(Main.clear);
            System.out.println(Main.red+"Invalid input"+Main.reset);
            System.out.println();
            return payment(totalamount);
        }
    }

}
