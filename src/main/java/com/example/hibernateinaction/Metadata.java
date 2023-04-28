package com.example.hibernateinaction;

import javax.persistence.Embeddable;
import java.sql.Timestamp;

@Embeddable
public class Metadata {
    private Timestamp createdAt;

    private Timestamp updatedAt;
}
