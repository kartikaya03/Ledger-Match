package com.example.ledgermatch.controller;

import com.example.ledgermatch.model.Invoice;
import com.example.ledgermatch.service.InvoiceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {
    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping("/upload")
    public ResponseEntity<?> uploadInvoice(@RequestParam("file") MultipartFile file) {
        // MVP: accept file and create invoice record with minimal metadata
        Invoice inv = new Invoice();
        inv.setOriginalFilename(file.getOriginalFilename());
        inv.setStatus("UPLOADED");
        Invoice saved = invoiceService.save(inv);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<Invoice>> list() {
        return ResponseEntity.ok(invoiceService.listAll());
    }

    @GetMapping("/<built-in function id>")
    public ResponseEntity<?> get(@PathVariable UUID id) {
        Invoice inv = invoiceService.getById(id);
        if (inv == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(inv);
    }
}
