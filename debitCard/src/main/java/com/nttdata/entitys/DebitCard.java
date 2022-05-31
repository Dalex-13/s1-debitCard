package com.nttdata.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "DebitCard")
public class DebitCard {

    @Id
    private String id;
    private String amount;//monto
    @JsonFormat(pattern="dd-MM-yyyy hh:mm:ss", timezone="GMT-05:00")
    private String startDate;
    @JsonFormat(pattern="dd-MM-yyyy hh:mm:ss", timezone="GMT-05:00")
    private String dateLimit;
    private String comision;
    private String description;
    private String idCustomer;

}
