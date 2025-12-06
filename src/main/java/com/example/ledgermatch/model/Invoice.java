package com.example.ledgermatch.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "invoices")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue
    private UUID id;
    private UUID uploaderId;
    private UUID vendorId;
    private String originalFilename;
    private String storagePath;
    private String status;
    private String invoiceNo;
    private LocalDate invoiceDate;
    private BigDecimal totalAmount;
    private BigDecimal taxAmount;
    private String currency;
    @Column(columnDefinition = "text")
    private String ocrText;
}
