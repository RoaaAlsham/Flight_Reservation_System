/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import FlightReservationExceptions.NoAvailableSeatException;
import OperationsAndServices.FlightDataLists;
import OperationsAndServices.ReservationOperations;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import reservationObjects.Airport;
import reservationObjects.Customer;
import reservationObjects.Flight;
import reservationObjects.Reservation;
import reservationObjects.Seat;

/**
 *
 * @author Zahera
 */
public class CustomerReservationPage extends javax.swing.JPanel {

    /**
     * Creates new form CustomerReservationPage
     */   
    MainFrame mainFrame;
    FlightDataLists flightDataLists;
    DefaultTableModel dtm;
    Vector<String> flightTableColumnsNames;
    Customer LoggedinCustomer;
    SpinnerNumberModel spinnerNumModel;
    
    Vector<Flight> flights;
    Vector<Airport> airports;
    public CustomerReservationPage(MainFrame mainFrame, FlightDataLists flightDataLists,Customer loggedinCustomer) {
        this.mainFrame = mainFrame;
        this.flightDataLists = flightDataLists;
        this.LoggedinCustomer= loggedinCustomer;
        
        this.flights= flightDataLists.getFlights();
        this.airports= flightDataLists.getAirports();
        
        initComponents();
        lbl_username.setText(loggedinCustomer.getFirstName()+" "+ loggedinCustomer.getLastName());
        flightTableColumnsNames= initializeFlightTableColumnsNames();
        dtm= new DefaultTableModel();
        dtm.setColumnIdentifiers(flightTableColumnsNames);
        flightsTable.setModel(dtm);
        
        setValuesForComboBoxes();
        
        initializeFlightIDcombobox();
        spinnerNumModel= new SpinnerNumberModel(1, 1, 10, 1);
        spinner_seatNumber.setModel(spinnerNumModel);
        
        
        
        
    }
    public Vector<String> initializeFlightTableColumnsNames(){
        Vector<String> names = new Vector<>();
        names.add("flight Id");
        names.add("departure");
        names.add("arrival");
        names.add("departure date");
        names.add("seat number");
        names.add("seat price");
        return names;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightsTable = new javax.swing.JTable();
        showAllAvailableFlights = new javax.swing.JButton();
        lbl_originCity = new javax.swing.JLabel();
        combo_originCity = new javax.swing.JComboBox<>();
        lbl_searhForFlight = new javax.swing.JLabel();
        lbl_destinationCity = new javax.swing.JLabel();
        combo_destinationCity = new javax.swing.JComboBox<>();
        btn_searchFlight = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combo_flightID = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        spinner_seatNumber = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        btn_calculateReservationPrice = new javax.swing.JButton();
        lbl_price = new javax.swing.JLabel();
        btn_makePaymentandConfirm = new javax.swing.JButton();
        btn_logoutCustomer = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Customer Reservation Page");

        flightsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "null"
            }
        ));
        jScrollPane1.setViewportView(flightsTable);

        showAllAvailableFlights.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showAllAvailableFlights.setForeground(new java.awt.Color(204, 153, 0));
        showAllAvailableFlights.setText("show all available flights");
        showAllAvailableFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllAvailableFlightsActionPerformed(evt);
            }
        });

        lbl_originCity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_originCity.setForeground(new java.awt.Color(204, 153, 0));
        lbl_originCity.setText("origin airport");

        combo_originCity.setForeground(new java.awt.Color(204, 153, 0));

        lbl_searhForFlight.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_searhForFlight.setForeground(new java.awt.Color(204, 153, 0));
        lbl_searhForFlight.setText("Search for a flight: ");

        lbl_destinationCity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_destinationCity.setForeground(new java.awt.Color(204, 153, 0));
        lbl_destinationCity.setText("destination airport");

        combo_destinationCity.setForeground(new java.awt.Color(204, 153, 0));

        btn_searchFlight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_searchFlight.setForeground(new java.awt.Color(204, 153, 0));
        btn_searchFlight.setText("search for a flight ");
        btn_searchFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchFlightActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Reserve a flight: ");

        jLabel3.setText("choose flight id according to the table above");

        combo_flightID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_flightIDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("flight ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("seat number");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("username");

        lbl_username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(102, 0, 102));
        lbl_username.setText("jLabel7");

        btn_calculateReservationPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_calculateReservationPrice.setForeground(new java.awt.Color(0, 102, 102));
        btn_calculateReservationPrice.setText("calculate reservation flight");
        btn_calculateReservationPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateReservationPriceActionPerformed(evt);
            }
        });

        lbl_price.setText("price: .....");

        btn_makePaymentandConfirm.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn_makePaymentandConfirm.setText("make Payment and Confirm Reservation");
        btn_makePaymentandConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_makePaymentandConfirmActionPerformed(evt);
            }
        });

        btn_logoutCustomer.setText("LOGOUT");
        btn_logoutCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(combo_originCity, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(combo_destinationCity, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_searhForFlight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showAllAvailableFlights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_searchFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(128, 128, 128))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lbl_originCity)
                        .addGap(108, 108, 108)
                        .addComponent(lbl_destinationCity)
                        .addGap(44, 44, 44)
                        .addComponent(lbl_username)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(combo_flightID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_logoutCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(btn_calculateReservationPrice)
                                .addGap(40, 40, 40)
                                .addComponent(lbl_price))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(btn_makePaymentandConfirm))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4)
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(spinner_seatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(lbl_username))
                .addGap(18, 18, 18)
                .addComponent(lbl_searhForFlight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_originCity)
                    .addComponent(lbl_destinationCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_originCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_destinationCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchFlight))
                .addGap(17, 17, 17)
                .addComponent(showAllAvailableFlights)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_flightID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner_seatNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calculateReservationPrice)
                    .addComponent(lbl_price))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_makePaymentandConfirm)
                    .addComponent(btn_logoutCustomer))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showAllAvailableFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllAvailableFlightsActionPerformed
        // TODO add your handling code here:
        dtm.setRowCount(0);  
        for (int i = 0; i < flights.size(); i++) {
            Flight flight= flights.elementAt(i);
            dtm.addRow(prepareFlightRow(flight));        
        }
    }//GEN-LAST:event_showAllAvailableFlightsActionPerformed

    private void btn_searchFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchFlightActionPerformed
        // TODO add your handling code here:
        String str_origin= combo_originCity.getSelectedItem().toString();
        String str_destination= combo_destinationCity.getSelectedItem().toString();
        dtm.setRowCount(0);
        for (Flight flight : flights) {
            if(flight.getOriginAirport().getCity().equals(str_origin)
                    &&flight.getDestinationAirport().getCity().equals(str_destination)){
                dtm.addRow(prepareFlightRow(flight));
            }
        }
        if(dtm.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "no flight found with selected origin and airport");
        }
        
    }//GEN-LAST:event_btn_searchFlightActionPerformed

    
    private void combo_flightIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_flightIDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_combo_flightIDActionPerformed

    private void btn_calculateReservationPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateReservationPriceActionPerformed
        // TODO add your handling code here:
        int seats= Integer.parseInt(spinner_seatNumber.getValue().toString());
        int flightId=Integer.parseInt(combo_flightID.getSelectedItem().toString()); 
        
        ReservationOperations resOp= new ReservationOperations(flightDataLists);
        Flight flight = resOp.getFlightById(flightId);
        //flight not found ???
        int price= seats*flight.getSeatPrice();
        
        lbl_price.setText(String.valueOf(price));
       
    }//GEN-LAST:event_btn_calculateReservationPriceActionPerformed

    private void btn_makePaymentandConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_makePaymentandConfirmActionPerformed
        int seats= Integer.parseInt(spinner_seatNumber.getValue().toString());
        int flightId=Integer.parseInt(combo_flightID.getSelectedItem().toString()); 
        
        ReservationOperations resOp= new ReservationOperations(flightDataLists);
        Flight flight = resOp.getFlightById(flightId);
        //check if asked seats are available 
        try {
            if(flight.getAvalilableSeats().size()<seats){
            throw new NoAvailableSeatException(flight, seats);
            }
        } catch (NoAvailableSeatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return;
        }
        String askUser= "you are going to reserve this flight\n Origin airporname: "+ flight.getOriginAirport().getAirportName()+" \n Destination airportname: "+ flight.getDestinationAirport().getAirportName()+"\n Reserved seat number: "+ seats +"\n if you confirm flight info please click on (OK) to make payment to complete your reservation.";
        
        int agree= JOptionPane.showConfirmDialog(mainFrame, askUser, "confirmation message", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
           
        if(agree==JOptionPane.OK_OPTION){
            Vector<Seat> reservedSeats= flight.reserveSeat(seats);
            Reservation reservation=new Reservation(LoggedinCustomer, reservedSeats, flight);
            flightDataLists.getReservations().add(reservation);
            JOptionPane.showMessageDialog(mainFrame, "RESERVATION DONE SUCCESSFULLY");
            int showTicket=JOptionPane.showConfirmDialog(mainFrame,"Would you like to take a look to your reservation ticket? ", "final procedure",JOptionPane.YES_NO_OPTION);
            if(showTicket==JOptionPane.YES_OPTION){ 
                BoardingPass boardingPass= new BoardingPass(mainFrame,reservation);
                mainFrame.mainPanel.add(boardingPass,"boardingPass");
                mainFrame.showPanelMethod("boardingPass");
            }
        }   
    }//GEN-LAST:event_btn_makePaymentandConfirmActionPerformed

    private void btn_logoutCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutCustomerActionPerformed
        // TODO add your handling code here:
        mainFrame.showPanelMethod("LoginPage");
        LoggedinCustomer.setLoggedIn(false);
    }//GEN-LAST:event_btn_logoutCustomerActionPerformed
    public Vector<String> prepareFlightRow(Flight flight){
        Vector<String> row= new Vector<>();
        String id= String.valueOf(flight.getFlightId());
        String arrival= flight.getOriginAirport().getCity();
        String destination= flight.getDestinationAirport().getCity();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedDate = flight.getDepartureTime().format(formatter);
        String seatNumber= String.valueOf(flight.getFlightSeatNumber());
        String seatPrice= String.valueOf(flight.getSeatPrice());
        row.add(id);
        row.add(arrival);
        row.add(destination);
        row.add(formattedDate);
        row.add(seatNumber);
        row.add(seatPrice);
        return row;
                
    }
    public void initializeFlightIDcombobox(){
        combo_flightID.removeAllItems();
        for (Flight flight : flights) {
            combo_flightID.addItem(String.valueOf(flight.getFlightId()));
        }
    }
    public void setValuesForComboBoxes(){
        int size= airports.size();
        for (int i = 0; i < size; i++) {
            combo_originCity.addItem(airports.elementAt(i).getCity());
            combo_destinationCity.addItem(airports.elementAt(size-i-1).getCity());
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calculateReservationPrice;
    private javax.swing.JButton btn_logoutCustomer;
    private javax.swing.JButton btn_makePaymentandConfirm;
    private javax.swing.JButton btn_searchFlight;
    private javax.swing.JComboBox<String> combo_destinationCity;
    private javax.swing.JComboBox<String> combo_flightID;
    private javax.swing.JComboBox<String> combo_originCity;
    private javax.swing.JTable flightsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_destinationCity;
    private javax.swing.JLabel lbl_originCity;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_searhForFlight;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JButton showAllAvailableFlights;
    private javax.swing.JSpinner spinner_seatNumber;
    // End of variables declaration//GEN-END:variables
}
