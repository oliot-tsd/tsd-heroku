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
import lombok.EqualsAndHashCode;
import org.oliot.heroku.tsd.models.common.Description2500;
import org.oliot.heroku.tsd.models.common.Description35;
import org.oliot.heroku.tsd.models.common.Description500;
import org.oliot.heroku.tsd.models.common.Description80;
import org.oliot.heroku.tsd.models.modules.TSD_ProductDataModuleFactory;
import org.springframework.data.annotation.PersistenceConstructor;

import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

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
    private List<Description80> productName;

    /**
     * Consumer-friendly marketing detailed description of the product.
     * Each Description2500 structure SHALL have a different language code,
     * and SHALL represent presentations of the same value in different languages.
     */
    private List<Description2500> consumerMarketingDescription;

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
    private List<Description500> regulatedProductName;

    /**
     * The function of the product.
     */
    private Description35 functionalName;

    /**
     * Provides a code to identify the variant type of the product (e.g. Flavour).
     */
    private List<TSD_TradeItemVariantTypeCode> tradeItemVariantTypeCode;

    /**
     * The brand name of the product.
     */
    private TSD_BrandNameInformation brandNameInformation;

    /**
     * URLs linking to product information provided by the brand owner.
     */
    private List<TSD_ProductInformationLink> productInformationLinks;

    /**
     * Images provided by the brand owner
     */
    private List<TSD_ImageLink> imageLinks;

    /**
     * Name, address and contact information as present on the packaging
     * (for example for the brand owner or importer, distributor, ..).
     * This information MAY be repeated for different parties presented on the packaging.
     */
    private List<TSD_PackagingSignatureLine> packagingSignatureLines;

    /**
     * Information specifying a colour in text and / or coded format.
     */
    private List<TSD_Color> colors;

    public TSD_BasicProductInformationTypeModule
            (Description80 productName, TSD_BrandNameInformation brandNameInformation) {
        this.productName = new ArrayList<Description80>();
        this.productName.add(productName);
        this.brandNameInformation = brandNameInformation;
    }

    @PersistenceConstructor
    private TSD_BasicProductInformationTypeModule
            (List<Description80> productName, TSD_BrandNameInformation brandNameInformation) {
        this.productName = productName;
        this.brandNameInformation = brandNameInformation;
    }

    public TSD_BasicProductInformationTypeModule
    addProductName(Description80 description) {
        this.productName.add(description);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    addConsumerMarketingDescription(Description2500 description) {
        if (this.consumerMarketingDescription == null) {
            this.consumerMarketingDescription = new ArrayList<Description2500>();
        }
        this.consumerMarketingDescription.add(description);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    addRegulatedProductName(Description500 description) {
        if (this.regulatedProductName == null) {
            this.regulatedProductName = new ArrayList<Description500>();
        }
        this.regulatedProductName.add(description);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    addTradeItemVariantTypeCode(TSD_TradeItemVariantTypeCode code) {
        if (this.tradeItemVariantTypeCode == null) {
            this.tradeItemVariantTypeCode = new ArrayList<TSD_TradeItemVariantTypeCode>();
        }
        this.tradeItemVariantTypeCode.add(code);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    addProductInformationLink(TSD_ProductInformationLink link) {
        if (this.productInformationLinks == null) {
            this.productInformationLinks = new ArrayList<TSD_ProductInformationLink>();
        }
        this.productInformationLinks.add(link);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    addImageLink(TSD_ImageLink link) {
        if (this.imageLinks == null) {
            this.imageLinks = new ArrayList<TSD_ImageLink>();
        }
        this.imageLinks.add(link);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    addPackagingSignatureLine(TSD_PackagingSignatureLine signature) {
        if (this.packagingSignatureLines == null) {
            this.packagingSignatureLines = new ArrayList<TSD_PackagingSignatureLine>();
        }
        this.packagingSignatureLines.add(signature);
        return this;
    }

    public TSD_BasicProductInformationTypeModule
    addColour(TSD_Color color) {
        if (this.colors == null) {
            this.colors = new ArrayList<TSD_Color>();
        }
        this.colors.add(color);
        return this;
    }

    @Override
    public String getModuleName() {
        return "BasicProductInformation";
    }
}
