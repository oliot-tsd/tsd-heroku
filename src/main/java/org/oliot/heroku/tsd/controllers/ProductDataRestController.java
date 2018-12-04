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

    @GetMapping("/resource/{epcURI}/MetaInformation")
    public TSDProductDataType getMetaInformation(@PathVariable String epcURI) {
        TSDProductDataType header;
        header = repository.getProductHeader(epcURI);
        return header;
    }

    @GetMapping("/resource/{epcURI}/BasicProductInformation")
    public TSDBasicProductInformationModuleType getBasicProductInformation(@PathVariable String epcURI) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDBasicProductInformationModuleType.class, epcURI);
        return iterator.isEmpty() ? null : (TSDBasicProductInformationModuleType) iterator.get(0).getValue();
    }

    @GetMapping("/resource/{epcURI}/ProductAllergenInformation")
    public TSDProductAllergenInformationModuleType getProductAllergenInformation(@PathVariable String epcURI) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDProductAllergenInformationModuleType.class, epcURI);
        return iterator.isEmpty() ? null : (TSDProductAllergenInformationModuleType) iterator.get(0).getValue();
    }

    @GetMapping("/resource/{epcURI}/ProductClaimsAndEndorsements")
    public TSDProductClaimsAndEndorsementsModuleType getProductClaimsAndEndorsements(@PathVariable String epcURI) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDProductClaimsAndEndorsementsModuleType.class, epcURI);
        return iterator.isEmpty() ? null : (TSDProductClaimsAndEndorsementsModuleType) iterator.get(0).getValue();
    }

    @GetMapping("/resource/{epcURI}/ProductInstructions")
    public TSDProductInstructionsModuleType getProductInstructions(@PathVariable String epcURI) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDProductInstructionsModuleType.class, epcURI);
        return iterator.isEmpty() ? null : (TSDProductInstructionsModuleType) iterator.get(0).getValue();
    }

    @GetMapping("/resource/{epcURI}/ProductQuantityInformation")
    public TSDProductQuantityInformationModuleType getProductQuantityInformation(@PathVariable String epcURI) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDProductQuantityInformationModuleType.class, epcURI);
        return iterator.isEmpty() ? null : (TSDProductQuantityInformationModuleType) iterator.get(0).getValue();
    }

    @GetMapping("/resource/{epcURI}/ProductOriginInformation")
    public TSDProductOriginInformationModuleType getProductOriginInformation(@PathVariable String epcURI) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDProductOriginInformationModuleType.class, epcURI);
        return iterator.isEmpty() ? null : (TSDProductOriginInformationModuleType) iterator.get(0).getValue();
    }

    @GetMapping("/resource/{epcURI}/FoodAndBeverageIngredientInformation")
    public TSDFoodAndBeverageIngredientInformationModuleType getFoodAndBeverageIngredientInformation(@PathVariable String epcURI) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDFoodAndBeverageIngredientInformationModuleType.class, epcURI);
        return iterator.isEmpty() ? null : (TSDFoodAndBeverageIngredientInformationModuleType) iterator.get(0).getValue();
    }

    @GetMapping("/resource/{epcURI}/FoodAndBeveragePreparationInformation")
    public TSDFoodAndBeveragePreparationInformationModuleType getFoodAndBeveragePreparationInformation(@PathVariable String epcURI) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDFoodAndBeveragePreparationInformationModuleType.class, epcURI);
        return iterator.isEmpty() ? null : (TSDFoodAndBeveragePreparationInformationModuleType) iterator.get(0).getValue();
    }

    @GetMapping("/resource/{epcURI}/NutritionalProductInformation")
    public TSDNutritionalProductInformationModuleType getNutritionalProductInformation(@PathVariable String epcURI) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDNutritionalProductInformationModuleType.class, epcURI);
        return iterator.isEmpty() ? null : (TSDNutritionalProductInformationModuleType) iterator.get(0).getValue();
    }

    @GetMapping("/resource/{epcURI}/BusLineInformation")
    public TSDBusLineInformationModuleType getBusLineInformation(@PathVariable String epcURI) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDBusLineInformationModuleType.class, epcURI);
        return iterator.isEmpty() ? null : (TSDBusLineInformationModuleType) iterator.get(0).getValue();
    }

    @GetMapping("/resource/{epcURI}/BusStopInformation")
    public TSDBusStopInformationModuleType getBusStopInformation(@PathVariable String epcURI) {
        List<JAXBElement> iterator;
        iterator = repository.getModuleInformation(TSDBusStopInformationModuleType.class, epcURI);
        return iterator.isEmpty() ? null : (TSDBusStopInformationModuleType) iterator.get(0).getValue();
    }
}
