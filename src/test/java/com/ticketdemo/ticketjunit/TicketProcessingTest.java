package com.ticketdemo.ticketjunit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.util.Date;

public class TicketProcessingTest {
    @Test
    public void generateTicketA(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'A',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(250,ticket.getRow());
    }
    @Test
    public void generateTicketB(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'B',"OG",21,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(250,ticket.getRow());
    }
    @Test
    public void generateTicketC(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'C',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(250,ticket.getRow());
    }
    @Test
    public void generateTicketD(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'D',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(150,ticket.getRow());
    }
    @Test
    public void generateTicketE(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'E',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(150,ticket.getRow());
    }
    @Test
    public void generateTicketF(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'F',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(150,ticket.getRow());
    }
    @Test
    public void generateTicketG(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'G',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(120,ticket.getRow());
    }
    @Test
    public void generateTicketH(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'H',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(120,ticket.getRow());
    }
    @Test
    public void generateTicketI(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'I',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(120,ticket.getRow());
    }
}
