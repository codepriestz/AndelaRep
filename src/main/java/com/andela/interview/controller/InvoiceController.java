package com.andela.interview.controller;

import com.andela.interview.model.CreateInvoiceRequest;
import com.andela.interview.model.InvoiceDTO;
import com.andela.interview.model.InvoiceSummary;
import com.andela.interview.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoices")
@Slf4j
@RequiredArgsConstructor
public class InvoiceController {

  private final InvoiceService invoiceService;

  @PostMapping()
  public InvoiceDTO createInvoice(CreateInvoiceRequest request) {
    return invoiceService.createInvoice(request);
  }

  @GetMapping
  public InvoiceSummary getInvoiceSummary() {
    return invoiceService.getInvoiceSummary();
  }
}
