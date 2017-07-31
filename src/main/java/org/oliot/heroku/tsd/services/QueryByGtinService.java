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

package org.oliot.heroku.tsd.services;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.oliot.heroku.tsd.models.TSD_ProductData;
import org.oliot.heroku.tsd.models.TSD_ProductDataRecord;
import org.oliot.heroku.tsd.models.TSD_ProductDataRepository;
import org.oliot.heroku.tsd.models.common.FormattedDescription;
import org.oliot.heroku.tsd.models.modules.AllergenInformation.TSD_AllergenInformationTypeModule;
import org.oliot.heroku.tsd.models.modules.AllergenInformation.TSD_AllergenRelatedInformation;
import org.oliot.heroku.tsd.models.modules.BasicProductInformation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import java.net.URI;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@JsonSerialize
class EmptyJsonResponse {}


@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
@RestController
public class QueryByGtinService {

    @Autowired
    TSD_ProductDataRepository repository;

    @RequestMapping("/insert")
    public ResponseEntity<?> insertProductData() {
        // START: Product Data
        TSD_ProductData data = new TSD_ProductData(
                "12345678912345",
                "123",
                "1234567891234",
                "Information Provider Name"
        );
        // START: Basic Information
        TSD_BrandNameInformation brand = new TSD_BrandNameInformation("Brand Name");
        TSD_BasicProductInformationTypeModule basic = new TSD_BasicProductInformationTypeModule(
                "en", "Product Name", brand);
        // productName
        basic.addProductName("kr", "Korean Product Name");
        basic.addProductName("fr", "French Product Name");
        // consumerMarketingDescription
        basic.addConsumerMarketingDescription("en", "Consumer Market Description");
        basic.addConsumerMarketingDescription("kr", "Korean Consumer Market Description");
        basic.addConsumerMarketingDescription("fr", "French Consumer Market Description");
        // gpcCategoryCode
        basic.setGpcCategoryCode("12345678");
        // regulatedProductName
        basic.addRegulatedProductName("en", "Regulated Product Name");
        basic.addRegulatedProductName("kr", "Korean Regulated Product Name");
        basic.addRegulatedProductName("fr", "French Regulated Product Name");
        // functionalName
        basic.setFunctionalName("en", "Functional Name");
        // tradeItemVariantTypeCode
        basic.addTradeItemVariantTypeCode(new TSD_TradeItemVariantTypeCode("FLAVOR"));
        basic.addTradeItemVariantTypeCode(new TSD_TradeItemVariantTypeCode("SCENT"));
        // brandNameInformation
        brand.addLanguageSpecificBrandName("en", "English specific brand name");
        brand.addLanguageSpecificBrandName("kr", "Korean specific brand name");
        brand.setSubBrand("Sub Brand");
        brand.addLanguageSpecificSubbrandName("en", "English specific subbrand name");
        brand.addLanguageSpecificSubbrandName("kr", "Korean specific subbrand name");
        // productInformationLink
        try {
            basic.addProductInformationLink(new TSD_ProductInformationLink(
                    new URI("http://www.google.com"),
                    new TSD_ProductInformationTypeCode("AUDIO")
            ));
        } catch (Exception e) {
        }
        // Product Data Record
        TSD_ProductDataRecord record = new TSD_ProductDataRecord(basic);

        // Allergen Information
        TSD_AllergenInformationTypeModule allergen = new TSD_AllergenInformationTypeModule(
                new TSD_AllergenRelatedInformation(
                        "en",
                        new FormattedDescription("Formatted Description")
                )
        );
        record.addModule(allergen);
        data.addProductDataRecord(record);
        // END: Product Data
        data = repository.save(data);

        return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.OK);
    }
}