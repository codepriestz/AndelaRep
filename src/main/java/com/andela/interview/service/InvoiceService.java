package com.andela.interview.service;

import com.andela.interview.model.CreateInvoiceRequest;
import com.andela.interview.model.InvoiceDTO;
import com.andela.interview.model.InvoiceSummary;

public interface InvoiceService {


  InvoiceDTO createInvoice(CreateInvoiceRequest createInvoiceRequest);
  InvoiceSummary getInvoiceSummary();
}
