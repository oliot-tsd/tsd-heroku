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
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Data
@Document(collection = "ProductData")
@CompoundIndexes({
    @CompoundIndex(name = "product_idx",
            unique = true,
            def = "{'gtin':1, 'targetMarket':1}")
})
public class TSD_ProductData {
    /**
     * Document ID
     */
    private final String id;

    /**
     * The GTIN of the product described by this TSD_ProductData instance.
     */
    @Pattern(regexp = "\\d{14}")
    private String gtin;

    /**
     * Target market to which this TSD_ProductData
     * instance applies, expressed as a CountryCode
     */
    @Pattern(regexp = "\\d{3}")
    private String targetMarket;

    /**
     * Party Global Location Number (GLN) of the party providing this data
     */
    @Size(min = 13, max = 13)
    private String informationProviderGLN;

    /**
     * Human-readable name of the party providing this data.
     */
    private String informationProviderName;

    /**
     * Product data records describing the product identified by the specified
     * GTIN for the specified target market. If more than one product data record
     * is included, each describes a different variant of the product.
     */
    @Setter(AccessLevel.NONE)
    private List<TSD_ProductDataRecord> productDataRecords;

    @PersistenceConstructor
    public TSD_ProductData
            (String gtin, String targetMarket,
             String informationProviderGLN, String informationProviderName) {
        this.id = null; /* Auto-assign */
        this.gtin = gtin;
        this.targetMarket = targetMarket;
        this.informationProviderGLN = informationProviderGLN;
        this.informationProviderName = informationProviderName;
        this.productDataRecords = new ArrayList<>();
    }

    public TSD_ProductData
    addProductDataRecord(TSD_ProductDataRecord record) {
        this.productDataRecords.add(record);
        return this;
    }
}