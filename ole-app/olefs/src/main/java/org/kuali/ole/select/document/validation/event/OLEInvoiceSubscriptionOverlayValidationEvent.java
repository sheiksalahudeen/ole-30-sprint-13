/*
 * Copyright 2011 The Kuali Foundation.
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
package org.kuali.ole.select.document.validation.event;

import org.kuali.ole.select.businessobject.OleInvoiceItem;
import org.kuali.ole.select.document.validation.impl.OleValidationRule;
import org.kuali.ole.select.document.validation.impl.OleValidationRuleBase;
import org.kuali.rice.krad.document.Document;
import org.kuali.rice.krad.rules.rule.BusinessRule;
import org.kuali.rice.krad.rules.rule.event.KualiDocumentEventBase;

public class OLEInvoiceSubscriptionOverlayValidationEvent extends KualiDocumentEventBase {

    private OleInvoiceItem invoiceItem;


    protected OLEInvoiceSubscriptionOverlayValidationEvent(String errorPathPrefix, Document document) {
        super("Creating Note Tag" + getDocumentId(document), errorPathPrefix, document);
    }

    public OLEInvoiceSubscriptionOverlayValidationEvent(Document document, OleInvoiceItem invoiceItem) {

        this("", document);
        this.invoiceItem = invoiceItem;
    }

    @Override
    public Class getRuleInterfaceClass() {
        return OleValidationRuleBase.class;
    }

    @Override
    public boolean invokeRuleMethod(BusinessRule rule) {
        return ((OleValidationRule) rule).processInvoiceSubscriptionOverlayBusinessRules(document, invoiceItem);
    }

    public OleInvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(OleInvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }
}
