package com.example.ledgermatch.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "invoice_line_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceLineItem {
    @Id
    @GeneratedValue
    private UUID id;
    private UUID invoiceId;
    @Column(columnDefinition = "text")
    private String description;
    private BigDecimal quantity;
    private BigDecimal unitPrice;
    private BigDecimal lineTotal;
    private Double confidence;
}
