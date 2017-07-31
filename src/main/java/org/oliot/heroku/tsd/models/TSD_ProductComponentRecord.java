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

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.oliot.heroku.tsd.models.modules.TSD_ProductDataModuleFactory;

import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Data
public class TSD_ProductComponentRecord {
    /**
     * Sequence number that uniquely identifies the component record.
     */
    @Min(value = 0)
    private Integer componentNumber;

    /**
     * Free text assigned by the manufacturer to describe the component.
     * Example flavor X, Y, Z.
     */
    @Setter(AccessLevel.NONE)
    private Map<String, String> componentDescription;

    /**
     * Product data modules.
     * This list SHALL contain at most one module of each module type.
     */
    @Setter(AccessLevel.NONE)
    private List<TSD_ProductDataModuleFactory> modules;

    public TSD_ProductComponentRecord
            (Integer componentNumber) {
        this.componentNumber = componentNumber;
    }

    public TSD_ProductComponentRecord
    addModule(TSD_ProductDataModuleFactory module) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        this.modules.add(module);
        return this;
    }

    public TSD_ProductComponentRecord
    setComponentDescription(String languageCode, String description) {
        if (this.componentDescription == null) {
            this.componentDescription = new HashMap<>();
        }
        /* Allow only one description */
        this.componentDescription.clear();
        this.componentDescription.put(languageCode, description);
        return this;
    }
}
