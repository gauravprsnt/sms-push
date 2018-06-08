package com.Prashant.smspush.modal;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "sms_table")
@EntityListeners(AuditingEntityListener.class)
public class SMS {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(name = "messages")
    public String message;

    @Column(name = "is_sent")
    public boolean isSent;

    @Column(name="mobile_no")
    public long mobileNo;

}
