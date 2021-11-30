package com.andela.interview.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CreateInvoiceRequest {

  private Integer quantity;
  private Integer price;
}
