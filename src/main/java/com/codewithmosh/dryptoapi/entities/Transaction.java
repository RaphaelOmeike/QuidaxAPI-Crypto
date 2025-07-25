package com.codewithmosh.dryptoapi.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "network")
    private String network;

    @Column(name = "service_id")
    private String serviceId;

    @Column(name = "billers_code")
    private String billersCode;

    @Column(name = "data_plan_code")
    private String dataPlanCode;

    @Column(name = "amount_naira")
    private BigDecimal amountNaira;

    @Column(name = "amount_crypto")
    private BigDecimal amountCrypto;

    @Column(name = "crypto_currency")
    private String cryptoCurrency;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;

    @Column(name = "transaction_status")
    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus; // PENDING, PAID, COMPLETED, FAILED, EXPIRED

    @Column(name = "delivery_status")
    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus; // PENDING, DELIVERED, FAILED
    //from vtpass
    @Column(name = "request_id")
    private String requestId;
//    from quidax
    @Column(name = "transaction_hash")
    private String transactionHash;

    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "expires_at", updatable = false)
    private LocalDateTime expiresAt;

    //add the isterminated attribute
    @Column(name = "is_terminated")
    private Boolean isTerminated;
//    @Column(name = ) //not needed, aim must be achieved
//    private LocalDateTime priceLockedAt;
}