package com.example.ledgermatch.repository;

import com.example.ledgermatch.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface InvoiceRepository extends JpaRepository<Invoice, UUID> {
}
