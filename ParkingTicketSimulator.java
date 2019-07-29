/**
 * ParkingTicketSimulator
 */
public class ParkingTicketSimulator {
    /**
     * ParkedCar
     */
    public class ParkedCar {
        private String make, model, color, license;
        private int minutes; 
        
    }
    /**
     * ParkingMeter
     */
    public class ParkingMeter {
        
        private int minutesPurchased;
    }

    /**
     * ParkingTicket
     */
    public class ParkingTicket {
    
        private ParkedCar car;
        private PoliceOfficer officer;
        private double fine;
        private int minutes;
        public final double BASE_FINE = 25.0;
        public final double HOURLY_FINE = 10.0;

        public ParkingTicket(ParkedCar car, PoliceOfficer officer, int minutes) {
            super();
            this.car = car;
            this.officer = officer;
            this.minutes = minutes;
    
            calculateFine();
        }
            private void calculateFine() {

                double hours = minutes / 60.0;
                int hoursAsInt = (int) hours;
        
                if ((hours - hoursAsInt) > 0) {
                    hoursAsInt++;
                }
        
                // Assign the base fine.
                fine = BASE_FINE;
        
                // Add the additional hourly fines.
                fine += (hoursAsInt * HOURLY_FINE);
            }
        
        }
        public static void main(String[] args) {

            // A green car was parked for 125 minutes
            ParkingTicketSimulator parkingTicketSimulator = new ParkingTicketSimulator();
            ParkedCar car = parkingTicketSimulator.new ParkedCar("Toyota", "2005",
                    "Green", "ABC123", 125);
        
            // 60 minutes of time was purchased
            ParkingMeter meter = parkingTicketSimulator.new ParkingMeter(60);
        
            // Officer Jack was on duty
            PoliceOfficer officer = parkingTicketSimulator.new PoliceOfficer(
                    "Sargent Jack Johnson", "8909");
        
            ParkingTicket ticket = officer.patrol(car, meter);
        
            // Did the officer issue a ticket?
            if (ticket != null) {
                System.out.println(ticket);
            } else {
                System.out.println("No crimes committed!");
            }
        }
    }