package com.example.ledgermatch.service;

import com.example.ledgermatch.model.Invoice;
import com.example.ledgermatch.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public Invoice save(Invoice invoice) {
        invoice.setStatus(invoice.getStatus() == null ? "UPLOADED" : invoice.getStatus());
        return invoiceRepository.save(invoice);
    }

    public List<Invoice> listAll() {
        return invoiceRepository.findAll();
    }

    public Invoice getById(UUID id) {
        return invoiceRepository.findById(id).orElse(null);
    }
}
