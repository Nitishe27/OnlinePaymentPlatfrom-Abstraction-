package com.onlinepaymentplatform.mapper;
import com.onlinepaymentplatform.dto.PaymentRequest;
import com.onlinepaymentplatform.entity.PaymentEntity;
import org.springframework.stereotype.Component;

@Component

public class PaymentMapperImp implements PaymentMapper {

    @Override
    public PaymentEntity toEntity(PaymentRequest dto){
        PaymentEntity entity = new PaymentEntity();

        entity.setPaymentType(dto.getPaymentType());
        entity.setAmount(dto.getAmount());
        entity.setCardNumber(dto.getCardNumber());
        entity.setCardHolder(dto.getCardHolder());
        entity.setEmail(dto.getEmail());

        return entity;
    }

}