package com.example.CSIA.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "MedicationReminder")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(allowGetters = true, ignoreUnknown = true)
public class MedicationReminder {

    @Id
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @NonNull
    @JsonProperty(value = "startTime")
    private LocalDateTime medStartTime;

    @NonNull
    @JsonProperty(value = "endTime")
    private LocalDateTime medEndTime;

    @NonNull
    @JsonProperty(value = "interval")
    private short medInterval;

    @NonNull
    @JsonProperty(value = "total")
    private int medTotalCount;

    @NonNull
    @JsonProperty(value = "remaining")
    private int medRemainingCount;

    @NotBlank
    @JsonProperty(value = "name")
    private String medication;


    @NonNull
    public UUID getUuid() {
        return id;
    }

    @NonNull
    public LocalDateTime getMedStartTime() {
        return medStartTime;
    }

    @NonNull
    public LocalDateTime getMedEndTime() {
        return medEndTime;
    }

    @NonNull
    public short getMedInterval() {
        return medInterval;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedStartTime(@NonNull LocalDateTime medStartTime) {
        this.medStartTime = medStartTime;
    }

    public void setMedEndTime(@NonNull LocalDateTime medEndTime) {
        this.medEndTime = medEndTime;
    }

    public void setMedInterval(@NonNull short medInterval) {
        this.medInterval = medInterval;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getMedTotalCount() {
        return medTotalCount;
    }

    public void setMedTotalCount(int medTotalCount) {
        this.medTotalCount = medTotalCount;
    }

    public int getMedRemainingCount() {
        return medRemainingCount;
    }

    public void setMedRemainingCount(int medRemainingCount) {
        this.medRemainingCount = medRemainingCount;
    }
}
