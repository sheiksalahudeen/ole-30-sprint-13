/**
 * Copyright 2005-2012 The Kuali Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.opensource.org/licenses/ecl2.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kuali.ole.deliver.keyvalue;

import org.kuali.rice.core.api.util.ConcreteKeyValue;
import org.kuali.rice.core.api.util.KeyValue;
import org.kuali.rice.kim.impl.identity.employment.EntityEmploymentStatusBo;
import org.kuali.rice.krad.keyvalues.KeyValuesBase;
import org.kuali.rice.krad.service.KRADServiceLocator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * OleAddressTypeKeyValues returns code and name for EntityAddressTypeBo.
 */
public class OleEmployeeStatusKeyValues extends KeyValuesBase {


    /**
     * This method will populate the code as a key and name as a value and return it as list
     *
     * @return keyValues(list)
     */
    @Override
    public List getKeyValues() {
        List<KeyValue> keyValues = new ArrayList<KeyValue>();
        Collection<EntityEmploymentStatusBo> employmentStatuses = KRADServiceLocator.getBusinessObjectService().findAll(EntityEmploymentStatusBo.class);
        keyValues.add(new ConcreteKeyValue("", ""));
        for (EntityEmploymentStatusBo employmentStatus : employmentStatuses) {
            if (employmentStatus.isActive()) {
                keyValues.add(new ConcreteKeyValue(employmentStatus.getCode(), employmentStatus.getName()));
            }
        }
        return keyValues;
    }
}

