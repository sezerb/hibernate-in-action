package com.example.hibernateinaction;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.sql.Timestamp;

@Embeddable
public class Metadata {
    private Timestamp createdAt;

    private Timestamp updatedAt;
}
