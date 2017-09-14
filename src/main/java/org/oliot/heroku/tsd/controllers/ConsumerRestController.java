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

package org.oliot.heroku.tsd.controllers;

import org.oliot.heroku.tsd.models.ProductDataRepository;
import org.oliot.heroku.tsd.models.schema.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerRestController {
    private ProductDataRepository repository;

    private static final Logger logger = LoggerFactory
            .getLogger(ConsumerRestController.class);

    @Autowired
    public ConsumerRestController(ProductDataRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/view/{gtin}/BasicProductInformation")
    public TSDBasicProductInformationModuleType getBasicProductInformation(@PathVariable String gtin) {
        logger.info("Requested GTIN: " + gtin);
        return repository.getBasicProductInformation(gtin);
    }

    @GetMapping("/view/{gtin}/ProductAllergenInformation")
    public TSDProductAllergenInformationModuleType getProductAllergenInformation(@PathVariable String gtin) {
        logger.info("Requested GTIN: " + gtin);
        return repository.getProductAllergenInformation(gtin);
    }

    @GetMapping("/view/{gtin}/ProductClaimsAndEndorsements")
    public TSDProductClaimsAndEndorsementsModuleType getProductClaimsAndEndorsements(@PathVariable String gtin) {
        logger.info("Requested GTIN: " + gtin);
        return repository.getProductClaimsAndEndorsements(gtin);
    }

    @GetMapping("/view/{gtin}/ProductInstructions")
    public TSDProductInstructionsModuleType getProductInstructions(@PathVariable String gtin) {
        logger.info("Requested GTIN: " + gtin);
        return repository.getProductInstructions(gtin);
    }

    @GetMapping("/view/{gtin}/ProductQuantityInformation")
    public TSDProductQuantityInformationModuleType getProductQuantityInformation(@PathVariable String gtin) {
        logger.info("Requested GTIN: " + gtin);
        return repository.getProductQuantityInformation(gtin);
    }

    @GetMapping("/view/{gtin}/ProductOriginInformation")
    public TSDProductOriginInformationModuleType getProductOriginInformation(@PathVariable String gtin) {
        logger.info("Requested GTIN: " + gtin);
        return repository.getProductOriginInformation(gtin);
    }

    @GetMapping("/view/{gtin}/FoodAndBeverageIngredientInformation")
    public TSDFoodAndBeverageIngredientInformationModuleType getFoodAndBeverageIngredientInformation(@PathVariable String gtin) {
        logger.info("Requested GTIN: " + gtin);
        return repository.getFoodAndBeverageIngredientInformation(gtin);
    }

    @GetMapping("/view/{gtin}/FoodAndBeveragePreparationInformation")
    public TSDFoodAndBeveragePreparationInformationModuleType getFoodAndBeveragePreparationInformation(@PathVariable String gtin) {
        logger.info("Requested GTIN: " + gtin);
        return repository.getFoodAndBeveragePreparationInformation(gtin);
    }

    @GetMapping("/view/{gtin}/NutritionalProductInformation")
    public TSDNutritionalProductInformationModuleType getNutritionalProductInformation(@PathVariable String gtin) {
        logger.info("Requested GTIN: " + gtin);
        return repository.getNutritionalProductInformation(gtin);
    }
}
