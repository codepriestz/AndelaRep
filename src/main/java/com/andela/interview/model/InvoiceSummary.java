package com.andela.interview.model;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class InvoiceSummary {

  private Integer totalInvoiceCount;
  private Integer totalInvoiceAmount;
  private List<InvoiceDTO> invoices;
}
