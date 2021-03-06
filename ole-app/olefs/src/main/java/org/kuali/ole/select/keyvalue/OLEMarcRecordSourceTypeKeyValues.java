package org.kuali.ole.select.keyvalue;

import org.kuali.ole.select.bo.OLEMarcRecordSourceType;
import org.kuali.rice.core.api.util.ConcreteKeyValue;
import org.kuali.rice.core.api.util.KeyValue;
import org.kuali.rice.krad.keyvalues.KeyValuesBase;
import org.kuali.rice.krad.service.KRADServiceLocator;
import org.kuali.rice.krad.service.KRADServiceLocatorWeb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by chenchulakshmig on 11/11/14.
 */
public class OLEMarcRecordSourceTypeKeyValues extends KeyValuesBase {

    @Override
    public List<KeyValue> getKeyValues() {
        List<KeyValue> keyValues = new ArrayList<KeyValue>();
        Collection<OLEMarcRecordSourceType> oleMarcRecordSourceTypes = KRADServiceLocator.getBusinessObjectService().findAll(OLEMarcRecordSourceType.class);
        for (OLEMarcRecordSourceType oleMarcRecordSourceType : oleMarcRecordSourceTypes) {
            if (oleMarcRecordSourceType.isActive()) {
                keyValues.add(new ConcreteKeyValue(oleMarcRecordSourceType.getMarcRecordSourceTypeId(), oleMarcRecordSourceType.getMarcRecordSourceTypeName()));
            }
        }
        return keyValues;
    }
}
