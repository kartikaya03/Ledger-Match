package com.example.ledgermatch.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "vendors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vendor {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String gstin;
    private String contactEmail;
}
