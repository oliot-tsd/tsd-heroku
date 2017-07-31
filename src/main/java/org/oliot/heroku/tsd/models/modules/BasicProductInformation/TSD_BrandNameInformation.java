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

package org.oliot.heroku.tsd.models.modules.BasicProductInformation;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.springframework.data.annotation.PersistenceConstructor;

import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;


@Data
public class TSD_BrandNameInformation {
    /**
     * The brand name of the product that appears on the consumer package.
     */
    @Size(min = 1, max = 70)
    private final String brandName;

    /**
     * An alternate form of the brand name for a specified language.
     */
    @Setter(AccessLevel.NONE)
    private Map<String, String> languageSpecificBrandNames;

    /**
     * A second level of brand expressed in a different language
     * than the primary sub- brand name (subBrand).
     */
    @Setter(AccessLevel.NONE)
    private Map<String, String> languageSpecificSubbrandNames;

    /**
     * Second level of brand. Can be a trademark.
     * It is the primary differentiating factor that a brand owner wants
     * to communicate to the consumer or buyer.
     * E.g. Yummy-Cola Classic.
     * In this example Yummy-Cola is the brand and Classic is the subBrand.
     */
    @Size(min = 1, max = 70)
    private String subBrand;

    @PersistenceConstructor
    public TSD_BrandNameInformation(String brandName) {
        this.brandName = brandName;
    }

    public TSD_BrandNameInformation
    addLanguageSpecificBrandName(String languageCode, String brandName) {
        if (this.languageSpecificBrandNames == null) {
            this.languageSpecificBrandNames = new HashMap<>();
        }
        this.languageSpecificBrandNames.put(languageCode, brandName);
        return this;
    }

    public TSD_BrandNameInformation
    addLanguageSpecificSubbrandName(String languageCode, String brandName) {
        if (this.languageSpecificSubbrandNames == null) {
            this.languageSpecificSubbrandNames = new HashMap<>();
        }
        this.languageSpecificSubbrandNames.put(languageCode, brandName);
        return this;
    }

    public String
    getLanguageSpecificBrandName(String languageCode) {
        return this.languageSpecificBrandNames.get(languageCode);
    }

    public String
    getLanguageSpecificSubbrandName(String languageCode) {
        return this.languageSpecificSubbrandNames.get(languageCode);
    }
}
