package com.onlinepaymentplatform.mapper;
import com.onlinepaymentplatform.dto.PaymentRequest;
import com.onlinepaymentplatform.entity.PaymentEntity;

public interface PaymentMapper {
    PaymentEntity toEntity(PaymentRequest dto);
}
