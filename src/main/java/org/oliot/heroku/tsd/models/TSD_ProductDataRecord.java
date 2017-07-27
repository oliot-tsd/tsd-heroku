/*
 * Copyright 2017 Open Language for Internet of Things (Oliot)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.oliot.heroku.tsd.models;

import lombok.Data;
import org.joda.time.DateTime;
import org.oliot.heroku.tsd.models.common.Description70;
import org.oliot.heroku.tsd.models.modules.BasicProductInformation.TSD_BasicProductInformationTypeModule;
import org.oliot.heroku.tsd.models.modules.TSD_ProductDataModuleFactory;
import org.springframework.data.annotation.PersistenceConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Data
public class TSD_ProductDataRecord {
    /**
     * Free text assigned by the manufacturer to describe the production variant.
     * Examples are: package series X, package series Y.
     */
    private Description70 productVariantDescription;

    /**
     * The start date of a production variant.
     */
    private DateTime productVariantEffectiveDateTime;

    /**
     * Product data modules. The first module SHALL be the basic product information module.
     * Other modules are optional. This list SHALL contain at most one module of each module type.
     */
    private Map<String, TSD_ProductDataModuleFactory> modules;

    /**
     * Product component records describing components of the product.
     * If more than one product component record is included, each describes a different
     * component of the product.
     */
    private List<TSD_ProductComponentRecord> productComponentRecords;

    public TSD_ProductDataRecord
            (TSD_BasicProductInformationTypeModule basicProductInformationTypeModule) {
        this.modules = new HashMap<>();
        this.modules.put(basicProductInformationTypeModule.getModuleName(), basicProductInformationTypeModule);
    }

    @PersistenceConstructor
    private TSD_ProductDataRecord
            (Map<String, TSD_ProductDataModuleFactory> modules) {
        this.modules = modules;
    }

    public TSD_ProductDataRecord
    addProductComponentRecord(TSD_ProductComponentRecord record) {
        if (this.productComponentRecords == null) {
            this.productComponentRecords = new ArrayList<TSD_ProductComponentRecord>();
        }
        this.productComponentRecords.add(record);
        return this;
    }

    public TSD_ProductDataRecord
    addModule(TSD_ProductDataModuleFactory module) {
        this.modules.put(module.getModuleName(), module);
        return this;
    }
}
