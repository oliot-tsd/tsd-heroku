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
import lombok.EqualsAndHashCode;
import lombok.Setter;
import org.oliot.heroku.tsd.models.modules.TSD_ProductDataModuleFactory;
import org.springframework.data.annotation.PersistenceConstructor;

import javax.validation.constraints.Pattern;
import java.util.*;

/**
 * The Basic Product Information Module carries the basic information
 * needed to recognize a product. The module is intended for all product categories.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TSD_BasicProductInformationTypeModule implements TSD_ProductDataModuleFactory {
    /**
     * Consumer friendly short description of the product suitable for compact presentation.
     * Each Description80 structure SHALL have a different language code,
     * and SHALL represent presentations of the same value in different languages.
     */
    @Setter(AccessLevel.NONE)
    private Map<String, String> productName;

    /**
     * Consumer-friendly marketing detailed description of the product.
     * Each Description2500 structure SHALL have a different language code,
     * and SHALL represent presentations of the same value in different languages.
     */
    @Setter(AccessLevel.NONE)
    private Map<String, String> consumerMarketingDescription;

    /**
     * 8-digit code specifying a product category
     * according to the GS1 Global Product Classification (GPC) standard
     */
    @Pattern(regexp = "\\d{8}")
    private String gpcCategoryCode;

    /**
     * The prescribed, regulated or generic product name or denomination
     * that describes the true nature of the product.
     * For example for a food product in order to distinguish it from other foods
     * according to country specific regulations.
     */
    @Setter(AccessLevel.NONE)
    private Map<String, String> regulatedProductName;

    /**
     * The function of the product.
     */
    @Setter(AccessLevel.NONE)
    private Map<String, String> functionalName;

    /**
     * Provides a code to identify the variant type of the product (e.g. Flavour).
     */
    @Setter(AccessLevel.NONE)
    private Set<TSD_TradeItemVariantTypeCode> tradeItemVariantTypeCode;

    /**
     * The brand name of the product.
     */
    private TSD_BrandNameInformation brandNameInformation;

    /**
     * URLs linking to product information provided by the brand owner.
     */
    @Setter(AccessLevel.NONE)
    private List<TSD_ProductInformationLink> productInformationLinks;

    /**
     * Images provided by the brand owner
     */
    @Setter(AccessLevel.NONE)
    private List<TSD_ImageLink> imageLinks;

    /**
     * Name, address and contact information as present on the packaging
     * (for example for the brand owner or importer, distributor, ..).
     * This information MAY be repeated for different parties presented on the packaging.
     */
    @Setter(AccessLevel.NONE)
    private List<TSD_PackagingSignatureLine> packagingSignatureLines;

    /**
     * Information specifying a colour in text and / or coded format.
     */
    @Setter(AccessLevel.NONE)
    private List<TSD_Color> colors;

    public TSD_BasicProductInformationTypeModule
            (String languageCode, String productName, TSD_BrandNameInformation brandNameInformation) {
        this.productName = new HashMap<>();
        this.productName.put(languageCode, productName);
        this.brandNameInformation = brandNameInformation;
    }

    @PersistenceConstructor
    private TSD_BasicProductInformationTypeModule
            (Map<String, String> productName, TSD_BrandNameInformation brandNameInformation) {
        this.productName = productName;
        this.brandNameInformation = brandNameInformation;
    }

    public TSD_BasicProductInformationTypeModule
    addProductName(String languageCode, String description) {
        this.productName.put(languageCode, description);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    addConsumerMarketingDescription(String languageCode, String description) {
        if (this.consumerMarketingDescription == null) {
            this.consumerMarketingDescription = new HashMap<>();
        }
        this.consumerMarketingDescription.put(languageCode, description);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    addRegulatedProductName(String languageCode, String name) {
        if (this.regulatedProductName == null) {
            this.regulatedProductName = new HashMap<>();
        }
        this.regulatedProductName.put(languageCode, name);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    addTradeItemVariantTypeCode(TSD_TradeItemVariantTypeCode code) {
        if (this.tradeItemVariantTypeCode == null) {
            this.tradeItemVariantTypeCode = new HashSet<>();
        }
        this.tradeItemVariantTypeCode.add(code);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    addProductInformationLink(TSD_ProductInformationLink link) {
        if (this.productInformationLinks == null) {
            this.productInformationLinks = new ArrayList<>();
        }
        this.productInformationLinks.add(link);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    addImageLink(TSD_ImageLink link) {
        if (this.imageLinks == null) {
            this.imageLinks = new ArrayList<>();
        }
        this.imageLinks.add(link);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    addPackagingSignatureLine(TSD_PackagingSignatureLine signature) {
        if (this.packagingSignatureLines == null) {
            this.packagingSignatureLines = new ArrayList<>();
        }
        this.packagingSignatureLines.add(signature);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    addColour(TSD_Color color) {
        if (this.colors == null) {
            this.colors = new ArrayList<>();
        }
        this.colors.add(color);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    setFunctionalName(String languageCode, String name) {
        if (this.functionalName == null) {
            this.functionalName = new HashMap<>();
        }
        /* Allow only one functional name */
        //TODO: it seems weird to provide a functional name in
        //only 1 language, but the cardinality on p.10 is 0..1
        this.functionalName.clear();
        this.functionalName.put(languageCode, name);
        return this;
    }

    public String getFunctionalName(String languageCode) {
        return this.functionalName.get(languageCode);
    }

    @Override
    public String getModuleName() {
        return "BasicProductInformation";
    }
}
