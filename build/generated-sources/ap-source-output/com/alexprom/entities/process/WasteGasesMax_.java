package com.alexprom.entities.process;

import com.alexprom.entities.process.gasesId;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-02T10:51:30")
@StaticMetamodel(WasteGasesMax.class)
public class WasteGasesMax_ { 

    public static volatile SingularAttribute<WasteGasesMax, String> aTag;
    public static volatile SingularAttribute<WasteGasesMax, BigDecimal> maxValue;
    public static volatile SingularAttribute<WasteGasesMax, Date> aDate;
    public static volatile SingularAttribute<WasteGasesMax, Integer> aShift;
    public static volatile SingularAttribute<WasteGasesMax, gasesId> id;

}