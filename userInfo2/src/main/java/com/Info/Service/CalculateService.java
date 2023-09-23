package com.Info.Service;

import org.springframework.stereotype.Component;

@Component("calculateService")
public class CalculateService {

public Integer calculateTotalPrice(Integer noOfTickets ,Integer ticketPrice, Integer ticketDiscount ){

   return (noOfTickets * ticketPrice ) - ticketDiscount;

} 

}