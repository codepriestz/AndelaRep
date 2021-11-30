package com.andela.interview.service.impl;

import com.andela.interview.entities.Invoice;
import com.andela.interview.model.CreateInvoiceRequest;
import com.andela.interview.model.InvoiceDTO;
import com.andela.interview.model.InvoiceSummary;
import com.andela.interview.repository.InvoiceRepository;
import com.andela.interview.service.InvoiceService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {

  private final InvoiceRepository invoiceRepository;

  @Override
  public InvoiceDTO createInvoice(CreateInvoiceRequest createInvoiceRequest) {
    Invoice savedInvoice = invoiceRepository.save(Invoice.builder()
        .quantity(createInvoiceRequest.getQuantity())
        .totalPrice(createInvoiceRequest.getPrice())
        .build());
    return savedInvoice.toDTO();
  }

  @Override
  public InvoiceSummary getInvoiceSummary() {
    List<InvoiceDTO> results = invoiceRepository.findAll().stream().map(Invoice::toDTO).collect(
        Collectors.toList());
    int totalCount = results.size();
    int totalAmount = results.stream().mapToInt(InvoiceDTO::getPrice).sum();

    return InvoiceSummary.builder()
        .invoices(results)
        .totalInvoiceAmount(totalAmount)
        .totalInvoiceCount(totalCount)
        .build();
  }

}
