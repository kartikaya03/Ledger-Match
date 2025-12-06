package com.example.ledgermatch.repository;

import com.example.ledgermatch.model.InvoiceLineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;

public interface InvoiceLineItemRepository extends JpaRepository<InvoiceLineItem, UUID> {
    List<InvoiceLineItem> findByInvoiceId(UUID invoiceId);
}
