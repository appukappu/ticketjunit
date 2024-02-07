package com.ticketdemo.ticketjunit;

public class TicketProcessing {

    public ShowOutputs movieTicket(ShowInputs inputs){

        char value = inputs.getRow();
        int price =0;

        if ( value == 'A' || value == 'B' || value == 'C'){
            price=250;
        }
        if ( value == 'D' || value == 'E' || value == 'F'){
            price=150;
        }
        if ( value == 'G' || value == 'H' || value == 'I'){
            price=120;

        }
        ShowOutputs output=new ShowOutputs(inputs.getDay(),inputs.getTime(), (char) price,inputs.getMovie(),inputs.getSeatNo(),inputs.getNoOfSeats());

        return output;
    }

}
