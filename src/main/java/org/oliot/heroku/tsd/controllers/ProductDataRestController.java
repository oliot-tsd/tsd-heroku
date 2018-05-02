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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBElement;
import java.util.List;

@RestController
public class ProductDataRestController {
    private ProductDataRepository repository;

    @Autowired
    public ProductDataRestController(ProductDataRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/product/{gtin}/BasicProductInformation")
    public TSDBasicProductInformationModuleType getBasicProductInformation(@PathVariable String gtin) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDBasicProductInformationModuleType.class, gtin);
        return iterator.isEmpty() ? null : (TSDBasicProductInformationModuleType)iterator.get(0).getValue();
    }

    @GetMapping("/product/{gtin}/ProductAllergenInformation")
    public TSDProductAllergenInformationModuleType getProductAllergenInformation(@PathVariable String gtin) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDProductAllergenInformationModuleType.class, gtin);
        return iterator.isEmpty() ? null : (TSDProductAllergenInformationModuleType)iterator.get(0).getValue();
    }

    @GetMapping("/product/{gtin}/ProductClaimsAndEndorsements")
    public TSDProductClaimsAndEndorsementsModuleType getProductClaimsAndEndorsements(@PathVariable String gtin) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDProductClaimsAndEndorsementsModuleType.class, gtin);
        return iterator.isEmpty() ? null : (TSDProductClaimsAndEndorsementsModuleType)iterator.get(0).getValue();
    }

    @GetMapping("/product/{gtin}/ProductInstructions")
    public TSDProductInstructionsModuleType getProductInstructions(@PathVariable String gtin) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDProductInstructionsModuleType.class, gtin);
        return iterator.isEmpty() ? null : (TSDProductInstructionsModuleType)iterator.get(0).getValue();
    }

    @GetMapping("/product/{gtin}/ProductQuantityInformation")
    public TSDProductQuantityInformationModuleType getProductQuantityInformation(@PathVariable String gtin) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDProductQuantityInformationModuleType.class, gtin);
        return iterator.isEmpty() ? null : (TSDProductQuantityInformationModuleType)iterator.get(0).getValue();
    }

    @GetMapping("/product/{gtin}/ProductOriginInformation")
    public TSDProductOriginInformationModuleType getProductOriginInformation(@PathVariable String gtin) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDProductOriginInformationModuleType.class, gtin);
        return iterator.isEmpty() ? null : (TSDProductOriginInformationModuleType)iterator.get(0).getValue();
    }

    @GetMapping("/product/{gtin}/FoodAndBeverageIngredientInformation")
    public TSDFoodAndBeverageIngredientInformationModuleType getFoodAndBeverageIngredientInformation(@PathVariable String gtin) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDFoodAndBeverageIngredientInformationModuleType.class, gtin);
        return iterator.isEmpty() ? null : (TSDFoodAndBeverageIngredientInformationModuleType)iterator.get(0).getValue();
    }

    @GetMapping("/product/{gtin}/FoodAndBeveragePreparationInformation")
    public TSDFoodAndBeveragePreparationInformationModuleType getFoodAndBeveragePreparationInformation(@PathVariable String gtin) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDFoodAndBeveragePreparationInformationModuleType.class, gtin);
        return iterator.isEmpty() ? null : (TSDFoodAndBeveragePreparationInformationModuleType)iterator.get(0).getValue();
    }

    @GetMapping("/product/{gtin}/NutritionalProductInformation")
    public TSDNutritionalProductInformationModuleType getNutritionalProductInformation(@PathVariable String gtin) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDNutritionalProductInformationModuleType.class, gtin);
        return iterator.isEmpty() ? null : (TSDNutritionalProductInformationModuleType)iterator.get(0).getValue();
    }
}
