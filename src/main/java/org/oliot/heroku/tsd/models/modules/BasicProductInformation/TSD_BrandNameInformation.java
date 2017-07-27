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

import lombok.Data;
import org.oliot.heroku.tsd.models.common.Description70;
import org.springframework.data.annotation.PersistenceConstructor;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


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
    private List<Description70> languageSpecificBrandNames;

    /**
     * A second level of brand expressed in a different language
     * than the primary sub- brand name (subBrand).
     */
    private List<Description70> languageSpecificSubbrandNames;

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
    addLanguageSpecificBrandName(Description70 brand) {
        if (this.languageSpecificBrandNames == null) {
            this.languageSpecificBrandNames = new ArrayList<Description70>();
        }
        this.languageSpecificBrandNames.add(brand);
        return this;
    }

    public TSD_BrandNameInformation
    addLanguageSpecificSubbrandName(Description70 brand) {
        if (this.languageSpecificSubbrandNames == null) {
            this.languageSpecificSubbrandNames = new ArrayList<Description70>();
        }
        this.languageSpecificSubbrandNames.add(brand);
        return this;
    }
}
