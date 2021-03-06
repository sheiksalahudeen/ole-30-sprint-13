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
package org.kuali.ole.select.document.web.struts;

import org.kuali.ole.sys.OLEConstants;
import org.kuali.rice.kns.web.struts.form.KualiTransactionalDocumentFormBase;

/**
 * This class is the Form Class for Acquisitions Search
 */
public class OleAcquisitionsSearchForm extends KualiTransactionalDocumentFormBase {

    private String url;

    // for batch upload

    private String loadSumId;

    public String getLoadSumId() {
        return loadSumId;
    }

    public void setLoadSumId(String loadSumId) {
        this.loadSumId = loadSumId;
    }

    public String getUrl() {
        return OLEConstants.DOC_HANDLER_URL;
    }
}
