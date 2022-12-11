package ie.atu;

import java.util.Scanner;

import static ie.atu.GenerateValues.generateString;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String inputName = sc.next();


        TicketInfo new_ticket = new TicketInfo();

        new_ticket.user_info.setUsr_name("Joe");
        new_ticket.user_info.setUsr_age(32);
        new_ticket.user_info.setUsr_occupation("Student");

        new_ticket.ticket_avail.setSeat_kind("sit");
        new_ticket.ticket_Parking.setParking_Option("Yes");
        new_ticket.ticket_avail.setTicket_ref(generateString());

        new_ticket.ticket_pay.setCardNumber(6123456789012345l);
        new_ticket.ticket_pay.setCardDate("12/24");
        new_ticket.ticket_pay.setCardCCV(451);

        System.out.print(new_ticket.toString() + '\n');

        TicketInfo ticket = new TicketInfo("Morgan", "student", 23, "stand", "no", 4123456789012345l, "12/24", 451);

        System.out.print(ticket.toString());


        /*
        //List<TicketInfo> new_ticket = new ArrayList<>();
        TicketAvailability max_tickets = new TicketAvailability(1, 10);

        List<TicketInfo> new_ticket = List.of(
                //new TicketInfo("Joe", "student", 24, 4123456789012345l)
                //new TicketInfo()
        );


        /*
        while(true){
            TicketInfo ticket = new TicketInfo();

            System.out.println("\n\n==========================================================\nUSER INFO\n==========================================================\n\r");

            System.out.print("ENTER NAME (MUST BE GREATER THAN 2 LETTERS): ");
            ticket.setUsr_name(sc.nextLine());

            System.out.print("\nENTER OCCUPATION (INDIVIDUAL, STUDENT, FAMILY, ELDERLY): ");
            ticket.setUsr_occupation(sc.nextLine());

            System.out.print("\nENTER AGE (MUST BE OLDER THAN 16): ");
            ticket.setUsr_age(sc.nextInt());

            sc.nextLine();


            System.out.println("\n\n==========================================================\nSEATING\n==========================================================\n\r");

            System.out.print("SEATING OR STANDING ARRANGEMENTS: ");
            String buffer = sc.nextLine();

            ticket.ticket_avail.setSeat_kind(buffer);


            System.out.println("\n\n==========================================================\nPAYMENTS\n==========================================================\n\r");

            System.out.print("\nENTER CARD NUMBER: ");
            ticket.ticket_pay.setCardNumber(sc.nextLong());

            // consumes nextlong left-over
            // DO NOT REMOVE FROM CODE
            sc.nextLine();

            System.out.print("\nENTER CARD DATE (MM/YY): ");
            ticket.ticket_pay.setCardDate(sc.nextLine());

            System.out.print("\nENTER CARD CCV: ");
            ticket.ticket_pay.setCardCCV(sc.nextInt());


            // consumes nextlong left-over
            // DO NOT REMOVE FROM CODE
            sc.nextLine();


            //  referencces ticket_avail in ticket object and sets the ticket_ref with generated 20 digit string from GenerateValues class
            ticket.ticket_avail.setTicket_ref(generateString());
            System.out.print("\nTICKET REFERENCE: " + ticket.ticket_avail.getTicket_ref() + "\n");

            new_ticket.add(ticket);

            System.out.printf(new_ticket.toString());
        }
         */
    }


}