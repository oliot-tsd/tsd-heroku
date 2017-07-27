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

package org.oliot.heroku.tsd.models.modules.AllergenInformation;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.oliot.heroku.tsd.models.modules.TSD_ProductDataModuleFactory;
import org.springframework.data.annotation.PersistenceConstructor;

import java.util.ArrayList;
import java.util.List;


/**
 * The Allergen Information Module carries the allergen warnings on the product.
 * The module is intended for all product categories.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TSD_AllergenInformationTypeModule implements TSD_ProductDataModuleFactory {
    /**
     * Information about substances that might cause allergic reactions and substances
     * subject to intolerance when consumed. The allergy information refers to specified
     * regulations that apply to the target market to which the item information is published.
     */
    private List<TSD_AllergenRelatedInformation> allergenRelatedInformations;

    public TSD_AllergenInformationTypeModule
            (TSD_AllergenRelatedInformation information) {
        this.allergenRelatedInformations = new ArrayList<TSD_AllergenRelatedInformation>();
        this.allergenRelatedInformations.add(information);
    }

    @PersistenceConstructor
    private TSD_AllergenInformationTypeModule
            (List<TSD_AllergenRelatedInformation> allergenRelatedInformations) {
        this.allergenRelatedInformations = allergenRelatedInformations;
    }

    public TSD_AllergenInformationTypeModule
    addAllergenRelatedInformation(TSD_AllergenRelatedInformation information) {
        this.allergenRelatedInformations.add(information);
        return this;
    }

    @Override
    public String getModuleName() {
        return "AllergenInformation";
    }
}
