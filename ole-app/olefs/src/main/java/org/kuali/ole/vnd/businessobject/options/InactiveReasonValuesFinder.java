/*
 * Copyright 2007 The Kuali Foundation
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
package org.kuali.ole.vnd.businessobject.options;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.kuali.ole.sys.context.SpringContext;
import org.kuali.ole.vnd.businessobject.VendorInactiveReason;
import org.kuali.rice.core.api.util.ConcreteKeyValue;
import org.kuali.rice.krad.keyvalues.KeyValuesBase;
import org.kuali.rice.krad.service.KeyValuesService;

/**
 * Values finder for <code>VendorInactiveReason</code>.
 * 
 * @see org.kuali.ole.vnd.businessobject.VendorInactiveReason
 */
public class InactiveReasonValuesFinder extends KeyValuesBase {

    /*
     * @see org.kuali.keyvalues.KeyValuesFinder#getKeyValues()
     */
    public List getKeyValues() {

        KeyValuesService boService = SpringContext.getBean(KeyValuesService.class);
        Collection inactiveReasons = boService.findAll(VendorInactiveReason.class);
        List labels = new ArrayList();
        labels.add(new ConcreteKeyValue("", ""));
        for (Iterator iter = inactiveReasons.iterator(); iter.hasNext();) {
            VendorInactiveReason reason = (VendorInactiveReason) iter.next();
            labels.add(new ConcreteKeyValue(reason.getVendorInactiveReasonCode(), reason.getVendorInactiveReasonDescription()));
        }

        return labels;
    }


}
