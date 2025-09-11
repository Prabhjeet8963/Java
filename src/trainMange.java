import java.util.*;

class Train {
    int trainID;
    String name, source, destination;
    int capacity, availableSeats;

    Train(int trainID, String name, String source, String destination, int capacity) {
        this.trainID = trainID;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.capacity = capacity;
        this.availableSeats = capacity;
    }
}

class Ticket {
    int ticketID, trainID;
    String passengerName;

    Ticket(int ticketID, int trainID, String passengerName) {
        this.ticketID = ticketID;
        this.trainID = trainID;
        this.passengerName = passengerName;
    }
}

public class TrainSystem {
    static List<Train> trains = new ArrayList<>();
    static List<Ticket> tickets = new ArrayList<>();
    static int nextTicketID = 1;

    static void addTrain(Scanner sc) {
        System.out.print("Train ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Source: ");
        String source = sc.nextLine();
        System.out.print("Destination: ");
        String dest = sc.nextLine();
        System.out.print("Capacity: ");
        int cap = sc.nextInt();
        trains.add(new Train(id, name, source, dest, cap));
        System.out.println("Train added.\n");
    }

    static void bookTicket(Scanner sc) {
        System.out.print("Train ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Passenger Name: ");
        String name = sc.nextLine();
        for (Train t : trains) {
            if (t.trainID == id && t.availableSeats > 0) {
                tickets.add(new Ticket(nextTicketID++, id, name));
                t.availableSeats--;
                System.out.println("Ticket booked.\n");
                return;
            }
        }
        System.out.println("Booking failed.\n");
    }

    static void showTrains() {
        if (trains.isEmpty()) {
            System.out.println("No trains available.\n");
            return;
        }
        for (Train t : trains) {
            System.out.println("ID: " + t.trainID + ", " + t.name + " (" + t.source + " → " + t.destination + "), Seats: " + t.availableSeats);
        }
        System.out.println();
    }

    static void showTickets(Scanner sc) {
        System.out.print("Train ID: ");
        int id = sc.nextInt();
        boolean found = false;
        for (Ticket tk : tickets) {
            if (tk.trainID == id) {
                System.out.println("Ticket #" + tk.ticketID + " - " + tk.passengerName);
                found = true;
            }
        }
        if (!found) System.out.println("No tickets for this train.");
        System.out.println();
    }

    static void cancelTicket(Scanner sc) {
        System.out.print("Ticket ID: ");
        int id = sc.nextInt();
        Iterator<Ticket> it = tickets.iterator();
        while (it.hasNext()) {
            Ticket tk = it.next();
            if (tk.ticketID == id) {
                for (Train t : trains) {
                    if (t.trainID == tk.trainID) {
                        t.availableSeats++;
                        break;
                    }
                }
                it.remove();
                System.out.println("Ticket cancelled.\n");
                return;
            }
        }
        System.out.println("Ticket not found.\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Train");
            System.out.println("2. Book Ticket");
            System.out.println("3. Show Trains");
            System.out.println("4. Show Tickets");
            System.out.println("5. Cancel Ticket");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> addTrain(sc);
                case 2 -> bookTicket(sc);
                case 3 -> showTrains();
                case 4 -> showTickets(sc);
                case 5 -> cancelTicket(sc);
                case 6 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.\n");
            }
        }
    }
}
