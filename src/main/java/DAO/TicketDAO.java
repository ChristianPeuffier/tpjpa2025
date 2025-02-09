package DAO;

import metier.Ticket;

public class TicketDAO extends AbstractJpaDao<Long, Ticket> {

    public TicketDAO(){
        super(Ticket.class);
    }
}
