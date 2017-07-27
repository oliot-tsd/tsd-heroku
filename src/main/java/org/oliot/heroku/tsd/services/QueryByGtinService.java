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
import org.oliot.heroku.tsd.models.common.Description80;
import org.oliot.heroku.tsd.models.common.FormattedDescription1000;
import org.oliot.heroku.tsd.models.common.LanguageCode;
import org.oliot.heroku.tsd.models.modules.AllergenInformation.TSD_AllergenInformationTypeModule;
import org.oliot.heroku.tsd.models.modules.AllergenInformation.TSD_AllergenRelatedInformation;
import org.oliot.heroku.tsd.models.modules.BasicProductInformation.TSD_BasicProductInformationTypeModule;
import org.oliot.heroku.tsd.models.modules.BasicProductInformation.TSD_BrandNameInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

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
        // Basic Information
        TSD_BasicProductInformationTypeModule basic = new TSD_BasicProductInformationTypeModule(
                new Description80("Product Name", new LanguageCode("en")),
                new TSD_BrandNameInformation("Brand Name")
        );
        // Product Data Record
        TSD_ProductDataRecord record = new TSD_ProductDataRecord(basic);

        // Allergen Information
        TSD_AllergenInformationTypeModule allergen = new TSD_AllergenInformationTypeModule(
                new TSD_AllergenRelatedInformation(
                        new FormattedDescription1000("Formatted Description",
                                new LanguageCode("en"))
                )
        );
        record.addModule(allergen);
        data.addProductDataRecord(record);
        // END: Product Data
        data = repository.save(data);

        return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.OK);
    }
}